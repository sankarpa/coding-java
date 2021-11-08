package restaurant.models;


public class Table {

    private Integer number;
    private String customer = "";

    public String getCustomer() {
        return customer;
    }

    public Table(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public boolean isEmpty(){
        return this.customer.isEmpty();
    }
}
