package xyz.foolcat.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import org.joda.money.Money;

@Builder
public class GoodsInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.shop_id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String shopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.goods_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.goods_description
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String goodsDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.goods_type
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Integer goodsType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.goods_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private String goodsUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.price
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Money price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.click_count
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Long clickCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.sale_volume
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Long saleVolume;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.stock_count
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Long stockCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foolcat_goods_info.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.id
     *
     * @return the value of foolcat_goods_info.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.id
     *
     * @param id the value for foolcat_goods_info.id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.shop_id
     *
     * @return the value of foolcat_goods_info.shop_id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withShopId(String shopId) {
        this.setShopId(shopId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.shop_id
     *
     * @param shopId the value for foolcat_goods_info.shop_id
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.goods_name
     *
     * @return the value of foolcat_goods_info.goods_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withGoodsName(String goodsName) {
        this.setGoodsName(goodsName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.goods_name
     *
     * @param goodsName the value for foolcat_goods_info.goods_name
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.goods_description
     *
     * @return the value of foolcat_goods_info.goods_description
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withGoodsDescription(String goodsDescription) {
        this.setGoodsDescription(goodsDescription);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.goods_description
     *
     * @param goodsDescription the value for foolcat_goods_info.goods_description
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.goods_type
     *
     * @return the value of foolcat_goods_info.goods_type
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withGoodsType(Integer goodsType) {
        this.setGoodsType(goodsType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.goods_type
     *
     * @param goodsType the value for foolcat_goods_info.goods_type
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.goods_url
     *
     * @return the value of foolcat_goods_info.goods_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public String getGoodsUrl() {
        return goodsUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withGoodsUrl(String goodsUrl) {
        this.setGoodsUrl(goodsUrl);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.goods_url
     *
     * @param goodsUrl the value for foolcat_goods_info.goods_url
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl == null ? null : goodsUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.price
     *
     * @return the value of foolcat_goods_info.price
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Money getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withPrice(Money price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.price
     *
     * @param price the value for foolcat_goods_info.price
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setPrice(Money price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.click_count
     *
     * @return the value of foolcat_goods_info.click_count
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Long getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withClickCount(Long clickCount) {
        this.setClickCount(clickCount);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.click_count
     *
     * @param clickCount the value for foolcat_goods_info.click_count
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.sale_volume
     *
     * @return the value of foolcat_goods_info.sale_volume
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Long getSaleVolume() {
        return saleVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withSaleVolume(Long saleVolume) {
        this.setSaleVolume(saleVolume);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.sale_volume
     *
     * @param saleVolume the value for foolcat_goods_info.sale_volume
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setSaleVolume(Long saleVolume) {
        this.saleVolume = saleVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.stock_count
     *
     * @return the value of foolcat_goods_info.stock_count
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Long getStockCount() {
        return stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withStockCount(Long stockCount) {
        this.setStockCount(stockCount);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.stock_count
     *
     * @param stockCount the value for foolcat_goods_info.stock_count
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setStockCount(Long stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.create_time
     *
     * @return the value of foolcat_goods_info.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.create_time
     *
     * @param createTime the value for foolcat_goods_info.create_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foolcat_goods_info.update_time
     *
     * @return the value of foolcat_goods_info.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public GoodsInfo withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foolcat_goods_info.update_time
     *
     * @param updateTime the value for foolcat_goods_info.update_time
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_goods_info
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
        sb.append(", shopId=").append(shopId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsDescription=").append(goodsDescription);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsUrl=").append(goodsUrl);
        sb.append(", price=").append(price);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", saleVolume=").append(saleVolume);
        sb.append(", stockCount=").append(stockCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}