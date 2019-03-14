package com.tony.demo.example.bean;

import java.io.Serializable;

public class AuthorizerAppid implements Serializable {
    /**
     * 
     * 表字段 : authorizer_appid.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 第三方平台appid
     * 表字段 : authorizer_appid.component_appid
     *
     * @mbggenerated
     */
    private String componentAppid;

    /**
     * 授权方appid
     * 表字段 : authorizer_appid.authorizer_appid
     *
     * @mbggenerated
     */
    private String authorizerAppid;

    /**
     * 店鋪id
     * 表字段 : authorizer_appid.group_id
     *
     * @mbggenerated
     */
    private String groupId;

    /**
     * 小程序名称
     * 表字段 : authorizer_appid.micro_name
     *
     * @mbggenerated
     */
    private String microName;

    /**
     * 店铺开通状态：0.未开通,1.授权未补充信息,2.已授权,3.未授权
     * 表字段 : authorizer_appid.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * 版本信息
     * 表字段 : authorizer_appid.version
     *
     * @mbggenerated
     */
    private String version;

    /**
     * 版本号状态，0：未指定版本，1:提交版本中，2：审核中，3：已上线,4:审核通过
     * 表字段 : authorizer_appid.version_status
     *
     * @mbggenerated
     */
    private Byte versionStatus;

    /**
     * 服务类型：0,小程序 1.公众号
     * 表字段 : authorizer_appid.service_type
     *
     * @mbggenerated
     */
    private Byte serviceType;

    /**
     * 微信原始id
     * 表字段 : authorizer_appid.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 是否由微信公众号自动生成:0不是 1是
     * 表字段 : authorizer_appid.created_by_wx
     *
     * @mbggenerated
     */
    private Byte createdByWx;

    /**
     * 是否删除： 0 - 未删除，1 - 删除
     * 表字段 : authorizer_appid.deleted
     *
     * @mbggenerated
     */
    private Byte deleted;

    /**
     * 新建时间
     * 表字段 : authorizer_appid.created_time
     *
     * @mbggenerated
     */
    private Long createdTime;

    /**
     * 更新时间
     * 表字段 : authorizer_appid.updated_time
     *
     * @mbggenerated
     */
    private Long updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table authorizer_appid
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.id
     *
     * @return the value of authorizer_appid.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.id
     *
     * @param id the value for authorizer_appid.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.component_appid
     *
     * @return the value of authorizer_appid.component_appid
     *
     * @mbggenerated
     */
    public String getComponentAppid() {
        return componentAppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.component_appid
     *
     * @param componentAppid the value for authorizer_appid.component_appid
     *
     * @mbggenerated
     */
    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid == null ? null : componentAppid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.authorizer_appid
     *
     * @return the value of authorizer_appid.authorizer_appid
     *
     * @mbggenerated
     */
    public String getAuthorizerAppid() {
        return authorizerAppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.authorizer_appid
     *
     * @param authorizerAppid the value for authorizer_appid.authorizer_appid
     *
     * @mbggenerated
     */
    public void setAuthorizerAppid(String authorizerAppid) {
        this.authorizerAppid = authorizerAppid == null ? null : authorizerAppid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.group_id
     *
     * @return the value of authorizer_appid.group_id
     *
     * @mbggenerated
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.group_id
     *
     * @param groupId the value for authorizer_appid.group_id
     *
     * @mbggenerated
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.micro_name
     *
     * @return the value of authorizer_appid.micro_name
     *
     * @mbggenerated
     */
    public String getMicroName() {
        return microName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.micro_name
     *
     * @param microName the value for authorizer_appid.micro_name
     *
     * @mbggenerated
     */
    public void setMicroName(String microName) {
        this.microName = microName == null ? null : microName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.status
     *
     * @return the value of authorizer_appid.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.status
     *
     * @param status the value for authorizer_appid.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.version
     *
     * @return the value of authorizer_appid.version
     *
     * @mbggenerated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.version
     *
     * @param version the value for authorizer_appid.version
     *
     * @mbggenerated
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.version_status
     *
     * @return the value of authorizer_appid.version_status
     *
     * @mbggenerated
     */
    public Byte getVersionStatus() {
        return versionStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.version_status
     *
     * @param versionStatus the value for authorizer_appid.version_status
     *
     * @mbggenerated
     */
    public void setVersionStatus(Byte versionStatus) {
        this.versionStatus = versionStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.service_type
     *
     * @return the value of authorizer_appid.service_type
     *
     * @mbggenerated
     */
    public Byte getServiceType() {
        return serviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.service_type
     *
     * @param serviceType the value for authorizer_appid.service_type
     *
     * @mbggenerated
     */
    public void setServiceType(Byte serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.user_name
     *
     * @return the value of authorizer_appid.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.user_name
     *
     * @param userName the value for authorizer_appid.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.created_by_wx
     *
     * @return the value of authorizer_appid.created_by_wx
     *
     * @mbggenerated
     */
    public Byte getCreatedByWx() {
        return createdByWx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.created_by_wx
     *
     * @param createdByWx the value for authorizer_appid.created_by_wx
     *
     * @mbggenerated
     */
    public void setCreatedByWx(Byte createdByWx) {
        this.createdByWx = createdByWx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.deleted
     *
     * @return the value of authorizer_appid.deleted
     *
     * @mbggenerated
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.deleted
     *
     * @param deleted the value for authorizer_appid.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.created_time
     *
     * @return the value of authorizer_appid.created_time
     *
     * @mbggenerated
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.created_time
     *
     * @param createdTime the value for authorizer_appid.created_time
     *
     * @mbggenerated
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorizer_appid.updated_time
     *
     * @return the value of authorizer_appid.updated_time
     *
     * @mbggenerated
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorizer_appid.updated_time
     *
     * @param updatedTime the value for authorizer_appid.updated_time
     *
     * @mbggenerated
     */
    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorizer_appid
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", componentAppid=").append(componentAppid);
        sb.append(", authorizerAppid=").append(authorizerAppid);
        sb.append(", groupId=").append(groupId);
        sb.append(", microName=").append(microName);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", versionStatus=").append(versionStatus);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", userName=").append(userName);
        sb.append(", createdByWx=").append(createdByWx);
        sb.append(", deleted=").append(deleted);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}