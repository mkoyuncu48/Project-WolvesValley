import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        GameState state = new GameState();

        //Initializing Characters
        InputHandler inputHandler = new InputHandler();
        inputHandler.handleCharacterInput("CharacterInput.txt",state);

        Character current = state.findCharacter("abuzerKomurcu");
        current.addCatchword("Sen itsin oglum, adam degilsin.");
        current.addCatchword("Ulen hayvan oğlu hayvan.");
        current.addCatchword("Anaydan eyi olmus lan itoglu.");
        current.addCatchword("Erdal, seni gebertirim lan it.");
        current.addCatchword("Agam, ittir nihayetinde, havlar.");
        current.addCatchword("Zurriyetsiz.");
        current.addCatchword("Seni bekledim de geldin mi lan itoglu.");

        String fileName1 = "CharacterInput.txt";


        // Program Starts

        current = state.findCharacter("abuzerKomurcu");
        System.out.print("Abuzer Komurcu: ");
        System.out.println(current.speakRandomly());


    }
}
