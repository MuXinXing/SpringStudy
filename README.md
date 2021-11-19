# Spring

## 什么是Spring

​		Spring是当下最主流的开源企业应用开发框架（现在你只需要知道这是个开发框架，还没到深究它是个什么框架的时候），其最初由一位名为Rod Johnson的程序员在2002年提出并建立， 初指是为了解决EJB（企业JavaBeans）开发的复杂性和软件开发中代码的耦合性，想方设法让JEE开发变得更加简单，令任何人都可以轻松的使用Spring框架进行JEE开发。
​		Spring是一个从实际开发中剥离出来的框架，因此Spring已经完成了开发中大量的相似步骤，留给开发者的工作仅仅是完成特定应用的特定部分，极大的提高了开发效率，从简单易用的角度出发，Spring不仅可以用于服务器开发，还可以用于任何Java程序的开发。

​		上头这段解释挺晦涩难懂的，但你在网上能看到百分之90的人都这么写，搞得刚入门的小程序员研究了半天也没研究明白Spring到底是个啥。其实对于Spring最通俗的解释就是，当你的程序需要使用数据库，而你又不想写那啰嗦的JDBC工具类时。欸嘿，这个时候我们就可以使用Spring了，Spring里头集成了JDBC操作，你可以使用简单的几条语句调用Spring集成的JDBC操作，Spring一行代码换十行，这波极限一换多它不亏。再或者，~~你想创建个对象，欸嘿，你没对象~~，啊不对，是你要new一个对象时，你需要写
```java 
Object ob=new一个Object();
```
但是你在Spring中可以这么写
```xml
<bean id="ob" class="com.mx.entity.Object"/>
```
来进行对象的创建，顺带说一句，Spring里头有一个东西叫bean，这个bean到处都是，这个bean它就是，~~你没有的~~对象~~哈哈哈哈哈嗝~~。
其实还可以这么写

```java	
@Component
public class NiDuiXiang{
    private Integer age;
    private String name;
    private String SanWei;
}
```
这里使用了一个@Component注解创建了一个名为NiDuiXiang的bean(对象)，莫研究什么是注解，莫关心这个@Component是什么东西，后面再说。好了，这时你的脑子里对Spring有了个大概的了解，如果还是没有大概那就接着往下看。

## Spring的优缺点

Spring在普通人眼中就是个神的存在，但是在不普通人眼里，依赖Spring会让你变得萎靡不振，会让你意志消沉巴拉巴拉巴拉等。Spring看似完美，但是♂深入研究后还是能扒出不少东西的。

> Spring的优点
  - 非侵入式设计，使用Spring不会影响你自己的原代码，框架与代码耦合度低。
  - 对象工厂&容器，将所有对象的创建和维护都交给Spring管理，提高程序复用。
  - 支持面向切面开发，在不破坏原代码的前提下对程序的功能进行集中处理。
  - 支持声明事务，只需要通过简单的配置就可以管理事务，不需要写繁琐的代码。
  - 集成各类测试框架，可以通过注解快速测试。
  - 优秀的集成性，可以集成其他框架，Spring内部为其他主流开源框架提供了直接支持。
  - Spring对常用API进行了封装，方便调用，如常用的JDBC，Mail等等...



> Spring的缺点（粗略）
>
> - Spring非常的*庞大* **庞大**和***庞大***，Spring明明是一个轻量级框架，却什么都有
> 		~~PS：Spring的源码已经达到了庞大的100w+行，在多来几年可能就赶上个Windows了？~~
> - 谨慎阅读Spring源码，如此庞大的源码，结合其他巨佬的说法，就是即使Spring底层实现一个很简单的功能，也写的那么复杂，一般人读完后可能会有副作用。如果遇到面试非要问，那也只能硬着头皮去看了。



## Spring的结构

> Spring体系结构图

