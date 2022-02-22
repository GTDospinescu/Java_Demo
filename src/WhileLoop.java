public class WhileLoop {
    public static void main(String[] args) {



        System.out.println(isEvenNumber(5));

//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
//
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

    }

    public static boolean isEvenNumber(int number){
        if(number % 2 ==0){
            return true;
        }
        return false;
    }

}
