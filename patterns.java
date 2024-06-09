import java.util.*;
public class patterns {
    public static void hollow_pattern(int totrow,int totcols){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcols;j++){
                if(i==1 || i==totrow || j==1 || j==totcols){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totrow=sc.nextInt();
        int totcols=sc.nextInt();
        hollow_pattern(totrow,totcols);
    }
    
}
