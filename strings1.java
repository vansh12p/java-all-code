import java.util.*;
public class strings1 {
   
    public static void main(String[]args){
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("abcd");
        Scanner sc=new Scanner(System.in);
        //when we want to print only one word then replace sc.nextLine to sc.next and when we change this our o/p is show only one word; 
        String name=sc.nextLine();
        System.out.println(name);
    }
    
}
