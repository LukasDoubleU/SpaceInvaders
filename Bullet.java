import greenfoot.*;
import java.util.List;

public class Bullet extends MyActor {

    public void act() {
        setLocation(getX(), getY() - 3);
        
        if(!getIntersectingObjects(Invader.class).isEmpty()) {
            removeTouching(Invader.class);
            getWorld().addObject(new Explosion(10),getX(), getY() - 15);
            checkWin();
            removeThis();
            return;
        }
        
        if(isAtEdge()) {
            removeThis();
            return;
        }
    }    
    
    private void checkWin() {
        List invaders = getWorld().getObjects(Invader.class);
        if(invaders == null || invaders.isEmpty()) {
            getWorld().showText("You win!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
