package DienTichChuVi;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" ");
            System.out.println("Chọn loại hình (nhập số từ 1-5) :");
            System.out.println(" ");
            System.out.println("1. Tam giác");
            System.out.println("2. Hình vuông");
            System.out.println("3. Hình chữ nhật");
            System.out.println("4. Hình tròn");
            System.out.println("5. Thoát");

            choice = scanner.nextInt();

            double chuVi = 0.0;
            double dienTich = 0.0;

            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều dài cạnh 1: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập chiều dài cạnh 2: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập chiều dài cạnh 3: ");
                    double c = scanner.nextDouble();
                    Triangle tamGiac = new Triangle(a, b, c);
                    chuVi = tamGiac.tinhChuVi();
                    dienTich = tamGiac.tinhDienTich();
                    break;
                case 2:
                    System.out.print("Nhập chiều dài cạnh vuông: ");
                    double canhVuong = scanner.nextDouble();
                    Square vuong = new Square(canhVuong);
                    chuVi = vuong.tinhChuVi();
                    dienTich = vuong.tinhDienTich();
                    break;
                case 3:
                    System.out.print("Nhập chiều dài hình chữ nhật: ");
                    double dai = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng hình chữ nhật: ");
                    double rong = scanner.nextDouble();
                    Rectangle chuNhat = new Rectangle(dai, rong);
                    chuVi = chuNhat.tinhChuVi();
                    dienTich = chuNhat.tinhDienTich();
                    break;
                case 4:
                    System.out.print("Nhập bán kính hình tròn: ");
                    double banKinh = scanner.nextDouble();
                    Circle tron = new Circle(banKinh);
                    chuVi = tron.tinhChuVi();
                    dienTich = tron.tinhDienTich();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }

            System.out.println("Chu vi: " +  chuVi);
            System.out.println("Diện tích: " + dienTich);

        } while (true);
    }
}
