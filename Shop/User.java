package Shop;

public class User {
    private String login;
    private String password;
    Busket busket;
    private static int number = 0;
    

    public User(String login, String password, Busket basket) {
        this.login = login;
        this.password = password;
        this.busket = basket;
        int id = number++;
        System.out.printf("Покупатель %d.%n",id);
    }
    
    
    public String getLogin() {
        return login;
    }

    public String getpassword() {
        return password;
    }
}
