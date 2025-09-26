
public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Михаил", "Барышников", Person.Gender.MALE, 170.5);
        Actor actor2 = new Actor("Михаил", "Фокин", Person.Gender.MALE, 170);
        Actor actor3 = new Actor("Сергей", "Полунин", Person.Gender.MALE, 165.5);
        System.out.println(actor1.toString());
        System.out.println(actor2.toString());
        System.out.println(actor3.toString());


        Director director1 = new Director("Александр", " Горский", Person.Gender.MALE, 10);
        Director director2 = new Director("Юрий", " Григорович", Person.Gender.MALE, 12);
        System.out.println(director1.toString());
        System.out.println(director2.toString());


        MusicComposer composer = new MusicComposer("Пётр Чайковский");
        System.out.println(composer.toString());


        Choreographer choreographer = new Choreographer("Лев Лукин");
        System.out.println(choreographer.toString());


        Show show = new Show("Обычный", 120, "Александр Горский");

        Opera opera = new Opera("Оперный", 90, "Юрий Григорович", 20,
                "Пётр Чайковский", "текст либретто");

        Ballet ballet = new Ballet("Балет", 60, "Александр Горский",
                "Пётр Чайковский", "Текст либретто", "Лев Лукин");

        System.out.println(show.toString());
        System.out.println(opera.toString());
        System.out.println(ballet.toString());

        show.addActor(actor1);
        opera.addActor(actor3);
        opera.addActor(actor2);
        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Актёры в спектакле '" + show.getTitle() + "':");
        show.printActorsList();
        System.out.println("Актёры в спектакле '" + opera.getTitle() + "':");
        opera.printActorsList();
        System.out.println("Актёры в спектакле '" + ballet.getTitle() + "':");
        ballet.printActorsList();


        System.out.println("Производится замена актёра...");

        if (show.isActorExists(actor1)) {
            // Актёр существует, можно выполнять замену
            show.replaceActor(actor2, actor1.getSurname());
            System.out.println("Актёр " + actor1.getName() + " " + actor1.getSurname() +
                    " заменён на актёра " + actor2.getName() + " " + actor2.getSurname() + ".");
        } else {
            System.out.println("Актёр " + actor1.getSurname() + " не найден в списке.");
        }
        show.removeActor(actor1); // Удаляем actor1 из show
        opera.removeActor(actor2); // Удаляем actor2 из opera (если он там есть)
        show.addActor(actor2); // Добавляем actor2 в show


        // Выводим обновлённый список актёров для show
        System.out.println("Обновлённый список актёров в спектакле '" + show.getTitle() + "':");
        show.printActorsList();

        System.out.println("Текст либретто оперного спектакля: " + opera.getLibrettoText());
        System.out.println("Текст либретто балетного спектакля: " + ballet.getLibrettoText());

    }
}
