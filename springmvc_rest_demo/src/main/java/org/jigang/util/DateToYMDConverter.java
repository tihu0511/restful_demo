package org.jigang.util;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lip on 2016/5/9.
 */
public class DateToYMDConverter extends AbstractSingleValueConverter {

    @Override
    public boolean canConvert(Class type) {
        return type.equals(Date.class);
    }

    @Override
    public String toString(Object obj) {
        Date objRet = (Date)obj;
        return new SimpleDateFormat("yyyy-MM-dd").format(objRet);
    }

    @Override
    public Object fromString(String s) {
        Object obj = null;
       try {
           obj = new SimpleDateFormat("yyyy-MM-dd").parse(s);
       }catch (Exception e){
           e.printStackTrace();
       }
        return obj;
    }
}
