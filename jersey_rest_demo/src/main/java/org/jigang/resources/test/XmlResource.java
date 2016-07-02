package org.jigang.resources.test;

import org.jigang.pojos.test.XmlInDto1;
import org.jigang.pojos.test.XmlOutDto1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wujigang on 16/7/2.
 */
@Path("/v1/{username}")
@Consumes(MediaType.TEXT_XML)
@Produces(MediaType.TEXT_XML)
public class XmlResource {
    @PathParam("username")
    private String username;

    @Path("/method=test1")
    @POST
    public XmlOutDto1 test1(XmlInDto1 inDto) {
        System.out.println("===========访问者==========" + username);
        System.out.println(inDto);

        XmlOutDto1 outDto = new XmlOutDto1();
        outDto.setId(1);
        outDto.setName("kent");
        outDto.setDay(new Date());
        outDto.setMoney(new BigDecimal(100000.11).setScale(2, BigDecimal.ROUND_HALF_UP));

        return outDto;
    }
}
