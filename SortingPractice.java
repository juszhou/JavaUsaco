import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortingPractice {
    public static void main(String argvp[]){
        String str1 = "afka";
        String str2 = "kaaf";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        boolean isAnagram =  Arrays.equals(arr1,arr2);
        System.out.println(isAnagram);



        //natural order
        //char: alpha, lexicographical order
        //int double long


        int [ ] intArray = {3,6,0,9,-1,5,-7};
        Arrays.sort(intArray);
        for(int num : intArray){
            System.out.print(num + " ");
        }
    }

}
