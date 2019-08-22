package xyz.foolcat.convert;

import xyz.foolcat.dto.UserInfoDTO;
import xyz.foolcat.model.UserInfo;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-08-2019/8/18 19:20
 */
public class UserInfoDTO2UserInfoConverter {

    public static UserInfo convert(UserInfoDTO userInfoDTO) {
        if (null == userInfoDTO){
            return new UserInfo();
        }

        return new UserInfo()
                .withOpenId(userInfoDTO.getOpenId())
                .withUnionId(userInfoDTO.getUnionId())
                .withNickName(userInfoDTO.getNickName())
                .withSex(userInfoDTO.getGender() == 1?"男":"女")
                .withAvatarUrl(userInfoDTO.getAvatarUrl());
    }
}
