
public class Square extends Rectangle {
	  public Square() {
	    }

	    public Square(double side) {
	        super(side, side);
	    }

	    public Square(double side, String color, boolean filled) {
	    }

	    public double getSide() {
	        return getWidth();
	    }

	    public void setSide(double side) {
	        setWidth(side);
	        setLength(side);
	    }

	 

}
