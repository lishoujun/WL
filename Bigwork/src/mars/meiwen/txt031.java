package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt031 extends Activity{
	private TextView txt031;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt031);
		txt031=(TextView)findViewById(R.id.txt031);
		txt031.setText("   Leave the excess baggage of yesterday's mistakes and dare to enter into all the tomorrow. Leave yesterday to hisory and resolve to begin fresh each new day daring to make dreams become a reality.\n" +
				       "   Dreams can't be bought, sold, nor traded. Dreams are the part of us that no one else can claim right to posses. Dreams are what keep life full of passion!\n" +
				       "   Do not allow others to define who we are or what our desires may be. When we allow others to define our boundaries, we become the limits others have imposed upon us. Our dreams are our own and belong to no one else.Never admit defeat to a wasted life by forsaking your dreams!\n" +
				       "   Life is sweetened by friendships we encounter along the highways that journey into our dreams.Dreams are complex and take years to accomplish, while holding onto the simplicity of a young child.\n" +
			       	   "   Do not allow life and the demands of making a living force you to put dreams on hold.Not just the successfully rich and famous have a right to their dreams. Chase after them as the wind!\n" +
				       "   The very fact that you are reading these words at this moment is the accomplishment of a dream come true. Since early childhood, I had a dream to write for others to read what I have written, wheter it is poetry or simple stories and ideas. I have not dreamed of fortune of fame, but only to be able to write in a manner that others can read and possibly make a different in their lives.\n" +
				       "   People have a need to read, I have a need to create with words same as a musician creates music with instruments, or an artist paints his imaginations before our eyes.\n" +
				       "   Please keep dreaming and never give up on yourself. ");
	}

}
