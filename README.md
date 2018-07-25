# QuickStart
基于SpringCloud体系实现，简单购物流程实现，满足基本功能：注册、登录、商品列表展示、商品详情展示、订单创建、详情查看、订单支付、库存更新等等。

每个业务服务采用独立的MYSQL数据库，初期考虑用到如下组件：
1. 服务注册、发现: eureka
2. 配置管理:spring config , spring security
3. 集群容错: hystrix
4. API网关: zuul
5. 服务负载:feign+ribbon
6. api文档输出:swagger2
7. 代码简化:lombok
8. 消息队列:rabbitmq
9. 分布式锁: redis （待实现）
10. 链路跟踪:spring cloud sletuh ->zipkin
11. 安全认证:oauth2/JWT(通过JWT轻量级的实现)
12. 服务监控:spring-boot-admin


# 各模块介绍

| 模块名称        | 端口   |  简介  |
| --------   | -----:  | :----:  |
| admin-server      | 9002   |   服务监控中心，监控所有服务模块    |
| conf-server        |   9004   |   分布式配置中心，结合spring-security/rabbitmq同时使用   |
| eureka-server        |    9003    |  服务注册中心，提供服务注册、发现功能  |
| sleuth-server        |    9001    |  SpringCloud实现的一种分布式追踪解决方案，兼容Zipkin  |
| zuul-server        |    9005    |  API网关模块  |
| account-service        |    8080    |  用户服务，提供注册、登录、地址等服务  |
| product-service       |    8081    |  商品服务，提供商品列表、详情、库存更新等服务  |
| payment-service    |    8082    |  支付服务，支付记录  |
| order-service        |    8083    |  订单服务，提供订单创建、详情、状态变更  |
| msg-service        |    8084    |  消息处理服务  |
| front-app        |    9943   |  前端服务，结合swagger2提供API管理(有小问题，swagger页面无法点击单个接口，可通过展开功能打开，待解决)  |


# 快速上手
- 1、先启动admin-server,eureka-server,conf-server三个基础服务
- 2、再依次启动payment/order/product/account基础业务服务
- 3、最后启动front-app服务
- 4、相关页面后续提供（页面架构 react 实现)

# 相关测试
	1、启动基础eureka/config两个服务后，直接启动front-app服务，通过swagger测试商品列表或详情功能来测试hystrix的功能
	1.1、启动hystrix-dashboard服务，输入监控地址http://localhost:8088/hystrix.stream可以查看监控视图
	2、输入http://localhost:9005/account-api/acc/login?accessToken=23232&phone=123456&password=123456查看返回结果

## Release Version

### v1.0

> Release Date : 2018-07-21
- 1、完成基本服务及业务子模块服务的搭建 ，业务子模块可正常运行
- 2、完成SpringBootAdmin业务模块的运行监控，及Eureka服务运行，满足各业务基础服务的注册、发现功能
- 3、可通过Front-app端，借助Feign组件发起login/signup等功能的 简单测试运行。
- 4、引入swagger2，完成API接口文档管理完成整体业务数据流程流转
- 5、通过API接口完成整体业务数据
- 6、基于Spring-cloud-config引入配置中心，结合security加强安全配置，同时引入bus-amqp(rabbitmq)高效更新配置内容[配置中心数据结合sc-cloud-repo工程使用]
- 7、引入feign，满足客户端调用服务端的服务
- 8、引入ribbon，可以满足客户端的负载均衡调用后端服务
- 9，针对api增加jwt安全防护【过滤需要验权的URI，校验jwt】
- 10，完善zuul过滤，完成基本代理路由、安全验证功能【但未引入到front-app中，下版中完善】

## mybatis-generator自定义注释生成

创建  org.mybatis.generator.internal 包
创建  DefaultCommentGenerator.class
相关示例代码 account-service工程 org.mybatis.generator.internal.DefaultCommentGenerator 
将编译完的  DefaultCommentGenerator.class 替换掉  mybatis-generator-core-1.3.7.jar 中 org.mybatis.generator.internal 包下的 DefaultCommentGenerator

generatorConfig.xml 配置文件在项目 test/resources 生成示例代码

      /**
         * 账户
         */
        private String accountId;
    
        /**
         * 姓名
         */
        private String realName;
    
        /**
         * 详细地址
         */
        private String detailAddress;



