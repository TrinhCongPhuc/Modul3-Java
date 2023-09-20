import java.util.Scanner;
public class ClassPtBacHai {
    static class PhuongTrinhBac2 {
        private double a, b, c;

        public PhuongTrinhBac2(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b + Math.sqrt(delta)) / (2 * a);
            } else {
                return 0;
            }
        }

        public double getRoot2() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b - Math.sqrt(delta)) / (2 * a);
            } else {
                return 0;
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập giá trị cho a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập giá trị cho b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập giá trị cho c: ");
            double c = scanner.nextDouble();

            PhuongTrinhBac2 phuongTrinh = new PhuongTrinhBac2(a, b, c);
            double delta = phuongTrinh.getDiscriminant();

            if (delta > 0) {
                double root1 = phuongTrinh.getRoot1();
                double root2 = phuongTrinh.getRoot2();
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("Nghiệm 1: " + root1);
                System.out.println("Nghiệm 2: " + root2);
            } else if (delta == 0) {
                double root = phuongTrinh.getRoot1();
                System.out.println("Phương trình có một nghiệm kép: " + root);
            } else {
                System.out.println("Phương trình không có nghiệm thực.");
            }
        }
    }
}
