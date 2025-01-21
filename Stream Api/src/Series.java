public class Series {
    private String name;
    private String platform;
    private double rating;

    //TODO: Sumar dos parametros mas

    public Series(String name, String platform, double rating) {
        this.name = name;
        this.platform = platform;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", rating=" + rating +
                '}';
    }
}
