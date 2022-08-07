public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius){
        super(radius);

    }

    @Override
    public void resize(int percent) {

        System.out.println(radius=radius*percent/100);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
}
