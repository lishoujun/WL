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
		txt041.setText("������ Aries\n"+
				       "Let's break up since it is meaningless to continue.\n"+
                       "��ţ�� Taurus\n"+
                       "We should never see each other again.\n"+
                       "˫���� Gemini\n"+
                       "You're not the cup of my tea.\n"+
                       "��з�� Cancer\n"+
                       "Since it's so heartbreaking to be together, why don't we just break up?\n"+
                       "ʨ���� Leo\n"+
                       "From now on, I can't love you anymore. Who do you think you are?\n"+
                       "��Ů�� Virgo\n"+
                       "You've changed.\n" +
                       "������ Libra\n" +
                       "I don't think we're right for each other, maybe we're a bad match?\n" +
                       "��Ы�� Scorpio\n" +
                       "I don't have feelings for you anymore. Don't contact me again.\n" +
                       "������ Sagittarius\n" +
                       "He moved out yesterday.\n" +
                       "Ħ���� Capricorn\n" +
                       "You will find someone better for you.\n" +
                       "ˮƿ�� Aquarius\n" +
                       "I think Bachelordom might be what you need right now.\n" +
                       "˫���� Pisces\n" +
                       "My goldfish said she dislikes you, so let's break up.");

	}
}
