package com.qyihu.study.com.study.bowling;


import java.util.List;

/**
 * Created by weihuang on 02/03/2017.
 */
public class Frame {

    private int id;

    private List<Bowling> bowlings;

    public List<Bowling> getBowlings1() {
        return bowlings1;
    }

    public void setBowlings1(List<Bowling> bowlings1) {
        this.bowlings1 = bowlings1;
    }

    private List<Bowling> bowlings1;

    private Frame nextFrame;

    public Frame() {
    }

    public Frame(List<Bowling> bowlings, List<Bowling> bowlings1, Frame nextFrame) {
        this.bowlings = bowlings;
        this.bowlings1 = bowlings1;
        this.nextFrame = nextFrame;
    }


    public int getScore() {
        int score = bowlings.size() + bowlings1.size() + nextFrame.bowlings.size();
        if(nextFrame.bowlings.size() == 10) {
            score += nextFrame.nextFrame.bowlings.size();
        }
        System.out.printf("");
        System.out.println("");
        return score;

    }

    public int add(int x, int y) {
        return x + y;
    }
}
