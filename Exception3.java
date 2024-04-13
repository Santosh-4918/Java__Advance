import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

class IOExcep {

    // instance variable
    private String name;

    // method to accept name
    void accept() throws IOException {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name: ");
        name = br.readLine();
    }

    // method to display name
    void display() {
        System.out.println("Name: " + name);
    }
}

public class Exception3 {
    public static void main(String[] args) {
        IOExcep s = new IOExcep();
        s.accept();
        s.display();
    }

}
