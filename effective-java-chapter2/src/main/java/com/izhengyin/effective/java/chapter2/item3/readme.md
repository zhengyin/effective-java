# 用私有构造器或枚举强化 SINGLETON 属性


```
    private Object readResolve() {
        // 保证 反序列化时， JVM 中只存在同一个对象，维持单例特性
        return INSTANCE;
    }
```