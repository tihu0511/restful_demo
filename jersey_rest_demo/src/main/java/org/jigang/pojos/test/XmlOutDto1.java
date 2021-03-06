package org.jigang.pojos.test;

import org.jigang.util.JaxbDateAdapter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wujigang on 16/7/2.
 */
@XmlRootElement
public class XmlOutDto1 {
    private Integer id;
    private String name;
    private Date day;
    private BigDecimal money;

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

    public Date getDay() {
        return day;
    }

    @XmlJavaTypeAdapter(JaxbDateAdapter.class)
    public void setDay(Date day) {
        this.day = day;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
