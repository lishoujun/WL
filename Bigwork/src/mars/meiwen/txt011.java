package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt011 extends Activity{

	private TextView txt011;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt011);
		txt011=(TextView)findViewById(R.id.txt011);
		txt011.setText("1. Most of it doesn't matter. So much of what I got excited about, anxious about, or wasted my time and energy on, turned out not to matter. There are only a few things that truly count for a happy life. I wish I had known to concentrate on those and ignore the rest.\n拥有一颗平常心。太多我曾经为其兴奋，为其焦虑，亦或是浪费了我时间以及精力的事情到最后却被证明是无关紧要的。它们只是幸福生活里极其微小的一部分。我多么希望早点知道这些，以便能把精力都投入到这些关乎幸福的事，而不是其他。 \n　" +
				       "2. The greatest source of misery and hatred in this world is clinging to past hurts.\n这个世界上痛苦与仇恨最大源泉是对过去的执迷。\n" +
				       "3. Waiting to do something until you can be sure of doing it exactly right means waiting for ever.\n 等待有把握时再去做一件事，往往意味着永远的等待。\n" +
				       "4. Following the latest fashion, in work or in life, is spiritual and intellectual suicide. You can be a cheap imitation of the ideal of the moment; or you can be a unique individual. The choice is yours. Religion isn't the opiate of the masses, fashion is.\n盲目追赶潮流是对精神和智力的扼杀。你可以成为一个廉价的时尚木偶，也可以成为独一无二的你，这些都在于自己的选择。信仰不是群众的鸦片，流行才是。 \n" +
				       "5. If people complain that you're too fond of going your own way and aren't fitting in, you must be on the right track. \n如果有人抱怨你太特立独行，恭喜你，你正走在正确的路上。\n" +
				       "6. If you make your work your life, you're making your life into hard work.\n如果你将工作等同于生活，那么你将为工作而生活。\n" +
				       "7. The quickest and simplest way to wreck any relationship is to listen to gossip.\n破坏关系的最快最简单的方法就是听信谣言。\n" +
				       "8. Trying to please other people is largely a futile activity.\n试图取悦别人是徒劳无益的做法 。");
		
	}

}
