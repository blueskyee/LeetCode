import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by henry on 2020/12/28.
 */
public class CourseSchedule_207 {
    public static void main(String[] args){
        int[][] input = {{0,1}};
        CourseSchedule_207 cs = new CourseSchedule_207();
        System.out.println(cs.canFinish(2, input));
    }

    //kahn's algorithm: https://en.wikipedia.org/wiki/Topological_sorting
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matric = new int[numCourses][numCourses];
        int[] inDegrees = new int[numCourses];

        for(int i=0; i<prerequisites.length; i++){
            int curCourse = prerequisites[i][0];
            int preCourse = prerequisites[i][1];
            matric[curCourse][preCourse] = 1;
            inDegrees[curCourse]++;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0; i<inDegrees.length; i++){
            if(inDegrees[i] == 0)
                queue.offer(i);
        }

        int count = 0;
        while(!queue.isEmpty()){
            int course = queue.poll();
            count++;
            for(int i=0; i<matric[course].length; i++){
                if(matric[i][course] == 1){
                    if(--inDegrees[i] == 0){
                        queue.offer(i);
                    }
                }
            }
        }

        return count == numCourses;
    }
}
