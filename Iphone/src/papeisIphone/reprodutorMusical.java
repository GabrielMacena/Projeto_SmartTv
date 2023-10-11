package papeisIphone;

public interface reprodutorMusical {
    void playTrack(String track);
    void pause();
    void skipToNext();
    void skipToPrevious();
    String getNowPlaying();
}
