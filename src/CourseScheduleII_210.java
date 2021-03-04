import java.util.*;

/**
 * Created by henry on 2021/3/4.
 */
public class CourseScheduleII_210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //need a matrix to record prerequisites between courses
        //need a array to record how many prerequisites of a course
        boolean[][] isPreCourse = new boolean[numCourses][numCourses];
        int[] preCourseNumArr = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++){
            int curCourse = prerequisites[i][0];
            int preCourse = prerequisites[i][1];
            isPreCourse[curCourse][preCourse] = true;
            preCourseNumArr[curCourse]++;
        }

        Queue<Integer> queue = new LinkedList();
        for(int i = 0; i < preCourseNumArr.length; i++){
            if(preCourseNumArr[i] == 0){
                queue.offer(i);
            }
        }

        List<Integer> courseList = new ArrayList<>();
        while(!queue.isEmpty()){
            int curCourse = queue.poll();
            courseList.add(curCourse);
            for(int i = 0; i < numCourses; i++){
                if(isPreCourse[i][curCourse]){
                    if(--preCourseNumArr[i] == 0){
                        queue.offer(i);
                    }
                }
            }
        }

        return courseList.size() == numCourses ?
                courseList.stream().mapToInt(i->i).toArray() : new int[0];
    }
}
