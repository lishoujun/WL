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
public class li03 extends Activity {
	private ListView myListView;  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limain);
        myListView=(ListView)findViewById(R.id.ListView01);
        
        ArrayList<HashMap<String, Object>> listitem=new ArrayList<HashMap<String,Object>>();
        
        HashMap<String, Object> map=new HashMap<String, Object>();
    	  map.put("title", "Who is your idol?");
    	  map.put("info", "Lucy:Hi. What's wrong with you ?");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "�������÷��");
    	  map.put("info", "Jackie:Hi! Lili, do you know Messi? ");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "�����¶�3����");
    	  map.put("info", "С��:What a pity! I had to go to a wedding"); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "������Ľ���");
   	  map.put("info", "����:Who is the pride in sports of our country ?  "); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "��̳����˲��");
	  map.put("info", "����:What is the most wonderful moment of"); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "Ҧ��");
	  map.put("info", "����:The most influential sports-men were chosen"); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "���ȴ�������8ǿ");
	  map.put("info", "Tom:Did you watch the US Open?"); 
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
			Toast.makeText(li03.this, "����˵�"+arg+"���"+mText.getText().toString(),
					1000).show();
			Intent intent =new Intent();
			switch(arg){
			case 0:break;
	  		case 1:
	  			 intent.putExtra("testid",15);
	  			 //.putExtra("testid", 0);
	         	// intent.setClass(testListViewAcitivity.this, xiu01.class);
	  	         break;
	  		case 2:
	  			intent.putExtra("testid",16);
	  			//intent.setClass(testListViewAcitivity.this, xiu02.class);
	  			break;
	  		case 3:
	  			intent.putExtra("testid",17);break;
	  		case 4:
	  			intent.putExtra("testid",18);break;
	  		case 5:
	  			intent.putExtra("testid",19);break;
	  		case 6:
	  			intent.putExtra("testid",20);break;
	  		case 7:
	  			intent.putExtra("testid",21);break;
	  		
	  			
	  	}
			intent.setClass(li03.this, xiu01.class);
			startActivity(intent);
		 
			  
		}
       });
      
    }
   
    
    
    
}