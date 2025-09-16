package Practice;

public class EarliestTimeToFinishOneTask {
    public static void main(String[] args) {
        int[][] tasks = {{100,100},{100,100},{100,100}};
        int result = earliestTime(tasks);
        System.out.println("Final answer: " + result);
    }

    public static int earliestTime(int[][] tasks){
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++) {
            sum = tasks[i][0] + tasks[i][1];
            System.out.println("Task " + i + ": [" + tasks[i][0] + "," + tasks[i][1] + "] = " + sum);

            if (sum < min) {
                min = sum;
                System.out.println("New minimum: " + min);
            }
        }
        return min;
    }
}