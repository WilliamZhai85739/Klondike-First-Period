
/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
  private int Value;
  private int Suit;
  private boolean Showing;
  private boolean Selected;
  public 
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
    Select = true;
  }
  public void Deselect() {
    Select = false;
  }
  public boolean compareTo(card C) {
    if(c.getValue() = Value + 1) {
      return true;
    }
    else {
      return false;
    }
  }
}
