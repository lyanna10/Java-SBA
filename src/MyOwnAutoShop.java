//Create the MyOwnAutoShop class, which contains the main() method. Perform the following within the main() method.
//Create an instance of the Sedan class and initialize all the fields with appropriate values. Use the super(...) method in the constructor to initialize the fields of the superclass.
//Create two instances of the Ford class and initialize all the fields with appropriate values. Use the super(...) method in the constructor to initialize the fields of the superclass.
//Create an instance of the Car class and initialize all the fields with appropriate values. Display the sale prices for all instances.
public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(150, 19000, "Blue", 22);
        Ford ford1 = new Ford(180, 40000, "Red", 2022, 3500);
        Ford ford2 = new Ford(200, 45000, "Silver", 2023, 4500);
        Car car = new Car(100, 13000, "Black");

        System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
        System.out.println("Ford1 Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford2 Sale Price: " + ford2.getSalePrice());
        System.out.println("Car Sale Price: " + car.getSalePrice());
    }
}
