# yang-utils

#### 介绍
本仓库为一个开源的功能项目，致力于为每一个程序猿服务，大家可以在本地的项目文件pom里面，添加本项目的依赖，就可以在本地使用本开源项目的一些相关功能。

#### 软件架构
使用springboot框架实现。


#### 安装教程

在本地项目的pom文件里加上（最新版）：

```
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
        <dependency>
            <groupId>com.gitee.yang-saiya</groupId>
            <artifactId>yang-utils</artifactId>
            <version>tag</version>
        </dependency>
```
展示效果：
![输入图片说明](https://foruda.gitee.com/images/1688216471974664747/bf186133_10715064.png "屏幕截图")


#### 使用说明

建议下载最新版本，此工具还在继续增加更多的工具。

```
    @Test
    public void test01() {
        String uuid = YangUtils.getUUID(12);
        System.out.println("-------------");
        System.out.println(uuid);
    }
```


#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.功能一为获取指定长度的UUID，在使用uuid作为验证码，密钥等方面能起到一定的作用。
2.功能二为随机生成六位数字，可以作为验证码来使用。
3.功能三为拥有自定义的链表，java没有链表需要我们自己来定义这个是我们都知道的，使用本依赖就可以省去自己再去定义的苦恼了，而且封装了众多的方法，是非常方便的。
