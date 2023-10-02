package DienTichChuVi;

public class Circle extends Shape {
    private double banKinh;


    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
    public void chuviDientich() {

    }
}
