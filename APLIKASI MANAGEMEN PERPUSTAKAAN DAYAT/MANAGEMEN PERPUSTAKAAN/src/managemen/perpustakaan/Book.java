public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Judul: " + title + ", Pengarang: " + author + ", ISBN: " + isbn + ", Tersedia: " + isAvailable;
    }
}
