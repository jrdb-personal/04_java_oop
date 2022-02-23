package exercise_shapes;

class clsTriangle {

    //instance variables
    int perimeter;
    double area;
    String type;
    
    //class variables
    static int triangleCount;
    
    
    clsTriangle(){
        
    }
    
    protected int getPerimeter(){    
        return perimeter;
    }
    
    protected double getArea(){
        return area;
    }
}
