package top.taiyuezifeng.springbootdemo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Class: top.taiyuezifeng.springbootdemo.entity.FastJson
 * @Date: 2018-05-23
 * @Author: taiyuezifeng
 * @Version: 1.0.0
 * @Description: FastJson用于演示Spring Boot整合Fastjson。
 */
public class FastJson {

    private Integer integerData;

    private String stringData;

    @JSONField(format = "yyyy-MM-dd")
    private Date dateData;

    public Integer getIntegerData() {
        return integerData;
    }

    public void setIntegerData(Integer integerData) {
        this.integerData = integerData;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public Date getDateData() {
        return dateData;
    }

    public void setDateData(Date dateData) {
        this.dateData = dateData;
    }
}
