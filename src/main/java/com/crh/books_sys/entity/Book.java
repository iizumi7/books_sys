package com.crh.books_sys.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;
import java.util.Date;

/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2020-11-15 11:26:01
 */
public class Book extends BaseRowModel implements Serializable {
    private static final long serialVersionUID = 542975291547542917L;

    @ExcelProperty(value = "ID",index = 0)
    private Integer bid;

    @ExcelProperty(value = "图书名",index = 1)
    private String name;

    @ExcelProperty(value = "作者",index = 2)
    private String author;

    @ExcelProperty(value = "出版社",index = 3)
    private String publish;

    @ExcelProperty(value = "价格",index = 4)
    private Double price;

    @ExcelProperty(value = "入库时间",index = 5)
    private Date crttime;

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", price=" + price +
                ", crttime=" + crttime +
                '}';
    }

    public Book() {
    }

    public Book(Integer bid, String name, String author, String publish, Double price, Date crttime) {
        this.bid = bid;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.price = price;
        this.crttime = crttime;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCrttime() {
        return crttime;
    }

    public void setCrttime(Date crttime) {
        this.crttime = crttime;
    }

}