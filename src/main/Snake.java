package main;

import java.util.List;

public class Snake {
    private List<Segment> segments;

    public Snake(List<Segment> segments) {
        boolean flag = true;
        for(int i = 0; i < segments.size()-1; i++){
            Segment segment1 = segments.get(i);
            Segment segment2 = segments.get(i+1);
            Point pointEnd = segment1.getPoint2();
            Point pointStart = segment2.getPoint1();
            if(pointStart.getX()==pointEnd.getX() && pointStart.getY() == pointEnd.getY()){
            } else {
                flag = false;
                break;
            }
        }
        if(flag){
            this.segments = segments;
        } else{
            throw new IllegalArgumentException("Змейка должна быть непрерывна");
        }
    }

    public List<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "segments=" + segments +
                '}';
    }
}
