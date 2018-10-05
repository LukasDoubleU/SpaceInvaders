import greenfoot.*;

public class MyActor extends Actor {
        
    public void removeThis() {
        getWorld().removeObject(this);
    }
    
    public SpaceWorld getWorld() {
        return (SpaceWorld) super.getWorld();
    }
}
