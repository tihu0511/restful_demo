package org.jigang.controller;

import org.jigang.pojos.XmlInDto;
import org.jigang.pojos.XmlOutDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wujigang on 16/7/3.
 */
@Controller
@RequestMapping("/xml")
public class XmlController {

    @RequestMapping(value = "/v1")
    @ResponseBody
    public String testPostXml2(HttpServletRequest request) throws IOException {
        InputStream is = request.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

        StringBuffer sb = new StringBuffer();
        String line = null;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();

        System.out.println(sb.toString());

        return sb.toString();
    }

    @RequestMapping(value = "/v2/{username}", method = RequestMethod.POST, produces = "application/xml")
    @ResponseBody
    public XmlOutDto testPostXml(@PathVariable("username") String username, @RequestBody XmlInDto inDto) {
        System.out.println(username);
        System.out.println(inDto);

        XmlOutDto outDto = new XmlOutDto();
        outDto.setId(33);
        outDto.setName("kent");
        outDto.setMoney(new BigDecimal(4000.22).setScale(2, BigDecimal.ROUND_HALF_UP));
        outDto.setDay(new Date());
        return outDto;
    }
}
