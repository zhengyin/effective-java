# 考虑使用静态工厂方法代替构造器

### 静态工厂方法惯用名

1. valueOf - 该方法返回的实例与他的参数具有相同的值； 如 ： Boolean b = Boolean.valueOf(true);
2. of - valueOf的一种更简洁的替代；
3. getInstance 返回唯一的实例，实例名由参数进行描述，对于单例类该方法没有参数；
4. newInstance 返回不同的实例；
5. getType 与getInstance一样，当工厂方法处于不同类中使用； 比如 : getRobot 
6. newType 与newInstance一样，当工厂方法处于不同类中使用； 比如 : newRobot 