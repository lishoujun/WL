package mars.meiwen;

import mars.bigwork.R;
import mars.meiwen.index.MyButtonListener01;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class group01 extends Activity{

	private static Button bt;
	private Button myButton011,myButton012,myButton013;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group01);
		myButton011=(Button)findViewById(R.id.myButton011); 
	//	myButton011.setMovementMethod(ScrollingMovementMethod.getInstance()); 
		myButton011.setText("����ʱһ��Ҫ֪����8����");
	    myButton011.setOnClickListener( new MyButtonListener011());
		 
		myButton012=(Button)findViewById(R.id.myButton012);
		myButton012.setText("��ס�⼸�仰 �㽫����һ��");
		myButton012.setOnClickListener( new MyButtonListener012());
		 
		myButton013=(Button)findViewById(R.id.myButton013);
		myButton013.setText("ѧ����ϧ ���÷��� ");
		myButton013.setOnClickListener( new MyButtonListener013());
		
	//	switch(R){}
	}

	class MyButtonListener011 implements OnClickListener{
	    
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(group01.this,txt011.class);
    		group01.this.startActivity(intent);
		} 	
    
		}
	class MyButtonListener012 implements OnClickListener{
	    
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(group01.this,txt012.class);
    		group01.this.startActivity(intent);
		} 	
    
		}
	class MyButtonListener013 implements OnClickListener{
	    
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(group01.this,txt013.class);
    		group01.this.startActivity(intent);
		} 	
    
		}
	
}
