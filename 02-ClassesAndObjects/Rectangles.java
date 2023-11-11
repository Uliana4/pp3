public class Rectangles {
    int side1;
    int side2;

    void showDimension(){
        System.out.printf("Dimension of rectangle:" + side1 + "x" + side2 + "\n");
    }

    void showPerimetr(){
        System.out.println((side1+side2)*2);
    }

    void showSurfaceArea(){
        System.out.println(side1*side2);
    }    
}