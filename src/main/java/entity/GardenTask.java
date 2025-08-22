package entity;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
public class GardenTask extends Task {

    private String gardenLocation;


    public GardenTask(String title, String description, LocalDate dueDate, String gardenLocation) {
        super(title, description, dueDate);
        this.gardenLocation = gardenLocation;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-40s | %10s | %-15s",
                getTitle(), getDescription(), getDueDate(), gardenLocation);
    }


}
