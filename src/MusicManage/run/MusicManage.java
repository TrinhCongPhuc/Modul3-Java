package MusicManage.run;

import MusicManage.controller.SingerController;
import MusicManage.controller.SongController;
import MusicManage.service.SingerService;
import MusicManage.service.SongService;
import java.util.Scanner;

public class MusicManage {
    public static void main(String[] args) {

        SingerService singerService = new SingerService();
        SongService songService = new SongService(singerService);

        SingerController singerController = new SingerController(singerService);
        SongController songController = new SongController(songService);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**********************MENU QUẢN LÝ ÂM NHẠC*************************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Thoát");
            System.out.print("Mời lựa chọn (số nguyên từ 1-3) : ");
            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    singerController.hienThiMenuQuanLyCaSi();
                    break;
                case 2:
                    songController.hienThiMenuQuanLyBaiHat();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại số nguyên từ 1-3");
            }
        }
    }
}
