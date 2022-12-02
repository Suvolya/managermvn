import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.MovieManager;

public class MovieManagerTest {

    @Test
    public void addMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

       String[] actual = manager.findeAll();
       String[] expected = {"Film I", "Film II", "Film III"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findeLastMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findeLast();
        String[] expected = {"Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findeMovieBeforLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");

        String[] actual = manager.findeLast();
        String[] expected = {"Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findeMovieLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");
        manager.addMovie("Film X");

        String[] actual = manager.findeLast();
        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findeMovieAboveLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");
        manager.addMovie("Film X");
        manager.addMovie("Film XI");

        String[] actual = manager.findeLast();
        String[] expected = {"Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findeMovieLimitParametr() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");


        String[] actual = manager.findeAll();
        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};

        Assertions.assertArrayEquals(expected, actual);

    }
}
