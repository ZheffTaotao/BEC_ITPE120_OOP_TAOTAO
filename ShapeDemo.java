public class ShapeDemo {
    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println("Shape: " + shape.name());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
enum Shape {
    Circle(4.0) {
        
        double calculateArea() {
            return Math.PI * radius * radius;
        }

    
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    },
    Square(5.0) {
        
        double calculateArea() {
            return sideLength * sideLength;
        }

        
        double calculatePerimeter() {
            return 4 * sideLength;
        }
    },
    Triangle(3.0, 4.0, 5.0) {
        
        double calculateArea() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        
        double calculatePerimeter() {
            return a + b + c;
        }
    };

    // Common properties for shapes
    double radius;
    double sideLength;
    double a, b, c;

    Shape(double radius) {
        this.radius = radius;
    }

    Shape(double sideLength) {
        this.sideLength = sideLength;
    }

    Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
        }
    }
}
