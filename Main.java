
public class Main {
    public static void main(String[] args) {

        GameState state = new GameState();

        //Initializing Characters
        state.addCharacter("mehmetKarahanli","Baron");
        state.addCharacter("lazZiya","KonseyUyesi");
        state.addCharacter("husrevAga","KonseyUyesi");
        state.addCharacter("kilic","KonseyUyesi");
        state.addCharacter("testereNecmi","KonseyUyesi");
        state.addCharacter("samuelVanunu","KonseyUyesi");
        state.addCharacter("nizamettinGuvenc","KonseyUyesi");
        state.addCharacter("tombalaciMehmet","KonseyUyesi");

        state.addCharacter("deveTuncay","Gumrukcu");
        state.addCharacter("iplikciNedim","ParaBabasi");
        state.addCharacter("sevko","IstanbulSefiri");
        state.addCharacter("cakir","Tetikci");

        for(Character x : state.council){
            System.out.printf("%-20s:%12s\n", x.name, x.rank);
        }



        System.out.println("Kurtlar Vadisi'ne Hosgeldiniz");


    }
}
