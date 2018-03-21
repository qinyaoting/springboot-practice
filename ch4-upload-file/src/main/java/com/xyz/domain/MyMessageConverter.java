package com.xyz.domain;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/21/18
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter() {
        super(new MediaType("application", "x-wisely", Charset.forName("utf-8")));
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> clazz,
                                   HttpInputMessage inputMessage)
            throws IOException, HttpMessageNotReadableException {

        String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("utf-8"));
        String[] temparr = temp.split("-");
        return new DemoObj(new Long(temparr[0]), temparr[1]);
    }

    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        String res = demoObj.getId() + "&&&***@@@" + demoObj.getName();
        outputMessage.getBody().write(res.getBytes());
    }
}
