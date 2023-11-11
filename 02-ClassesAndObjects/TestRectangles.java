public class TestRectangles {
    public static void main(String[] args){
        Rectangles rec = new Rectangles();
        rec.side1 = 3;
        rec.side2 = 4;
        
        rec.showDimension();
        rec.showPerimetr();
        rec.showSurfaceArea();

        Rectangles rec2 = new Rectangles();
        rec2.side1 = 2;
        rec2.side2 = 7;

        rec2.showDimension();
        rec2.showPerimetr();
        rec2.showSurfaceArea();
    }
}
