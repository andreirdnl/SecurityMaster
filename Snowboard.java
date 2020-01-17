public class Snowboard {

	public int length;
	public static final String[] shapes = {"Camber","Rocker","Flat","Hybrid"};
	public boolean isDirectional;
	public float radius;
	public String shape;
	
	public Snowboard() {
		this.length = 0;
		this.isDirectional = false;
		this.radius = 0;
		this.shape = "";
	}
	
	public Snowboard(int _len,String _shape,boolean _dir,float _rad) {
		this.length = _len;
		this.isDirectional = _dir;
		this.radius = _rad;
		this.shape = _shape;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isDirectional() {
		return isDirectional;
	}

	public void setDirectional(boolean isDirectional) {
		this.isDirectional = isDirectional;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String[] getShapes() {
		return shapes;
	}
}
