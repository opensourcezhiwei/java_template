package com.ay.rbac.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String name;

    private String tel;

    private String email;

    private Date createTime;

    private Date updateTime;

    private Byte enable;

    private String payPwd;

    private String saltPay;

    private static final long serialVersionUID = 1L;

    public User(Long id, String username, String password, String name, String tel, String email, Date createTime, Date updateTime, Byte enable, String payPwd, String saltPay) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.enable = enable;
        this.payPwd = payPwd;
        this.saltPay = saltPay;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    public String getSaltPay() {
        return saltPay;
    }

    public void setSaltPay(String saltPay) {
        this.saltPay = saltPay == null ? null : saltPay.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getPayPwd() == null ? other.getPayPwd() == null : this.getPayPwd().equals(other.getPayPwd()))
            && (this.getSaltPay() == null ? other.getSaltPay() == null : this.getSaltPay().equals(other.getSaltPay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getPayPwd() == null) ? 0 : getPayPwd().hashCode());
        result = prime * result + ((getSaltPay() == null) ? 0 : getSaltPay().hashCode());
        return result;
    }
}