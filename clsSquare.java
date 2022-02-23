package exercise_shapes;

class clsSquare {

    //instance variables
    int sides;
    float area;
    
    //class variables
    static int squareCount;
    
    clsSquare(){
        
    }
    
    protected int getPerimeter(){
        return sides;
    }
    
    protected float getArea(){
        return area;
    }
}
