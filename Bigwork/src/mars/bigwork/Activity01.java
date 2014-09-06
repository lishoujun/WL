package mars.bigwork;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import mars.dataop.*;
import mars.meiwen.index;
import android.view.View;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.database.SQLException;

public class Activity01 extends Activity {
	/** Called when the activity is first created. */
	private Button button1, button2, button3, button4;
	
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		
		/*DatabaseHelper myDbHelper = new DatabaseHelper(this);
	     try {		System.out.print("2");

	             myDbHelper.createDataBase();
	      } catch (IOException ioe) {
	  		System.out.print("3");

	              throw new Error("Unable to create database");
	      }
	      try {
	  		System.out.print("4");

	              myDbHelper.openDataBase();
	      }catch(SQLException sqle){
	              throw sqle;
	      }*/
		
		this.setTitle("边走边学^-^");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		button1 = (Button) findViewById(R.id.mybutton1);
		button1.setText("在线翻译");
		button2 = (Button) findViewById(R.id.mybutton2);
		button2.setText("情景例句");
		button3 = (Button) findViewById(R.id.mybutton3);
		button3.setText("美文赏析");
		//button4 = (Button) findViewById(R.id.mybutton4);
		//button4.setText("游戏");

		button1.setOnClickListener(new Button1Listener());
		button2.setOnClickListener(new Button2Listener());
		button3.setOnClickListener(new Button3Listener());
	}
	
	

      
      
	class Button1Listener implements OnClickListener {

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(Activity01.this, mars.word.Word.class);
			Activity01.this.startActivity(intent);
		}

	}

	class Button2Listener implements OnClickListener {

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(Activity01.this, mars.liju.liebiao.class);
			Activity01.this.startActivity(intent);
		}
	}
	class Button3Listener implements OnClickListener {

		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(Activity01.this, index.class);
			Activity01.this.startActivity(intent);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		menu.add(0, Menu.FIRST, Menu.NONE, "退出程序");
		menu.add(0, Menu.FIRST + 1, Menu.NONE, "创建快捷方式");
		menu.add(0, Menu.FIRST + 2, Menu.NONE, "关于软件");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {// 获取菜单项的ID，即前面Menu.add方法的第二个参数

		case Menu.FIRST:// 退出
			this.finish();
			break;

		case Menu.FIRST + 1:// 快捷方式 实现  
			this.addShortcut();
			break;

		case Menu.FIRST + 2:// about
			Intent intent = new Intent();
			intent.setClass(Activity01.this, About.class);
			Activity01.this.startActivity(intent);
			break;
		default:
			break;
		}
		return true;
	}

	private void addShortcut() {
		Intent shortcut = new Intent(
				"com.android.launcher.action.INSTALL_SHORTCUT");
		// 快捷方式的名称
		shortcut.putExtra(Intent.EXTRA_SHORTCUT_NAME,
				getString(R.string.app_name));
		shortcut.putExtra("duplicate", false); // 不允许重复创建
		// 指定当前的Activity为快捷方式启动的对象: 如
		// com.everest.video.VideoPlayer
		// 注意: ComponentName的第二个参数必须加上点号(.)，否则快捷方式无法启动相应程序

		ComponentName comp = new ComponentName(this.getPackageName(), "."
				+ this.getLocalClassName());

		shortcut.putExtra(Intent.EXTRA_SHORTCUT_INTENT, new Intent(
				Intent.ACTION_MAIN).setComponent(comp));

		// 快捷方式的图标
		ShortcutIconResource iconRes = Intent.ShortcutIconResource.fromContext(
				this, R.drawable.icon);
		shortcut.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconRes);
		sendBroadcast(shortcut);

	}

}