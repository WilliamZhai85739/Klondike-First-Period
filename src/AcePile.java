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
      pile.get(0).draw(g, x, y);
    }
  }
  public void update(ActionEvent a) {

  }
  public boolean canAddCard(Card c) {
    if(pile.size() > 0) {
      if(c.getSuit() == pile.get(0).getSuit()) {
        if(c.getValue() == pile.get(0).getValue() + 1){
          pile.add(0, c);
          return true;
        } 
      }
    }
    else {
      if(c.getValue() == 0){
        pile.add(c);
        return true;
      }
    }
    return false;
  }
}
