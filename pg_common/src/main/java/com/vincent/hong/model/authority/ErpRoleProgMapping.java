package com.vincent.hong.model.authority;

import java.util.Date;
import javax.persistence.*;

@Table(name = "erp_role_prog_mapping")
public class ErpRoleProgMapping {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色ID
     */
    @Column(name = "ROLE_ID")
    private Integer roleId;

    /**
     * 权限ID
     */
    @Column(name = "PROG_ID")
    private Integer progId;

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
     * 获取权限ID
     *
     * @return PROG_ID - 权限ID
     */
    public Integer getProgId() {
        return progId;
    }

    /**
     * 设置权限ID
     *
     * @param progId 权限ID
     */
    public void setProgId(Integer progId) {
        this.progId = progId;
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
}