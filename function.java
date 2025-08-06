import java.util.*;
public class function
{
    public static void calculater(int a,int b)// jav method bana k time integer pass krte h tb ye parameter hota
    {// yaha pr jo a b ha yo copy value ha main function se joo v change kre ge
        // vo ya pr change ho ga maint wala a or b me koi frk nhi pre ga
        a=99;
        b=100;
        int sum=a+b;
        System.out.println("sum :" + sum);
//        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int sum= a+b;
//        calculater(a,b);// call krne time jo pass krte h vo argument or actual parameter , yaha pr actual value pass ho rh ha
//        // formal parameter me hm lo sirf prarameter pass kia vo actual value nhi ntha
//        System.out.println("orgnal values of a and b :" + a+" " + b);
        //binomial cofficent
//        int result = binomialCofficent(5,2);
//        System.out.println("  binormila coficient is ncr = " + result);
//        prime_number(22);
//        boolean rersult=op_prime(13);
//        System.out.println(rersult);
        range_primenumber();









    }
    // lets find a factorial of number n
//    public static int factorial(int n)
//    {
//        int fac=1;
//        for (int i = 1; i < n; i++)
//        {
//            fac = fac*i;
//        }
//        return fac;
//    }
//    // lets find a binomial coficient NcR;n!/r!(n-r)!
//    public static int binomialCofficent(int n, int r)
//    {
//        int biono;
//        int n_factoria=factorial(n);
//        int r_factoria=factorial(r);
//        int nmr_factoria=factorial(n-r);
//        biono=n_factoria/(r_factoria*nmr_factoria);
//
//        return biono;
//
//    }
    // lets find the prime number
//    public static void prime_number(int n)
//    {
////        boolean number_N=true;
////        for (int i = 2; i < n-1; i++)
////        {
////            if((n%i)==0)
////            {
////                number_N=false;
////
////            }
////
////        }
////        System.out.println(number_N);
//
//    }
        //that is not the most optimal way  lets look for most optimal way
    public static boolean op_prime(int n)
    {

        for (int i = 2; i <=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                return false;
            }

        }return true;
    }
    // print the prime number between the reannge of the given number
    public static void range_primenumber()
    {
        int num1=10;
        int num2=20;
        for (;num1<= num2;num1++)
        {
//            System.out.println(num1);
            boolean result=op_prime(num1);// her i m chcking num1 is prime or not just by callinf method
            if(result) System.out.println(num1);
        }


    }


}
