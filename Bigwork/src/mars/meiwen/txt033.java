package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt033 extends Activity{
	private TextView txt033;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt033);
		txt033=(TextView)findViewById(R.id.txt033);
		txt033.setText("1.The best classroom in the world is at the feet of an elderly person.\n" +
				       "2.Life is tough, but I'm tougher.\n" +
				       "3.I can't choose how I feel, but I can choose what I do about it.\n" +
				       "4.Opportunities are never lost; someone will take the ones you miss.\n" +
				       "5.When you harbor bitterness, happiness will dock elsewhere.\n"+
                       "6.When you're in love, it shows./n" +
                       "7.Having a child fall asleep in your arms is one of the most peaceful feelings in the world.\n" +
                       "8.Being kind is more important than being right.\n" +
                       "9.You should never say no to a gift from a child.\n" +
                       "10.I can always pray for someone when I don't have the strength to help him in some other way.\n" +
                       "11.No matter how serious your life requires you to be, everyone needs a friend to act goofy with.\n" +
                       "12.Sometimes all a person needs is a hand to hold and a heart to understand." +
                       "13.It's those small daily happenings that make life so spectacular.\n" +
                       "14.Love, not time, heals all wounds.\n" +
                       "15.The easiest way for me to grow as a person is to surround myself with people smarter than I am.");
	}

}
