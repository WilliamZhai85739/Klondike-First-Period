
/** represents a playing card that can draw itself. */
/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
    private int Value;
    private int Suit;
    private boolean Showing;
    private boolean Selected;
    public 
    public void draw(Graphics g) {

    }
    public void update(ActionEvent a) {
        
    }
    public Card(int v, int s) {
      Value = v;
      Suit = s;
      Showing = false;
      Selected = false;
    }
    public int getValue() {
      return Value;
    }
    public int getSuit() {
      return Suit;
    }
    public boolean getShowing() {
      return Showing;
    }
    public boolean getSelected() {
      return Selected;
    }
    public void Select() {
      Selected = true;
    }
    public void Deselect() {
      Selected = false;
    }
    public boolean compareTo(Card c) {
      if(c.getValue() == Value + 1) {
        return true;
      }
      else {
        return false;
      }
    }
  }
