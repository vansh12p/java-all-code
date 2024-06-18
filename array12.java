import java.util.*;
public class array12 {
    public static void kadans_algo(int num[]){
        // ms=max_sum
        // cs=current_sum
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }

            ms=Math.max(cs,ms);
        }
        System.out.println("our max sum is  = "+ms);


    }
    public static void main (String[]args){
        int num[]= {-2,-3,4,-1,-2,1,5,-3};
        kadans_algo(num);
    }
    
}
