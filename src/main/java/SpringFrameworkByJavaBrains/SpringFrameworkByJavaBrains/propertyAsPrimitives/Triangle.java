package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.propertyAsPrimitives;

public class Triangle {

	private String type;
	private int height;

	public int getHeight() {
		return height;
	}

	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	// Setter injection will be done by using "Property" tag of the spring.xml"
	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println("Traiangle has been drawn of Type :: " + getType());
	}
	
	public void drawWithHeight() {
		System.out.println("Traiangle has been drawn of Type :: " + getType()+" :: "+getHeight());
	}

}
