package app;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.startMovie();
        movie.stopMovie();

        Music music = new Music();
        music.startMusic();
        music.stopMusic();

        Radio radio = new Radio();
        radio.startRadio();
        radio.stopRadio();

    }
}
