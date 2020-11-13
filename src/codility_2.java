/**
 * Created by henry on 2020/11/13.
 */
public class codility_2 {
    public static void main(String[] args){
        double[] X = {0.00,0.2,0.33,0.43,0.63,0.66,1.00};
        double[] Y = {0.00,0.25,0.25,0.50,0.50,1.00,1.00};
        codility_2 cd2 = new codility_2();
        System.out.println(cd2.solution(X,Y));
    }

    public double solution(double[] X, double[] Y) {
        double area = 0;
        area += (X[1] * Y[1])/2;
        for(int i=2; i<X.length; i++){
            area += (Y[i-1] + Y[i]) * (X[i] - X[i-1]) / 2;
        }

        return area;
    }
}
