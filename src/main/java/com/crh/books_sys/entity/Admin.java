package com.crh.books_sys.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2020-11-15 11:26:00
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 519527405223388740L;

    private Integer id;

    private String acctname;

    private String password;

    private Date crttime;

    public Admin() {
    }

    public Admin(Integer id, String acctname, String password, Date crttime) {
        this.id = id;
        this.acctname = acctname;
        this.password = password;
        this.crttime = crttime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcctname() {
        return acctname;
    }

    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCrttime() {
        return crttime;
    }

    public void setCrttime(Date crttime) {
        this.crttime = crttime;
    }

}