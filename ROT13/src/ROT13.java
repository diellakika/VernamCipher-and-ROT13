import java.util.Scanner;
public class ROT13 {

    public static String enkriptoMeROT13(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
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

        String encrypted = enkriptoMeROT13(input);
        String decrypted = enkriptoMeROT13(encrypted); // ROT13 është reversible

        System.out.println("\nEncrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
