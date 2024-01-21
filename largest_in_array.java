package dsa;
// import java.util.*;
public class largestnumber {
    public static int largest(int numbers[]){
        int large = Integer.MIN_VALUE; // -ve infinity
        int small = Integer.MAX_VALUE;// +ve infinity 
        for (int i=0; i<numbers.length; i++){
            if (large < numbers[i]) {
                large = numbers[i];
            }
            if (small > numbers[i]){
                small = numbers[i];
            }
        }
        System.out.println("small is:" + small);
        return large;
    }

public static void main(String args[]){
    int numbers[] =  {1, 8, 10 ,3};
    System.out.println("largest number is:" + largest(numbers));

}
}
