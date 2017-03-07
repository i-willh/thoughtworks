import com.qyihu.study.com.study.bowling.Bowling;
import com.qyihu.study.com.study.bowling.Frame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weihuang on 02/03/2017.
 */
public class Test {


    public void testAddSelfFramBowling() {
        List<Bowling > bowlings = new ArrayList<Bowling>();
        bowlings.add(new Bowling(1));
        bowlings.add(new Bowling(2));
        bowlings.add(new Bowling(3));
        bowlings.add(new Bowling(4));

        List<Bowling > bowlings1 = new ArrayList<Bowling>();
        bowlings1.add(new Bowling(1));
        bowlings1.add(new Bowling(2));
        bowlings1.add(new Bowling(3));
        bowlings1.add(new Bowling(4));

        Frame nextFrame = null;
        Frame frame = new Frame(bowlings, bowlings1, nextFrame);
        int score = frame.getScore();
    }
}
