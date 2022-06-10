public class HomeworkLesson3_8 {
    //Программа, которая находит МИНИМАЛЬНЫЙ факториал от числа, который удовлетворят некоторым условиям.
    public static void main (String[] args){
        long fact = 1;
        int n = 30;
        for (int i = 1; i<=n; i++) {
            fact=fact*i;
            if(fact>40320 && fact<1278945280 && fact%11==0) { // наши условия: диапазон 40320 ... 1278945280 и кратность 11
                System.out.println(i+"!="+ fact);
                break; // если убераем break, то будут отображаться все факториалы в диапазоне 40320 ... 1278945280.
            }
        }
    }
}
