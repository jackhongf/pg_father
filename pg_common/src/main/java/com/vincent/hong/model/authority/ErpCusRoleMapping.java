package com.vincent.hong.model.authority;

import java.util.Date;
import javax.persistence.*;

@Table(name = "erp_cus_role_mapping")
public class ErpCusRoleMapping {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户CODE
     */
    @Column(name = "CUS_CODE")
    private Integer cusCode;

    /**
     * 角色ID
     */
    @Column(name = "ROLE_ID")
    private Integer roleId;

    /**
     * 描述
     */
    @Column(name = "DESCRIPT")
    private String descript;

    /**
     * 角色创建时间
     */
    @Column(name = "CREATE_DT")
    private Date createDt;

    /**
     * 角色创建者
     */
    @Column(name = "CREATE_BY")
    private String createBy;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户CODE
     *
     * @return CUS_CODE - 用户CODE
     */
    public Integer getCusCode() {
        return cusCode;
    }

    /**
     * 设置用户CODE
     *
     * @param cusCode 用户CODE
     */
    public void setCusCode(Integer cusCode) {
        this.cusCode = cusCode;
    }

    /**
     * 获取角色ID
     *
     * @return ROLE_ID - 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取描述
     *
     * @return DESCRIPT - 描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置描述
     *
     * @param descript 描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取角色创建时间
     *
     * @return CREATE_DT - 角色创建时间
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 设置角色创建时间
     *
     * @param createDt 角色创建时间
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * 获取角色创建者
     *
     * @return CREATE_BY - 角色创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置角色创建者
     *
     * @param createBy 角色创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}