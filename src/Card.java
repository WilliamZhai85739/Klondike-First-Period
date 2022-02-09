
/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
  private int Value;
  private int Suit;
  private boolean Showing;
  private boolean Selected;
  public Card(int v, int s) {
    Value = v;
    Suit = s;
    Showing = false;
    Selected = false;
  }
}
