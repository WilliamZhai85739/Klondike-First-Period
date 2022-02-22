import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Graphics;





public class AcePile extends Pile {
  public AcePile() {
    super();
  }
  public void draw(Graphics g) {
    
  }
  public void draw(Graphics g, int x, int y) {
    if(pile.size() > 0) {
      pile.get(1).draw(g, x, y);
    }
  }
  public void update(ActionEvent a) {

  }
  public boolean canAddCard(Card c) {
    if(c.getSuit() == pile.get(1).getSuit()) {
      if(c.getValue() == pile.get(1).getValue()){
        pile.add(0, c);
        return true;
      } 
    }
    return false;
  }
}
