package math.problems;

import org.testng.Assert;

import static math.problems.Factorial.factorial;
import static math.problems.Fibonacci.fibonacciSerie;
import static math.problems.FindLowestDifference.fLd;
import static math.problems.FindMissingNumber.fMN;
import static math.problems.LowestNumber.getMinArr;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        //Factorial
        try {
            Assert.assertEquals(factorial(5), 120, "It Work Fine");
        }catch(Exception ex){
            ex.getMessage();
        }
        //fibonacci
        int[] fArr={0,1,1,2,3,5,8,13};
        try {
            Assert.assertEquals( fibonacciSerie(8),fArr, "It Work Fine");
        }catch(Exception ex){
            ex.getMessage();
        }
        //FindLowestDiffrence
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        try {
            Assert.assertEquals(fLd(array1,array2),1,"This Thing Work");
        }catch(Exception ex){
            ex.getMessage();
        }
        //find missing number
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        try {
            Assert.assertEquals(fMN(array),9,"This thing work fine");
        }catch (Exception ex){
            ex.getMessage();
        }
        //lowest number
        int  arrayLN[]= new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        try {
            Assert.assertEquals(getMinArr(arrayLN),5,"this thin work");
        }catch (Exception ex){
            ex.getMessage();
        }

    }
}
