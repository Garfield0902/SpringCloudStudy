# SpringCloudStudy
ps:
  运行该服务前，需要配置hosts文件： 添加：127.0.0.1 peer1 peer2
  
学习springcloud 知识，及其相关组件：采用maven搭建的项目spring-boot项目，目前整合进来的组件有 eureka+ribbon+hystrix;后面继续学习；
涉及到的点：
  eureka 高可用服务 注册和发现： 启动该服务时需要添加启动参数；--spring.profiles.active=peer1  或者 --spring.profiles.active=peer2（用这两个参数启动两次服务，可以启动两个 Eureka服务，他们相互注册实现高可用）
  
