package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt041 extends Activity{
	private TextView txt041;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt041);
		txt041=(TextView)findViewById(R.id.txt041);
		txt041.setText("°×Ñò×ù Aries\n"+
				       "Let's break up since it is meaningless to continue.\n"+
                       "½ðÅ£×ù Taurus\n"+
                       "We should never see each other again.\n"+
                       "Ë«×Ó×ù Gemini\n"+
                       "You're not the cup of my tea.\n"+
                       "¾ÞÐ·×ù Cancer\n"+
                       "Since it's so heartbreaking to be together, why don't we just break up?\n"+
                       "Ê¨×Ó×ù Leo\n"+
                       "From now on, I can't love you anymore. Who do you think you are?\n"+
                       "´¦Å®×ù Virgo\n"+
                       "You've changed.\n" +
                       "ÌìèÒ×ù Libra\n" +
                       "I don't think we're right for each other, maybe we're a bad match?\n" +
                       "ÌìÐ«×ù Scorpio\n" +
                       "I don't have feelings for you anymore. Don't contact me again.\n" +
                       "ÉäÊÖ×ù Sagittarius\n" +
                       "He moved out yesterday.\n" +
                       "Ä¦ôÉ×ù Capricorn\n" +
                       "You will find someone better for you.\n" +
                       "Ë®Æ¿×ù Aquarius\n" +
                       "I think Bachelordom might be what you need right now.\n" +
                       "Ë«Óã×ù Pisces\n" +
                       "My goldfish said she dislikes you, so let's break up.");

	}
}
