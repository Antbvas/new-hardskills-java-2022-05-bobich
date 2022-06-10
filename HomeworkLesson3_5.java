public class HomeworkLesson3_5 {
    //Программа, которая выводит на экран пользователя лесенку из *.
    public static void main(String[] args){
      /* String text = "";
        for (int i = 0; i < 10; i++) {
            text = text+"*";
            System.out.println(text);
        }*/
        int n=10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
