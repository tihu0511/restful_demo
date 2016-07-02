package org.jigang.pojos.test;

import org.jigang.util.JaxbDateAdapter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wujigang on 16/7/2.
 */
@XmlRootElement(name = "Root")
public class XmlInDto1 {
    private Integer inId;
    private String inName;
    private Date inDay;
    private BigDecimal inMoney;

    public Integer getInId() {
        return inId;
    }

    public void setInId(Integer inId) {
        this.inId = inId;
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName;
    }

    @XmlJavaTypeAdapter(JaxbDateAdapter.class)
    public Date getInDay() {
        return inDay;
    }

    public void setInDay(Date inDay) {
        this.inDay = inDay;
    }

    public BigDecimal getInMoney() {
        return inMoney;
    }

    public void setInMoney(BigDecimal inMoney) {
        this.inMoney = inMoney;
    }

    @Override
    public String  toString() {
        return "XmlInDto1{" +
                "inId=" + inId +
                ", inName='" + inName + '\'' +
                ", inDay=" + inDay +
                ", inMoney=" + inMoney +
                '}';
    }
}
