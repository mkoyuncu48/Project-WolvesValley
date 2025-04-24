import java.io.*;
import java.util.*;


public class InputHandler {



    public void handleCharacterInput(String fileName, GameState state) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNextLine()){
            String Line = inputFile.nextLine(); // Grabbing a line
            String[] strParts = Line.split(","); // Dividing a line by comma
            state.addCharacter(strParts[0],strParts[1]);
        }
    }








}
