import java.util.*;
public class array10 {
    public static void max_array(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            int start=i;
            for (int j=i;j<num.length;j++){
                int end=j;
                currsum=0;
                for( int k=start;k<=end;k++){
                    currsum+=num[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                
            }
            
        }

        System.out.println("max sum "+maxsum);

    }
    
    public static void main(String[]args){
        int num[]={2,4,6,8,10};
        max_array(num);
    }
    
}
