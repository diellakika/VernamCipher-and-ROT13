import java.util.Scanner;
public class VernamCipher {

    public static String encrypt(String plainText,String key){
        StringBuilder cipherText=new StringBuilder();
        for (int i=0;i<plainText.length();i++){
            char encryptedChar=(char)(plainText.charAt(i)^key.charAt(i%key.length()));
            cipherText.append(encryptedChar);
        }
        return cipherText.toString();
        
    }


 public static String decrypt(String cipherText,String key){
    StringBuilder decryptedText=new StringBuilder();
    for (int i=0;i<cipherText.length();i++){
        char decryptedChar=(char)(cipherText.charAt(i)^key.charAt(i%key.length()));
        decryptedText.append(decryptedChar);
    }
    return decryptedText.toString();
}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter plaintext:");
        String plainText=scanner.nextLine();
        System.out.println("Enter key:");
        String key=scanner.nextLine();
        String encryptedText=encrypt(plainText,key);
        System.out.println("Encrypted text:"+encryptedText);
        String decryptedText=decrypt(encryptedText,key);
        System.out.println("Decrypted text:"+decryptedText);




    }
}
