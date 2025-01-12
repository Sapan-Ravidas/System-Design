package facade.system;

public class StreamPlayer extends Instrument {
    private int currentChapter;
    private Instrument amplifier;
    private String movie;

    public StreamPlayer(String description, Instrument amplifier) {
        setDescription(description);
        this.amplifier = amplifier;
    }

    public int getCurrentChapter() {
        return currentChapter;
    }

    public Instrument getAmplifier() {
        return amplifier;
    }

    public String getMovie() {
        return movie;
    }

    public void play(String movie) {
        this.movie = movie;
        currentChapter =  0;
        System.out.println(getDescription() + " playing [" + movie + "]");
    }

    public void play(int chapter) {
        if (movie == null) {
            System.out.println(getDescription() + " can't play " + chapter + 
                " no movie selected");
        } else {
            currentChapter = chapter;
            System.out.println(getDescription() + " playing chapter of [" + movie + "]");
        }
    }

    public void stop() {
        currentChapter = 0;
        System.out.println(getDescription() + " stopped [" + movie + "]");
    }

    public void pause() {
        System.out.println(getDescription() + " paused [" + movie + "]");
    }

    public void setTwoChannelAudio() {
        System.out.println(getDescription() + " set 2 channel audio");
    }

    public void setSurroundAudio() {
        System.out.println(getDescription() + "set surroung audio");
    }

    @Override
    public String toString() {
        return getDescription();
    }
    
}
