package com.vincent.hong.model.authority;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {
    /**
     * 用户编码
     */
    @Id
    @Column(name = "CUS_CODE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cusCode;

    /**
     * 用户名
     */
    @Column(name = "CUS_NAME")
    private String cusName;

    /**
     * 用户密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    private String nickname;

    /**
     * 身份证号
     */
    @Column(name = "IDN")
    private String idn;

    /**
     * 用户状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 手机
     */
    @Column(name = "MPHONE")
    private String mphone;

    /**
     * 联系地址
     */
    @Column(name = "ADDR")
    private String addr;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 注册时间
     */
    @Column(name = "CREATE_DT")
    private Date createDt;

    /**
     * 获取用户编码
     *
     * @return CUS_CODE - 用户编码
     */
    public Integer getCusCode() {
        return cusCode;
    }

    /**
     * 设置用户编码
     *
     * @param cusCode 用户编码
     */
    public void setCusCode(Integer cusCode) {
        this.cusCode = cusCode;
    }

    /**
     * 获取用户名
     *
     * @return CUS_NAME - 用户名
     */
    public String getCusName() {
        return cusName;
    }

    /**
     * 设置用户名
     *
     * @param cusName 用户名
     */
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    /**
     * 获取用户密码
     *
     * @return PASSWORD - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取身份证号
     *
     * @return IDN - 身份证号
     */
    public String getIdn() {
        return idn;
    }

    /**
     * 设置身份证号
     *
     * @param idn 身份证号
     */
    public void setIdn(String idn) {
        this.idn = idn;
    }

    /**
     * 获取用户状态
     *
     * @return STATUS - 用户状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置用户状态
     *
     * @param status 用户状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取手机
     *
     * @return MPHONE - 手机
     */
    public String getMphone() {
        return mphone;
    }

    /**
     * 设置手机
     *
     * @param mphone 手机
     */
    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    /**
     * 获取联系地址
     *
     * @return ADDR - 联系地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置联系地址
     *
     * @param addr 联系地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取注册时间
     *
     * @return CREATE_DT - 注册时间
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 设置注册时间
     *
     * @param createDt 注册时间
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

	@Override
	public String toString() {
		return "Customer [cusCode=" + cusCode + ", cusName=" + cusName + ", password=" + password + ", nickname="
				+ nickname + ", idn=" + idn + ", status=" + status + ", mphone=" + mphone + ", addr=" + addr
				+ ", email=" + email + ", createDt=" + createDt + "]";
	}
}