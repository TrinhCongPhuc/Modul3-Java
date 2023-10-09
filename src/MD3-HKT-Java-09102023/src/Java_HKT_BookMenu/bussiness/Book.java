package Java_HKT_BookMenu.bussiness;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Book implements IBook, Comparable<Book> {
    public static List<Book> listBook = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;
    private boolean getBookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, float importPrice, float exportPrice, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
    
    public void inputData(){
        System.out.println("Mời nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Mời nhập tiêu đề sách: ");
        this.title = scanner.nextLine();
        System.out.println("Mời nhập tổng số trang sách: ");
        this.numberOfPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập giá nhập sách: ");
        this.importPrice =Float.parseFloat(scanner.nextLine());
        System.out.println("Mời nhập giá bán sách: ");
        this.exportPrice =Float.parseFloat(scanner.nextLine());
        System.out.println("Mời nhập trạng thái sách: ");
        this.bookStatus = Boolean.parseBoolean(scanner.nextLine());
    }
    public void displayData(){
        System.out.println("==============================================================");
        System.out.printf("Mã Sách: %d, Tên sách: %s, Tiêu đề: %s, Tổng số trang: %d\n", bookId, bookName, title, numberOfPages);
        System.out.printf("Giá nhập sách: %.1f, Giá bán sách: %.1f, Lợi nhuận: %.1f, Trạng thái sách: %s\n", importPrice, exportPrice, this.interest = this.exportPrice - this.importPrice, bookStatus ? "đang bán" : "không bán");
        System.out.println("==============================================================\n");
    }

    @Override
    public void inputBook() {
        System.out.println("Nhập số lượng sách muốn thêm: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i+1) + " :");
            Book book = new Book();
            book.inputData();
            if (listBook.size() == 0) {
                book.setBookId(1);
            } else {
                book.setBookId(listBook.get(listBook.size() - 1).getBookId() + 1);
            }
            listBook.add(book);
        }
    }

    @Override
    public void displayBook() {
        for (Book book:listBook) {
            book.displayData();
        }
    }

    @Override
    public void sortBookByInterist() {
        Collections.sort(listBook);
    }

    @Override
    public void deleteBookById() {
        System.out.println("Nhập id muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book:listBook) {
            if (book.getBookId()==id){
                listBook.remove(book);
                return;
            }
        }
        System.out.println("không có sách muốn xoá");
    }


    @Override
    public void searchBookByName() {
        System.out.println("Nhập tên sách muốn tìm: ");
        String search = scanner.nextLine();
        for (Book book : listBook) {
            if (book.getBookName().equals(search)) {
                book.displayData();
                return;
            }
        }
        System.out.println("Không có sách cần tìm");
    }

    @Override
    public void changeBookStatus() {
        System.out.println("Nhập id sách muốn thay đổi trạng thái: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book : listBook) {
            if (book.getBookId() == id) {
                book.setBookStatus(!book.isBookStatus());
                return;
            }
        }
        System.out.println("ID không tồn tại");
    }

    @Override
    public int compareTo(Book o) {
        return (int) (o.getInterest()-this.interest);
    }


}