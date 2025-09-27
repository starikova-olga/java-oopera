public class Person {
   protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;

    }

    public enum Gender {
        MALE,
        FEMALE
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Имя: '" + name + ", Фамилия: " + surname + "', пол: " + gender;
    }
}

