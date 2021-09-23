public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first,int second){
        if(first<10 || second<10)
            return -1;
        int firstRem =0,secondRem = 0,finalRem = 0;
        for(int i=1;i<=first;i++){
            if(first%i == 0){
                firstRem = i;
            }
            for(int j=1;j<=second;j++){
                if(second%j==0){
                    secondRem = j;
                    if(firstRem == secondRem)
                        finalRem = secondRem;
                }
            }
        }
        return finalRem;
    }

}
