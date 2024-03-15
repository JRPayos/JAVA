public class RightTriangle {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //int a = 3;
        //int b = 4;
        //int c = 5;
        int csqr = c*c;
        int bsqr = b*b;
        int asqr = a*a;
        boolean right;

        right = (csqr == asqr + bsqr);
        System.out.println(right);

    }
}
