package xyz.foolcat.dto;

import lombok.Data;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-08-2019/8/5 0:08
 */

@Data
public class WeChatAuthDTO {

    /**
     * 密文数据
     */
    private String authenticate;

    /**
     * 初始偏移量
     */
    private String iv;
}
