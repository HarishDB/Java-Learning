public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0) return -1;
        if(number==0) return 0;


        int rema,sum = 0;
        while (number>0){
            rema =number%10;
            number/=10;
            if(rema%2==0){
                sum +=rema;
            }

        }
        return sum;
    }
}
