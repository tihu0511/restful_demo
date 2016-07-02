package org.jigang.resources.test;

import org.codehaus.jettison.json.JSONObject;
import org.jigang.pojos.test.JSONOutDto1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wujigang on 16/7/2.
 */
@Path("/v2/{username}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class JsonResource {
    @PathParam("username")
    private String username;

    @Path("/method=test")
    @POST
    public JSONOutDto1 test(JSONObject inJson) {
        System.out.println("==================" + username);
        System.out.println(inJson.toString());

        JSONOutDto1 outDto = new JSONOutDto1();
        outDto.setId(1);
        outDto.setName("kent");
        outDto.setDay(new Date());
        outDto.setMoney(new BigDecimal(100000.11).setScale(2, BigDecimal.ROUND_HALF_UP));

        return outDto;

    }
}
