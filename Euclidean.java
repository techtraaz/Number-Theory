
public class Euclidean{

    
    static void nonRecursive(int num1 , int num2){
        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);
        while(min != 0){
            int temp = min;
            min = max % min;
            max = temp;
        }

        System.out.println("gcd of " + num1 + " , " + num2 + " : " + max);
    }

    //if gets parameters in ascending order

    static int nonRecAsc(int n1 , int n2){
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }


    //recursive way

    static int rec(int a , int b){
        if(b==0){
            return a;
        }
        return rec(b,a%b);
    }

    public static void main(String[] args){

        nonRecursive(45,15);
        int num1 = 13;
        int num2 = 65;
        System.out.println("gcd of " + num1 + " , " + num2 + " : " + nonRecAsc(num1,num2));
        System.out.println("gcd of " + num1 + " , " + num2 + " : " + rec(num1,num2));
        


    }
}