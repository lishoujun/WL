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
		
		this.setTitle("���߱�ѧ^-^");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		button1 = (Button) findViewById(R.id.mybutton1);
		button1.setText("���߷���");
		button2 = (Button) findViewById(R.id.mybutton2);
		button2.setText("�龰����");
		button3 = (Button) findViewById(R.id.mybutton3);
		button3.setText("��������");
		//button4 = (Button) findViewById(R.id.mybutton4);
		//button4.setText("��Ϸ");

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
		menu.add(0, Menu.FIRST, Menu.NONE, "�˳�����");
		menu.add(0, Menu.FIRST + 1, Menu.NONE, "������ݷ�ʽ");
		menu.add(0, Menu.FIRST + 2, Menu.NONE, "�������");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {// ��ȡ�˵����ID����ǰ��Menu.add�����ĵڶ�������

		case Menu.FIRST:// �˳�
			this.finish();
			break;

		case Menu.FIRST + 1:// ��ݷ�ʽ ʵ��  
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
		// ��ݷ�ʽ������
		shortcut.putExtra(Intent.EXTRA_SHORTCUT_NAME,
				getString(R.string.app_name));
		shortcut.putExtra("duplicate", false); // �������ظ�����
		// ָ����ǰ��ActivityΪ��ݷ�ʽ�����Ķ���: ��
		// com.everest.video.VideoPlayer
		// ע��: ComponentName�ĵڶ�������������ϵ��(.)�������ݷ�ʽ�޷�������Ӧ����

		ComponentName comp = new ComponentName(this.getPackageName(), "."
				+ this.getLocalClassName());

		shortcut.putExtra(Intent.EXTRA_SHORTCUT_INTENT, new Intent(
				Intent.ACTION_MAIN).setComponent(comp));

		// ��ݷ�ʽ��ͼ��
		ShortcutIconResource iconRes = Intent.ShortcutIconResource.fromContext(
				this, R.drawable.icon);
		shortcut.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconRes);
		sendBroadcast(shortcut);

	}

}