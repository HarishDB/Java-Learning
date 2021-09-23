public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int x, y, z;
            x = kiloBytes;
            y = kiloBytes / 1024;
            z = kiloBytes % 1024;
            System.out.println(x + " KB = " + y + " MB and " + z + " KB");
        }


    }
}
