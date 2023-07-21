package com.yang.yangutils.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

    /**
     * QQ炸屏
     */
    public static void QQSenMsg(int num) {
        try {
            Robot robot = new Robot();
            robot.delay(3000);
            for (int i = 0; i < num; i++) {
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("我是恋爱脑"), null);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                robot.delay(100);
            }
//                //无限炸，这个快
//                while (true) {
//                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("我是恋爱脑"), null);
//                    robot.keyPress(KeyEvent.VK_CONTROL);
//                    robot.keyPress(KeyEvent.VK_V);
//                    robot.keyRelease(KeyEvent.VK_CONTROL);
//                    robot.keyRelease(KeyEvent.VK_V);
//                    robot.keyPress(KeyEvent.VK_ENTER);
//                    robot.keyRelease(KeyEvent.VK_ENTER);
//                    robot.delay(100);
//                }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
//        System.out.println(getCode());
    }

}
