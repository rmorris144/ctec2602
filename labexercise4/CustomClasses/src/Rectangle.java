
public class Rectangle {
//private double x, y;
private double w, h;

public double getArea() {
	return w *h;
}

public double getPerimeter() {
	return 2*w+2*h;
}

public String toString() {
	return "Rectangle["+w+", "+h+"]Area:"+getArea()+",Perimeter:"+getPerimeter();
}

}
