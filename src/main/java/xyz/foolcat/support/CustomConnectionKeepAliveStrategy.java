package xyz.foolcat.support;

import com.alibaba.druid.util.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

import java.util.Arrays;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-07-2019/7/25 23:46
 */

public class CustomConnectionKeepAliveStrategy implements ConnectionKeepAliveStrategy {

    private final long DEFAULT_SECONDS = 30;

    @Override
    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return Arrays.stream(httpResponse.getHeaders(HTTP.CONN_KEEP_ALIVE))
                .filter(h -> StringUtils.equalsIgnoreCase(h.getName(), "timeout")
                && StringUtils.isNumber(h.getValue()))
                .findFirst()
                .map(h -> NumberUtils.toLong(h.getValue(), DEFAULT_SECONDS))
                .orElse(DEFAULT_SECONDS) * 1000;
    }

}
