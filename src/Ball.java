import javax.swing.ImageIcon;

public class Ball {
	private int x, y, w, h, dx, dy;
	private ImageIcon ShipImg;
	
	public Ball() {
		x= 1;
		y = 1;
		w = 1;
		h = 1;
		ShipImg = new ImageIcon("");
		dx = 0;
		dy = 0;
	}
	//use for predators
	public Ball(int xV, int yV, int width, int height, int dx, ImageIcon i) {
		x = xV;
		y= yV;
		w = width;
		h = height;
		ShipImg = i;
		this.dx = dx;
		dx = 0;
	}
	public Ball(int xV, int yV, int height, int width, ImageIcon i) {
		x = xV;
		y= yV;
		w = 50;
		h = 50;
		ShipImg = i;
		dx = 0;
		dx = 0;
	}

	//getters and setters
	public ImageIcon getShipImg() {
		return ShipImg;
	}
	public void setX(int xV) {
		x=xV;
	}
	public void setY(int yV) {
		y=yV;
	}
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getdy() {
		return dy;
	}
	public void setW(int width) {
		w+=width;
	}
	public void setH(int height) {
		h+=height;
	}
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public void changeDx() {
		dx = dx*-1;
	}
	public void changeDy() {
		dy = dy*-1;
	}
	
	public void Hmove() {
		x = x + dx;
	}
	public void Vmove() {
		y = y + dy;
	}

	

}
