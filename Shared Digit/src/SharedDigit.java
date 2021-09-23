public class SharedDigit {
    public static boolean hasSharedDigit(int num1,int num2){
        if(num1<10 || num1 >99 || num2<10 || num2 >99)
            return false;

        int rem1,rem2=0;
        int oldnum2 =num2;
        while (num1>0){
            rem1=num1%10;
            System.out.println(rem1);
            num2 = oldnum2;
            while (num2>0){
                rem2 = num2%10;
                System.out.println("In 2nd loop"+rem2);
                if(rem1==rem2)
                    return true;

                num2 /=10;
            }
            num1/=10;
        }
        return false;
    }
}
