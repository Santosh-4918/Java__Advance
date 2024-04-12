public class Exception2 {
    public static void main(String[] args) {
        try {
            // open files
            System.out.println("open files");
            // do some processing
            int n = 3;
            System.out.println("n=" + n);
            int a = 45 / n;
            System.out.println("a=" + a);
            int b[] = { 10, 20, 30 };
            b[50] = 100;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
            // display the exception details
            System.out.println(ae);
        } finally {
            // close the files
            System.out.println("close files");

        }
    }
}
