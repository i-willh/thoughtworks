package com.qyihu.study.com.study.bowling;

import junit.framework.TestCase;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by weihuang on 06/03/2017.
 */
public class FrameTest {

    @org.junit.Test
    public void add() throws Exception {
        TestCase.assertEquals(new Frame().add(1, 2), 3);
    }

}