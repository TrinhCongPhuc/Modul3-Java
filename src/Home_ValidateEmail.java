import java.util.regex.*;
public class Home_ValidateEmail {
    public static boolean xacThucEmail(String email) {
        // Biểu thức chính quy cho địa chỉ email
        String emailRegex = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}$";

        // Tạo một đối tượng Pattern để so khớp với biểu thức chính quy
        Pattern pattern = Pattern.compile(emailRegex);

        // Tạo đối tượng Matcher để kiểm tra email có khớp với biểu thức chính quy hay không
        Matcher matcher = pattern.matcher(email);

        // Trả về kết quả kiểm tra
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "viduEmail@example.com",
                "invalid.email",
                "khongcokytudacbiet@example.com",
                "emailOK3@domain.com",
                "khoang trong khong hop le@example.com"
        };

        for (String email : emails) {
            boolean isValid = xacThucEmail(email);
            System.out.println(email + " có hợp lệ: " + isValid);
        }
    }
}
