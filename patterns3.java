import java.util.Scanner;

public class patterns3 {
    public static void half_pyramid(int n){
    for (int i=1;i<=n;i++){
        for (int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        
        System.out.println();
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of number n"   );
        int n=sc.nextInt();
        
        half_pyramid(n);
    }
    
}

