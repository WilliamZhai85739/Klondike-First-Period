import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class GameBoard implements Drawable, Updateable {
	

	Image testImage, backImage;
	public static final int OFFSET_X = 40, OFFSET_Y = 20;
	
	private boolean firstClick;
	private int numdraws=0;
	private AcePile ace1;
	private AcePile ace2;
	private AcePile ace3;
	private AcePile ace4;
	private BottomPile bottom1;
	private BottomPile bottom2;
	private BottomPile bottom3;
	private BottomPile bottom4;
	private BottomPile bottom5;
	private BottomPile bottom6;
	private BottomPile bottom7;
	private DrawPile draw;
	 
	
	public GameBoard() {
		try {
			testImage = ImageIO.read(new File("images/cards/dj.png"));
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/** @param g Graphics context onto which all Objects in the game
	 * draw themselves.  This should NOT change the Objects
	 */
	public void draw(Graphics g) {
		numdraws++;
		g.setColor(new Color(40, 155, 70));
		g.fillRect(0, 0, 3000, 2000);
		
		// this is just to test drawing a card
		g.drawImage(testImage, 30, 80, null);
		g.drawImage(backImage, 100, 80, null);
		g.drawImage(backImage, 105, 100, null);
		Card tester = new Card(0,0);
		tester.draw(g, 200, 400);
	}
	

	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */
	public void justClicked(MouseEvent me) {
		Point p = me.getPoint();
		System.out.println("You just clicked "+p);
		int x = me.getX(), y = me.getY();
		if(firstClick) {
			firstClick(x,y);
		}
		else {
			secondClick(x,y);
		}

	}
	public void firstClick(int x, int y) {
		
	}
	public void secondClick(int x, int y) {
		
	}
	public boolean checkAce(int x, int y) {
		if(ace1.pileSize() > 0) {
			if(ace1.firstCard().withinBounds(x, y)) {
				return true;
			}
		}
		if(ace2.pileSize() > 0) {
			if(ace2.firstCard().withinBounds(x, y)) {
				return true;
			}
		}
		if(ace3.pileSize() > 0) {
			if(ace3.firstCard().withinBounds(x, y)) {
				return true;
			}
		}
		if(ace4.pileSize() > 0) {
			if(ace4.firstCard().withinBounds(x, y)) {
				return true;
			}
		}
		return false;
	}
	public boolean checkBottom(int x, int y) {
		return false;
	}
	public boolean checkDraw(int x, int y) {
		return false;
	}
	@Override
	// this update will be called each time the timer in the KlondikeGame
	// goes off.  This will be convenient for animating.
	public void update(ActionEvent a) {
		
		
	}

}
