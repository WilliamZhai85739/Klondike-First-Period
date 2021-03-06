
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
    private int cardX, cardY;
    public void draw(Graphics g) {
      
    }
    public void draw(Graphics g, int x, int y) {
      cardX = x;
      cardY = y;
      if(Showing) {
        System.out.println(front);
        g.drawImage(front, x, y, null);
      }
      else {
        System.out.println(back);
        g.drawImage(back, x, y, null);
      }
    }
    public boolean contains(int clickX, int clickY) {
      if(clickX <= cardX + width && clickX >= cardX && clickY >= cardY && clickY <= cardY + height) {
        return true;
      }
      return false;
    }
    public void update(ActionEvent a) {
        
    }
    public Card(int v, int s) {
      Value = v;
      Suit = s;
      Showing = false;
      Selected = false;
      OpenImage();
      cardX = 0;
      cardY = 0;
    }
    public void OpenImage() {
      if(Spritesheet == null) {
        try {
          File f = new File("images/cards/AllCards.png");
          Spritesheet = ImageIO.read(f);
          System.out.println(Spritesheet);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      front = ((BufferedImage)Spritesheet).getSubimage((Value)*width,(Suit)*height,width,height);
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
    public void Show() {
      Showing = true;
    }
    public void Hide() {
      Showing = false;
    }
    public boolean compareTo(Card c) {
      if(c.getValue() == Value + 1) {
        return true;
      }
      else {
        return false;
      }
    }
    public boolean withinBounds(int x, int y){
      if(x >= cardX && x <= cardX + width && y >= cardY && y <= cardY + height) {
        System.out.println("you clicked on " + toString());
        return true;
      }
      return false;
    }
    public String toString() {
      String s = "You just clicked on the ";
      String[] values = new String[]{"ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
      String[] suits = new String[]{"Spades","Hearts","Clubs","Diamonds"};
      s += values[Value] + " of " + suits[Suit];
      return s;
    }
  }
