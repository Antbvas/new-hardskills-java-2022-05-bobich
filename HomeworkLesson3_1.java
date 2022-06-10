/*Программа, которая выводит все нечётные числа в массиве на экран пользователя
(каждое число должно находится на новой строке).*/
public class HomeworkLesson3_1 {
    public static void main(String[] args) {
        int[] numbers =  {1, 3, 11, 2, 4, 102, 155, 171, 2990, 123, -2, -3, 18};
        for (int i:numbers){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
