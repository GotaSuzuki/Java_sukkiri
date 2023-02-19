import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Good {
  void Go() {
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int y = c.get(Calendar.DAY_OF_MONTH);
    y += 100;
    c.set(Calendar.DAY_OF_MONTH, y);
    Date future = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    System.out.println(f.format(future));
  }
}
