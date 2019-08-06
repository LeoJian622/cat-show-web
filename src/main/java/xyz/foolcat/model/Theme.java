package xyz.foolcat.model;

import java.io.Serializable;
import java.util.Date;

public class Theme implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_theme.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_theme.theme_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String themeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_theme.theme_image_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String themeImageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_theme.state
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_theme.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_theme.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foolcat_theme
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_theme.id
     *
     * @return the value of foolcat_theme.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_theme
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Theme withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_theme.id
     *
     * @param id the value for foolcat_theme.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_theme.theme_name
     *
     * @return the value of foolcat_theme.theme_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getThemeName() {
        return themeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_theme
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Theme withThemeName(String themeName) {
        this.setThemeName(themeName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_theme.theme_name
     *
     * @param themeName the value for foolcat_theme.theme_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setThemeName(String themeName) {
        this.themeName = themeName == null ? null : themeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_theme.theme_image_url
     *
     * @return the value of foolcat_theme.theme_image_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getThemeImageUrl() {
        return themeImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_theme
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Theme withThemeImageUrl(String themeImageUrl) {
        this.setThemeImageUrl(themeImageUrl);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_theme.theme_image_url
     *
     * @param themeImageUrl the value for foolcat_theme.theme_image_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setThemeImageUrl(String themeImageUrl) {
        this.themeImageUrl = themeImageUrl == null ? null : themeImageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_theme.state
     *
     * @return the value of foolcat_theme.state
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_theme
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Theme withState(Integer state) {
        this.setState(state);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_theme.state
     *
     * @param state the value for foolcat_theme.state
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_theme.create_time
     *
     * @return the value of foolcat_theme.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_theme
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Theme withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_theme.create_time
     *
     * @param createTime the value for foolcat_theme.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_theme.update_time
     *
     * @return the value of foolcat_theme.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_theme
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Theme withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_theme.update_time
     *
     * @param updateTime the value for foolcat_theme.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_theme
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
        sb.append(", themeName=").append(themeName);
        sb.append(", themeImageUrl=").append(themeImageUrl);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}