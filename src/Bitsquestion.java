public class Bitsquestion {
    public static void main(String[] args) {
//      ODDorEven(55);//for odd check
//      ODDorEven(56);//for even check
//        ithBit(3);
        countSetBit();
    }
    // check the number is odd or even  using bits
//    public static void ODDorEven(int n)
//    {
//        //just we have to find the last bit of the number
//        //for that we will use & AND bits wise operator
//        //n&1 will outpit will be last bit of the n number
//        //ther is only two posibily 1 or 0 1 means odd and 0 means even
//        if((n&1)==1) System.out.println("Number is ODD");
//        else System.out.println("Number is even");
//    }
    // lets find th ith bit of any number
//    public static void ithBit(int i)
//    {
//        int num=8;// we will find the (i)th bits of this number
//        //for that we will use binary right shift
//        // AND WE WILL use &bit operator for for finding the bit on that index
//        System.out.println(num>>i&1);//num ko hmlog utna right shif kre ge jitna i ka value rhe ga
//        //i jitna values discart hoo jae ga or fir ith idex wala first position pr aajae ga
//        //fir 1 sa & operation kr k find kr lege ki us positions pe kon ha
//        //ith value is liye right sift kr rhe q ki ndex 0 se start hota h
//
//
//    }
//    // set ith bit mean ith number wala bit ko one bnae
//    // hm vo number se OR kre ge jime sirf th bit 1 rhe baki sb zero  therfor output me sirf ith bit change hoga
//    public static void setIthbit(int i)
//    {
//        int num=8;
//        int bitmask=1<<i;
//        System.out.println(num&bitmask); // left left shit 1<<i will generate one number which will have 1 in ith position only
//        // if will do & with num then ith bit will become 1
//    }
//    // clear bit means make 0 in ith bit
//    public static void clearBit(int i)
//    {
//        int num =11;
//        int bitmask=~(1<<i);
//        System.out.println(num&bitmask);
//
//    }
    public static void countSetBit()
    {
        int num=88;
        int setbitCount=0;
//        if(num!=0)
        {
            while (num!=0)
            {
                if((num & 1)==1)
                {
                    setbitCount++;

                }
                num=num>>1;

            }
        }
        System.out.println(" number of set bit;"+setbitCount);

    }

}