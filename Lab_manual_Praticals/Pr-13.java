public class StringMethodsDemo {
    public static void main(String[] args) {
        // Example string
        String text = "Hello, World!";

        // charAt() method
        char charAtIndex5 = text.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);

        // contains() method
        boolean containsWorld = text.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // format() method
        String formattedText = String.format("The length of the string is %d characters.", text.length());
        System.out.println(formattedText);

        // length() method
        int lengthOfString = text.length();
        System.out.println("Length of the string: " + lengthOfString);

        // split() method
        String[] splitWords = text.split(", ");
        System.out.println("Splitting the string:");
        for (String word : splitWords) {
            System.out.println(word);
        }
    }
}
