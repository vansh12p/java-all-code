import java.util.*;
public class array4 {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;  //for largest value
        int Smallest=Integer.MAX_VALUE;  // for smallest value
        for(int i=0;i<numbers.length;i++){
           //that condition is try to print largest value
            if(largest<numbers[i]){
                largest=numbers[i];

            }
            // And that condition is try to print smallest value
            if(Smallest>numbers[i]){
                Smallest=numbers[i];
            }
        }
        System.out.println("smallest value is : "+Smallest);
        return largest;

    }
    public static void main(String[]args){
        int numbers[]={1,2,3,9,4,2,12,13,11,3,18,19,2,4,6,0};
        System.out.println("the largest value : "+getlargest(numbers));
    }
}
