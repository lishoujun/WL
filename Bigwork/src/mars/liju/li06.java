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
public class li06 extends Activity {
	private ListView myListView;  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limain);
        myListView=(ListView)findViewById(R.id.ListView01);
        
        ArrayList<HashMap<String, Object>> listitem=new ArrayList<HashMap<String,Object>>();
        
        HashMap<String, Object> map=new HashMap<String, Object>();
    	  map.put("title", "去中国旅行");
    	  map.put("info", "A::Have you been to China before ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "寻找邮局");
    	  map.put("info", "汤姆:Can you help me out? ");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "去车站");
    	  map.put("info", "汤姆:Excuse me. Could you please tell me  "); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "提出上诉");
   	  map.put("info", "律师:You can appeal if you're not satisfied "); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "报警");
	  map.put("info", "迈克:Hello, is that the police? "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "跟团到长城");
	  map.put("info", "汤姆:Yes. I have heard the Great Wall"); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "购买通票");
	  map.put("info", "艾丽丝:Excuse me, two tickets please. "); 
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
			Toast.makeText(li06.this, "你点了第"+arg+"项的"+mText.getText().toString(),
					1000).show();
			Intent intent =new Intent();
			switch(arg){
			case 0:break;
	  		case 1:
	  			 intent.putExtra("testid",36);
	  			 //.putExtra("testid", 0);
	         	// intent.setClass(testListViewAcitivity.this, xiu01.class);
	  	         break;
	  		case 2:
	  			intent.putExtra("testid",37);
	  			//intent.setClass(testListViewAcitivity.this, xiu02.class);
	  			break;
	  		case 3:
	  			intent.putExtra("testid",38);break;
	  		case 4:
	  			intent.putExtra("testid",39);break;
	  		case 5:
	  			intent.putExtra("testid",40);break;
	  		case 6:
	  			intent.putExtra("testid",41);break;
	  		case 7:
	  			intent.putExtra("testid",42);break;
	  		
	  			
	  	}
			intent.setClass(li06.this, xiu01.class);
			startActivity(intent);
		 
			  
		}
       });
      
    }
   
    
    
    
}