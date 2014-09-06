package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt021 extends Activity{

	private TextView txt021;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt021);
		txt021=(TextView)findViewById(R.id.txt021);
		txt021.setText("In fact, everyone has an angel protecting himself forever.\n" +
				"If this angel feels that your life is full of pain and you always feel excessively sad, She would turn into someone else beside you.\n" +
				"Maybe it's a friend of you, or your lover, or a net-friend you have never met,or a stranger you just met only once.These persons quietly appear in your life, accompany you with a happy time and then he could leave silently. And thus your life is full of happy memories. Even the future path is covered with storm or snow, once reminiscing those happy stories he brought to you, you can still be brave.\n" +
				"For those who have left you without any word, actually they're angels returning to the heaven. For example, your lost friends ,the strangers who ever gave you help, those seperated but used to love you, those artists who used to sing good songs to you, the good writer,and etc.., they are all kind-hearted angels.\n" +
				"Perhaps sometimes you would feel sad or lost because of their disappearance, and would seek them everywhere to find out where they're going, which nation they've arrived. But in the end, you'll be convinced that they stay in a certain nook of this world with a tranquil and gratified life. Finallly, all the feelings of loss or sadness will no longer exist since time has been the greatest therapist.");
	}

}
