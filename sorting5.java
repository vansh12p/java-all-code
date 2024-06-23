import java.util.*;
//acendeing order inbuilt function
public class sorting5 {
    public static void printarry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        System.out.println("for print index 0 to 2");
        Arrays.sort(arr,0,3);
        printarry(arr);
        System.out.println("to short whole array");
        Arrays.sort(arr);
        printarry(arr);
        


    }
    
}
