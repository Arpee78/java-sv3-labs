package typeconversion;

import java.util.Arrays;

public class ConversionMain {

    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.convertDoubleToDouble(3.14));
        byte[] bytes = conversion.convertIntArrayToByteArray(new int[]{5, -14, 6, 2, 125, 354, 9738, 3});
        System.out.println(Arrays.toString(bytes));
        System.out.println(conversion.getFirstDecimal(3.14));
    }
}
