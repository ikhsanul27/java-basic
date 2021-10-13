package basic.day2.task2;

import java.util.Date;

public class Book extends Document{
    private String title;

    public String getTitle() {
        return title;
    }

    public Book(String[] authors, Date date, String title) {
        super(authors, date);
        this.title = title;
    }
}
