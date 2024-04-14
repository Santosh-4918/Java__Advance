
import java.io.*;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) throws IOException {
        // Create linked list to store strings
        LinkedList<String> ll = new LinkedList<>();

        // add some name in String
        ll.add("India");
        ll.add("bihar");
        ll.add("Delhi");

        System.out.println("List = " + ll);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String element;
        int pos, choice = 0;

        // Menu
        while (choice < 8) {
            System.out.println("\n LINKEDLIST OPERATION");
            System.out.println("1.Add element at First Position");
            System.out.println("2.Add Last element:");
            System.out.println("3.Add element at Any Position");
            System.out.println("4.Remove First:");
            System.out.println("5.Remove Last:");
            System.out.println("6.Remove Element at Position:");
            System.out.println("7.Change element:");
            System.out.println("8.EXIT");

            System.out.println("Enter Your Choice :");
            choice = Integer.parseInt(br.readLine());

            // perform a task depending on user choice
            switch (choice) {
                case 1:
                    System.out.println("Enter First element:");
                    element = br.readLine();
                    ll.addFirst(element);
                    break;
                case 2:
                    System.out.println("Enter last element:");
                    element = br.readLine();
                    ll.addLast(element);
                    break;
                case 3:
                    System.out.println("Enter element at Position:");
                    element = br.readLine();
                    System.out.println("At Which Position ?");
                    pos = Integer.parseInt(br.readLine());
                    ll.add(pos - 1, element);
                    break;
                case 4:
                    System.out.println("Delete First element:");
                    ll.removeFirst();
                    break;
                case 5:
                    System.out.println("Delete Last element:");
                    ll.removeLast();
                    break;
                case 6:
                    System.out.println("Delete position element:");
                    pos = Integer.parseInt(br.readLine());
                    ll.remove(pos - 1);
                    break;
                case 7:
                    System.out.println("Enter Position to change element:");
                    pos = Integer.parseInt(br.readLine());
                    System.out.println("Enter new Element");
                    element = br.readLine();
                    ll.set(pos - 1, element);
                    break;

                default:
                    return;
            }
            // use Iterator to retrieve element
            System.out.print("List = ");
            Iterator<String> it = ll.iterator();
            while (it.hasNext()) {
                // String s = (String) it.next();
                System.out.print(it.next() + " ");

            }

        }
    }
}
