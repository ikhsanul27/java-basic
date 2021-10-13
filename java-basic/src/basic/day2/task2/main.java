package basic.day2.task2;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        System.out.println("\n===== Document =====");
        Document document = new Document(new String[]{ "Ikhsan", "ikhsanul", "Ikhsanul Fahmi" }, new Date());
        String[] getAuthors = document.getAuthors();
        document.addAuthors("ikhsann");
        for (String author: getAuthors){
            System.out.println(author);
        }
        System.out.println(document.getDate());
        System.out.println("\n====== Book =====");
        Book book = new Book(new String[]{ "Ikhsan", "ikhsanul", "Ikhsanul Fahmi" }, new Date(), "Buku MTK");
        System.out.println(book.getTitle());
        System.out.println("\n===== Email =====");
        Email email = new Email(new String[]{ "Ikhsan", "Ikhsanul", "Ikhsanul Fahmi" }, new Date(), "Pesan ini untuk", new String[]{"Fahmi", "Ikhsanul Fahmi"});
        System.out.println(email.getSubject());
        String[] getTo = email.getTo();
        for(String to: getTo){
            System.out.println(to);
        }
    }
}
