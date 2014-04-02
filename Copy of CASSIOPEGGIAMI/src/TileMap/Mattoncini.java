package TileMap;

import java.awt.image.BufferedImage;

public class Mattoncini {
	
	private BufferedImage image;
	private int type;
	
	// mattoncini types <3
	public static final int NORMAL = 0;
	public static final int BLOCKED = 1;
	
	public Mattoncini(BufferedImage image, int type) {
		this.image = image;
		this.type = type;
	}
	
	public BufferedImage getImage() { return image; }
	public int getType() { return type; }
	
}
