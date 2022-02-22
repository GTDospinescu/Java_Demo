public class MegaByteCon {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(3000);

    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return; // return; ma scoate din metoda complet si nu mai ruleaza nimic dupa (in metoda)
        }
        int megaBytes = kiloBytes / 1024;
        int kiloBytesRemainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");

    }
}
