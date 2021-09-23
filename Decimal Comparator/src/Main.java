public class Main {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.12345,1.12364));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.12345,1.11364));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.133,1.133));

    }
}
