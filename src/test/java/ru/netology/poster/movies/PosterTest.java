package ru.netology.poster.movies;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test

    public void shouldFindAll() {
        Poster poster = new Poster();

        poster.addMovie("Бладшот");
        poster.addMovie("Вперед");
        poster.addMovie("Отель Белград");

        String[] actual = poster.findAll();
        String[] expected = {"Бладшот", "Вперед", "Отель Белград"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test

    public void shouldFindLast() {
        Poster poster = new Poster();

        poster.addMovie("Бладшот");
        poster.addMovie("Вперед");
        poster.addMovie("Отель Белград");
        poster.addMovie("Джентельмены");
        poster.addMovie("Человек-нивидимка");
        poster.addMovie("Тролли");

        String[] actual = poster.findLast();
        String[] expected = {"Тролли", "Человек-нивидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test

    public void shoudFindLastifLimit() {
        Poster poster = new Poster();

        poster.addMovie("Бладшот");
        poster.addMovie("Вперед");
        poster.addMovie("Отель Белград");
        poster.addMovie("Джентельмены");
        poster.addMovie("Человек-нивидимка");
        poster.addMovie("Тролли");
        poster.addMovie("Шрек");
        poster.addMovie("Игра престолов");
        poster.addMovie("Мстители");
        poster.addMovie("Тор");

        String[] actual = poster.findLast();
        String[] expected = {"Тор", "Мстители", "Игра престолов", "Шрек", "Тролли", "Человек-нивидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};

        Assertions.assertArrayEquals(actual, expected);
    }

}
