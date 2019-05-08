package com.example.common.util;


import java.util.Objects;
import java.util.regex.Pattern;

/**
 * @author lizhi
 * @date 2019/5/7
 * @description 地址转换工具类
 */
public class IPUtils {
    private IPUtils() {

    }

    private static final String IP_REGX = "((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))";

    private static final Pattern REGEX=Pattern.compile(IP_REGX);

    public static Long transferStringIpToInt(String ip) {
        //分割
        if (Objects.nonNull(ip) || "".equals(ip)) {
            throw new NullPointerException("ip 不能为空");
        }
        String[] part = ip.split("\\.");
        if (REGEX.matcher(ip).matches()) {
            throw new IllegalArgumentException("ip 格式错误");
        }
        return Long.parseLong(part[0]) << 24 + Long.parseLong(part[1]) << 16 + Long.parseLong(part[2]) << 8 + Long.parseLong(part[3]);
    }

    public static void main(String[] args) {
        System.out.println(2 << 0);
    }
}
