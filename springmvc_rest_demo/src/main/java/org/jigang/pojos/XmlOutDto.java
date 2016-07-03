package org.jigang.pojos;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.jigang.util.DateToYMDHHMMSSConverter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wujigang on 16/7/3.
 */
@XStreamAlias("root")
public class XmlOutDto {
    @XStreamAlias("id")
    private Integer id;

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("money")
    private BigDecimal money;

    @XStreamAlias("day")
    @XStreamConverter(DateToYMDHHMMSSConverter.class)
    private Date day;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
