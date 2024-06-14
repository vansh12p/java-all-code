import java.util.*;
public class array3 {
    public static int linear_search(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[]args){
        int num[]={2,4,6,8,10,12,14,16};
       int key=80;
       int index=linear_search(num,key);
       if(index==-1){
        System.out.println("we can't find this key in our index");
       }
       else{
        System.out.println("key is at index = "+index);
       }


    }
    
}
