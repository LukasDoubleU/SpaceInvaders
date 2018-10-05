import greenfoot.*;

public class Ship extends MyActor {
    
    int shootCooldown = 0;
    int shootCooldownTime = 50;

    public Ship() {
        setRotation(270);
    }
    
    public void act() {
        moveByKey();
        if(Greenfoot.isKeyDown("space")) {
           shoot();
        }
    }
    
    /**
     * Gibt einen Schuss ab (Bullet)
     */
    public void shoot() {
        if(shootCooldown == 0) {
            getWorld().addObject(new Bullet(), getX(), getY() - 75);
            shootCooldown = shootCooldownTime;
        }
        else {
            shootCooldown--;
        }
    }
    
    /**
     * Bewegt sich entsprechend der gedrückten Taste
     */
    public void moveByKey() {
       if(Greenfoot.isKeyDown("left")) {
           moveLeft();
       }
       
       if(Greenfoot.isKeyDown("right")) {
           moveRight();
       }
    }
    
    /**
     * Bewegt sich nach links
     */
    public void moveLeft() {
        setLocation(getX() - 10, getY());
    }
    
    /**
     * Bewegt sich nach rechtse
     */
    public void moveRight() {
        setLocation(getX() + 10, getY());
    }
}
