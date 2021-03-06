package xyz.foolcat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public ShopInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlIsNull() {
            addCriterion("shop_background_image_url is null");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlIsNotNull() {
            addCriterion("shop_background_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlEqualTo(String value) {
            addCriterion("shop_background_image_url =", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlNotEqualTo(String value) {
            addCriterion("shop_background_image_url <>", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlGreaterThan(String value) {
            addCriterion("shop_background_image_url >", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("shop_background_image_url >=", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlLessThan(String value) {
            addCriterion("shop_background_image_url <", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlLessThanOrEqualTo(String value) {
            addCriterion("shop_background_image_url <=", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlLike(String value) {
            addCriterion("shop_background_image_url like", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlNotLike(String value) {
            addCriterion("shop_background_image_url not like", value, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlIn(List<String> values) {
            addCriterion("shop_background_image_url in", values, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlNotIn(List<String> values) {
            addCriterion("shop_background_image_url not in", values, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlBetween(String value1, String value2) {
            addCriterion("shop_background_image_url between", value1, value2, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopBackgroundImageUrlNotBetween(String value1, String value2) {
            addCriterion("shop_background_image_url not between", value1, value2, "shopBackgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlIsNull() {
            addCriterion("shop_portrait_url is null");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlIsNotNull() {
            addCriterion("shop_portrait_url is not null");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlEqualTo(String value) {
            addCriterion("shop_portrait_url =", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlNotEqualTo(String value) {
            addCriterion("shop_portrait_url <>", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlGreaterThan(String value) {
            addCriterion("shop_portrait_url >", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("shop_portrait_url >=", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlLessThan(String value) {
            addCriterion("shop_portrait_url <", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlLessThanOrEqualTo(String value) {
            addCriterion("shop_portrait_url <=", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlLike(String value) {
            addCriterion("shop_portrait_url like", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlNotLike(String value) {
            addCriterion("shop_portrait_url not like", value, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlIn(List<String> values) {
            addCriterion("shop_portrait_url in", values, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlNotIn(List<String> values) {
            addCriterion("shop_portrait_url not in", values, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlBetween(String value1, String value2) {
            addCriterion("shop_portrait_url between", value1, value2, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andShopPortraitUrlNotBetween(String value1, String value2) {
            addCriterion("shop_portrait_url not between", value1, value2, "shopPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIsNull() {
            addCriterion("shop_description is null");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIsNotNull() {
            addCriterion("shop_description is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionEqualTo(String value) {
            addCriterion("shop_description =", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotEqualTo(String value) {
            addCriterion("shop_description <>", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionGreaterThan(String value) {
            addCriterion("shop_description >", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("shop_description >=", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLessThan(String value) {
            addCriterion("shop_description <", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLessThanOrEqualTo(String value) {
            addCriterion("shop_description <=", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLike(String value) {
            addCriterion("shop_description like", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotLike(String value) {
            addCriterion("shop_description not like", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIn(List<String> values) {
            addCriterion("shop_description in", values, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotIn(List<String> values) {
            addCriterion("shop_description not in", values, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionBetween(String value1, String value2) {
            addCriterion("shop_description between", value1, value2, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotBetween(String value1, String value2) {
            addCriterion("shop_description not between", value1, value2, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated do_not_delete_during_merge Tue Aug 13 14:52:18 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foolcat_shop_info
     *
     * @mbg.generated Tue Aug 13 14:52:18 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}