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
public class li04 extends Activity {
	private ListView myListView;  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limain);
        myListView=(ListView)findViewById(R.id.ListView01);
        
        ArrayList<HashMap<String, Object>> listitem=new ArrayList<HashMap<String,Object>>();
        
        HashMap<String, Object> map=new HashMap<String, Object>();
    	  map.put("title", "���˵���ĸ�׵ĶԻ�");
    	  map.put("info", "���˵�:Mother, I love him and decide to marry him. ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "�����ӱ���ҵ��������");
    	  map.put("info", "Mother:Have you finished your homework ");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "��ؼ�VS�Ͽ�");
    	  map.put("info", "Son:I'm home ,Mummy."); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "I will miss you");
   	  map.put("info", "wife:Our daughter,Poler, is very lovely,isn't it?  "); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "�Լ��������Լ���");
	  map.put("info", "Mrs.H:Peter,your trousers are too dirty to wear!"); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "homework");
	  map.put("info", "Mother:son,the next time ,help me cook,OK? "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "�ҵ��ճ�����");
	  map.put("info", "dad:My children ,can you help me move the things? "); 
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
			Toast.makeText(li04.this, "����˵�"+arg+"���"+mText.getText().toString(),
					1000).show();
			Intent intent =new Intent();
			switch(arg){
			case 0:break;
	  		case 1:
	  			 intent.putExtra("testid",22);
	  			 //.putExtra("testid", 0);
	         	// intent.setClass(testListViewAcitivity.this, xiu01.class);
	  	         break;
	  		case 2:
	  			intent.putExtra("testid",23);
	  			//intent.setClass(testListViewAcitivity.this, xiu02.class);
	  			break;
	  		case 3:
	  			intent.putExtra("testid",24);break;
	  		case 4:
	  			intent.putExtra("testid",25);break;
	  		case 5:
	  			intent.putExtra("testid",26);break;
	  		case 6:
	  			intent.putExtra("testid",27);break;
	  		case 7:
	  			intent.putExtra("testid",28);break;
	  		
	  			
	  	}
			intent.setClass(li04.this, xiu01.class);
			startActivity(intent);
		 
			  
		}
       });
      
    }
   
    
    
    
}