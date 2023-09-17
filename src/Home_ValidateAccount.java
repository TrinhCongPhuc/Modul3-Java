import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Home_ValidateAccount {
    public static boolean xacThucTenDangNhap(String tenDangNhap) {
        String regexTenDangNhap = "^[a-z0-9_]{6,}$";
        Pattern pattern = Pattern.compile(regexTenDangNhap);
        Matcher matcher = pattern.matcher(tenDangNhap);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] tenDangNhaps = {
                "ten_dang_nhap_hop_le",
                "ten_dang_nhap_khong_hop_le!",
                "test",
                "ten_dang_nhap666",
                "Ten_Nguoi_Dung"
        };
        for (String tenDangNhap : tenDangNhaps) {
            boolean hopLe = xacThucTenDangNhap(tenDangNhap);
            System.out.println(tenDangNhap + " là hợp lệ: " + hopLe);
        }
    }
}
