public class DigitSum {
    public static void main(String[] args) {
        System.out.println( sumDigits(11111));
    }
    public static int sumDigits(int number){
        if(number<10)
            return -1;
        else
        {
            int sum=0;
        while (number>0){
            int remainder = number%10;
            number = number/10;

            sum=sum+remainder;

        }
            return sum;
        }

    }
}
