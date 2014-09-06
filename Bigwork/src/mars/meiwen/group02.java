package mars.meiwen;

import mars.bigwork.R;
import mars.meiwen.group01.MyButtonListener011;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class group02 extends Activity{

	private Button myButton021,myButton022,myButton023;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group02);
		myButton021=(Button)findViewById(R.id.myButton021);
		myButton021.setText("永远守护着自己的天使");
		myButton021.setOnClickListener( new MyButtonListener021());
		
		myButton022=(Button)findViewById(R.id.myButton022);
		myButton022.setText("等我死了, 最亲爱的");
		myButton022.setOnClickListener( new MyButtonListener022());
		
		myButton023=(Button)findViewById(R.id.myButton023);
		myButton023.setText("爱之歌 LOVE SONG ");
		myButton023.setOnClickListener( new MyButtonListener023());
	}

class MyButtonListener021 implements OnClickListener{
	    
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(group02.this,txt021.class);
    		group02.this.startActivity(intent);
		} 	
    
		}
class MyButtonListener022 implements OnClickListener{
    
	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		intent.setClass(group02.this,txt022.class);
		group02.this.startActivity(intent);
	} 	

	}
class MyButtonListener023 implements OnClickListener{
    
	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		intent.setClass(group02.this,txt023.class);
		group02.this.startActivity(intent);
	} 	

	}
}