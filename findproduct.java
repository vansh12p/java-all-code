import java.util.*;
class findproduct {
    public static int sumOfProduct(int a,int b){
   
    
    int  sumOfProduct=a*b;
    return  sumOfProduct;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    int b=sc.nextInt();
    int d=sumOfProduct(a,b);
       
        System.out.println(d);
        int f=sumOfProduct(9,10);
       
        System.out.println(f);

    }
}