package mars.liju;

import mars.bigwork.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.TextView;

public class liebiao extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liebiao);
       //TextView myTextView =(TextView)findViewById(R.id.myTextView);
        Button Button1=(Button)findViewById(R.id.xiuxian);
        Button Button2=(Button)findViewById(R.id.yishi);
        Button Button3=(Button)findViewById(R.id.tiyu);
        Button Button4=(Button)findViewById(R.id.jiating);
        Button Button5=(Button)findViewById(R.id.shangwu);
        Button Button6=(Button)findViewById(R.id.lvyou);
        Button Button7=(Button)findViewById(R.id.wenhua);
        
        Button1.setText("休闲娱乐");
        Button1.setOnClickListener(new Button1Listener());
        Button2.setText("衣食住行");
        Button2.setOnClickListener(new Button2Listener());
        Button3.setText("体育英语");
        Button3.setOnClickListener(new Button3Listener());
        Button4.setText("家庭关系");
        Button4.setOnClickListener(new Button4Listener());
        Button5.setText("人际交往");
        Button5.setOnClickListener(new Button5Listener());
        Button6.setText("旅游出行");
        Button6.setOnClickListener(new Button6Listener());
        Button7.setText("文化教育");
        Button7.setOnClickListener(new Button7Listener());
        
    }
    class Button1Listener implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(liebiao.this, testListViewAcitivity.class);
			liebiao.this.startActivity(intent);
		}
    }
    class Button2Listener implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(liebiao.this, li02.class);
			liebiao.this.startActivity(intent);
		}
    }
    class Button3Listener implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(liebiao.this, li03.class);
			liebiao.this.startActivity(intent);
		}
    }
    class Button4Listener implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(liebiao.this, li04.class);
			liebiao.this.startActivity(intent);
		}
    }
    class Button5Listener implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(liebiao.this, li05.class);
			liebiao.this.startActivity(intent);
		}
    }
    class Button6Listener implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(liebiao.this, li06.class);
			liebiao.this.startActivity(intent);
		}
    }
    class Button7Listener implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(liebiao.this, li07.class);
			liebiao.this.startActivity(intent);
		}
    }
    
}