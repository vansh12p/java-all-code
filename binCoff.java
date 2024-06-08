import java.util.*;
public class binCoff {
    public static int factorial(int n){
       int f=1;
        for (int i=1;i<=n;i++){
            f =f * i ;
        }
        return f;
    }

    public static int binCoff(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        if(n>r){
            System.out.println("Enter the value of n and r");
        }
        else {
            System.out.println("that is not possible");

        }
        int binCoff=n_fact/(r_fact*nmr_fact);
        return binCoff;

       
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();

    System.out.println(binCoff(n,r));
    
}
    

    
}
