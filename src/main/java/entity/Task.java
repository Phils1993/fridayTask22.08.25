package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor

public class Task implements Serializable {
    private String title;
    private String description;
    private LocalDate dueDate; // LocalDate

    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-40s | %10s",
                title, description, dueDate);
    }

}
