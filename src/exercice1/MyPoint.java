package exercice1;
import java.util.Map; 

public class MyPoint {

	Integer x = 0;
	Integer y = 0;
	
	public MyPoint() {
		super();
	}

	public MyPoint(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}


	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		System.out.println(p1.distance(5, 6));

	}
	
	public void setXY(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void getXY() {
		Integer[] coordonnees = new Integer[2];
		coordonnees[0] = x;
		coordonnees[1] = y;
		System.out.println(coordonnees);
	}
	
	public Integer distance(Integer x , Integer y) {		
		Integer xDiff = this.x - x;
		Integer yDiff = this.y - y;
		return  (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}

}
