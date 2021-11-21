package app;

public class Radio {

    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    Projector projector = new Projector("Top-O-Line Projector", dvd);
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    public void startRadio(){

        tuner.on();
        tuner.setFrequency(97.5);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);

    }

    public void stopRadio(){

        tuner.off();
        amp.off();

    }

}
