package com.yang.yangutils.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Random;
import java.util.UUID;

@SuppressWarnings("all")
@Slf4j
public class YangUtils {
    public static String getUUID32() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * (获取指定长度uuid)
     */
    public static String getUUID(int len) {
        if (len <= 0 || len > 32) {
            return null;
        }
        String uuid = getUUID32();
        //    System.out.println(uuid);
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < len; i++) {
            str.append(uuid.charAt(i));
        }
        return str.toString();
    }

    /**
     * 随机生成6位数字
     */
    public static String getCode() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        String code = stringBuilder.toString();

        log.info("==============验证码=" + code);

        return stringBuilder.toString();
    }
    
    @Test
    public void test() {
//        System.out.println(getCode());
    }

}
