class Strsplit {
    public static void main(String[] args) {
        // take a string
        String str = "Hello, Here is Practice Session for Java";

        // declare a string type array s to store pieces
        String s[];

        // split the String where a space is found in str
        s = str.split(" ");

        // display the pieces from s
        for (var i = 0; i < s.length; i++) {
            System.out.println(s[i]);

        }
    }

}