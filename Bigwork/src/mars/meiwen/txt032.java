package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt032 extends Activity{
	private TextView txt032;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt032);
		txt032=(TextView)findViewById(R.id.txt032);
		txt032.setText("1. Realize that enduring happiness doesn't come from financial success.\n" +
				       "2. Take control of your time.\n" +
				       "3. Act happy.\n" +
				       "4. Seek work and leisure that engages your skills.\n" +
				       "5. Join the 'movement' movement.\n" +
				       "6. Give your body the sleep it wants.\n" +
				       "7. Give priority to close relationships.\n" +
				       "8. Focus beyond self.\n" +
				       "9. Be grateful.\n" +
				       "10. Nurture your spiritual self.");
	}

}
