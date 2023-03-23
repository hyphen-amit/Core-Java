package Arrays;
import java.util.Arrays;
public class ArraysOperartions {

    public static void main(String[] args) {

        int arr[]={20, 25, 10, 8, 11, 19};

        //Display array
        System.out.println(Arrays.toString(arr));

        //sum of elements in array
        System.out.println(ArraysOperationsFunctions.getSum(arr));

        //sorting array
        Arrays.sort(arr);
        System.out.println("Sorted array -> "+Arrays.toString(arr));

        //searching in array
        int key=19;
        System.out.println(key + " found at index " + Arrays.binarySearch(arr, key));

        //compare arrays
//        int arr2[]={20,10,30};
//        if(Arrays.compare(arr, arr2)==0){
//            System.out.println("Equal arrays");
//        }else{
//            System.out.println("NOt equal");
//        }

        //create copy of array
        int arr3[]=Arrays.copyOf(arr, arr.length);
        System.out.println("New arrays -> "+ Arrays.toString(arr3));

        //filling the arrays for specified value
        int val=12;
        Arrays.fill(arr, val);
        System.out.println("Filled array -> "+ Arrays.toString(arr));

    }

}
