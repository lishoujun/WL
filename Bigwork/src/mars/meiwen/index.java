package mars.meiwen;

import mars.bigwork.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class index extends Activity {
    /** Called when the activity is first created. */
	private Button myButton01,myButton02,myButton03,myButton04;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        myButton01 = (Button)findViewById(R.id.myButton01);
        myButton01.setText("人生哲理");
        myButton01.setOnClickListener( new MyButtonListener01());
        
        myButton02 = (Button)findViewById(R.id.myButton02);
        myButton02.setText("情感阅读");
        myButton02.setOnClickListener( new MyButtonListener02());
        
        myButton03 = (Button)findViewById(R.id.myButton03);
        myButton03.setText("智慧人生");
        myButton03.setOnClickListener( new MyButtonListener03());
        
        myButton04 = (Button)findViewById(R.id.myButton04);
        myButton04.setText("休闲放松");
        myButton04.setOnClickListener( new MyButtonListener04());
    }
    
    
    class MyButtonListener01 implements OnClickListener{
    
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(index.this,group01.class);
    		index.this.startActivity(intent);
		} 	
    
		}
    class MyButtonListener02 implements OnClickListener{
        
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(index.this,group02.class);
    		index.this.startActivity(intent);
		} 	
    
		}
    class MyButtonListener03 implements OnClickListener{
        
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(index.this,group03.class);
    		index.this.startActivity(intent);
		} 	
    
		}
    class MyButtonListener04 implements OnClickListener{
        
		@Override
		public void onClick(View v) {
			Intent intent=new Intent();
    		intent.setClass(index.this,group04.class);
    		index.this.startActivity(intent);
		} 	
    
		}
}