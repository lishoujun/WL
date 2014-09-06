package mars.liju;

import mars.bigwork.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class xiu01 extends Activity  {

	private TextView liju;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neirong);
        liju=(TextView)findViewById (R.id.text1);
        Intent intent=getIntent();
        int a=intent.getIntExtra("testid", 0);
      //  .getStringExtra("testid");
        switch(a){
        case 0:break;
        case 1:
        liju.setText(R.string.i01);break;
        case 2:
        	liju.setText(R.string.i02);break;
        case 3:
        	liju.setText(R.string.i03);break;
        case 4:
        	liju.setText(R.string.i04);break;
        case 5:
        	liju.setText(R.string.i05);break;
        case 6:
        	liju.setText(R.string.i06);break;
        case 7:
        	liju.setText(R.string.i07);break;
        case 8:
        	liju.setText(R.string.i08);break;
        case 9:
        	liju.setText(R.string.i09);break;
        case 10:
        	liju.setText(R.string.i10);break;
        case 11:
        	liju.setText(R.string.i11);break;
        case 12:
        	liju.setText(R.string.i12);break;
        case 13:
        	liju.setText(R.string.i13);break;
        case 14:
        	liju.setText(R.string.i14);break;
        case 15:
        	liju.setText(R.string.i15);break;
        case 16:
        	liju.setText(R.string.i16);break;
        case 17:
        	liju.setText(R.string.i17);break;
        case 18:
        	liju.setText(R.string.i18);break;
        case 19:
        	liju.setText(R.string.i19);break;
        case 20:
        	liju.setText(R.string.i20);break;
        case 21:
        	liju.setText(R.string.i21);break;
        case 22:
        	liju.setText(R.string.i22);break;
        case 23:
        	liju.setText(R.string.i23);break;
        case 24:
        	liju.setText(R.string.i24);break;
        case 25:
        	liju.setText(R.string.i25);break;
        case 26:
        	liju.setText(R.string.i26);break;
        case 27:
        	liju.setText(R.string.i27);break;
        case 28:
        	liju.setText(R.string.i28);break;
        case 29:
        	liju.setText(R.string.i29);break;
        case 30:
        	liju.setText(R.string.i30);break;
        case 31:
        	liju.setText(R.string.i31);break;
        case 32:
        	liju.setText(R.string.i32);break;
        case 33:
        	liju.setText(R.string.i33);break;
        case 34:
        	liju.setText(R.string.i34);break;
        case 35:
        	liju.setText(R.string.i35);break;
        case 36:
        	liju.setText(R.string.i36);break;
        case 37:
        	liju.setText(R.string.i37);break;
        case 38:
        	liju.setText(R.string.i38);break;
        case 39:
        	liju.setText(R.string.i39);break;
        case 40:
        	liju.setText(R.string.i40);break;
        case 41:
        	liju.setText(R.string.i41);break;
        case 42:
        	liju.setText(R.string.i42);break;
        case 43:
        	liju.setText(R.string.i43);break;
        case 44:
        	liju.setText(R.string.i44);break;
        case 45:
        	liju.setText(R.string.i45);break;
        case 46:
        	liju.setText(R.string.i46);break;
        case 47:
        	liju.setText(R.string.i47);break;
        case 48:
        	liju.setText(R.string.i48);break;
        case 49:
        	liju.setText(R.string.i49);break;
        
        }
       
        
	}
}