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
来进行对象创建，顺带说一句，Spring里头有一个bean，这个bean到处都是，这个bean它就是，~~你没有的~~对象~~哈哈哈哈哈嗝~~。
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
> - 谨慎阅读Spring源码，如此庞大的源码，再结合其他巨佬的说法，就是即使Spring底层实现一个很简单的功能，也写的那么复杂，一般人读完后可能会有副作用。如果遇到面试非要问，那也只能硬着头皮去看了。



## Spring的结构

> Spring体系结构图

![Spring体系结构图](https://www.pianshen.com/images/696/3fbc89421a5baeaafccd1051750002a8.JPEG "Spring结构图")

> Spring是分层架构，Spring的各种功能被划分到20个模块当中，大致可以理解成五个模块，不做细致分析，仅用于理解
> - Data Access/Integration：数据访问/集成模块。
> - Web：Web应用模块，提供Web上下文操作，Servlet支持等等
> - AOP：面向切面模块。
> - Core Container：核心容器，Spring核心组成。
> - Test：单元测试模块。



# 施工中

