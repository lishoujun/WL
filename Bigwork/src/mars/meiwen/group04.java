package mars.meiwen;

import mars.bigwork.R;
import mars.meiwen.group01.MyButtonListener011;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class group04 extends Activity{

	private Button myButton041,myButton042,myButton043;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group04);
		myButton041=(Button)findViewById(R.id.myButton041);
		myButton041.setText("十二星座分手时会怎么说? ");
		myButton041.setOnClickListener( new MyButtonListener041());
		
		myButton042=(Button)findViewById(R.id.myButton042);
		myButton042.setText("小广告 大文化 18条绝妙广告语");
		myButton042.setOnClickListener( new MyButtonListener042());
		
		myButton043=(Button)findViewById(R.id.myButton043);
		myButton043.setText("一'网'情深的英文结婚短信祝福语 ");
		myButton043.setOnClickListener( new MyButtonListener043());
	}
	
	
class MyButtonListener041 implements OnClickListener{
	    
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(group04.this,txt041.class);
    		group04.this.startActivity(intent);
		} 	
    
		}
class MyButtonListener042 implements OnClickListener{
    
	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		intent.setClass(group04.this,txt042.class);
		group04.this.startActivity(intent);
	} 	

	}
class MyButtonListener043 implements OnClickListener{
    
	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		intent.setClass(group04.this,txt043.class);
		group04.this.startActivity(intent);
	} 	

	}

}