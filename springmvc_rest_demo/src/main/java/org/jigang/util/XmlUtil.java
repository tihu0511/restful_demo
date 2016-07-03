package org.jigang.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.CompactWriter;

import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by BF100177 on 2016/6/21.
 */
public class XmlUtil {

   /**
     * 对象转换成xml字符串
     * @param object
     * @return
     */
    public static String toXML(Object object) {
        XStream xs = new XStream();
        StringWriter str = new StringWriter();
        xs.processAnnotations(object.getClass());
        xs.toXML(object, str);
        return str.toString();
    }

    /**
     * 对象转换成xml字符串(压缩版)
     * @param object
     * @return
     */
    public static String toMarshalXML(Object object) {
        Writer writer = new StringWriter();
        XStream xs = new XStream();
        xs.processAnnotations(object.getClass());
        xs.marshal(object, new CompactWriter(writer));
        return writer.toString();
    }

    /**
     * xml字符串转换成对象
     *
     * @param clazz
     * @param xml
     * @return
     */
    public static <T> T toObject(Class<T> clazz, String xml) {
        XStream xs = new XStream();
        xs.processAnnotations(clazz);
        return (T) xs.fromXML(xml);
    }
}
