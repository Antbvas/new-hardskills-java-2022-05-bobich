public class HomeworkLesson3_2 {
    /*Программа, которая выводит произведение всех чисел массива, кратных 5.*/
    public static void main(String[] args) {
        int[] numbers =  {0, 4, 5, 11, 23, 55, 155, 22, 90, 1223, -15, -27, -100};
        long x=1;
        for (int i:numbers){
            if (i!=0 && i%5==0) {
                x = x*i;
            }
        }
        System.out.println(x);
    }
}
