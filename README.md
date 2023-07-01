# yang-utils

#### 介绍
本仓库为一个开源的功能项目，致力于为每一个程序猿服务，大家可以在本地的项目文件pom里面，添加本项目的依赖，就可以在本地使用本开源项目的一些相关功能。

#### 软件架构
使用springboot框架实现。


#### 安装教程

在本地项目的pom文件里加上：

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
            <version>1.0.0</version>
        </dependency>
```
展示效果：
![输入图片说明](https://foruda.gitee.com/images/1688216471974664747/bf186133_10715064.png "屏幕截图")


#### 使用说明

本开源项目目前为1.0.0版本，只有一个功能，为获取指定长度的uuid：

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

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
