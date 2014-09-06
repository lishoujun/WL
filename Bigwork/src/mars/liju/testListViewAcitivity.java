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
public class testListViewAcitivity extends Activity {
	private ListView myListView;  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limain);
        myListView=(ListView)findViewById(R.id.ListView01);
        
        ArrayList<HashMap<String, Object>> listitem=new ArrayList<HashMap<String,Object>>();
        
        HashMap<String, Object> map=new HashMap<String, Object>();
    	  map.put("title", "饲养宠物");
    	  map.put("info", "Ann:Alison，What kind of pet do you want to get? ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "爱他， 请这样做");
    	  map.put("info", "杨:Why are you looking so sad?");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "这位子有人坐吗？");
    	  map.put("info", "乘客A:Excuse me, is this seat taken? "); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "我不清楚");
   	  map.put("info", "Bob:Ann,do you know where our boss is?"); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "我们这没有“一般的咖啡”");
	  map.put("info", "服务员:Excuse me,sir, can I take your order?"); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "就是这么回事");
	  map.put("info", "Tom:Mom,I am back.  "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "教爸爸学英语");
	  map.put("info", "女儿:Dad, what’s up?"); 
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
			Toast.makeText(testListViewAcitivity.this, "你点了第"+arg+"项的"+mText.getText().toString(),
					1000).show();
			Intent intent =new Intent();
			switch(arg){
			case 0:break;
	  		case 1:
	  			 intent.putExtra("testid",1);
	  			 //.putExtra("testid", 0);
	         	// intent.setClass(testListViewAcitivity.this, xiu01.class);
	  	         break;
	  		case 2:
	  			intent.putExtra("testid",2);
	  			//intent.setClass(testListViewAcitivity.this, xiu02.class);
	  			break;
	  		case 3:
	  			intent.putExtra("testid",3);break;
	  		case 4:
	  			intent.putExtra("testid",4);break;
	  		case 5:
	  			intent.putExtra("testid",5);break;
	  		case 6:
	  			intent.putExtra("testid",6);break;
	  		case 7:
	  			intent.putExtra("testid",7);break;
	  		
	  			
	  	}
			intent.setClass(testListViewAcitivity.this, xiu01.class);
			startActivity(intent);
		 
			  
		}
       });
      
    }
   
    
    
    
}