package org.jigang.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wujigang on 16/7/2.
 */
public class JaxbDateAdapter extends XmlAdapter<String, Date> {
    static final String STANDARM_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date unmarshal(String v) throws Exception {
        if (v == null) {
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return format.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return format.format(v);
    }
}
