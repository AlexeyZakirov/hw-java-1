public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));


        String work = "Test";
        int age = 8;

        System.out.println(work.equals("Test") && age == 8);
        System.out.println(work.equals("Apple") || age == 8);
        System.out.println(work.equals("Apple") || age == 34);
        System.out.println(work.equals("Test") && age == 34);


        byte value1 = 127;
        byte value2 = 10;

        byte result = (byte) (value1 + value2);
        System.out.println("Result: " + result);


        int c = 10;
        double d = 4.5;

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));
    }
}
