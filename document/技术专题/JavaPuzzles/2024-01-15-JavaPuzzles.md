# 启发-用Match.abs()取绝对值会出现bug

[toc]

1. 问题一：用Match.abs()取绝对值会出现bug；

   ```java
       public static int abs(int a) {
           if (a>=0) {
               return a;
           }
           if (a==Integer.MIN_VALUE) {
               return Integer.MAX_VALUE;
           }
           return (~a & Integer.MAX_VALUE) + 1;
       }
   ```

   

2. 问题二：hashCode()；JVM内置了hashCode的五种存储方式；

   可以用于测试数据倾斜。

   ```
   ```

3. 所有对象的hashCode只会计算一次，缓存到对象头里。

4. 字符串的hashCode；

   修改JVM内置的hashCode，对重写了hashCode方法的对象不起作用。

