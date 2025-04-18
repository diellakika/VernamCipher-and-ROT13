import java.util.Scanner;
public class rot13 {
    public static String rot13(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + 13) % 26 + base));
            } else {
                result.append(c); // Nuk i prekim numrat/simbolet
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp tekstin për ta enkriptuar me ROT13: ");
        String input = scanner.nextLine();

        String encrypted = rot13(input);
        String decrypted = rot13(encrypted); // ROT13 është reversible

        System.out.println("\nEncrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
