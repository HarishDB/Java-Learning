public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){

       int d1 = (int) (num1 *1000);
        int d2 = (int) (num2 *1000);
        return d1 == d2;
    }
}
