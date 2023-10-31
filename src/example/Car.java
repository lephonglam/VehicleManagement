package example;

public class Car extends Vehicle{
    private static final int WHEELS = 4;

    public Car() {
    }

    public Car(String id, String name, String owner, String description, int capacity, double price) {
        super(id, name, owner, description, capacity, price);
    }

    @Override
    public void move() {
        System.out.println("Maximum speed is 200 km/h.");
    }

    @Override
    public double getTax() {
        if(this.getCapacity() < 100){
            return this.getPrice()*0.02;
        } else if (this.getCapacity() >= 100 && this.getCapacity() <= 200) {
            return this.getPrice()*0.04;
        }
        else{
            return this.getPrice()*0.06;
        }
    }
}
