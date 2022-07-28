public class Main {
    public static void main(String[] args) {

        System.out.println("Method 1:");
        Student student1 = new Student("Ivan", "Ivanov", "I-123", 5);
        Student student2 = new Student("Petr", "Petrov", "P-345", 4.5);
        Aspirant aspirant1 = new Aspirant("Dima", "Dmytrov", "D-67", 5, "C#");
        Aspirant aspirant2 = new Aspirant("Alex", "Alexov", "A-89", 4, "C++");

        System.out.println("Scholarship for " + student1.getLastName() + ": " + student1.getSholarShip() + " BYN");
        System.out.println("Scholarship for " + student2.getLastName() + ": " + student2.getSholarShip() + " BYN");
        System.out.println("Scholarship for " + aspirant1.getLastName() + ": " + aspirant1.getSholarShip() + " BYN");
        System.out.println("Scholarship for " + aspirant2.getLastName() + ": " + aspirant2.getSholarShip() + " BYN");

        //Ввод через массив:
        System.out.println("Method 2:");
        Student[] arr = {new Student("Ivan", "Ivanov", "I-123", 5),
                new Student("Petr", "Petrov", "P-345", 4.5),
                new Aspirant("Dima", "Dmytrov", "D-67", 5, "C#"),
                new Aspirant("Alex", "Alexov", "A-89", 4, "C++")};
        for (Student stud : arr) {
            System.out.println("Scholarship for " + stud.getLastName() + " - " + stud.getSholarShip() + " BYN");
        }

        System.out.println("***********************************");
        // Объявляем продукты
        Product product1 = new Product("Apple", 10, 10);
        Product product2 = new Product("Pear", 9, 9);
        Product product3 = new Product("Tomato", 7, 7);
        Product product4 = new Product("Pepper", 8, 8);

        //Объявляем категории
        Category category1 = new Category("Fruits", product1);
        Category category2 = new Category("Vegetable", product3);

        //Выводим категорию + продукт который в нее включен
        System.out.println("Name category: " + category2.getNameCategory() + " contains- " + category2.getProductCategory());
        //Меняем название категории 2
        category2.setNameCategory("NEWVegetable");
        //Меняем продукт категории 2
        category2.setProductCategory(product4);
        //Выводим новое название категории + новый продукт который в нее включен
        System.out.println("Name category: " + category2.getNameCategory() + " contains- " + category2.getProductCategory());


        //Выводим имя продукта + цена + рейтинг
        System.out.println("Product name:" + product1.getNameProduct() + "-Price:" + product1.getPriceProduct() + "-Rate:" + product1.getRateProduct());
        product1.setPriceProduct(20);
        System.out.println("Product name:" + product2.getNameProduct() + "-Price:" + product2.getPriceProduct() + "-Rate:" + product2.getRateProduct());

        //Объявляем продукт в корзину
        Basket basket1 = new Basket(product1);
        Basket basket2 = new Basket(product2);

        //Выводим корзину с продуктом:
        System.out.println("Basket1 contains " + basket1.getProduct());
        System.out.println("Basket2 contains " + basket2.getProduct());

        //Меняем продукт корзины:
        basket1.setProduct(product3);
        basket2.setProduct(product4);

        //Выводим корзину с новым продуктом:
        System.out.println("Basket1 contains " + basket1.getProduct());
        System.out.println("Basket2 contains " + basket2.getProduct());

        //Объявляем пользователя
        User user1 = new User("useruseruser", "qwerty", "basket1");
        //Выводим данные пользователя
        System.out.println("Login: " + user1.getLogin() + " |Password:" + user1.getPassword() + " |Basket:" + user1.getBasket());

    }
}
