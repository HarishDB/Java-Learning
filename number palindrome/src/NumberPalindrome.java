public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        //123 to 321,,,,,,,,rem =123n %10 == 3;
        // 123n /=10 == 12;
        //rem =3*10 + 0=30
        if(number<0)
            number*=-1;

        int oldnum= number;
        int reverse =0;
        while (number>0) {
            int lastdigit = number % 10;//3
            reverse =(reverse*10)+lastdigit;
            number /= 10;//12
        }
        if(reverse==oldnum)
            return true;
        else return false;
    }
}
