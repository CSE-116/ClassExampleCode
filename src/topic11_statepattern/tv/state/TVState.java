package topic11_statepattern.tv.state;

public interface TVState {

    void volumeUpPressed();

    void volumeDownPressed();

    void mutePressed();

    void powerPressed();

    int currentVolume();

}
