public class MusicalShow extends Show {
    protected Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, String director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {

        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {

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