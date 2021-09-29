package teamactivity;


public class Main {


    public static void main(String[] args) {

        Player p = new Player("Steve", 50, 1000, 10);

        System.out.println(p);

        Game theGame = new Game();
        theGame.saveGame(SAVE_FILE);

        Game newGame = Game.loadGame(SAVE_FILE);
        System.out.println(newGame.getPlayer());


        p.addEquipment("Sword", 10);
        p.addEquipment("Shield", 40);
        p.addEquipment("Lunch", 100);
        System.out.println(p);

        theGame.saveGame(SAVE_FILE);
        GamethirdGame = Game.loadGame(SAVE_FILE);
        System.out.println(thirdGame.getPlayer());

    }
}
