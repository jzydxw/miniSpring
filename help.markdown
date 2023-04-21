# 1 搭建miniSpring


## 1.1 IOC 容器

1 一个需要成为bean的类
2 一个读取xml获取bean配置
3 反射创建bean
4 map保存bean实例
5 提供获取bean方法

## 1.2 解耦ClassPathXmlApplicationContext
分解这个类，主要工作就是两个部分，
一是提出一个最基础的核心容器，
二是把 XML 这些外部配置信息的访问单独剥离出去，
现在我们只有 XML 这一种方式，但是之后还有可能配置到 Web 或数据库文件里，拆解出去之后也便于扩展。

## 1.3 扩展bean
    
1.增加单例bean接口定义
2.预留事件监听接口
3.扩展beanDefinition

## 1.4 bean注入值，解决循环依赖
1. 值的注入
2. 循环依赖

## 1.5 bean支持注解

@Autowired 注解


