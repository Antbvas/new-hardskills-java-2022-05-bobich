public class HomeworkLesson3_7 {
    //Программа, выводящая матрицу 3 x 3, диагонали которой заполнены нулями.
    public static void main(String[] args){
        //int[][] matrix = new int[][]{ {0,2,0}, {4,0,6}, {0,8,0} } ;
        int[][] matrix = new int[3][3];
        matrix[0][0] = 0;
        matrix[0][1] = 2;
        matrix[0][2] = 0;
        matrix[1][0] = 4;
        matrix[1][1] = 0;
        matrix[1][2] = 6;
        matrix[2][0] = 0;
        matrix[2][1] = 8;
        matrix[2][2] = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
