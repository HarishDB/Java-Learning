public class Main {
    public static void main(String[] args) {
        int sum = 0;int c = 0;
        for(int i= 1;i<=1000;i++){
            if (i%3==00 && i%5==0){
                System.out.println(i+" is the number");
                sum+=i;
                c++;
                if(c==5)
                    break;
            }

        }
        System.out.println(sum+" is the sum of those numbers");
    }
}
