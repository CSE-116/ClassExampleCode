package topic11_statepattern.tv.state;

import topic11_statepattern.tv.TV;

public class OffMuted extends Off {

    public OffMuted(TV tv) {
        super(tv);
    }

    @Override
    public void powerPressed() {
        this.tv.stateTransition(new Muted(this.tv));
    }

}
