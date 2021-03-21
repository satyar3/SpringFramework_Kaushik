package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.prototype;

public class Triangle {

	private String type;
	private int height;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void drawWithHeight() {
		System.out.println("Traiangle has been drawn of Type :: " + getType() + " :: " + getHeight());
	}

}
