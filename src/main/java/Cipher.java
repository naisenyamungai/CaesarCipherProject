import java.io.Console;

class Cipher{

    public String yourWords;
    public String stringStep;


    public String userInput(){
        Console myConsole = System.console();
        System.out.println("Enter your word or letter");
         String inputWords = myConsole.readLine();
         String yourWords = inputWords.toUpperCase();
         return yourWords;
    }

    public Integer userStepValue(){
        Console myConsole = System.console();
        System.out.println("Enter your step value");
        String stringStep = myConsole.readLine();
        Integer yourStepValue = Integer.parseInt(stringStep);
        return yourStepValue;
    }

    public String encrypt(String yourWords, Integer yourStepValue){

        if(yourStepValue > 25){
            yourStepValue = (yourStepValue % 25);
        }else if(yourStepValue < 0 ){
            yourStepValue = (yourStepValue % 25) + 25;
        }

        String newWords = "";

        int length = yourWords.length();
        for(int i=0; i<length; i++){
            char anyLetter = yourWords.charAt(i);
            char letterNewPosition = (char)(anyLetter + yourStepValue);
            if(letterNewPosition > 'Z'){
                newWords += (char)(anyLetter - (26 - yourStepValue));
            }else{
                newWords += letterNewPosition;
            }
        }

       return newWords;

    }

    public String decrypt(String yourWords, Integer yourStepValue){

        if(yourStepValue > 25){
            yourStepValue = (yourStepValue % 25);
        }else if(yourStepValue < 0 ){
            yourStepValue = (yourStepValue % 25) + 25;
        }

        String newWords = "";

        int length = yourWords.length();
        for(int i=0; i<length; i++){
            char anyLetter = yourWords.charAt(i);
            char letterNewPosition = (char)(anyLetter - yourStepValue);
            if(letterNewPosition < 'A'){
                newWords += (char)(anyLetter + (26 - yourStepValue));
            }else{
                newWords += letterNewPosition;
            }
        }

        return newWords;

    }

}

