package org.jigang.resources.test;

import org.jigang.pojos.test.Request;
import org.jigang.pojos.test.Response;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by wujigang on 16/7/2.
 */
@Component
@Path("/test")
public class TestResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "Hello Jersey!";
    }

    @Path("/json/{username}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String testGetJson(@PathParam("username") String username) {
        return "{\"abc\":\"123\",\"user\":" + username + "}";
    }


    @Path("/post")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String testPostPlain() {
        return "Welcome";
    }

    @Path("/v0/{username}")
    @Produces(MediaType.TEXT_PLAIN)
    public String testPlain(@PathParam("username") String username) {
        return "Welcome to rest service, " + username;
    }

    @Path("/v1/{username}")
    @POST
    @Consumes(MediaType.TEXT_XML)
    @Produces(MediaType.TEXT_XML)
    public String testXml(@PathParam("username") String username) {
        System.out.println("=============================" + username);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "<xml><username>" + username + "</username><welcome>Welcome to Jigang's rest service!</welcome></xml>";
    }

    @Path("/v2/{username}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testJson(@PathParam("username") String username, Request query) {
        System.out.println("========##############" + username);
        System.out.println(query);

        return new Response(1, "33");
    }
}
