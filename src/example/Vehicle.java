package example;

public abstract class Vehicle implements Movable{
    private String id;
    private String name;
    private String owner;
    private String description;
    private int capacity;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String id, String name, String owner, String description, int capacity, double price) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.capacity = capacity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax(){
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printTax(){
        System.out.printf("%5s %5d %10.2f %10.2f", this.id, this.capacity, this.price, this.getTax());
    }
}
