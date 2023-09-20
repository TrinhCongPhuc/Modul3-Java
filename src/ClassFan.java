public class ClassFan {
    // Khai báo hằng số để đại diện cho tốc độ của quạt
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Các trường dữ liệu
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor không tham số
    public ClassFan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    // Getter và setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString
    @Override
    public String toString() {
        if (on) {
            return "Tốc độ: " + speed + ", Màu sắc: " + color + ", Bán kính: " + radius + ", Trạng thái: Quạt đang bật";
        } else {
            return "Tốc độ: " + speed + ", Màu sắc: " + color + ", Bán kính: " + radius + ", Trạng thái: Quạt đang tắt";
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng Fan 1
        ClassFan quat1 = new ClassFan();
        quat1.setSpeed(FAST);
        quat1.setRadius(10);
        quat1.setColor("yellow");
        quat1.setOn(true);

        // Tạo đối tượng Fan 2
        ClassFan quat2 = new ClassFan();
        quat2.setSpeed(MEDIUM);
        quat2.setRadius(5);
        quat2.setColor("blue");
        quat2.setOn(false);

        // Hiển thị thông tin của các đối tượng
        System.out.println("Đối tượng Quạt 1: " + quat1.toString());
        System.out.println("Đối tượng Quạt 2: " + quat2.toString());
    }
}
