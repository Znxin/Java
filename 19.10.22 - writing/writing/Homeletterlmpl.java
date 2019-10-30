package writing;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Homeletterlmpl implements HomeLetter {

    @Override
    public String writeTitle(String wt) {
        return "亲爱的"+wt;
    }

    @Override
    public String writeHello() {
        return "你好吗？";
    }

    @Override
    public String writeBody(String wb) {
        return wb;
    }

    @Override
    public String writeGreeting() {
        return "祝身体健康";
    }

    @Override
    public String writeSelft() {
        Date date = new Date();
        DateFormat df= new SimpleDateFormat("yyyy年MM月dd日");
        return "此致\n敬礼\n                    LL\n          "+df.format(date);
    }
}
