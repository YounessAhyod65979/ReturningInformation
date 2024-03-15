class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {

        this.model = model;

        this.brand = brand;

        this.year = year;

        this.price = price;

        this.color = color;

        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void delivery(int amount) {
        this.quantity += amount;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public void sell() {
        if (this.quantity > 0) {
            this.quantity--;
        } else {
            System.out.println("Out of stock!");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("A45", "Mercedes", 2024, 80000, "Black", 5);

        System.out.println(myCar.toString());

        myCar.sell();

        System.out.println("After sales units:");

        System.out.println(myCar.toString());

    }
}

