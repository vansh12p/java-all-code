import java.util.*;
public class primeOrNot {
    public static boolean isPrime(int n) {
       
        if(n==2)  {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
            
        }
        return true;
       

    }
    public static void allprime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        allprime(n);
    }

}
