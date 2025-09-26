public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, String director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {

        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {

        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {

        return librettoText;
    }

    public void setLibrettoText(String librettoText) {

        this.librettoText = librettoText;
    }

    public void printLibrettoText() {

        System.out.println(librettoText);
    }

    @Override
    public String toString() {

        return "Режиссёр спектакля: " + getDirector();
    }
}