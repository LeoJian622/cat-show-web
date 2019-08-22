package xyz.foolcat.dto;

import lombok.Data;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-08-2019/8/18 19:10
 */
@Data
public class UserInfoDTO {

    private String openId;

    private String nickName;

    private int gender;

    private String language;

    private String city;

    private String province;

    private String country;

    private String avatarUrl;

    private String unionId;

    private Watermark watermark;
}
