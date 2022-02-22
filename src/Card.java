
/** represents a playing card that can draw itself. */
/** represents a playing card that can draw itself. */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import java.awt.event.*;




public class Card implements Drawable, Updateable{
    private int Value;
    private int Suit;
    private boolean Showing;
    private boolean Selected;
    private Image Spritesheet;
    private Image front;
    private static Image back;
    private static int width = 71;
    private static int height = 96;
    public void draw(Graphics g) {
      
    }
    public void draw(Graphics g, int x, int y) {
      if(Showing) {
        g.drawImage(front, x, y, null);
      }
      else {
        g.drawImage(back, x, y, null);
      }
    }
    public void update(ActionEvent a) {
        
    }
    public Card(int v, int s) {
      Value = v;
      Suit = s;
      Showing = false;
      Selected = false;
      OpenImage();
    }
    public void OpenImage() {
      if(Spritesheet == null) {
        try {
          File f = new File("../images/AllCards.png");
          Spritesheet = ImageIO.read(f);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      front = ((BufferedImage)Spritesheet).getSubimage((Value-1)*width,(Suit-1)*height,width,height);
      back = ((BufferedImage)Spritesheet).getSubimage((0)*width,(4)*height,width,height);
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
