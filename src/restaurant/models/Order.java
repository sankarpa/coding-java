package restaurant.models;

import java.time.LocalDateTime;
import java.util.Map;

public class Order {

    private String customer;
    private Table table;
    private Map<MenuItem, Integer> menuItemList;
    private LocalDateTime createdTime = LocalDateTime.now();

    public Order(){

    }

    public String getCustomer() {
        return customer;
    }

    public Table getTable() {
        return table;
    }

    public Map<MenuItem, Integer> getMenuItemList() {
        return menuItemList;
    }

    public void setTable(Table table) {
        this.table = table;
        this.customer = table.getCustomer();
    }

    public void setMenuItemList(Map<MenuItem, Integer> menuItemList) {
        this.menuItemList = menuItemList;
    }

//    public Order(Table table, Map<MenuItem, Integer> menuItemList) {
//        this.customer = table.getCustomer();
//        this.table = table;
//        this.menuItemList = menuItemList;
//    }
}
