import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        
        // int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(numbers, 4);

        // System.out.println("The index of element 4 in the array is : "+index);


        Integer[] numbers = {30,10,50,80,70};
        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        for(int n : numbers){
            System.out.println(n);
        }
    }
}
