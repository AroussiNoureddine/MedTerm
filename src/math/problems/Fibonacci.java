package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        //fibonacciSerie(40);
        for (int i:fibonacciSerie(8)) {
            System.out.print(i+", ");
        }
    }
    public static int[] fibonacciSerie(int x) {
        int[] arrX = new int[x];
        //System.out.print(" the fibonacci serie of "+x +"th is: ");
        for (int i = 0; i < arrX.length; i++) {
            if (i==0|| i==1)arrX[i]=i;
            else arrX[i]=arrX[i-1]+arrX[i-2];
            //System.out.print(arrX[i]+", ");
        }
        return arrX;
    }
}
