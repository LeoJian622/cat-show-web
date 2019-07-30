package xyz.foolcat.model;

import java.io.Serializable;
import java.util.Date;

public class ShopInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.user_id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.shop_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String shopName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.shop_background_image_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String shopBackgroundImageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.shop_portrait_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String shopPortraitUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.state
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.shop_description
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String shopDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_shop_info.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.id
     *
     * @return the value of foolcat_shop_info.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.id
     *
     * @param id the value for foolcat_shop_info.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.user_id
     *
     * @return the value of foolcat_shop_info.user_id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.user_id
     *
     * @param userId the value for foolcat_shop_info.user_id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.shop_name
     *
     * @return the value of foolcat_shop_info.shop_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withShopName(String shopName) {
        this.setShopName(shopName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.shop_name
     *
     * @param shopName the value for foolcat_shop_info.shop_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.shop_background_image_url
     *
     * @return the value of foolcat_shop_info.shop_background_image_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getShopBackgroundImageUrl() {
        return shopBackgroundImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withShopBackgroundImageUrl(String shopBackgroundImageUrl) {
        this.setShopBackgroundImageUrl(shopBackgroundImageUrl);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.shop_background_image_url
     *
     * @param shopBackgroundImageUrl the value for foolcat_shop_info.shop_background_image_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setShopBackgroundImageUrl(String shopBackgroundImageUrl) {
        this.shopBackgroundImageUrl = shopBackgroundImageUrl == null ? null : shopBackgroundImageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.shop_portrait_url
     *
     * @return the value of foolcat_shop_info.shop_portrait_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getShopPortraitUrl() {
        return shopPortraitUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withShopPortraitUrl(String shopPortraitUrl) {
        this.setShopPortraitUrl(shopPortraitUrl);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.shop_portrait_url
     *
     * @param shopPortraitUrl the value for foolcat_shop_info.shop_portrait_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setShopPortraitUrl(String shopPortraitUrl) {
        this.shopPortraitUrl = shopPortraitUrl == null ? null : shopPortraitUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.state
     *
     * @return the value of foolcat_shop_info.state
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withState(Integer state) {
        this.setState(state);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.state
     *
     * @param state the value for foolcat_shop_info.state
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.shop_description
     *
     * @return the value of foolcat_shop_info.shop_description
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getShopDescription() {
        return shopDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withShopDescription(String shopDescription) {
        this.setShopDescription(shopDescription);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.shop_description
     *
     * @param shopDescription the value for foolcat_shop_info.shop_description
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription == null ? null : shopDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.create_time
     *
     * @return the value of foolcat_shop_info.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.create_time
     *
     * @param createTime the value for foolcat_shop_info.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_shop_info.update_time
     *
     * @return the value of foolcat_shop_info.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public ShopInfo withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_shop_info.update_time
     *
     * @param updateTime the value for foolcat_shop_info.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopBackgroundImageUrl=").append(shopBackgroundImageUrl);
        sb.append(", shopPortraitUrl=").append(shopPortraitUrl);
        sb.append(", state=").append(state);
        sb.append(", shopDescription=").append(shopDescription);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}