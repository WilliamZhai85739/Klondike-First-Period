import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Graphics;




public class BottomPile extends Pile {
    public BottomPile() {
        super();
    }
    public void draw(Graphics g) {
        
    }
    public void draw(Graphics g, int x, int y) {
        if(pile.size() > 0) {
            int drawX = x;
            int drawY = y;
            for(int i = pile.size() - 1 ; i > 0; i--) {
                pile.get(i).draw(g, drawX, drawY);
                drawX = drawX + 20;
            }
            
        }
    }
    public void update(ActionEvent a) {
    
    }
    
    public boolean canAddCard(Card c) {
        if(c.getSuit() % 2  != pile.get(0).getSuit() % 2) {
            if(c.getValue() == pile.get(0).getValue() - 1){
              pile.add(0, c);
              return true;
            } 
          }
        return false;
    }
    public int pileSize() {
        return pile.size();
    }
}
