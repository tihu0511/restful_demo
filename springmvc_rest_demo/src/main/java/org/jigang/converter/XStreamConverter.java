package org.jigang.converter;

import org.jigang.util.XmlUtil;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * Created by wujigang on 16/7/3.
 */
public class XStreamConverter extends AbstractHttpMessageConverter<Object> {
    public final static Charset UTF8     = Charset.forName("UTF-8");
    private Charset             charset  = UTF8;

    protected boolean supports(Class<?> clazz) {
        return true;
    }

    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        InputStream in = inputMessage.getBody();

        byte[] buf = new byte[1024];
        for (;;) {
            int len = in.read(buf);
            if (len == -1) {
                break;
            }

            if (len > 0) {
                baos.write(buf, 0, len);
            }
        }

        byte[] bytes = baos.toByteArray();

        return XmlUtil.toObject(clazz, new String(bytes));
    }

    protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        OutputStream out = outputMessage.getBody();
        String text = XmlUtil.toXML(o);
        byte[] bytes = text.getBytes(charset);
        out.write(bytes);
    }
}
