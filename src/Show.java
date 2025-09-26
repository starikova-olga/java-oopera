import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private String director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, String director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Название спектакля: '" + title + "', продолжительность: " + duration + " мин." +
                ", режиссёр: " + director + ".";
    }


    public boolean removeActor(Actor actor) {

        return listOfActors.remove(actor);
    }

    public boolean isActorExists(Actor actor) {

        return listOfActors.contains(actor);
    }


    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    public String getDirector() {

        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }



    public ArrayList<Actor> getListOfActors() {

        return listOfActors;
    }

    public void printActorsList() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());

        }
    }


    public boolean addActor(Actor actor) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.equals(actor)) {
                System.out.println("Актёр с такими данными уже существует в списке.");
                return false;
            }
        }
        listOfActors.add(actor);
        return true;
    }

    public boolean replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return true;
            }
        }
        System.out.println("Актёр с такой фамилией" + surname + " не найден.");
        return false;

    }
}
