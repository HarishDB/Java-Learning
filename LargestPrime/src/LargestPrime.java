
public class LargestPrime {

	public static int getLargestPrime(int number) {
		if (number<0) {
			return -1;
		}
		int maxPrime =0;
		
		
		
		
		
		for(int i=1; i<=number; i++){
            if(number%i==0) {
            	
            if(isPrime(i)) {
            	maxPrime = i;
            }
            	
            	
            }
        }
		
		
		
		
		
		if(maxPrime==0) {
			return -1;
		}
		
			return maxPrime;
		
	}
	
	public static boolean isPrime(int number) {
		
		for(int i=1;i<number/2;i++) {
			if(number %i != 0)
				return true;
		}
		
			return false;
		
		
		
	}
}
