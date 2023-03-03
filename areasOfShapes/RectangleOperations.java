package areasOfShapes;

public class RectangleOperations {

    private int length, breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int calArea(){
        int area=2*(length*breadth);
        return area;
    }

    @Override
    public String toString() {
        return "rectangleOperations{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public RectangleOperations(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public RectangleOperations(){
        super();
    }

}
