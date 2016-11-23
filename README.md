#RapidLibs
--------------------------
#### Brife
一套项目级别的综合框架实践，有问题欢迎提issue。

**1.1 Gradle**

```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

```
dependencies {
    compile 'com.github.MarnonDev:RapidLibs:最新版本号'
}
```

**1.2 Function**

* BasicActivity和BasicFragment重写生命周期
* 创建支持手势返回的Activity
* 沉浸式状态栏（一句代码实现）
* 万能适配器（ListView、GridView，RecyclerView）
* Fragment懒加载，Activity可见时加载
* 下拉刷新、上拉加载
* 可添加多个Header和Footer
* manager类是三方库二次封装，目前有GlideManager和MLog(Logger封装)两个类
* 常用工具类（拆分为 [EasyUtilCode](https://github.com/MarnonDev/EasyUtilCode) 维护），但是默认已经集成在该库中
* Retrofit请求与Activity、Fragment生命周期绑定，需要手动调用bindUntilEvent()方法
* 创建常见Activity和Fragment

#### Guide


#### Thanks

>* [(https://github.com/ThePacific/adapter](https://github.com/ThePacific/adapter)
>* [https://github.com/H07000223/FlycoTabLayout](https://github.com/H07000223/FlycoTabLayout) 
>* 

#### About

- 邮箱：marnodev@163.com
- 简书：[点击关注Marno的简书](http://www.jianshu.com/users/174a09ba6c25)
