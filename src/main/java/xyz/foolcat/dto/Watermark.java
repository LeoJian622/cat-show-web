package xyz.foolcat.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-08-2019/8/18 19:14
 */
@Data
public class Watermark {

    private Date timestamp;

    private String appid;
}
