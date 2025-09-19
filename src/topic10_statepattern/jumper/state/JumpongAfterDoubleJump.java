package topic10_statepattern.jumper.state;

import topic10_statepattern.jumper.Player;

public class JumpongAfterDoubleJump extends Jumping{

    public JumpongAfterDoubleJump(Player player, double initialVelocity) {
        super(player, initialVelocity);
    }

    @Override
    public void jump(){

    }
}
