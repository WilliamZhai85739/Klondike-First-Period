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
  public void update(ActionEvent a) {
    
  }
  public boolean canAddCard(Card c) {
    if(c.getSuit() == pile.get(1).getSuit()) {
      if(c.getValue() == pile.get(1).getValue()){
        pile.set(0,c);
        return true;
      } 
    }
    return false;
  }
}
