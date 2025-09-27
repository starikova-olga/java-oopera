public class MusicComposer extends Person {

    public MusicComposer(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }


    @Override
    public String toString() {

        return "Автор музыки: " + getName() + " " + getSurname() ;
    }
}