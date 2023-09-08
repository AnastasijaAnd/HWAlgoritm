package Shop;

public class main {
    public static void main(String[] args) {
        Product teddy = new Product("мягкая игрушка Мишка", 9.2, 4.5);
        Product barbie = new Product("кукла Барби", 10.5, 4.8);
        Category toys = new Category("Игрушки", new Product[]{teddy, barbie});
        Category shoes = new Category("Обувь", new Product[]
                {new Product("сапоги", 100, 5.0), new Product("туфли", 555, 3.9)});
        Category clothes = new Category("Одежда", new Product[]
                {new Product("юбка", 30, 4.3), new Product("брюки", 57.99, 4.0)});
        User user1 = new User("user1", "password", new Busket(5));
        User user2 = new User("user2", "123", new Busket(5));
        
        System.out.println("-----------------");
        System.out.println("Каталог товаров по категориям: ");
         Category.displayProductsByCategory(toys);
         Category.displayProductsByCategory(shoes);
         Category.displayProductsByCategory(clothes);
        System.out.println("-----------------");
        
        user2.busket.addProductToBasket(teddy);
        user1.busket.addProductToBasket(barbie);
        System.out.println("-----------------");
        
    }
}
