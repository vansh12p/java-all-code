import java.util.*;
public class array11 {
    public static void max_array2(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        //for print prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for (int i=0;i<num.length;i++){
            int start=i;
            for (int j=i;j<num.length;j++){
                int end=j;
                currsum=start==0 ? prefix[end] : prefix[end]-prefix[start];
                
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                
            }
            
        }

        System.out.println("max sum "+maxsum);

    }
    
    public static void main(String[]args){
        int num[]={2,4,6,8,10};
        max_array2(num);
    }
    
}
