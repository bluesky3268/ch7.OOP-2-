import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");
        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시각은 " + time.format(today));
    }

}
