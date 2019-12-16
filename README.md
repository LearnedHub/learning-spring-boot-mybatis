## learning spring boot mybatis

- 整合通用mapper
- 使用druid数据源，加密数据库密码
- 使用mbg自动生成mapper和bean
- 自定义错误页面
   
> 使用`RestControllerAdvice`，但是需要在application.properties中配置
>
> spring.mvc.throw-exception-if-no-handler-found=true
>
> spring.resources.add-mappings=false #不跟static/error下的静态文件映射

- 发现一个问题

> 使用mysql-java-driver高版本8以上，在数据库中比如有user这个表，在url中指定了对应的数据库了，MBG生成model时，但是还是会把数据里面系统的user生成出来。
> 换成低版本之后（5.x.x），就没事了。