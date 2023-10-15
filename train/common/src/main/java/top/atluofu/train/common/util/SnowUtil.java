package top.atluofu.train.common.util;

/**
 * @ClassName: SnowUtil
 * @description: 封装hutool雪花算法
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-16:48
 * @Version: 1.0
 */

import cn.hutool.core.util.IdUtil;

public class SnowUtil {
    //数据中心
    private static long dataCenterId = 1;
    // 机器标识
    private static long workerId = 1;

    public static long getSnowflakeNextId() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextId();
    }

    public static String getSnowflakeNextIdStr() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextIdStr();
    }
}
