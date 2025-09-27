
public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, String director, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    public String getChoreographer() {

        return choreographer;
    }
    @Override
    public String toString() {
        return "Название спектакля: '" + getTitle() + "', Продолжительность: " + getDuration() + " мин." +
                ", режиссёр: " + getDirector() + ", автор музыки: " + getMusicAuthor() +
                ", текс либретто: " + getLibrettoText() + ", хореограф: " + choreographer + ".";
    }

}
