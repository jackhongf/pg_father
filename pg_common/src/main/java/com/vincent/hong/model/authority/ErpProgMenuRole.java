package com.vincent.hong.model.authority;

import java.util.Date;
import javax.persistence.*;

@Table(name = "erp_prog_menu_role")
public class ErpProgMenuRole {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父级菜单CODE
     */
    @Column(name = "MENU_ID")
    private Integer menuId;

    /**
     * 角色ID
     */
    @Column(name = "ROLE_ID")
    private Integer roleId;

    /**
     * 有效性
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 创建人
     */
    @Column(name = "CREATE_BY")
    private String createBy;

    /**
     * 创建时间
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
     * 获取父级菜单CODE
     *
     * @return MENU_ID - 父级菜单CODE
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置父级菜单CODE
     *
     * @param menuId 父级菜单CODE
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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
     * 获取有效性
     *
     * @return STATUS - 有效性
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置有效性
     *
     * @param status 有效性
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return CREATE_BY - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DT - 创建时间
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 设置创建时间
     *
     * @param createDt 创建时间
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }
}