package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.propertyAsObjects;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw(){
		System.out.println(getPointA().getX()+" :: "+getPointA().getY());
		System.out.println(getPointB().getX()+" :: "+getPointB().getY());
		System.out.println(getPointC().getX()+" :: "+getPointC().getY());
		System.out.println(getPointD().getX()+" :: "+getPointD().getY());
	}

}
