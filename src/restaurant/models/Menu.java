package restaurant.models;


import java.util.List;

public class Menu {

    private String name;
    private List<MenuItem> menuItemList;

    public Menu(String name, List<MenuItem> menuItemList) {
        this.name = name;
        this.menuItemList = menuItemList;
    }
}
