package xyz.foolcat.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;
import xyz.foolcat.model.Swiper;
import xyz.foolcat.model.SwiperExample;

public interface SwiperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    long countByExample(SwiperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    int deleteByExample(SwiperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    @Insert({
        "insert into foolcat_swiper (shop_id, swiper_image_url, ",
        "title, create_time, ",
        "update_time)",
        "values (#{shopId,jdbcType=VARCHAR}, #{swiperImageUrl,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Swiper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    int insertSelective(Swiper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    List<Swiper> selectByExampleWithRowbounds(SwiperExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    List<Swiper> selectByExample(SwiperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") Swiper record, @Param("example") SwiperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foolcat_swiper
     *
     * @mbg.generated Sun Jul 14 21:54:20 CST 2019
     */
    int updateByExample(@Param("record") Swiper record, @Param("example") SwiperExample example);
}