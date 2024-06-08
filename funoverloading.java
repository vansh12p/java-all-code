// using parameter execute this code uncomment this code line and comment all line given below code .
// public class funoverloading {
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main (String [] args){
//         System.out.println(sum(3,5));
//         System.out.println(sum(3,5,4));
//     }
    
// }


//using data type
public class funoverloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static void main (String [] args){
        System.out.println(sum(3,5));
        System.out.println(sum(3.9f,5,4));
    }
    
}
