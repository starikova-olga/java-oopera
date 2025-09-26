public class MusicComposer {
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public MusicComposer(String name) {

        this.name = name;
    }


    @Override
    public String toString() {

        return "Автор музыки: " + name + ".";
    }
}