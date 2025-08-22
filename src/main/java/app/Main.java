package app;

import entity.GardenTask;
import entity.Task;
import entity.TaskList;

import java.time.LocalDate;
import java.util.List;

import static services.AddTasks.createSampleGardenTask;
import static services.AddTasks.createSampleTaskList;

public class Main<T> {
    public static void main(String[] args) {
        TaskList personalList = createSampleTaskList();
        TaskList gardenList = createSampleGardenTask();

        System.out.println("=== Min personal list ===");
        personalList.printAllTasks();
        System.out.println("=== Min garden list ===");
        gardenList.printAllTasks();


        // filter på keyword på personlig liste:
        List<Task> filteredByKeywordPersonalList = personalList.filterTaskByDescription("Mobil");
        System.out.println("=== Min filtered by keyword Personal list ===");
        personalList.printTasksByKeyword(filteredByKeywordPersonalList);

        // filter på keyword på garden task:
        List<Task> filteredByKeywordGardenList = gardenList.filterTaskByDescription("træ");
        System.out.println("=== Min filtered by keyword Garden list ===");
        gardenList.printTasksByKeyword(filteredByKeywordGardenList);


        // filter på overskredet task personal
        List<Task>OverDueTaskPersonal = personalList.taskOverDue();
        System.out.println("=== Over Due Personal list ===");
        personalList.printTasksByKeyword(OverDueTaskPersonal);

        List<Task>OverDueTaskGarden = gardenList.taskOverDue();
        System.out.println("=== Over Due Garden list ===");
        gardenList.printTasksByKeyword(OverDueTaskGarden);


        // Personal tasks for today:
        List<Task>TaskforTodayPersonal = personalList.taskDueToday();
        System.out.println("=== Min Personal Task for Today ===");
        personalList.printTasksByKeyword(TaskforTodayPersonal);


        List<Task> TaskForTodayGarden = gardenList.taskDueToday();
        System.out.println("=== Min Garden Task for Today ===");
        gardenList.printTasksByKeyword(TaskForTodayGarden);

        // task in the future:
        List<Task> PersonalTaskInFuture = personalList.taskInFuture();
        System.out.println("=== Min Personal Task in Future ===");
        personalList.printTasksByKeyword(PersonalTaskInFuture);

        List<Task> GardenTaskInFuture = gardenList.taskInFuture();
        System.out.println("=== Min Garden Task in Future ===");
        gardenList.printTasksByKeyword(GardenTaskInFuture);
    }
}