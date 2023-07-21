package com.yang.yangutils;

import com.yang.yangutils.utils.YangUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YangUtilsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test01() {
        YangUtils.QQSenMsg(10);
    }
}
