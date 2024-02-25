package com.hef.service.impl;

import com.google.common.base.Strings;
import com.hef.service.Demo;

/**
 * @Date 2024/2/21
 * @Author lifei
 */
public class DemoImpl implements Demo {

    @Override
    public String doit(int i) {
        return Strings.lenientFormat("第一次预习作业：%s", i);
    }
}
