import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        System.out.println("=== Manajemen Perpustakaan ===");
        System.out.println("Nama: Moh Syarif Hidayatullah");
        System.out.println("NIM : 32602300025");

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Lihat Daftar Buku Tersedia");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan Pengarang Buku: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukkan ISBN Buku: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Masukkan Nama Anggota: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan ID Anggota: ");
                    String memberId = scanner.nextLine();
                    library.addMember(new Member(name, memberId));
                    break;

                case 3:
                    System.out.print("Masukkan ISBN Buku yang Ingin Dipinjam: ");
                    String borrowIsbn = scanner.nextLine();
                    System.out.print("Masukkan ID Anggota: ");
                    String borrowMemberId = scanner.nextLine();
                    library.borrowBook(borrowIsbn, borrowMemberId);
                    break;

                case 4:
                    System.out.print("Masukkan ISBN Buku yang Ingin Dikembalikan: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;

                case 5:
                    library.displayAvailableBooks();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan aplikasi perpustakaan.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
