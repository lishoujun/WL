package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt023 extends Activity{
	private TextView txt023;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt023);
		txt023=(TextView)findViewById(R.id.txt023);
		txt023.setText("love will die if held too tightly\nove will fly if held too lightly\nfriendship often ends in love\nBut love in friendship - never\n" +
				       "you may be one person to the world\nbut you may also be the the world to one person\nto love is nothing\nto be loved is something\n" +
				       "to love and be loved is everything\nanticipation is sweet\nwhen you are sure of the outcome\ndo not marry a person you can live with\n" +
				       "marry someone you can not live without love -\none word that frees us of all the weight and pain in life\nto love and win is the best thing\nto love and lose, the next best");
	
	}

}