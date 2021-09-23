public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        //123

        if (number < 0)
            return -1;
        if(number==0)
            return 0;
        int LastDigit = number%10;


        int rev=0;int rem=0;
        while (number>0){
            rem =number%10;
            rev =(rev*10)+rem;
            number/=10;
        }

        int FirstDigit=rev%10;

        return FirstDigit+LastDigit;
    }
}
