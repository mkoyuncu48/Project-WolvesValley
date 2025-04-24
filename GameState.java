import java.util.ArrayList;

public class GameState {
    Character[] characters = new Character[100];
    int characterCount;
    ArrayList<Character> council = new ArrayList<>();
    Character current;
    public void addCharacterToCouncil(Character newCharacter){
        if(newCharacter != null) {
            council.add(newCharacter);
        }
    }

    public void addCharacter(String name, String rank){
        current = new Character(name, rank);
        characters[characterCount] = current;
        characterCount ++;
        if (rank.equals("KonseyUyesi") || rank.equals("Baron")){
            addCharacterToCouncil(current);
        }
    }

    public Character findCharacter(String name){
        for(Character character : characters ){
            if(character == null)
                return null;
            if(name.equals(character.name))
                return character;
        }
        return null;
    }

}
