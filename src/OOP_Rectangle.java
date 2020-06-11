

public class OOP_Rectangle {
   private Double width;
   private Double height;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public OOP_Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getArea() {
        return width*height;
    }

    public static void main(String[] args) {
        OOP_Rectangle rectangle = new OOP_Rectangle(10.0, 8.0);
        System.out.println("width: " + rectangle.getWidth());
        System.out.println("height: " + rectangle.getHeight());
        System.out.println("square: " + rectangle.getArea());
        rectangle.setWidth(8.0);
        rectangle.setHeight(10.0);
        System.out.println("width: " + rectangle.getWidth());
        System.out.println("height: " + rectangle.getHeight());
        System.out.println("square: " + rectangle.getArea());
    }
}