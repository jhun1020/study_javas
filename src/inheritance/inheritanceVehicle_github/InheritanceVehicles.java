package inheritance.inheritanceVehicle_github;

public class InheritanceVehicles {
public static void main(String[] args) {

    Vehicles vehicles = new Vehicles();
    System.out.println("---vehicles---");
    vehicles.speed(100, 2);
    vehicles.weight(20, 30, 40);
    System.out.println(" ");
   
    Vans vans = new Vans();
    System.out.println("---vans---");
    vans.speed(100, 2);
    vans.weight(20, 30, 40);
    vans.windows_count(5);
    System.out.println(" ");

    Cars cars = new Cars(50);
    System.out.println("---cars---");
    cars.speed(100, 2);
    cars.weight(20, 30, 40);
    System.out.println("디버깅용");

}
}