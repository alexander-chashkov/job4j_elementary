package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 20/02/2022 - 17:17
 * @project job4j
 */
public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public static double distance(Point p1, Point p2) {
        double rsl = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(new Point(0, 0), new Point(6, 2));
        System.out.println("result (0, 0) to (6, 2) " + result);
    }
}
