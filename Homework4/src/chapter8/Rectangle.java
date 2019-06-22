package chapter8;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		if (width < 0 || height < 0) {
			throw new IllegalArgumentException();
			
		}
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			
		
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String toString() {
		return "Rectangle[ x = " + x + ", y = " + y + ", with = " + width + ", height = " + height + " ]";
	}
	
	public Rectangle(Point p, int width, int height) {
		this.x = p.getX();
		this.y = p.getY();
		this.width = width;
		this.height = height;
		
	}
	public boolean contains(int x, int y) {
		return this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height;
	}
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	public Rectangle union(Rectangle rect) {
		 int newX = Math.min(this.getX(), rect.getX());
		    int newY = Math.min(this.getY(), rect.getY());
		    int newWidth = Math.max(rect.getX() + rect.getWidth() - newX,
		        this.getX() + this.getWidth() - newX);
		    int newHeight = Math.max(rect.getY() + rect.getHeight() - newY,
		        this.getY() + this.getHeight() - newY);
		    return new Rectangle(newX, newY, newWidth, newHeight);
	}
	public Rectangle intersection(Rectangle rect) {
		 if(this.getX() + this.getWidth() < rect.getX() ||
			        rect.getX() + rect.getWidth() < this.getX() ||
			        this.getY() + this.getHeight() < rect.getY() ||
			        rect.getY() + rect.getHeight() < this.getY())
			        return null;
			        
			    int startX = Math.max(this.getX(), rect.getX());
			    int endX = Math.min(this.getX() + this.getWidth(),
			        rect.getX() + rect.getWidth());
			    int startY = Math.max(this.getY(), rect.getY());
			    int endY = Math.min(this.getY() + this.getHeight(),
			        rect.getY() + rect.getHeight());
			        
			    return new Rectangle(startX, startY, endX - startX, endY - startY);
	}

}
