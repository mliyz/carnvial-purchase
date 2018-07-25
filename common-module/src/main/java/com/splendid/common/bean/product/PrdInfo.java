package com.splendid.common.bean.product;

import java.io.Serializable;
import java.util.Date;

public class PrdInfo implements Serializable {
    /**
     *
     */
    private String tid;

    /**
     * 对外展示名称
     */
    private String labelName;

    /**
     * 短描述
     */
    private String shortDesc;

    /**
     * 库存
     */
    private String price;

    /**
     *
     */
    private Integer store;

    /**
     *
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     *
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 原因
     */
    private String remark;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 状态
     */
    private Integer state;

    /**
     * tb_prd_info
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @return tid
     */
    public String getTid() {
        return tid;
    }

    /**
     *
     * @param tid
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    /**
     * 对外展示名称
     * @return label_name 对外展示名称
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * 对外展示名称
     * @param labelName 对外展示名称
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    /**
     * 短描述
     * @return short_desc 短描述
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * 短描述
     * @param shortDesc 短描述
     */
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc == null ? null : shortDesc.trim();
    }

    /**
     * 库存
     * @return price 库存
     */
    public String getPrice() {
        return price;
    }

    /**
     * 库存
     * @param price 库存
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     *
     * @return store
     */
    public Integer getStore() {
        return store;
    }

    /**
     *
     * @param store
     */
    public void setStore(Integer store) {
        this.store = store;
    }

    /**
     *
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     *
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     *
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     *
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 原因
     * @return remark 原因
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 原因
     * @param remark 原因
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 版本
     * @return version 版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version 版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 状态
     * @return state 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", labelName=").append(labelName);
        sb.append(", shortDesc=").append(shortDesc);
        sb.append(", price=").append(price);
        sb.append(", store=").append(store);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remark=").append(remark);
        sb.append(", version=").append(version);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}