import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        printArray(sortArray(myArray()));
        int[] array = myArray();
//        System.out.println(findMin(array));
        reverse(array);
        System.out.println(Arrays.toString(array));


    }

    public static int[] myArray (){
        int[] array;
        System.out.println("Enter length of Array");
        int arrayLength = sc.nextInt();
        array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please enter a element " + (i+1) + ":");
            int element = sc.nextInt();
            array[i] = element;
        }
        return array;
    }

    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + " is now " + array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        //algo method
        int[] sortedArray = new int[array.length];

        System.arraycopy(array, 0, sortedArray, 0, array.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int findMin(int[] array){
        //algo method
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min){
                min = value;
            }
        }
        return min;
    }

    public static void reverse(int[] array){

        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
