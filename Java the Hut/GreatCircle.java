public class GreatCircle{
    public static void main(String[] args){
        double x1 = 60.0;
        double y1 = 15.0;
        double x2 = 120.0;
        double y2 = 105.0;
        double r = 6371.0;

        double sinx = Math.sin((x2-x1)/2.0);
        double sinxsqrd = Math.pow(sinx, 2.0);
        double siny = Math.sin((y2-y1)/2.0);
        double sinysqrd = Math.pow(siny,2.0);
        double cossin = Math.cos(x1) * Math.cos(x2) * sinysqrd;
        double interm = Math.sqrt(sinxsqrd + cossin);
        double distance = 2.0*r*Math.asin(interm);
        
        double a = Math.pow(Math.sin((x2-x1)/2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2);

        // great circle distance in radians
        double angle2 = 2 * Math.asin(Math.sqrt(a));

        // convert back to degrees
        angle2 = Math.toDegrees(angle2);

        // each degree on a great circle of Earth is 60 nautical miles
        double distance2 = 60 * angle2;

        System.out.println(distance2 + " kilometers");
    }
}