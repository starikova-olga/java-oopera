
public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, String director, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {

        return choreographer;
    }
    @Override
    public String toString() {
        return "Название спектакля: '" + getTitle() + "', Продолжительность: " + getDuration() + " мин." +
                ", режиссёр: " + getDirector() + ", " + musicAuthor +
                ", текс либретто: " + getLibrettoText() + ", " + choreographer;
    }

}
