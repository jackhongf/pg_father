package com.vincent.hong.model.authority;

import java.util.Date;
import javax.persistence.*;

@Table(name = "erp_menu")
public class ErpMenu {
    /**
     * 权限编码
     */
    @Id
    @Column(name = "MENU_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;

    /**
     * 父级CODE
     */
    @Column(name = "MENU_PID")
    private Integer menuPid;

    /**
     * 权限名称
     */
    @Column(name = "MENU_NAME")
    private String menuName;

    /**
     * 权限备注
     */
    @Column(name = "DESCRIPT")
    private String descript;

    /**
     * 菜单URL
     */
    @Column(name = "MENU_URL")
    private String menuUrl;

    /**
     * 菜单图标
     */
    @Column(name = "IMAGE")
    private String image;

    /**
     * 排序
     */
    @Column(name = "SHOW_ORDER")
    private Integer showOrder;

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
     * 获取权限编码
     *
     * @return MENU_ID - 权限编码
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置权限编码
     *
     * @param menuId 权限编码
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取父级CODE
     *
     * @return MENU_PID - 父级CODE
     */
    public Integer getMenuPid() {
        return menuPid;
    }

    /**
     * 设置父级CODE
     *
     * @param menuPid 父级CODE
     */
    public void setMenuPid(Integer menuPid) {
        this.menuPid = menuPid;
    }

    /**
     * 获取权限名称
     *
     * @return MENU_NAME - 权限名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置权限名称
     *
     * @param menuName 权限名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取权限备注
     *
     * @return DESCRIPT - 权限备注
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置权限备注
     *
     * @param descript 权限备注
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取菜单URL
     *
     * @return MENU_URL - 菜单URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 设置菜单URL
     *
     * @param menuUrl 菜单URL
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * 获取菜单图标
     *
     * @return IMAGE - 菜单图标
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置菜单图标
     *
     * @param image 菜单图标
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取排序
     *
     * @return SHOW_ORDER - 排序
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * 设置排序
     *
     * @param showOrder 排序
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
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