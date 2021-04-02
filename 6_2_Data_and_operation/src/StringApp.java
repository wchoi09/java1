import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class StringApp {
    public static void main(String[] args) {
        
        // Character VS String
        System.out.println("Hello, World"); // String
        System.out.println('H'); // Character
        System.out.println("H"); // String

        System.out.println(
            "Hello, World");
        
        System.out.println("Hello "
        + "World!");

        // new line
        System.out.println("Hello \nWorld");

        // escape
        System.out.println("Hello \"World\""); // Hello "World"
    }
}
