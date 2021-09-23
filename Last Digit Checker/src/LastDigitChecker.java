public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        if (num1 <10 || num1>1000 || num2 <10 || num2>1000 || num3 <10 || num3>1000)
            return false;


        int Lastdigit1,Lastdigit2,Lastdigit3;

        Lastdigit1= num1%10;
        Lastdigit2=num2%10;
        Lastdigit3=num3%10;

        if((Lastdigit1==Lastdigit2)||(Lastdigit2==Lastdigit3)||(Lastdigit1==Lastdigit3))
            return true;
        else return false;

    }
    public static boolean isValid(int num1){
        if(num1>=10 && num1<=1000)
            return true;
        else return false;
    }
}
