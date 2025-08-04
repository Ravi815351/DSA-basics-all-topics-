public class recursion
{
    public static void main(String[] args)
    {

//        decorder(10);
//        increnum(10);
//        System.out.println(factorial(10));
//        System.out.println(SumNatural(10));
//        System.out.println(fabnachi(25));
        int arr[]={1,2,3,4,4,5,6,7};
//        System.out.println(sorted(arr,0));
//        System.out.println(Firstacurenc(arr,0));
//        System.out.println(LastAcurenc(arr,0));
        System.out.println(Xpower(3,3));

    }
    public static void decorder(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        decorder(n-1);
    }
    public static void increnum(int n)
    {
        if(n==1)
        {
            System.out.print(n +" ");
            return;

        }
        increnum(n-1);
        System.out.print(n +" ");
    }
    // for finding the factorial
    public static int factorial(int n )
    {
        if (n==0)return 1;
        int fnm1=factorial(n-1);
        int  fn=n*fnm1;
        return fn;



    }
    //sum n natural number
    public static int SumNatural(int n)
    {
        if (n==0)return 0;
        int FofN=SumNatural(n-1);
        int sum=n+FofN;
        return sum;
    }
    // print the nTH term of fabnachi number
    public static int fabnachi(int n  )
    {
        if(n==0 || n==1)
          return n;
        int f1=fabnachi(n-1);
        int f2= fabnachi(n-2);
        return f2+f1;


    }
    // check wether the given arry is sorted or not
    public static boolean sorted(int arr[],int i)
    { if(i==arr.length-1)return true;
       if(arr[i]>arr[i+1]) return false;
       boolean fOFn=sorted(arr,i+1);
       return fOFn;


    }

    //find the index of first acurance of that element
    public static int Firstacurenc(int arr[],int i)
    {
        if (arr[i]==4)return i;
        if(i==arr.length-1)return -1;
        int index=Firstacurenc(arr,i+1);
        return index;
    }
    //find last accurance
    public static int LastAcurenc(int arr[],int i)
    {
        if (arr[arr.length-1-i]==10)return arr.length-1-i;//
        if(i==arr.length-1)return -1;
        int index=LastAcurenc(arr,i+1);
        return index;
    }

    // X to the power N
    public static int Xpower(int x ,int n)
    { if (n==0)return 1;
        int fon=Xpower(x,n-1);
        int result=x*fon;
        return result;//
    }



}