/**
 * Created by henry on 2020/10/25.
 */
public class ContainerWithMostWater_11 {
    public static void main(String[] args){
        int[] input = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater_11 cmw = new ContainerWithMostWater_11();
        System.out.println(cmw.maxArea(input));
    }

    public int maxArea(int[] height) {
        int curMaxArea = 0;
        int area = 0;
        for(int i=0; i< height.length-1; i++){
            for(int j=i+1; j<height.length; j++){
                area = (j-i) * Math.min(height[i], height[j]);
                if(area > curMaxArea){
                    curMaxArea = area;
                }
            }
        }

        return curMaxArea;
    }
}
