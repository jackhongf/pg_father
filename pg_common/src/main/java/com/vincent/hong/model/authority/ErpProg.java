package com.vincent.hong.model.authority;

import java.util.Date;
import javax.persistence.*;

@Table(name = "erp_prog")
public class ErpProg {
    /**
     * 权限编码
     */
    @Id
    @Column(name = "PROG_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer progId;

    /**
     * 权限名称
     */
    @Column(name = "PROG_NAME")
    private String progName;

    /**
     * 权限备注
     */
    @Column(name = "DESCRIPT")
    private String descript;

    /**
     * 权限URL
     */
    @Column(name = "URL")
    private String url;

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
     * @return PROG_ID - 权限编码
     */
    public Integer getProgId() {
        return progId;
    }

    /**
     * 设置权限编码
     *
     * @param progId 权限编码
     */
    public void setProgId(Integer progId) {
        this.progId = progId;
    }

    /**
     * 获取权限名称
     *
     * @return PROG_NAME - 权限名称
     */
    public String getProgName() {
        return progName;
    }

    /**
     * 设置权限名称
     *
     * @param progName 权限名称
     */
    public void setProgName(String progName) {
        this.progName = progName;
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
     * 获取权限URL
     *
     * @return URL - 权限URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置权限URL
     *
     * @param url 权限URL
     */
    public void setUrl(String url) {
        this.url = url;
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