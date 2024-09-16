public class HomeworkLesson2{
    public static void main(String[] args) {
        long salary = 2000;
        double tax = 0.13;
        double newSalary = salary - salary * tax;
        System.out.println("Начислено: " + salary + " USD");
        System.out.println("Налогов вычтено: " + salary * tax + " USD");
        System.out.println("Итого к выплате: " + newSalary + " USD");
    }
}