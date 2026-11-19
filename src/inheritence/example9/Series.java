package inheritence.example9;

public class Series extends Film {

    int amountOfEpisodes;

    public Series(String name, int yearOfRelease, int ratings, int announce, int amountOfEpisodes) {
        super(name, yearOfRelease, ratings, announce);
        this.amountOfEpisodes = amountOfEpisodes;
    }
}
