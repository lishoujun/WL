package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt022 extends Activity{
	private TextView txt022;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt022);
		txt022=(TextView)findViewById(R.id.txt022);
		txt022.setText("When I am dead, my dearest,\nWhen I am dead, my dearest, \nSing no sad songs for me; \nPlant thou no roses at my head, \nNor shady cypress tree: \nBe the green grass above me \nWith showers and dewdrops wet; \nAnd if thou wilt, remember, \nAnd if thou wilt, forget.\n"+
                       "\n\nI shall not see the shadows, \nI shall not feel the rain; \nI shall not hear the nightingale \nSing on, as if in pain: \nAnd dreaming through the twilight \nThat doth not rise nor set, \nHaply I may remember, \nAnd haply may forget.");
	}

}
