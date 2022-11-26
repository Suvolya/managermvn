package ru.netology.manager;

public class MovieManager {

    private String[] movies = new String[0];

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] findeAll() {
        return movies;

    }

    public String[] findeLast() {
        int resultLength;
        if (movies.length < 10) {
            resultLength = movies.length;
        } else {
            resultLength = 10;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}



