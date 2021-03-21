package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.propertyAsCollections;

import java.util.List;

import SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.propertyAsCollections.Point;

public class Triangle {

	private List<Point> pointList;

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}

	public void draw() {
		pointList.stream().forEach(i -> System.out.println(i.getX()+" :: "+i.getY()));
	}

}
