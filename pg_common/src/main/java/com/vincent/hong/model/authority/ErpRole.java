package com.vincent.hong.model.authority;

import java.util.Date;
import javax.persistence.*;

@Table(name = "erp_role")
public class ErpRole {
    /**
     * 角色编码
     */
    @Id
    @Column(name = "ROLE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    /**
     * 角色名称
     */
    @Column(name = "ROLE_NAME")
    private String roleName;

    /**
     * 角色备注
     */
    @Column(name = "DESCRIPT")
    private String descript;

    /**
     * 角色状态
     */
    @Column(name = "ROLE_STATUS")
    private String roleStatus;

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
     * 获取角色编码
     *
     * @return ROLE_ID - 角色编码
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色编码
     *
     * @param roleId 角色编码
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return ROLE_NAME - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色备注
     *
     * @return DESCRIPT - 角色备注
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置角色备注
     *
     * @param descript 角色备注
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取角色状态
     *
     * @return ROLE_STATUS - 角色状态
     */
    public String getRoleStatus() {
        return roleStatus;
    }

    /**
     * 设置角色状态
     *
     * @param roleStatus 角色状态
     */
    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
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