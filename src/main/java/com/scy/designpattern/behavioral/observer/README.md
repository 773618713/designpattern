## 观察者模式

#### 案例说明
当一个数字改变，所有负责进制转换的对象（观察者）要将这个值转换成对应的进制。

1、各种具体观察者（xxxxObserver）全部要实现观察者抽象类（Observer）。

2、Subjet中定义了观察者集合（observers）。

3、具体观察者（xxxxObserver）在实例化时，要将自己添加到Subjet中的观察者集合（observers）中。

4、Subjet再必要时通过notifyAllObservers方法通知所有观察者。


#### 参考

###### 案例代码来自菜鸟教程

https://www.runoob.com/design-pattern/observer-pattern.html

###### 解释说明（漫画）

这个文章非常生动具体。
https://blog.csdn.net/bjweimengshu/article/details/107171436