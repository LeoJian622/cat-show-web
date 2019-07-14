package xyz.foolcat.model;

import java.io.Serializable;
import java.util.Date;

public class SysUserInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.id
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.unionid
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private String unionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.nick_name
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.portrait_url
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private String portraitUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.user_identity
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private Integer userIdentity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.phone
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.sex
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.create_time
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_sys_user_info.update_time
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.id
     *
     * @return the value of foolcat_sys_user_info.id
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.id
     *
     * @param id the value for foolcat_sys_user_info.id
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.unionid
     *
     * @return the value of foolcat_sys_user_info.unionid
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withUnionid(String unionid) {
        this.setUnionid(unionid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.unionid
     *
     * @param unionid the value for foolcat_sys_user_info.unionid
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.nick_name
     *
     * @return the value of foolcat_sys_user_info.nick_name
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withNickName(String nickName) {
        this.setNickName(nickName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.nick_name
     *
     * @param nickName the value for foolcat_sys_user_info.nick_name
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.portrait_url
     *
     * @return the value of foolcat_sys_user_info.portrait_url
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public String getPortraitUrl() {
        return portraitUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withPortraitUrl(String portraitUrl) {
        this.setPortraitUrl(portraitUrl);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.portrait_url
     *
     * @param portraitUrl the value for foolcat_sys_user_info.portrait_url
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl == null ? null : portraitUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.user_identity
     *
     * @return the value of foolcat_sys_user_info.user_identity
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public Integer getUserIdentity() {
        return userIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withUserIdentity(Integer userIdentity) {
        this.setUserIdentity(userIdentity);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.user_identity
     *
     * @param userIdentity the value for foolcat_sys_user_info.user_identity
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setUserIdentity(Integer userIdentity) {
        this.userIdentity = userIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.phone
     *
     * @return the value of foolcat_sys_user_info.phone
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.phone
     *
     * @param phone the value for foolcat_sys_user_info.phone
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.sex
     *
     * @return the value of foolcat_sys_user_info.sex
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.sex
     *
     * @param sex the value for foolcat_sys_user_info.sex
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.create_time
     *
     * @return the value of foolcat_sys_user_info.create_time
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.create_time
     *
     * @param createTime the value for foolcat_sys_user_info.create_time
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_sys_user_info.update_time
     *
     * @return the value of foolcat_sys_user_info.update_time
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public SysUserInfo withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_sys_user_info.update_time
     *
     * @param updateTime the value for foolcat_sys_user_info.update_time
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", unionid=").append(unionid);
        sb.append(", nickName=").append(nickName);
        sb.append(", portraitUrl=").append(portraitUrl);
        sb.append(", userIdentity=").append(userIdentity);
        sb.append(", phone=").append(phone);
        sb.append(", sex=").append(sex);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}