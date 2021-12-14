package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(3,4);
        Point point3 = new Point(3,4);
        Point point4 = new Point(5,7);
        Point point5 = new Point(6,8);
        Point point6 = new Point(8,9);
        Segment segment1 = new Segment(point1, point2);
        Segment segment2 = new Segment(point3, point4);
        Segment segment3 = new Segment(point5, point6);
        List<Segment> segments = new ArrayList<>();
        segments.add(segment1);
        segments.add(segment2);
        segments.add(segment3);

        Snake snake = new Snake(segments);
        System.out.println(snake);
    }
}
