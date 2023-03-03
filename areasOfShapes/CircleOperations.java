package areasOfShapes;

public class CircleOperations {

    private float radius;
    static final float PI=3.14f;
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float calArea(){
        float area=PI*radius*radius;
        return area;
    }
    @Override
    public String toString() {
        return "CircleOperations{" +
                "radius=" + radius +
                '}';
    }

    public CircleOperations(float radius){
        this.radius=radius;
    }

    public CircleOperations(){
        super();
    }

}
