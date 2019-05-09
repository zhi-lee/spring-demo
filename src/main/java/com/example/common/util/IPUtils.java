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

    private static final String IP_REGX = "((25[0-5]|2[0-4]\\d|((1\\d{2})|([0-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([0-9]?\\d)))";

    private static final Pattern REGEX = Pattern.compile(IP_REGX);

    /**
     * <p>字符串id转成Long</p>
     *
     * @param ip
     * @return
     * @throws Exception
     */
    public static Long transferStringIpToInt(String ip) throws Exception {
        Long result = null;
        //分割
        if (Objects.isNull(ip) || "".equals(ip))
            throw new NullPointerException("ip 不能为空");
        if (!REGEX.matcher(ip).matches())
            throw new IllegalArgumentException("ip 格式错误");
        String[] idArr = ip.split("\\.");
        result = new Long(0);
        for (int i = 3; i >= 0; i--) {
            result += Long.parseLong(idArr[3 - i]) << (8 * i);
        }
        return result;
    }

    /**
     * <p>Long转换成字符串</p>
     *
     * @param ip
     * @return
     * @throws Exception
     */
    public static String transferLongToStringIp(Long ip) throws Exception {
        if (Objects.isNull(ip) || ip < 0L || ip > 4294967295L)
            throw new IllegalArgumentException("ip 参数错误");
        StringBuilder ipStr = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            ipStr.append(ip >> (i * 3) & 0xFF).append(".");
        }
        return ipStr.deleteCharAt(ipStr.length() - 1).toString();
    }

}
