package mars.liju;

import java.util.ArrayList;
import java.util.HashMap; 

import mars.bigwork.R;
import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle; 
import android.view.View; 
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
public class li05 extends Activity {
	private ListView myListView;  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limain);
        myListView=(ListView)findViewById(R.id.ListView01);
        
        ArrayList<HashMap<String, Object>> listitem=new ArrayList<HashMap<String,Object>>();
        
        HashMap<String, Object> map=new HashMap<String, Object>();
    	  map.put("title", "������������");
    	  map.put("info", "Ů��:Oh,fancy meeting you here ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "�Ͽγٵ�");
    	  map.put("info", "Ken:Sorry teacher I'm late.  ");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "feel");
    	  map.put("info", "JACK:How do you feel?"); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "Hope");
   	  map.put("info", "Alex:Sorry�� i should just quit.  "); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "�佱����Ư����");
	  map.put("info", "monce:Oh,You look very pretty�� "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "ӭ������");
	  map.put("info", "ӭ��ʦ��:Nice to meet you !What can I do for you? "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "�ʺ�����");
	  map.put("info", "Mr Li:Good morning,Mr Smith. "); 
	 listitem.add(map);
       
        SimpleAdapter listitemAdapter=new SimpleAdapter(this,//������
        		listitem, //����
        		R.layout.listview_style,//listItem��xml���F
        		new String[]{"title","info"}, //��map������Key
        		new int[]{R.id.title,R.id.info} //��Ҫ���F�Ŀؼ���
        );
        
        myListView.setAdapter(listitemAdapter);
        
       myListView.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) { 
			
		
			// TODO Auto-generated method stub 
			int arg=arg2+1;
			RelativeLayout lr=(RelativeLayout)arg1;
			TextView mText=(TextView)lr.getChildAt(1); 
			Toast.makeText(li05.this, "����˵�"+arg+"���"+mText.getText().toString(),
					1000).show();
			Intent intent =new Intent();
			switch(arg){
			case 0:break;
	  		case 1:
	  			 intent.putExtra("testid",29);
	  			 //.putExtra("testid", 0);
	         	// intent.setClass(testListViewAcitivity.this, xiu01.class);
	  	         break;
	  		case 2:
	  			intent.putExtra("testid",30);
	  			//intent.setClass(testListViewAcitivity.this, xiu02.class);
	  			break;
	  		case 3:
	  			intent.putExtra("testid",31);break;
	  		case 4:
	  			intent.putExtra("testid",32);break;
	  		case 5:
	  			intent.putExtra("testid",33);break;
	  		case 6:
	  			intent.putExtra("testid",34);break;
	  		case 7:
	  			intent.putExtra("testid",35);break;
	  		
	  			
	  	}
			intent.setClass(li05.this, xiu01.class);
			startActivity(intent);
		 
			  
		}
       });
      
    }
   
    
    
    
}