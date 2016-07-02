package org.jigang.pojos.test;

/**
 * Created by wujigang on 16/7/2.
 */
public class Response {
    private Integer respCode;
    private String respMessage;

    public Response(Integer respCode, String respMessage) {
        this.respCode = respCode;
        this.respMessage = respMessage;
    }

    public Integer getRespCode() {
        return respCode;
    }

    public void setRespCode(Integer respCode) {
        this.respCode = respCode;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }
}
