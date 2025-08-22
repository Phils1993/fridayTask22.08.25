package entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter

public class ShoppingList extends Task {

    private String groceryStore;

    public ShoppingList(String title, String description, LocalDate dueDate, String groceryStore) {
        super(title, description, dueDate);
        this.groceryStore = groceryStore;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-40s | %10s | %-15s",
                getTitle(), getDescription(), getDueDate(), groceryStore);
    }
}
