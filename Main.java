
public class Main{

    static void gcd(int a , int b){

        int min = Math.min(a,b);

        //any number can be divided by itself and 1
        //so initialize gcd with 1
        int gcd = 1 ;

        for(int i=1;i<= min ;i++){
            if(a%i == 0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("gcd of " + a + " , " + b + " is : " + gcd);

    }

    //above method is not efficient as it runs from 1 all the way up to min
    //so theres a efficient way of finding gcd
    
    //from theort we know gcd must be less than or equal to the minimum number of 2 numbers
    //so if both numbers are divisable by the minimum number we got the gcd
    //if not we will decrement it and get the gcd up until 1

    static void gcd2(int x , int y){

        int min = Math.min(x,y);

        while(min > 0){
            if(x%min == 0 && y%min == 0){
                break;
            }
            min --;
        }

        System.out.println("gcd of " + x + " , " + y + " is :" + min);
    }

    public static void main(String[] args){
        System.out.println("hello");
        gcd(65,18);
        gcd2(56,34);
    }
}
