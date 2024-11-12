import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Anggota berhasil ditambahkan.");
    }

    public void borrowBook(String isbn, String memberId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.borrow();
                System.out.println("Buku berhasil dipinjam oleh ID Anggota: " + memberId);
                return;
            }
        }
        System.out.println("Buku tidak tersedia atau ISBN tidak ditemukan.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("Buku berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan atau sudah tersedia.");
    }

    public void displayAvailableBooks() {
        System.out.println("\nDaftar Buku Tersedia:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}
