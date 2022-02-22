public class TeenNumberChecker {
    public static void main(String[] args) {

    }
    public static boolean hasTeen (int par1, int par2, int par3) {
        return isTeen(par1) || isTeen(par2) || isTeen(par3);
//        if (isTeen(par1) == true) {
//            return true;
//        } else if (isTeen(par2) == true) {
//            return true;
//        } else if (isTeen(par3) == true) {
//            return true;
//        } else {
//            return false;
//        }

    }

    public static boolean isTeen (int pAr) {
        return pAr >= 13 && pAr <= 19;
    }
}
