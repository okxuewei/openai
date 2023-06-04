package com.runmin.user.service.impl;

import com.runmin.user.service.TestService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

/**
 * @Author: Buffett
 * @Date: 2019/3/17 19:35
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    public int queryCount() {
        return RandomUtils.nextInt(1, 1000);
    }
}
