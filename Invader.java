import greenfoot.*;

public class Invader extends MyActor {
    
    public Invader(){
        setRotation(90);
    }

    public void act() {
        if(Greenfoot.getRandomNumber(500) == 1) {
            shoot();
        }
    }
    
    public void shoot() {
        getWorld().addObject(new InvaderBullet(), getX(), getY() + 5);
    }
}
