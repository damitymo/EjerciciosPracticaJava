import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Series> seriesList = new ArrayList<>();
        seriesList.add(new Series("Breaking Bad", "Netflix", 9.5));
        seriesList.add(new Series("The Sopranos", "Max", 6.5));
        seriesList.add(new Series("The boys", "Prime Video", 3.5));
        seriesList.add(new Series("Strangers things", "Netflix", 4.1));
        seriesList.add(new Series("Game of thrones", "Max", 9.9));
/*
        List <Series> netflixHighRatedSeries = new ArrayList<>();
        for (Series series: seriesList){
            if ("Netflix".equals(series.getPlatform())){
                if (series.getRating()>9.0){
                    netflixHighRatedSeries.add(series);

                }
            }
        }
        System.out.println("High-rated Netflix series (Imperative): ");
        for (Series series: netflixHighRatedSeries){
            System.out.println(series.getName());
        }

 */

        //TODO: generar nuevo evaluador para la plataforma
        SeriesEvaluator highRatingEvaluator= series -> series.getRating() >9.0;

        List <Series> netflixHighRatedSeries= seriesList.stream()
                .filter(series -> "Netflix".equals(series.getPlatform()))
                .filter(highRatingEvaluator::evaluate)
                .toList();

        List <String> netflixSeries= seriesList.stream()
                .filter(series -> "Netflix".equals(series.getPlatform()))
                .map(Series::getName)
                .toList();

        System.out.println("High-rated Netflix series: ");
        for (Series series: netflixHighRatedSeries){
            System.out.println(series.getName());

            System.out.println("Netflix series: ");
            netflixSeries.stream().forEach(System.out::println);
    }
}}