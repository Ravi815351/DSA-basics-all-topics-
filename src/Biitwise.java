public class Biitwise
{
    public static void main(String[] args)
    {
        BinarytoDecimal();
        bitswiseoperator();


    }
    //lest look for the conversion binarry number to decimal number
    public static void BinarytoDecimal()
    {
        int num1=1000110101;
        double result=0;
        int i=0;
        while (num1>0)
        {
            int sinlebit=num1%10;//remainder le kr dekh lete tha ki last digit kya ha
            if(sinlebit==1)result=result+Math.pow(2,i);//last digit kya tha uske anusar result store kr dete tha
            num1=num1/10;//last digit use kr liye h fir usko remove krne k liye divide kr rhe h
            i++;
        }
        System.out.println( (int)result);

    }
    //bits wise operater
    public static void bitswiseoperator()
    {
        //1- &   AND
        System.out.println( 6&5);// dogin AND operations in bits wise //output is 4
        // 6 and 5 get in bits and then AND operation is performed
        //&   and && both are differations single and means bit leve opertations
        //&& means doing and operation but and in bit level jus for comaresion
        System.out.println(6+5); // this is jus sum


        //2-OR    | binarry OR
        System.out.println(5|6);//out put is 7
        //operations in bit level
        //    || and |   both are not same

        // binary XOR ^
        System.out.println(6^5);// its doenot mean power
        // its XOR operations in bit level


        //binary One`s complement   -   ~
        System.out.println(~5);// its will not match with corret answer
        // reson 5 in the computer is represent in large bits and further with xyz concept se change hoo jata ha


        // Binary Left Shift <<
        //  a<<b   or 5<<2   means shifting a b times to wards left in bits level
        //shif krne k bad jo empty apace rhata h bit me voo zero se fill up
        System.out.println(6<<2);
        // a<<b =a*2 power b    all this at bit level


        //BInary Right Shift >>
        // same conceft as left shift just shifting right shide
        //a>>b   a shited b times to wards right   jo right sift ho ta ha vo values discard ho jata ha
        //
        System.out.println(6>>2);
        //A>>B=A/2power B
    }


}