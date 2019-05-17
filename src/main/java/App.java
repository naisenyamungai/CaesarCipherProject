
public class App{
    public static void main(String [] args){
        Encryption e = new Encryption();
        Decryption d = new Decryption();
        String text = e.userInput();
        Integer step = e.userStepValue();
        String cipherWord = e.encrypt(text, step);
        System.out.println("Your encrypted word is " + cipherWord);

        String decrypted = d.decrypt(cipherWord ,step);
        System.out.println("Your decrypted word is " + decrypted);

    }
}
