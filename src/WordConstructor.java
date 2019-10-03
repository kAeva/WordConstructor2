import java.util.Scanner;

public class WordConstructor {
      public static void main (String [] args) {

        String word;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Type the word java here:\t");
        word = inputDevice.next();
        OrdinaryLetter [] availableLetters = {new LetterJ(), new LetterA(), new LetterV(), new LetterK()};
        OrdinaryLetter [] wordToBuild = new OrdinaryLetter[word.length()];




        for(int i=0; i<word.length();i++){
            System.out.println("checking a " + word.charAt(i) + " letter on a position: " + i);
            for(int k=0; k<word.length(); k++) {
                System.out.println("object letter on position " + k + " testing: " + availableLetters[k]);
                if(word.charAt(i)==availableLetters[k].letterValue){
                    wordToBuild[i] = availableLetters[k];
                    System.out.println("value changed");
                    System.out.println( "builderLetters from " + k + " now is " + wordToBuild[i]);
                    break;
                } else {
                    System.out.println("value didn't found");

                }

            }
        }

                 builder(wordToBuild);
        }



    public static void builder(OrdinaryLetter[] oLet) {


            for (int k=0; k<oLet.length; k++) {
                oLet[k].firstLine();
            }
            System.out.println();

            for (int k=0; k<oLet.length; k++) {
                oLet[k].secondLine();
            }
            System.out.println();

            for (int k=0; k<oLet.length; k++) {
                oLet[k].thirdLine();
            }
            System.out.println();
            for (int k=0; k<oLet.length; k++) {
                oLet[k].fourthLine();
            }
            System.out.println();

            for (int k=0; k<oLet.length; k++) {
                oLet[k].fifthLine();
            }
            System.out.println();

    }
}
