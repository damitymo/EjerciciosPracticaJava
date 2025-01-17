import java.time.LocalDate;

public class PCGames implements  VideoGames{

    private String title;
    private String genre;
    private LocalDate releaseDate;

    public PCGames() {
    }

    public PCGames(String title, String genre, LocalDate releaseDate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public LocalDate releaseDate() {
        return null;
    }



}
