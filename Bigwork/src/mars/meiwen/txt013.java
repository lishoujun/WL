package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt013 extends Activity{

	private TextView txt013;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt013);
		txt013=(TextView)findViewById(R.id.txt013);
		txt013.setText("1.Ready or not, some day it will all come to an end. There will be no more sunrises, no days, no hours or minutes. All the things you collected, whether treasured or forgotten, will pass no someone else.\n不管你是否做好了心理准备，终有一天，一切都会结束。那时，将不再有日出、岁月、小时和分钟的概念。你曾拥有的一切，无论是值得珍惜的还是应该遗忘的，那将转予他人。\n" +
				       "2.Your wealth, fame and temporal power will shrivel to irrelevance. It will not matter what you owned or what you were owed.\n不管你是否做好了心理准备，终有一天，一切都会结束。那时，将不再有日出、岁月、小时和分钟的概念。你曾拥有的一切，无论是值得珍惜的还是应该遗忘的，那将转予他人。\n" +
				       "3.Your grudges, resentments, frustrations, and jealousies will finally disappear. So, too, your hopes, ambitions, plans, and to-do lists will all expire. The wins and losses that once seemed so important will fade away.\n你的恶意、愤恨、挫败感和嫉妒都会消失殆尽。当然，你的希望、抱负、计划和要做的事也会无法实现。曾对你至关重要的得与失，也慢慢地淡漠了。\n" +
				       "4.It won't matter where you come from, or on what side of the tracks you lived. It won't matter whether you were beautiful or brilliant. Your gender, skin color, ethnicity will be irrelevant.\n那时，你来自何方和如何生活都不重要。同样，曾经非常光鲜亮丽的你也毫无意义。你的性别、肤色和种族也会与你无关。\n" +
				       "5.So what will matter? How will the value of your days be measured?\n那么，究竟什么才是真正该珍惜的呢？又该以什么标准去衡量人生的价值呢？\n" +
				       "6.What will matter is not what you bought, but what you built; not what you got, but what you gave.\n你要珍惜的，不是你曾经获得的成功，而是你的价值。\n" +
				       "7.What will matter is not your success, but your significance.\n你要珍惜的，不是你买的东西，也不是你所创造的，更不是你所获得的，而是你给予的。\n" +
				       "8.What will matter is not what you learned, but what you taught.\n你要珍惜的，不是你曾学会了什么，而是你曾留下了什么。");
	}

}
