package com.splendid.common.bean.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderProdut implements Serializable {
    /**
     *
     */
    private String tid;

    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 商品名
     */
    private String prdName;

    /**
     * 商品价
     */
    private BigDecimal prdPrice;

    /**
     * 数量
     */
    private Integer prdQty;

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
     * tb_ord_produt
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
     * 流水号
     * @return serial_no 流水号
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 流水号
     * @param serialNo 流水号
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * 商品名
     * @return prd_name 商品名
     */
    public String getPrdName() {
        return prdName;
    }

    /**
     * 商品名
     * @param prdName 商品名
     */
    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    /**
     * 商品价
     * @return prd_price 商品价
     */
    public BigDecimal getPrdPrice() {
        return prdPrice;
    }

    /**
     * 商品价
     * @param prdPrice 商品价
     */
    public void setPrdPrice(BigDecimal prdPrice) {
        this.prdPrice = prdPrice;
    }

    /**
     * 数量
     * @return prd_qty 数量
     */
    public Integer getPrdQty() {
        return prdQty;
    }

    /**
     * 数量
     * @param prdQty 数量
     */
    public void setPrdQty(Integer prdQty) {
        this.prdQty = prdQty;
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
        sb.append(", serialNo=").append(serialNo);
        sb.append(", prdName=").append(prdName);
        sb.append(", prdPrice=").append(prdPrice);
        sb.append(", prdQty=").append(prdQty);
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