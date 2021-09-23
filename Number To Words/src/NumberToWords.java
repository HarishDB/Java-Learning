public class NumberToWords {


    public static int reverse(int number){
        //123 to 321,,,,,,,,rem =123n %10 == 3;
        // 123n /=10 == 12;

        int neg =0;
        if(number<0) {
            number = number * -1;
            neg = 1;
        }


        int reverseNum =0;
        while (number>0) {
            int lastdigit = number % 10;//3
            reverseNum =(reverseNum*10)+lastdigit;
            number /= 10;//12
        }
        if (neg==1)
            return -reverseNum;
        else return reverseNum;
    }

    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        if(number<=9)
            return 1;

        int count=0;
        while(number>0){
            int rem=number%10;
            number/=10;
            count++;
        }
        return count;
    }


    public static void numberToWords(int number){

        int Newcount = getDigitCount(number);
        number = reverse(number);//get reveresed number
        int count=0;
        if(number<0)
            System.out.println("Invalid Value");
        else {
            while (number > 0) {
                int lastdigit = number % 10;

                switch (lastdigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Should not be reachableeeeeeeeee");
                        break;
                }
                count++;
                number /= 10;//12
            }
        while (Newcount!=count){
            System.out.println("Zero");
            count++;
        }

        }
    }
}
