abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title; this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract String getType();
}

class Book extends LibraryResource {
    public Book(String title, String author) { super(title, author); }
    @Override
    public String getType() { return "Book"; }
}

class Magazine extends LibraryResource {
    public Magazine(String title, String author) { super(title, author); }
    @Override
    public String getType() { return "Magazine"; }
}

class DVD extends LibraryResource {
    public DVD(String title, String author) { super(title, author); }
    @Override
    public String getType() { return "DVD"; }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "Alice");
        Magazine m = new Magazine("Tech Today", "Bob");
        DVD d = new DVD("Movie Night", "Charlie");

        System.out.println(b.getTitle() + " is a " + b.getType());
        System.out.println(m.getTitle() + " is a " + m.getType());
        System.out.println(d.getTitle() + " is a " + d.getType());
    }
}
