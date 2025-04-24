import java.util.Random;
public class Character {
    String name;
    String rank;
    Character[] Enemies = new Character[5];
    String[] catchwords = new String[10];
    int catchwordCount;
    Character(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public void addCatchword(String newCatchword){
        catchwords[catchwordCount] = newCatchword;
        catchwordCount ++;
    }

    public String speakRandomly(){
        Random rand = new Random();
        int randInt = rand.nextInt(catchwordCount);
        return catchwords[randInt];
    }
}
