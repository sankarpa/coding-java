package restaurant.models;


import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Restaurant {

    private String name;
    private Location location;
    private RestaurantType restaurantType;
    private Set<Table> tables;
    private Menu menu;

    public Restaurant(String name, Location location, RestaurantType restaurantType) {
        this.name = name;
        this.location = location;
        this.restaurantType = restaurantType;
    }

    public void setTables(Set<Table> tables) {
        this.tables = tables;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Table reserveTable(String customer){
        for(Table table: tables){
            if(table.isEmpty()){
                table.setCustomer(customer);
                return table;
            }
        }
        return new NullTable(-1);
    }

    public Order placeOrder(Integer tableNumber, Map<MenuItem, Integer> menuItemList){
        Order order = new Order();
        for(Table table: tables){
            if(table.getNumber() == tableNumber){
                order.setTable(table);
                order.setMenuItemList(menuItemList);
            }
        }
        return order;
    }

    public String issueBill(Order order){

        StringBuilder builder = new StringBuilder();
        builder.append("_______________________\n");
        builder.append(this.name+"\n");
        builder.append("_______________________\n");
        builder.append("Customer:").append(order.getCustomer()).append("\n");
        builder.append("Table Number:").append(order.getTable().getNumber()).append("\n");
        builder.append("________________________\n");
        AtomicReference<Double> total = new AtomicReference<>(Double.valueOf(0));
        order.getMenuItemList().entrySet().forEach(

                menuItemIntegerEntry -> {
                    Double price = menuItemIntegerEntry.getValue() * menuItemIntegerEntry.getKey().getPrice();
                    builder.append(menuItemIntegerEntry.getKey().getName()+"x"+menuItemIntegerEntry.getValue())
                            .append("=")
                            .append(price)
                            .append("\n");
                    total.updateAndGet(v -> v + price);
                }
        );
        builder.append("_______________________\n");
        builder.append("Total Amount:"+total+"\n");
        return builder.toString();

    }


    public static void main(String[] args) {
        Location location = new Location(Double.valueOf(101.0), Double.valueOf(102.0));
        Restaurant restaurant = new Restaurant("Test Bhavan", location, RestaurantType.VEGETARIAN);

        MenuItem dosa = new MenuItem("Dosa", 100.0);
        MenuItem idly = new MenuItem("Idly", 50.0);

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(dosa);
        menuItems.add(idly);

        Menu southIndianMenu = new Menu("SouthIndian", menuItems);
        restaurant.setMenu(southIndianMenu);

        Table tableOne = new Table(1);
        Table tableTwo = new Table(2);
        Set<Table> tables = new HashSet<>();
        tables.add(tableOne);
        tables.add(tableTwo);

        restaurant.setTables(tables);
        Table table = restaurant.reserveTable("Sankar");
        Map<MenuItem, Integer> orderIt = new HashMap<>();
        orderIt.put(idly,2);
        orderIt.put(dosa,2);

        Order order = restaurant.placeOrder(table.getNumber(), orderIt);
        System.out.println(restaurant.issueBill(order));

    }

}
