package com.splendid.msg.bean;

import java.io.Serializable;
import java.util.Date;

public class MsgNotice implements Serializable {
    /**
     *
     */
    private String tid;

    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 目标类型SMS|EMAIL
     */
    private String targetType;

    /**
     * 目标地址
     */
    private String targetAddress;

    /**
     * 消息详情
     */
    private String content;

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
     * tb_msg_notice
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
     * 目标类型SMS|EMAIL
     * @return target_type 目标类型SMS|EMAIL
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * 目标类型SMS|EMAIL
     * @param targetType 目标类型SMS|EMAIL
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType == null ? null : targetType.trim();
    }

    /**
     * 目标地址
     * @return target_address 目标地址
     */
    public String getTargetAddress() {
        return targetAddress;
    }

    /**
     * 目标地址
     * @param targetAddress 目标地址
     */
    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress == null ? null : targetAddress.trim();
    }

    /**
     * 消息详情
     * @return content 消息详情
     */
    public String getContent() {
        return content;
    }

    /**
     * 消息详情
     * @param content 消息详情
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        sb.append(", targetType=").append(targetType);
        sb.append(", targetAddress=").append(targetAddress);
        sb.append(", content=").append(content);
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