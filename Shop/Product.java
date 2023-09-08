package Shop;

public class Product {
    private String name;
    private double price;
    private double rate;

    public Product(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRate() {
        return rate;
    }

    public String toString() {
        return  name +
                ", price: " + price +
                ", ranking: " + rate;
    }
}
