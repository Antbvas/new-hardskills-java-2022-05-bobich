public class HomeworkLesson3_6 {
    //Программа, которая выводит на экран пользователя треугольник из *.
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("    *");
            }
            System.out.println("");
        }
        for (int i = n; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("    *");
            }
            System.out.println("");
        }
    }
}
