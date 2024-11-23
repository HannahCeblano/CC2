public class BinaryToUnicode {
    public static void main(String[] args) {
        String binary = "11001110"; // Example: Binary for 't' (U+0074)
        int codePoint = Integer.parseInt(binary, 2); // Parse binary to integer
        String character = new String(Character.toChars(codePoint)); // Convert to Unicode character
        System.out.println("Character: " + character);
    }
}