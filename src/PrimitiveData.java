public class PrimitiveData {

    public static void main(String[] args) {


            int myValue = 10000;
            int myMinIntValue = Integer.MIN_VALUE;
            int myMaxIntValue = Integer.MAX_VALUE;
            System.out.println("Integer Minimum Value = " + myMinIntValue);
            System.out.println("Integer Minimum Value = " + myMaxIntValue);

            byte myMinByteValue = Byte.MIN_VALUE;
            byte myMaxByteValue = Byte.MAX_VALUE;
            System.out.println("Byte Minimum Value = " + myMinByteValue);
            System.out.println("Byte Max Value = " + myMaxByteValue);

            short myMinShortValue = Short.MIN_VALUE;
            short myMaxShortValue = Short.MAX_VALUE;
            System.out.println("Short Minimum Value = " + myMinShortValue);
            System.out.println("Short Max Value = " + myMaxShortValue);

            long myLongValue = 100L;
            long myMinLongValue = Long.MIN_VALUE;
            long myMaxLongValue = Long.MAX_VALUE;
            System.out.println("Long Minimum Value = " + myMinLongValue);
            System.out.println("Long Max Value = " + myMaxLongValue);

            int myTotal = (myMinIntValue / 2);
            // (tip de variabila dorita)(variabila) transforma tipul de variabila in cel din prima paranteza

            byte myNewByteValue = (byte)(myMinByteValue / 2);

            short myNewShortValue = (short)(myMinShortValue / 2);

            byte MyExByte = 6;
            short MyExShort = 124;
            int MyExInt = 1244;
            long MyExLong = 50000 + (10 * (MyExByte + MyExShort + MyExInt));


            // Single precision 32 bits - Double precision 64 bits
            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;
            System.out.println("Float minimum value = " + myMinFloatValue);
            System.out.println("Float max value = " + myMaxFloatValue);

            double myMinDoubleValue = Double.MIN_VALUE;
            double myMaxDoubleValue = Double.MAX_VALUE;
            System.out.println("Double minimum value = " + myMinDoubleValue);
            System.out.println("Double max value = " + myMaxDoubleValue);

            int myIntValue = 5 / 3;
            float myFloatValue = 5f / 3f;
            double myDoubleValue = 5d / 3d;
            System.out.println("MyIntValue = " + myIntValue);
            System.out.println("MyFloatValue = " + myFloatValue);
            System.out.println("MyDoubleValue = " + myDoubleValue);

            double myPound = 20;
            double myKg = myPound / 2.205d;
            System.out.println("I have " + myKg + " kg");


    }

}
