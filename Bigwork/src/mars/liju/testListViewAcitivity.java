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
    	  map.put("title", "��������");
    	  map.put("info", "Ann:Alison��What kind of pet do you want to get? ");
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "������ ��������");
    	  map.put("info", "��:Why are you looking so sad?");
    	 
    	listitem.add(map);
    	  map = new HashMap<String, Object>();
    	  map.put("title", "��λ����������");
    	  map.put("info", "�˿�A:Excuse me, is this seat taken? "); 
    	 listitem.add(map);
    	 map = new HashMap<String, Object>();
   	  map.put("title", "�Ҳ����");
   	  map.put("info", "Bob:Ann,do you know where our boss is?"); 
   	 listitem.add(map);
   	 map = new HashMap<String, Object>();
	  map.put("title", "������û�С�һ��Ŀ��ȡ�");
	  map.put("info", "����Ա:Excuse me,sir, can I take your order?"); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "������ô����");
	  map.put("info", "Tom:Mom,I am back.  "); 
	 listitem.add(map);
	 map = new HashMap<String, Object>();
	  map.put("title", "�ְ̰�ѧӢ��");
	  map.put("info", "Ů��:Dad, what��s up?"); 
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
			Toast.makeText(testListViewAcitivity.this, "����˵�"+arg+"���"+mText.getText().toString(),
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