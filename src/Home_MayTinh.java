import java.util.Scanner;
public class Home_MayTinh {
    public static class MayTinh {
        private int soA;
        private int soB;

        public MayTinh(int a, int b) {
            this.soA = a;
            this.soB = b;
        }

        public MayTinh() {
            soA = 0;
            soB = 0;
        }

        public static void main(String[] args) {
            MayTinh mayTinh = new MayTinh();
            mayTinh.nhapGiaTri();

            System.out.println("Tổng: " + mayTinh.cong());
            System.out.println("Hiệu: " + mayTinh.tru());
            System.out.println("Tích: " + mayTinh.nhan());
            System.out.println("Thương: " + mayTinh.chia());
        }

        public int getSoA() {
            return soA;
        }

        public void setSoA(int a) {
            this.soA = a;
        }

        public int getSoB() {
            return soB;
        }

        public void setSoB(int b) {
            this.soB = b;
        }

        public void nhapGiaTri() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số a: ");
            soA = scanner.nextInt();
            System.out.println("Nhập số b: ");
            soB = scanner.nextInt();
        }

        public int cong() {
            return soA + soB;
        }

        public int tru() {
            return soA - soB;
        }

        public int nhan() {
            return soA * soB;
        }

        public double chia() {
            if (soB == 0) {
                System.out.println("Lỗi");
                return 0;
            }
            return (double) soA / soB;
        }
    }
}
