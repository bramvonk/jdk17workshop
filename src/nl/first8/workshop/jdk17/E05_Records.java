package nl.first8.workshop.jdk17;

import java.util.Objects;

public class E05_Records {
    // TODO: can you make this much shorter using Records (and thus without using lombok)?
    //       Note: yes, you must change one thing in the printInterestingStuffAboutSomePoints method...
    private class Point {
        final private int x;
        final private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {	return x; }
        public int getY() {	return y; }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            final Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private void printInterestingStuffAboutSomePoints() {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        System.out.println("We have a point p1 " + p1);
        System.out.println("And a point p2 " + p2);
        System.out.println("And they are equal? " + p1.equals(p2));
        System.out.println("And what is point p1's x? " + p1.getX());
    }

    public static void main(String[] args) {
        new E05_Records().printInterestingStuffAboutSomePoints();
    }

}
