import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Home_CrawlSong {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng URL để truy cập trang web nhạc của NhacCuaTui
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            // Sử dụng Scanner để đọc nội dung trang web từ URL
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            // Loại bỏ các ký tự xuống dòng để dễ dàng xử lý nội dung
            content = content.replaceAll("\\n+", "");

            // Sử dụng biểu thức chính quy để tìm và in ra tên các bài hát
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
