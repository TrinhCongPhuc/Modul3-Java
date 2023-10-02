package DienTichChuVi;

import DienTichChuVi.Shape;

public class Triangle extends Shape {
    private double canh1;
    private double canh2;
    private double canh3;

    public Triangle(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    @Override
    public double tinhChuVi() {
        return canh1 + canh2 + canh3;
    }

    @Override
    public double tinhDienTich() {
        // Sử dụng công thức Heron để tính diện tích tam giác
        double p = (canh1 + canh2 + canh3) / 2.0;
        return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }
}
