
public class App{
    public static void main(String [] args){
        Cipher c = new Cipher();
        String text = c.userInput();
        Integer step = c.userStepValue();
        String cipherWord = c.encrypt(text, step);
        System.out.println("Your encrypted word is " + cipherWord);

        String decrypted = c.decrypt(cipherWord ,step);
        System.out.println("Your decrypted word is " + decrypted);

    }
}
