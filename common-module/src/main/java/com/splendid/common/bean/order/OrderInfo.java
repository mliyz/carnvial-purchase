package com.splendid.common.bean.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo implements Serializable {
    /**
     *
     */
    private String tid;

    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 支付类型
     */
    private String payType;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 账户
     */
    private String shippingAccount;

    /**
     * 账户编号
     */
    private String accountId;

    /**
     * 收货人
     */
    private String shippingName;

    /**
     * 收货地址
     */
    private String shippingAddress;

    /**
     * 收货电话
     */
    private String shippingPhone;

    /**
     * 发货方式
     */
    private String postWay;

    /**
     * 配送费
     */
    private BigDecimal postFee;

    /**
     * 订单总价
     */
    private BigDecimal price;

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
     * tb_ord_inf
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
     * 订单状态
     * @return status 订单状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 订单状态
     * @param status 订单状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 支付类型
     * @return pay_type 支付类型
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 支付类型
     * @param payType 支付类型
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * 支付状态
     * @return pay_status 支付状态
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * 支付状态
     * @param payStatus 支付状态
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * 账户
     * @return shipping_account 账户
     */
    public String getShippingAccount() {
        return shippingAccount;
    }

    /**
     * 账户
     * @param shippingAccount 账户
     */
    public void setShippingAccount(String shippingAccount) {
        this.shippingAccount = shippingAccount == null ? null : shippingAccount.trim();
    }

    /**
     * 账户编号
     * @return account_id 账户编号
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 账户编号
     * @param accountId 账户编号
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 收货人
     * @return shipping_name 收货人
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 收货人
     * @param shippingName 收货人
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * 收货地址
     * @return shipping_address 收货地址
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 收货地址
     * @param shippingAddress 收货地址
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    /**
     * 收货电话
     * @return shipping_phone 收货电话
     */
    public String getShippingPhone() {
        return shippingPhone;
    }

    /**
     * 收货电话
     * @param shippingPhone 收货电话
     */
    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone == null ? null : shippingPhone.trim();
    }

    /**
     * 发货方式
     * @return post_way 发货方式
     */
    public String getPostWay() {
        return postWay;
    }

    /**
     * 发货方式
     * @param postWay 发货方式
     */
    public void setPostWay(String postWay) {
        this.postWay = postWay == null ? null : postWay.trim();
    }

    /**
     * 配送费
     * @return post_fee 配送费
     */
    public BigDecimal getPostFee() {
        return postFee;
    }

    /**
     * 配送费
     * @param postFee 配送费
     */
    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    /**
     * 订单总价
     * @return price 订单总价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 订单总价
     * @param price 订单总价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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
        sb.append(", serialNo=").append(serialNo);
        sb.append(", status=").append(status);
        sb.append(", payType=").append(payType);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", shippingAccount=").append(shippingAccount);
        sb.append(", accountId=").append(accountId);
        sb.append(", shippingName=").append(shippingName);
        sb.append(", shippingAddress=").append(shippingAddress);
        sb.append(", shippingPhone=").append(shippingPhone);
        sb.append(", postWay=").append(postWay);
        sb.append(", postFee=").append(postFee);
        sb.append(", price=").append(price);
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