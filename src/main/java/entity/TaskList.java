package entity;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;

public class TaskList <T extends Task> implements Iterable<T> {

    private List<T> tasks;


    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(T task){
        tasks.add(task);
    }

    public List<T> getTasks(){
        return List.copyOf(tasks);
    }

    public List<T> filterTaskByDescription(String keyword){
        String keyWord = keyword.toLowerCase();
        return tasks.stream()
                .filter( t -> t.getTitle().toLowerCase().contains(keyWord) ||
                        t.getDescription().toLowerCase().contains(keyWord))
                .toList();
    }

    public List<T> filterTaskByDueDate(LocalDate dueDate){
        return tasks.stream()
                .filter( t-> t.getDueDate()!=null && dueDate.isEqual(t.getDueDate()))
                .sorted(Comparator.comparing(Task::getDueDate))
                .toList();
    }

    public List<T> taskDueToday(){
        return filterTaskByDueDate(LocalDate.now());
    }

    public List<T> taskOverDue(){
        return tasks.stream()
                .filter(t -> t.getDueDate() != null && t.getDueDate().isBefore(LocalDate.now()))
                .sorted(Comparator.comparing(Task::getDueDate))
                .toList();
    }

    public List<T> taskInFuture(){
        return tasks.stream()
                .filter(t->t.getDueDate()!=null && t.getDueDate().isAfter(LocalDate.now()))
                .sorted(Comparator.comparing(Task::getDueDate))
                .toList();
    }


    // Simple print for all tasks
    public void printAllTasks() {
        tasks.forEach(System.out::println);
    }

    // print with a specific list in mind
    public void printAllTaskFromList(List<T> tasksToPrint) {
        tasksToPrint.forEach(task ->
                System.out.printf("%-20s | %-40s | %10s%n",
                        task.getTitle(),
                        task.getDescription(),
                        task.getDueDate())
        );
    }



    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
