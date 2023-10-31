package example;

public class Motorbike extends Vehicle{
    private static final int WHEELS = 2;

    public Motorbike() {
    }

    public Motorbike(String id, String name, String owner, String description, int capacity, double price) {
        super(id, name, owner, description, capacity, price);
    }

    @Override
    public void move() {
        System.out.println("Maximum speed is 140 km/h.");
    }

    @Override
    public double getTax() {
        if(this.getCapacity() < 100){
            return this.getPrice()*0.01;
        } else if (this.getCapacity() >= 100 && this.getCapacity() <= 200) {
            return this.getPrice()*0.03;
        }
        else{
            return this.getPrice()*0.05;
        }
    }
}
