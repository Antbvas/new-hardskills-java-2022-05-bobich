public class HomeworkLesson3_3 {
    /*Программа, которая выводит число в обратном порядке*/
    // 23114 -> 41132
    public static void main (String[] args){
        int number = 23114;
        System.out.print(number+ " -> " );
        int reversed = 0;
        for ( ;number!=0; number/=10) {
            int digital = number%10;
            reversed = reversed*10+ digital;
        }
        System.out.println(reversed);
    }
}

