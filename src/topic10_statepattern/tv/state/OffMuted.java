package topic10_statepattern.tv.state;

import topic10_statepattern.tv.TV;

public class OffMuted extends Off {

    public OffMuted(TV tv) {
        super(tv);
    }

    @Override
    public void powerPressed() {
        this.tv.stateTransition(new Muted(this.tv));
    }

}
