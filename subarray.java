package dsa;
//subarrays: continuous part of array
public class print_subarr {
    public static void print_subarr(int numbers[]) {
        int ts=0;
        for (int i=0; i<numbers.length;i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                for (int k=start; k<=end; k++){
                    System.out.println(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total are:" + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        print_subarr(numbers);
    }
}
