package teamactivity;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Game {
    Player thePlayer;

    Public Game(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    Public Player getPlayer() {
        return thePlayer;
    }

    Public void saveGame(String filenaame) {
        Gson gson = newGson();

        String playerData = gson.toJson(thePlayer);

        try(Writer w = new BufferedWriter(new outputStreamWriter(new FileOutputStream(filename), "UTF-8"))) {
            w.write(playerData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static Game loadGame(String filename)
    {
        String gameData = null;

        try{
            byte[] encoded = Files.readallBytes(Paths.get(filename));
            gameData = new String(encoded, "UTF-8");
        }catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = newGson();
        Player savedPlayer = gson.fromJson(gameData, Player.class);

        Game newGame = new Game(savedPlayer);

        return newGame;
    }
}
