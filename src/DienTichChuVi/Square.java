package DienTichChuVi;

public class Square extends Shape {
    private double canh;

    public Square(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
}
