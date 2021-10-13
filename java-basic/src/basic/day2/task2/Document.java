package basic.day2.task2;

import java.util.Arrays;
import java.util.Date;

public class Document {
    private String[] authors;
    private Date date;

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public Document(String[] authors,Date date) {
        this.authors = authors;
        this.date = date;
    }

    public void addAuthors(String name) {
        String[] newArray = Arrays.copyOf(this.authors, this.authors.length+1);
        newArray[this.authors.length] = name;
        this.authors = newArray;
    }
}
