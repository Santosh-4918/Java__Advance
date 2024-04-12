public class Exception {
    public static void main(String args[]) {
        try {
            System.out.println("open files");
            int n = args.length;
            System.out.println("n=" + n);
            int a = 45 / n;
            System.out.println("a=" + a);
        } catch (ArithmeticException ae) {

            // display the exceptional message
            System.out.println(ae);

            // display any message
            System.out.println("Please pass data while running this program");
        } finally {
            // close the file
            System.out.println("Close files");
        }
    }
}