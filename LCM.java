

public class LCM{

    static int naive_lcm(int num1 , int num2){

        // lcm must be greater than or equal to the largest number
        int lcm = Math.max(num1,num2);

        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                return lcm;
            }
            lcm++;
        }
    }


    //if given 2 numbers a , b
    //a x b = lcm(a,b) x gcd(a,b)
    //from that we can get lcm with the help of gcd

    static int gcd(int n1 , int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2,n1%n2);
    }

    static int lcm_with_gcd(int n1 , int n2){
        int multiply = n1*n2;
        return multiply/gcd(n1,n2);
    }

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 13;

        int lcm =  naive_lcm(num1,num2);
        System.out.println("lcm of " + num1 + " , " + num2 + " : " + lcm);

        int n1 = 9;
        int n2 = 12;
        int lcm2 = lcm_with_gcd(9,12);
        System.out.println("lcm of " + n1 + " , " + n2 + " : " + lcm2);

    }
}