import java.util.ArrayList;

public class GameState {
    ArrayList<Character> council = new ArrayList<>();
    Character current;
    public void addCharacterToCouncil(Character newCharacter){
        if(newCharacter != null) {
            council.add(newCharacter);
        }
    }

    public void addCharacter(String name, String rank){
        current = new Character(name, rank);
        if (rank.equals("KonseyUyesi") || rank.equals("Baron")){
            addCharacterToCouncil(current);
        }
    }
}
