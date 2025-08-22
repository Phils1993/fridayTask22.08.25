package services;

import entity.GardenTask;
import entity.Task;
import entity.TaskList;

import java.time.LocalDate;

public class AddTasks {

    public static TaskList<Task> createSampleTaskList() {
        TaskList<Task> taskList = new TaskList<>();
        taskList.addTask(new Task("Oplad mobil", "Finde oplader og sætte min mobil i laderen"
                , LocalDate.of(2025, 8, 30)));
        taskList.addTask(new Task("Lektier", "Lav fredagsopgave"
                , LocalDate.of(2025, 8, 22)));
        taskList.addTask(new Task("Skifte Wilma", "Skifte Wilmas ble"
                , LocalDate.of(2025, 8, 1)));
        taskList.addTask(new Task("Køre i skole", "Hente cykel i kælderen og køre 10 km til EK Lyngby"
                , LocalDate.of(2025, 8, 24)));
        return taskList;
    };


    public static TaskList<Task> createSampleGardenTask() {
        TaskList<Task> gardenTaskList = new TaskList<>();
        gardenTaskList.addTask(new GardenTask("Slå græsset", "Hent maskine og slå græsset"
                ,LocalDate.of(2025,8,10), "Hele haven"));
        gardenTaskList.addTask(new GardenTask("Beskær træer",
                "Klip tørre grene væk",
                LocalDate.of(2025, 8, 30),
                "Bagsiden"));
        gardenTaskList.addTask(new GardenTask("Vand blomster",
                "Vand roserne",
                LocalDate.now(),
                "Terrassen"));
        return gardenTaskList;
    }
}
