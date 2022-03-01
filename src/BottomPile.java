import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Graphics;








public class DrawPile extends Pile {
    public DrawPile() {
        super();
    }
    public void draw(Graphics g) {
        
    }
    public void draw(Graphics g, int x, int y) {
        if(pile.size() > 0) {
            pile.get(0).draw(g, x, y);
        }
    }
    public void update(ActionEvent a) {
    
    }
    public boolean canAddCard(Card c) {
        return false;
    }
    public Card firstCard() {
        return pile.get(0);
    }
    public int pileSize() {
        return pile.size();
    }
}
