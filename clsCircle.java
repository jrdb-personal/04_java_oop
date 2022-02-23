package exercise_shapes;

class clsCircle {
    
    //instance variables
    int radius;
    double perimeter;
    double area;
    
    //class variables;
    static double pi = 3.1415d;
    static int circleCount;
    
    clsCircle(int radius, String type){
        this.radius = radius;
    }
    
    protected double getPerimeter(){
        perimeter = 2*pi*radius;
        return perimeter;
    }
    
    protected double getArea(){
        area = pi*(radius*radius);
        return area;
    }
}
