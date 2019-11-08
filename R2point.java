import java.util.Scanner;

class R2Point {

    private double x, y;
    public R2Point(double x, double y) {
        this.x = x; this.y = y;
    }
    public R2Point() throws Exception {
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
    }
    public static double dist(R2Point a, R2Point b) {
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
    public static double area(R2Point a, R2Point b, R2Point c) {
        return 0.5*((a.x-c.x)*(b.y-c.y)-(a.y-c.y)*(b.x-c.x));
    }
    public static boolean equal(R2Point a, R2Point b) {
        return a.x==b.x && a.y==b.y;
    }
    public static boolean isTriangle(R2Point a, R2Point b, R2Point c) {
        return area(a, b, c) != 0.0;
    }
    public boolean inside(R2Point a, R2Point b) {
        return (a.x <= x && x <= b.x || a.x >= x && x >= b.x) &&
                (a.y <= y && y <= b.y || a.y >= y && y >= b.y);

    }
    public boolean light(R2Point a, R2Point b) {
        double s = area(a, b, this);
        return s < 0.0 || ( s == 0.0 && ! inside(a, b));
    }
}