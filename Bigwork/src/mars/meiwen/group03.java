package mars.meiwen;

import mars.bigwork.R;
import mars.meiwen.group01.MyButtonListener011;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class group03 extends Activity{

	private Button myButton031,myButton032,myButton033;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group03);
		myButton031=(Button)findViewById(R.id.myButton031);
		myButton031.setText("青春无悔 别停下梦想的脚步");
		myButton031.setOnClickListener( new MyButtonListener031());
		
		myButton032=(Button)findViewById(R.id.myButton032);
		myButton032.setText("记住这10句话 你将永远幸福快乐");
		myButton032.setOnClickListener( new MyButtonListener032());
		
		myButton033=(Button)findViewById(R.id.myButton033);
		myButton033.setText("你不可不知的人生智慧");
		myButton033.setOnClickListener( new MyButtonListener033());
	}

	
class MyButtonListener031 implements OnClickListener{
	    
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(group03.this,txt031.class);
    		group03.this.startActivity(intent);
		} 	
    
		}
class MyButtonListener032 implements OnClickListener{
    
	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		intent.setClass(group03.this,txt032.class);
		group03.this.startActivity(intent);
	} 	

	}
class MyButtonListener033 implements OnClickListener{
    
	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		intent.setClass(group03.this,txt033.class);
		group03.this.startActivity(intent);
	} 	

	}
}
