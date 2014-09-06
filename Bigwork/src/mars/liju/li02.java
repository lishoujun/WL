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
public class li02 extends Activity {
	private ListView myListView;  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limain);
        myListView=(ListView)findViewById(R.id.ListView01);
        
        ArrayList<HashMap<String, Object>> listitem=new ArrayList<HashMap<String,Object>>();
        
        HashMap<String, Object> map=new HashMap<String, Object>();
    	  map.put("title", "为寿司而生的胃");
    	  map.put("info", "Sam:Hey, body, where do you want to eat? ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "你不应该向左转");
    	  map.put("info", "LUKE:Hey,dudes!I think I'm lost!");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "我生病了");
    	  map.put("info", "A:Hi，Kate！How are you today?"); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "春节回家买火车票");
   	  map.put("info", "Passenger:What's the next train ~ "); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "中国式约会");
	  map.put("info", "A:Do you have time tomorrow？"); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "忘记带伞");
	  map.put("info", "Zhu:This time I am really doomed. "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "请客");
	  map.put("info", "Tom:It is my promotion,I would like to"); 
	 listitem.add(map);
       
        SimpleAdapter listitemAdapter=new SimpleAdapter(this,//上下文
        		listitem, //數據
        		R.layout.listview_style,//listItem的xml實現
        		new String[]{"title","info"}, //從map的批定Key
        		new int[]{R.id.title,R.id.info} //到要實現的控件上
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
			Toast.makeText(li02.this, "你点了第"+arg+"项的"+mText.getText().toString(),
					1000).show();
			Intent intent =new Intent();
			switch(arg){
			case 0:break;
	  		case 1:
	  			 intent.putExtra("testid",8);
	  			 //.putExtra("testid", 0);
	         	// intent.setClass(testListViewAcitivity.this, xiu01.class);
	  	         break;
	  		case 2:
	  			intent.putExtra("testid",9);
	  			//intent.setClass(testListViewAcitivity.this, xiu02.class);
	  			break;
	  		case 3:
	  			intent.putExtra("testid",10);break;
	  		case 4:
	  			intent.putExtra("testid",11);break;
	  		case 5:
	  			intent.putExtra("testid",12);break;
	  		case 6:
	  			intent.putExtra("testid",13);break;
	  		case 7:
	  			intent.putExtra("testid",14);break;
	  		
	  			
	  	}
			intent.setClass(li02.this, xiu01.class);
			startActivity(intent);
		 
			  
		}
       });
      
    }
   
    
    
    
}