package xyz.foolcat.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;
import xyz.foolcat.model.UserInfo;
import xyz.foolcat.model.UserInfoExample;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    long countByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    int deleteByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    @Delete({
        "delete from foolcat_sys_user_info",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    @Insert({
        "insert into foolcat_sys_user_info (id, union_id, open_id, ",
        "nick_name, avatar_url, ",
        "user_identity, phone, ",
        "sex, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=VARCHAR}, #{unionId,jdbcType=VARCHAR}, #{openId,jdbcType=VARCHAR}, ",
        "#{nickName,jdbcType=VARCHAR}, #{avatarUrl,jdbcType=VARCHAR}, ",
        "#{userIdentity,jdbcType=INTEGER}, #{phone,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT REPLACE(UUID(),'-','') FROM DUAL", keyProperty="id", before=true, resultType=String.class)
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    List<UserInfo> selectByExampleWithRowbounds(UserInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    @Select({
        "select",
        "id, union_id, open_id, nick_name, avatar_url, user_identity, phone, sex, create_time, ",
        "update_time",
        "from foolcat_sys_user_info",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("xyz.foolcat.mapper.UserInfoMapper.BaseResultMap")
    UserInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Thu Aug 15 16:48:06 CST 2019
     */
    @Update({
        "update foolcat_sys_user_info",
        "set union_id = #{unionId,jdbcType=VARCHAR},",
          "open_id = #{openId,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "avatar_url = #{avatarUrl,jdbcType=VARCHAR},",
          "user_identity = #{userIdentity,jdbcType=INTEGER},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UserInfo record);

    /**
     * 通过openId 查找用户信息
     *
     * @param openId 微信开放ID
     * @return UserInfo 对象 或 NULL
     */
    @Select({
            "select",
            "id, union_id, open_id, nick_name, avatar_url, user_identity, phone, sex, create_time, ",
            "update_time",
            "from foolcat_sys_user_info",
            "where open_id = #{openId,jdbcType=VARCHAR}"
    })
    @ResultMap("xyz.foolcat.mapper.UserInfoMapper.BaseResultMap")
    UserInfo selectByOpenId(String openId);

    /**
     * 通过unionId 查找用户信息
     *
     * @param unionId 微信开放ID
     * @return UserInfo 对象 或 NULL
     */
    @Select({
            "select",
            "id, union_id, open_id, nick_name, avatar_url, user_identity, phone, sex, create_time, ",
            "update_time",
            "from foolcat_sys_user_info",
            "where open_id = #{unionId,jdbcType=VARCHAR}"
    })
    @ResultMap("xyz.foolcat.mapper.UserInfoMapper.BaseResultMap")
    UserInfo selectByUnionId(String unionId);
}