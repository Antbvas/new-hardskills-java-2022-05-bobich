public class User {
    private String login;
    private String password;
    private String basket;

    public User(String login, String password, String basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getBasket() {
        return basket;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = String.valueOf(basket);
    }
}
