public class Triangle {
    public int perimeter(int a, int b, int c) {
        int perimeter = 0;
        perimeter = a + b + c;
        System.out.println("The perimeter is:"+" "+perimeter);
        return perimeter;
    }

    public double area(int a, int b, int c) {
        double area = 0;

        //This formula is not accurate
        // I'm just using it to represent the area
        area = a * b * c;
        System.out.println("The area is:" + " " +area);
        return area;
    }

    public static void main(String args[]) {
        Triangle areaPerimeter = new Triangle();

        areaPerimeter.perimeter(6, 12, 13);
        areaPerimeter.area(6, 12, 13);
    }
}
