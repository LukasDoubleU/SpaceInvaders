import greenfoot.*;

public class InvaderBullet extends MyActor{

    public void act() {
        setLocation(getX(), getY() + 3);
        
        if(!getIntersectingObjects(Ship.class).isEmpty()) {
            getWorld().addObject(new Explosion(10),getX(), getY() + 5);
            getWorld().showText("You lose!");
            Greenfoot.stop();
        }
        
        if(isAtEdge()) {
            removeThis();
            return;
        }
    }    
}
