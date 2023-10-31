package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    static void enterVehicle(Vehicle vehicle){
        String id;
        do {
            System.out.print("Enter id: ");
            id = sc.nextLine();
            boolean found = false;
            if(!vehicles.isEmpty()){
                for (Vehicle v: vehicles
                     ) {
                    if(v.getId().equals(id)){
                        found = true;
                        break;
                    }
                }
            }
            if(found){
                id = "";
                System.out.println("ID existed!");
            }
        }while(id.trim().isEmpty());
        vehicle.setId(id);

        String name;
        do {
            System.out.print("Enter vehicle's name: ");
            name = sc.nextLine();
        }while(name.trim().isEmpty());
        vehicle.setName(name);

        String owner;
        do {
            System.out.print("Enter vehicle's owner: ");
            owner = sc.nextLine();
        }while(owner.trim().isEmpty());
        vehicle.setOwner(owner);

        String description;
        do {
            System.out.print("Enter vehicle's description: ");
            description = sc.nextLine();
        }while (description.trim().isEmpty());
        vehicle.setDescription(description);
        int capacity;
        do {
            try {
                System.out.print("Enter vehicle's capacity: ");
                capacity = sc.nextInt();
                sc.nextLine();
            }catch (Exception e){
                capacity = 0;
                sc.nextLine();
            }
        }while (capacity <= 0);
        vehicle.setCapacity(capacity);

        double price;
        do {
            try {
                System.out.println("Enter vehicle's price: ");
                price = sc.nextDouble();
                sc.nextLine();
            }catch (Exception e){
                price = 0.0;
                sc.nextLine();
            }
        }while(price <= 0);

        vehicle.setPrice(price);

    }
    public static void main(String[] args) {
        int a,n;
        boolean flag = true;
        do {
            System.out.println("Choose a below option: ");
            System.out.println("1. Enter vehicle");
            System.out.println("2. Export tax declaration");
            System.out.println("Other numbers to exit");
            do {
                try {
                    System.out.print("Enter the option: ");
                    a = sc.nextInt();
                    sc.nextLine();
                    break;
                }catch (Exception e){
                    sc.nextLine();
                }
            }while (true);
            switch (a){
                case 1:
                    do {
                        try {
                            System.out.print("Enter the number of vehicles for each type: ");
                            n = sc.nextInt();
                            sc.nextLine();
                            break;
                        }catch (Exception e){
                            sc.nextLine();
                        }
                    }while (true);
                    System.out.println("Car: ");
                    for (int i = 0; i < n; i++){
                        Car car = new Car();
                        enterVehicle(car);
                        vehicles.add(car);
                    }
                    System.out.println("Motorbike: ");
                    for(int i = 0; i < n; i++){
                        Motorbike motorbike = new Motorbike();
                        enterVehicle(motorbike);
                        vehicles.add(motorbike);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %10s %10s", "ID", "Capacity", "Price", "Tax");
                    for (Vehicle vehicle:vehicles
                         ) {
                        vehicle.printTax();
                    }
                    break;
                default:
                    System.out.println("Goodbye!");
                    flag = false;
                    break;
            }
        }while (flag);
    }
}