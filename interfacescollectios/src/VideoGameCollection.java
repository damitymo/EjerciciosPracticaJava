import java.time.LocalDate;
import java.util.*;

public class VideoGameCollection {

    List <PCGames> gameList = new ArrayList<>();
    Set <String> uniqueGenres = new HashSet<>();
    Map <String, LocalDate> lastPlayed= new HashMap<>();


    //add

    public  void  addGame(VideoGames game){
        gameList.add((PCGames) game);
        uniqueGenres.add(game.getGenre());
    }

    //marcar un juego como jugado
    public void markAsPlayed(){
        lastPlayed.put(title(), LocalDate.now());

    }



}
