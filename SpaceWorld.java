import greenfoot.*;

public class SpaceWorld extends World {
    
    Ship ship = new Ship();

    public SpaceWorld() {    
        super(800, 600, 1); 
        prepare();
    }

    private void prepare() {
        addObject(ship, 400, 525);
        
        int invaderx = 100, invadery = 50;
        for(int i=0; i<7; i++) {
            addObject(new Invader(), invaderx, invadery);
            invaderx += 100;
        }
        
        invaderx = 150; invadery = 125;
        for(int i=0; i<6; i++) {
            addObject(new Invader(), invaderx, invadery);
            invaderx += 100;
        }
    }
    
    public void showText(String s) {
        showText(s, getWidth() / 2, getHeight() / 2);
    }
}