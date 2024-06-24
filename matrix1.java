import java.util.*;
public class matrix1 {
    public static void search(int matrix[][], int key){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]==key){
                    System.out.print("key is the found at the index ("+i + ","+j+")");
                }
            }
        }
        System.out.println("not found");

    }
    public static void main(String[]args){
        int matrix[][]=new int[3][3];
        int n=3; int m=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] +" ");
                
            }
            System.out.println();
        }
        search(matrix ,5);

    }
    
}
