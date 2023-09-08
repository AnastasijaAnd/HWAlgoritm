package Shop;

public class Busket {
    private Product[] products;
    private int size = 1;

    public Busket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProductToBasket(Product product) {
        if (size < products.length) {
            products[size] = product;
            size++;
            System.out.println(product.getName() + " добавлена в корзину");
            return true;
        } else {
            System.out.println(product.getName() + " could not be added to basket");
            return false;
        }
    }

    public void addProduct(Product products) {
        products.add(products);
    }

    public void removeProduct(Product products) {
        products.remove(products);
    }
}
