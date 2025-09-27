public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, String director, int choirSize,
                 Person musicAuthor, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Название спектакля: '" + getTitle() +
                "', продолжительность: " + getDuration() + " мин." +
                ", режиссёр: " + getDirector() + ", размер хора: " + choirSize + " человек" +
                ", " + musicAuthor + ", текст либретто: " + getLibrettoText() + ".";
    }
}