package xyz.foolcat.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;
import xyz.foolcat.model.SysUserInfo;
import xyz.foolcat.model.SysUserInfoExample;

public interface SysUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    long countByExample(SysUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    int deleteByExample(SysUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    @Insert({
        "insert into foolcat_sys_user_info (union_id, nick_name, ",
        "portrait_url, user_identity, ",
        "phone, sex, create_time, ",
        "update_time)",
        "values (#{unionId,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
        "#{portraitUrl,jdbcType=VARCHAR}, #{userIdentity,jdbcType=INTEGER}, ",
        "#{phone,jdbcType=VARCHAR}, #{sex,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    int insertSelective(SysUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    List<SysUserInfo> selectByExampleWithRowbounds(SysUserInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    List<SysUserInfo> selectByExample(SysUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysUserInfo record, @Param("example") SysUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_sys_user_info
     *
     * @mbg.generated Tue Jul 30 23:49:45 CST 2019
     */
    int updateByExample(@Param("record") SysUserInfo record, @Param("example") SysUserInfoExample example);
}