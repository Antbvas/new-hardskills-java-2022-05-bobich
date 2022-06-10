public class HomeworkLesson3_4 {
    //Программа, которая выводит сумму наибольшего и наименьшего чисел в исходном числе.
    public static void main (String[] args){
        int number = 103281234;
        System.out.print("Исходное число:"+number );
        int min = 9, max = 0;    // идем от обратного - может задать иначе?
        for ( ;number!=0; number/=10) {
            int digital = number%10;
            if (digital<min){
                min=digital;
            }
            if (digital>max) {
                max=digital;
            }
        }
        System.out.println(min+max);
        System.out.println("Минимальное число:"+min);
        System.out.println("Максимальное число:"+max);
        System.out.println("********************");
        System.out.println("Сумма чисел:"+(max+min));
    }
}
