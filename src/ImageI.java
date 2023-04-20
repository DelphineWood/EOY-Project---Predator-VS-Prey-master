import javax.swing.ImageIcon;

public class ImageI {

	private int x, xV, yV, dxV, dyV, wV, hV;
	private int y;
	private int h;
	private int w;
	private int dx, dy;
	private ImageIcon img;
	
	
	public ImageI()
	{
		x=200;
		y=300;
		w=300;
		h=500;
		dx=0;
		
	}
	public ImageI(int xV, int yV, int wV, int hV, String s)
	{
		x=xV;
		y=yV;
		dx=dxV;
		dy=dyV;
		w=wV;
		h=hV;
		img=new ImageIcon("heart.png");
	}
	public ImageIcon getImage() {
		return img;
	}
	public void setX(int xV) {
		x+=xV;
	}
	public void getY(int yV) {
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
	public void reverseHorz() {
		dx=dx*-1;
	}
	public void reverseVert() {
		dy=dy*-1;
	}
	public void setW(int width) {
		w=width;
	}
	public void getH(int height) {
		h=height;
	}
		public int getW() {
			return w;
		}
		public int getH() {
			return h;
		}
	
	public void move(int screenW, int screenH)
	{
		x+=dx;
		
		if((x+w)> screenW || x<0)
		{
			reverseHorz();
		}
		y+=dy;
		if((y+h)> screenH || y<0)
			reverseVert();
	}
	
	public void setDx(int dxFromGame)
	{
		dx= dxFromGame;
	}
}
