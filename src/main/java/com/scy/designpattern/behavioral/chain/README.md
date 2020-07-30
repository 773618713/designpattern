## 责任链模式

#### 案例说明

1、所有责任链中的日志对象（xxxxLogger）要实现抽象日志对象（AbstractLogger）

2、AbstractLogger里存在一个nextLogger的属性，存放的是下一个责任链上的日志对象。
 
3、在AbstractLogger.logMessage的方法中，可以继续调用下一个责任链对象的logMessage方法。