import java.util.Date;
public class ClassStopWatch {
    public static class DoiChieuThoiGian {
        private long startTime;
        private long endTime;

        public DoiChieuThoiGian() {
            startTime = System.currentTimeMillis();
        }

        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            if (endTime == 0) {
                return System.currentTimeMillis() - startTime;
            } else {
                return endTime - startTime;
            }
        }

        public static void main(String[] args) {
            DoiChieuThoiGian doiChieu = new DoiChieuThoiGian();

            int[] arr = new int[100000];
            for (int i = 0; i < 100000; i++) {
                arr[i] = (int) (Math.random() * 100000);
            }

            doiChieu.start();

            // Thực hiện thuật toán sắp xếp chọn tại đây (Selection Sort)
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            doiChieu.stop();

            System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn là: " + doiChieu.getElapsedTime() + " milisecond giây.");
        }
    }
}
