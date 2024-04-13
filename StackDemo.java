
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack<>();
        int pos, element;
        int choice = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Display Menu to choose for user choice<=4
        while (choice < 4) {

            System.out.println("STACK OPERATION");
            System.out.println("1 Push an element.");
            System.out.println("2.Pop an element.");
            System.out.println("3.Peek an element.");
            System.out.println("4.Search an element.");
            System.out.println("5.Exit");

            System.out.println("Your Choice: ");
            choice = Integer.parseInt(br.readLine());
            // perform a task depending on user choice
            switch (choice) {
                case 1:
                    System.out.println("Enter element: ");
                    element = Integer.parseInt(br.readLine());
                    st.push(element);
                    break;
                case 2:// System.out.println("Delete which element ?");
                       // pos=Integer.parseInt(br.readLine());
                    Integer obj = st.pop();
                    System.out.println("Popped element :" + obj);
                    break;
                case 3:
                    Integer objpeek = st.peek();
                    System.out.println("Peeked element :" + objpeek);
                    break;
                case 4:
                    System.out.println("Search which element ?");
                    element = Integer.parseInt(br.readLine());
                    pos = st.search(element);
                    if (pos == -1) {
                        System.out.println("Element not found.");
                    } else
                        System.out.println("position= " + pos);
                    break;

                default:
                    return;
            }
            System.out.println("Stack contents: " + st);
        }
    }
}