package app;

import entity.Task;
import entity.TaskList;

import java.util.List;

import static services.AddTasks.*;

public class Main<T> {
    public static void main(String[] args) {
        TaskList personalList = createSampleTaskList();
        TaskList gardenList = createSampleGardenTask();
        TaskList shoppingList = createSampleShoppingList();

        System.out.println("=== Min personal list ===");
        personalList.printAllTasks();
        System.out.println("=== Min garden list ===");
        gardenList.printAllTasks();
        System.out.println("=== Min shopping list ===");
        shoppingList.printAllTasks();


        // filter på keyword på personlig liste:
        List<Task> filteredByKeywordPersonalList = personalList.filterTaskByDescription("Mobil");
        System.out.println("=== Min filtered by keyword Personal list ===");
        personalList.printAllTaskFromList(filteredByKeywordPersonalList);

        // filter på keyword på garden task:
        List<Task> filteredByKeywordGardenList = gardenList.filterTaskByDescription("træ");
        System.out.println("=== Min filtered by keyword Garden list ===");
        gardenList.printAllTaskFromList(filteredByKeywordGardenList);


        // filter på overskredet task personal
        List<Task> OverDueTaskPersonal = personalList.taskOverDue();
        System.out.println("=== Over Due Personal list ===");
        personalList.printAllTaskFromList(OverDueTaskPersonal);

        List<Task> OverDueTaskGarden = gardenList.taskOverDue();
        System.out.println("=== Over Due Garden list ===");
        gardenList.printAllTaskFromList(OverDueTaskGarden);

        List<Task> OverDueTaskShopping = shoppingList.taskOverDue();
        System.out.println("=== Over Due Shopping list ===");
        shoppingList.printAllTaskFromList(OverDueTaskShopping);


        // Personal tasks for today:
        List<Task> TaskforTodayPersonal = personalList.taskDueToday();
        System.out.println("=== Min Personal Task for Today ===");
        personalList.printAllTaskFromList(TaskforTodayPersonal);


        List<Task> TaskForTodayGarden = gardenList.taskDueToday();
        System.out.println("=== Min Garden Task for Today ===");
        gardenList.printAllTaskFromList(TaskForTodayGarden);

        List<Task> TaskForTodayShopping = shoppingList.taskDueToday();
        System.out.println("=== Min Shopping Task for Today ===");
        shoppingList.printAllTaskFromList(TaskForTodayShopping);

        // task in the future:
        List<Task> PersonalTaskInFuture = personalList.taskInFuture();
        System.out.println("=== Min Personal Task in Future ===");
        personalList.printAllTaskFromList(PersonalTaskInFuture);

        List<Task> GardenTaskInFuture = gardenList.taskInFuture();
        System.out.println("=== Min Garden Task in Future ===");
        gardenList.printAllTaskFromList(GardenTaskInFuture);

        List<Task> ShoppingTaskInFuture = shoppingList.taskInFuture();
        System.out.println("=== Min Shopping Task in Future ===");
        shoppingList.printAllTaskFromList(ShoppingTaskInFuture);

    }
}