package xyz.foolcat.dto;

import lombok.Data;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-07-2019/7/25 0:03
 */

@Data
public class WeChatAuthReturnDTO{

    private String openid;

    private String sessionKey;

    private String unionId;

    private int errcode;

    private String errmsg;
}
