import greenfoot.*;

public class Explosion extends MyActor {
    
    int roundsLived = 0;
    int duration;
    
    public Explosion(int duration) {
        this.duration=duration;
    }

    public void act() {
        if(roundsLived++ == duration) {
            removeThis();
        }
    }    
}
