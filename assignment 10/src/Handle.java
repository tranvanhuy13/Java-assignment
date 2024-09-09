import java.text.SimpleDateFormat;

public class Handle {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Author author = new Author("101", "Napoleon Hill", sdf.parse("26/10/1883"));
            Book book = new Book("1", "Think And Grow Rich", author);
            System.out.println("Book information: " + book);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }
}