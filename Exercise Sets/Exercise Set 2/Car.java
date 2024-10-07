import java.util.Scanner;

public class Car {
    private String color;
    private double price;
    private char size; 
    
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    public String toString() {
        String sizeDescriptor = "";
        switch (size) {
            case 'S':
                sizeDescriptor = "Small";
                break;
            case 'M':
                sizeDescriptor = "Medium";
                break;
            case 'L':
                sizeDescriptor = "Large";
                break;
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car color: ");
        String color = scanner.nextLine();

        System.out.print("Enter car price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter car size (S for small, M for medium, L for large): ");
        char size = scanner.next().charAt(0);

        Car car = new Car(color, price, size);

        System.out.println(car);

        scanner.close();
    }
}
