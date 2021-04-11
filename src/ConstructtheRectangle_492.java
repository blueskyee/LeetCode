/**
 * Created by henry on 2021/4/11.
 */
public class ConstructtheRectangle_492 {
    public static void main(String[] args){
        int area = 122122;
        ConstructtheRectangle_492 cr = new ConstructtheRectangle_492();
        System.out.println(cr.constructRectangle(area));
    }

    public int[] constructRectangle(int area) {
        int sqr = (int)Math.sqrt(area);
        while(area % sqr != 0){
            sqr--;
        }
        return new int[]{area/sqr, sqr};
    }
}
