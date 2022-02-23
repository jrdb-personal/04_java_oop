package exercise_shapes;

class clsQuadrilaterals {
    
    //instance variables
    int length;
    int width;
    int perimeter;
    double area;
    String type;
    
    //class variables
    static int quadriCount;
    
    clsQuadrilaterals(int length, int width, String type){
        this.length = length;
        this.width = width;
        this.type = type;
    }
    
    protected int getPerimeter(String type){  
        switch(type){
            case "parallelogram":
                break;
                
            case "rhombus":
                break;
                
            case "trapezoid":
                break;
            
            case "kite":
                break;
                
            default:
                break;
                
        }
        return perimeter;
    }
    
    protected double getArea(){
        return area;
    }
}
