package actPlus.business.services.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by AAAAA on 2016/11/28.
 */
class DateTool {
    static String getTodayDate() {
        SimpleDateFormat timeform = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return timeform.format(new Date());
    }
}
