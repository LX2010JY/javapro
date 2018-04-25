package innerclass;

public class Circle {
    double radius = 0;
    public Circle(double radius) {
        this.radius = radius;
        getDrawInstance().drawShape();
    }
    class Draw {
        public void drawShape() {
            System.out.println(Circle.this.radius);
        }
    }
    private Draw getDrawInstance() {
        return new Draw();
    }
    public static void main(String[] args) {
        Circle c = new Circle(12);
    }
}