![Spring体系结构图](http://c.biancheng.net/uploads/allimg/210701/1031053202-0.png "Spring结构图")

> Spring采用分层架构，Spring的各种功能被划分到多个模块当中，其大致可以理解成五个模块，不做细致分析，仅用于理解
> - Data Access/Integration：数据访问/集成模块。
> - Web：Web应用模块，提供Web上下文操作，Servlet支持等等
> - AOP：面向切面模块。
> - Core Container：核心容器，Spring核心组成。
> - Test：单元测试模块。

​		至此，Spring框架基本介绍完毕。

# 第一个Spring程序

​		粗略介绍完Spring之后我们开始编写第一个Spring程序，这边使用Idea+Maven+JDK1.8作为环境使用，环境不单一，按自己习惯。

你能看到Spring的教程，基本上能熟练使用编译器和基本项目构建工具了。

> 第一个Spring程序准备工作

- Spring所需jar包，一个Spring程序需要使用如下五个基本包

  spring-core-x.x.x.RELEASE.jar：Spring核心工具类包，所有组件都要用到。

  spring-beans-x.x.x.RELEASE.jar：Bean处理包，主要包括Bean的创建定义初始化，配置文件读取等等等。

  spring-context-x.x.x.RELEASE.jar：Spring基础功能扩展包(IOC基础上)，提供了许多企业级服务的支持。

  spring-expression-x.x.x.RELEASE.jar：Spring表达式(SpEL)包，例如#{}界定符。

  和一个第三方包

  commons-logging-x.x.jar：一个日志框架，可以跟其他日志框架配合使用也可以单独使用来记录日志。

其中，x.x.x表示的是当前Spring的版本，如Spring5的jar版本就是spring-core-5.0.1.RELEASE.jar。

​		至此，准备并导入完Spring的五个基本包之后，我们可以开始编写第一个Spring程序了。

> 第一个Spring程序

第一步，我们创建一个普普通通的类

```java
package com.mx.entity;
public class FirstSpring{
    public void hello(){
        System.in.println("Hello spring");
    }
}
```

第二步，我们创建一个Spring配置文件，Spring程序当中都需要有一个配置文件，配置Spring的各种操作，我们将其命名为applicationContext.xml，名字随意，是xml配置文件即可

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--以上均为xml的文件约束信息，你可以理解为导入包啥的,只不过导入的是一个namespace，
		里面包含着xml结构，语法，数据类型等等等。
		Spring官方文档有，可直接去官方文档复制，不建议手写，容易出错。
		当你下载了Spring源码之后，官方文档在：docs\spring-framework-reference文件夹中的index.html
	-->
    
    <bean id="firstSpring" class="com.mx.entity.FristSpring"/>
    <!--
		一对<bean></bean>标签声明一个bean，
		你可以看到<bean>标签内会有多个属性，但我们当前只讨论id与class属性。
		id属性，就是bean的名字，相当于对象名。
		class属性，就是类的路径，通过类路径来标识需要创建对象的类，
		这个过程可以看作FirstSpring firstSpring=new FirstSpring();
	-->
</beans>
```

第三步，我们再创建一个普普通通的类

```java
package com.mx.entity;
public class SpringMain{
    public static void main(String[] args){
        String path="applicationContext.xml";
        //Spring applicationContext.xml配置文件路径，当你放在与项目同一路径下时，可以使用相对路径。
        ApplicationContext application=new ClassPathXmlApplicationContext(path);
        //初始化Spring容器并加载配置文件，此时的application是一个初始化了的Spring容器。
        FirstSpring fs=(FirstSpring)application.getBean("firstSpring");
        //通过application获取实例化后的bean，getBean方法根据bean id去xml配置文件当中找到对应id的bean。
        fs.hello();
        //调用hello方法后控制台就可以正常输出hello方法中的System.in.println("Hello spring")了。
    }
}
```

​		至此，一个传统的Spring程序完成了。可以看到Spring程序与传统Java程序最本质的区别(我是这么理解的)，就是不用写new了。程序将创建对象的过程交给Spring去管理，同时这也是Spring最核心的概念之一，控制反转(IOC)。莫急着探究什么是IOC，后面会和你深入探讨♂。



> 使用配置类编写Spring程序

​		在上面我们使用了标准的Spring配置文件进行Spring程序编写，但xml总会有些奇奇怪怪的小毛病，所以Spring3之后提供了一个配置类来替代繁琐的xml配置文件。

> 配置类演示

我们直接改写上方的FirstSpring，进行代码重用(偷懒)

我们开始新建一个配置类

```java
package com.mx.config;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig{
    @Bean//注解声明这是一个bean，提交给容器进行处理，bean id默认以方法名/类名首字母小写。
    //这个方法的bean id就是getFirstSpring。
    public FirstSpring getFirstSpring(){
        return new FirstSpring();
    }
}
```

我们又创建一个配置类测试类

```java
package com.mx.test;
public class SpringConfigTest{
    public static void main(String[] args) {
        ApplicationContext application=new AnnotationConfigApplicationContext(SpringConfig.class);
        //配置类使用的AnnotationConfigApplicationContext类加载配置类与传统xml配置文件的CPXAC不同。
        //参数填配置类的.class对象。  
        FirstSpring fs=(FirstSpring)application.getBean("getFirstSpring");
        //获取bean
        fs.hello();
        //控制台成功输出hello方法。
    }
}
```

可以看到，Spring使用@Configuration注解来声明一个配置类。这个注解就相当于xml文件中的beans标签，可以在被修饰的类中进行传统xml文件中的操作。配置类里头有一个@Bean注解来声明一个bean，就相当于xml文件中的bean标签，这么写可是一个xml文件也没有哦。

​		到此，我们的第一个Spring程序的两种创建方式结束了，你已经对Spring有了一个基本的认识，我们要开始深入♂探讨了


# 施工中。。。

天天满课抽时间施工。。

