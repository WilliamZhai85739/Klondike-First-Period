import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Graphics;
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    public Pile() {
        pile = new ArrayList<Card>();
    }
    public abstract boolean canAddCard(Card c);
    public ArrayList<Card> pile;
    public void draw(Graphics g, int x, int y) {
        
    }
    public void update(ActionEvent a){

    }
}
