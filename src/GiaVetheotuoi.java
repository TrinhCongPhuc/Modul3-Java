import java.util.Scanner;
public class GiaVetheotuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = input.nextInt();
        int giaVe = 0;
        if (tuoi < 6) {
            System.out.println("Trẻ em dưới 6 tuổi: Miễn phí");
        } else if (tuoi >= 6 && tuoi < 18) { giaVe = 5000; // Thiếu niên từ 6 tuổi đến dưới 18 tuổi
        } else if (tuoi >= 18 && tuoi < 22) { giaVe = 7000; // Người lớn từ 18 đến dưới 22 tuổi
        } else if (tuoi >= 22 && tuoi < 60) { giaVe = 10000; // Người lớn từ 22 đến dưới 60 tuổi
        } else { System.out.println("Nguời già lớn tuổi: Miễn phí");//giaVe = 0; // Người lớn từ 60 tuổi trở lên
        } System.out.println("Giá vé của bạn là: " + giaVe + " đồng");
    }
}
