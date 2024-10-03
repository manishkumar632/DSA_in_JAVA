import java.lang.Math;
class DataTypes{
    public static void main(String[] args) {
        byte b = 123; // byte value range is -2^7 to 2^7 - 1
        // byte b = 128; it will give error because 128 > 127
        short s = 124; // short value range is -2^15 to 2^15 - 1
        double d = Math.pow(2, 31); // int value range is -2^31 to 2^31-1;
        long l = 1243l;
        char c = 'a' + 29;
        byte by = (byte) 4898;
        int i = 4898 / 256;
        int abc = 6;
        int result = abc++;
        System.out.println(result);
        System.out.println("hello");
    }
}