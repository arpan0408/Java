public class Type_casting {
    public static void main(String[]args) {
        byte b = 123;
        int i = 123456;
        float f = 12.34f;
        long l = 75564;
        double d = 758.548;

        int bi = b;
        float fi = i;

        System.out.println("byte: "+b+"(int)"+bi);
        System.out.println("int into (byte)"+(byte)i);
        System.out.println("int: "+i+"(float)"+fi);
        System.out.println("float into (int)"+(int)f);
        System.out.println("Long: "+l+" into (double)"+(double)l);
        System.out.println("Double: "+d+" into (long)"+(long)d);
    }
}