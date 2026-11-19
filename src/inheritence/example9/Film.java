package inheritence.example9;

public class Film extends Media {

    int raiting;
    int announce;

    public Film(String name, int yearOfRelease, int raiting, int announce) {
        super(name, yearOfRelease);
        this.raiting = raiting;
        this.announce = announce;
    }
}
