package com.jk.model;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by lyc on 2018/4/3.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8945371540835791841L;
    private String userid;

    private String username;

    private String userpass;

    private Date createtime;

    private Date modifytime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userid.equals(user.userid);

    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                '}';
    }

    @Override
    public int hashCode() {
        return userid.hashCode();


    }
}
