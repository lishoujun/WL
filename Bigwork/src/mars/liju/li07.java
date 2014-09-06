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
public class li07 extends Activity {
	private ListView myListView;  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limain);
        myListView=(ListView)findViewById(R.id.ListView01);
        
        ArrayList<HashMap<String, Object>> listitem=new ArrayList<HashMap<String,Object>>();
        
        HashMap<String, Object> map=new HashMap<String, Object>();
    	  map.put("title", "english study");
    	  map.put("info", "JACK:How was your english study? ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "���ϵ���");
    	  map.put("info", "Man:Dear God! I pray to You for helping me out.");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "�ͻ�����");
    	  map.put("info", "�˿�:I want three."); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "Ӣ����־");
   	  map.put("info", "��Ա:We have English magazines.   "); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "DVD");
	  map.put("info", "�˿�:I want to buy some DVDs. "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "����ʦ����");
	  map.put("info", "Teacher:Hey, Tom, where are you going? "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "��ҳ���");
	  map.put("info", "Ann:Mr. Smith, I need to talk to you."); 
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
			Toast.makeText(li07.this, "����˵�"+arg+"���"+mText.getText().toString(),
					1000).show();
			Intent intent =new Intent();
			switch(arg){
			case 0:break;
	  		case 1:
	  			 intent.putExtra("testid",43);
	  			 //.putExtra("testid", 0);
	         	// intent.setClass(testListViewAcitivity.this, xiu01.class);
	  	         break;
	  		case 2:
	  			intent.putExtra("testid",44);
	  			//intent.setClass(testListViewAcitivity.this, xiu02.class);
	  			break;
	  		case 3:
	  			intent.putExtra("testid",45);break;
	  		case 4:
	  			intent.putExtra("testid",46);break;
	  		case 5:
	  			intent.putExtra("testid",47);break;
	  		case 6:
	  			intent.putExtra("testid",48);break;
	  		case 7:
	  			intent.putExtra("testid",49);break;
	  		
	  			
	  	}
			intent.setClass(li07.this, xiu01.class);
			startActivity(intent);
		 
			  
		}
       });
      
    }
   
    
    
    
}