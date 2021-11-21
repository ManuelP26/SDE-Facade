package app;

public class Movie {

            Amplifier amp = new Amplifier("Top-O-Line Amplifier");
            Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
            DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
            CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
            Projector projector = new Projector("Top-O-Line Projector", dvd);
            TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
            Screen screen = new Screen("Theater Screen");
            PopcornPopper popper = new PopcornPopper("Popcorn Popper");

            public void startMovie(){
                popper.on();
                popper.pop();
                lights.dim(10);
                screen.down();
                projector.on();
                projector.wideScreenMode();
                amp.on();
                amp.setSurroundSound();
                amp.setVolume(5);
                dvd.on();
                dvd.play("Tucker and Dale VS Evil");
            }
            public void stopMovie(){
                popper.off();
                lights.on();
                screen.up();
                projector.off();
                amp.off();
                dvd.stop();
                dvd.eject();
                dvd.off();
            }
}
