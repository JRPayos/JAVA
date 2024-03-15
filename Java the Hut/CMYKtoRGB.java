public class CMYKtoRGB {
    public static void main(String[] args){
        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);
        //double C = 0.61;
        //double M = 0.7;
        //double Y = 0.0;
        //double K = 0.2;
        double W = 1- K;

        double R = 255 * W * (1 - C);
        double G = 255 * W * (1- M);
        double B = 255 * W * (1 - Y);

        int red = (int) Math.round(R);
        int green = (int) Math.round(G);
        int blue = (int) Math.round(B);
        System.out.println(red);
        System.out.println(green);
        System.out.println(blue);
    }
}
