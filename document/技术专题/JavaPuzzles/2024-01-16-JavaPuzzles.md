# 启发-用Match.abs()取绝对值会出现bug

[toc]

1. 问题一：`Math.sqrt(a)`和`StrictMath.sqrt(a)`

   JDK11， 添加了注解。

   性能有优化：带有`@HotSpotInTrinsicCandidate`注解，直接调用CPU指令集来进行优化。

   启动：拿这种方法测试语言的性能，不能说明问题。

2. 问题二：能不能更改`static final`属性值

   
