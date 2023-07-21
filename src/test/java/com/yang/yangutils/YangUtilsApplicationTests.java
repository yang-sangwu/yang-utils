package com.yang.yangutils;

import com.sun.mail.util.MailSSLSocketFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

@SpringBootTest
class YangUtilsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test01() throws MessagingException, GeneralSecurityException {
        //封装配置信息
        Properties properties = new Properties();//实例化配置文件，也可以在外面写xxx.properties文件再引入配置
        properties.setProperty("mail.host", "smtp.qq.com");//设置QQ邮件服务器
        properties.setProperty("mail.transport.protocol", "smtp");//设置邮件发送协议
        properties.setProperty("mail.smtp.auth", "true");//需要验证用户名密码

        //关于QQ邮箱，还要设置SSL加密，加上以下代码即可
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);

        //使用JavaMail发送邮件的5个步骤
        //QQ才有！其他邮箱就不用

        //1.创建定义整个应用程序所需的环境信息的Session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //发件人邮件用户名、授权码
                return new PasswordAuthentication("2728771838@qq.com", "kovpofprtymwdgca");
            }
        });
        //开启session的debug模式，这样就可以查看程序发送Email的运行状态
        //session.setDebug(true);
        //2.通过session得到transport对象
        Transport ts = session.getTransport();
        //3.使用邮箱的用户名和授权码连上邮件服务器
        ts.connect("smtp.qq.com", "2728771838@qq.com", "kovpofprtymwdgca");
        //4.创建邮件:写邮件
        //注意需要传递session
        MimeMessage message = new MimeMessage(session);
        //指明邮件发件人
        message.setFrom(new InternetAddress("2728771838@qq.com"));
        //指明邮件的收件人，现在的发件人和收件人是一样，就是给自己发邮件
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("2728771838@qq.com"));
        //邮件的标题
        message.setSubject("nihaoa1");
        //邮件的文本内容,第二个参数代表前面文本支持html标签，字符编码为utf-8
        message.setContent("<h1 style='color:red'>你好啊！</h1>", "text/html;charset=UTF-8");
        //5.发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        //6.关闭连接
        ts.close();
    }
}
