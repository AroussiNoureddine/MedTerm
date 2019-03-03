package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        System.out.println(fLd(array1,array2));
    }
    public static int fLd(int[] a,int[] b){
        int d=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int tmp = Math.abs(a[i]-b[j]);
                if(d>tmp) d=tmp;
            }
        }
        return d;
    }

}
