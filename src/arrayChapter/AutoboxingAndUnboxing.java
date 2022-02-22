package arrayChapter;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        String[] stringArray = new String[5];
        int[] intArray = new int[10];
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Teo");
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);
        Integer integer2 = Integer.valueOf(54);
        Integer integer3 = 56;
        //un ArrayList nu poate contine primitive data types (!!! String nu e primitive)
        //Integer, Double, String sunt wrapper class peste un tip primitiv care ofera acces la mai multe metode.
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i<=10; i++) {
            integerArrayList.add(Integer.valueOf(i)); //.valueOf() - ia un int si ret un Integer
//            integerArrayList.add(i);
        }

        for (int i = 0; i<=10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue()); //.intValue() ia un Integer si ret un int
//            System.out.println(i + " --> " + integerArrayList.get(i));
        }

        Integer myIntValue = 57;



    }



}
