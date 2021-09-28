package mbeans;


public class Interval implements IntervalMBean{
    double totalArea =0;

    @Override
    public void updateArea(double s){
        totalArea = totalArea +s;
    }
    @Override
    public double getTotalArea()
    {
        return totalArea;
    }
    @Override
    public void addPoint(double r){
        double s = r*r*3.14;
        updateArea(s);
    }

}