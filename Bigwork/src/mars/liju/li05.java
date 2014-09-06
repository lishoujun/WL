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
    	  map.put("title", "昔日恋人相遇");
    	  map.put("info", "女友:Oh,fancy meeting you here ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "上课迟到");
    	  map.put("info", "Ken:Sorry teacher I'm late.  ");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "feel");
    	  map.put("info", "JACK:How do you feel?"); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "Hope");
   	  map.put("info", "Alex:Sorry， i should just quit.  "); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "夸奖长的漂亮！");
	  map.put("info", "monce:Oh,You look very pretty！ "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "迎新新生");
	  map.put("info", "迎新师兄:Nice to meet you !What can I do for you? "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "问候与告别");
	  map.put("info", "Mr Li:Good morning,Mr Smith. "); 
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
			Toast.makeText(li05.this, "你点了第"+arg+"项的"+mText.getText().toString(),
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