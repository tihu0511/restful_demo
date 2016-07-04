package org.jigang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by wujigang on 16/7/4.
 */
@Mapper
public interface TestDao {

//    @Select("SELECT count(1) FROM coupon")
//    int cntTest();

    int countTest();
}
