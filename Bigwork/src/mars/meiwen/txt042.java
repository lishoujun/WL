package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt042 extends Activity{
	private TextView txt042;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt042);  
		txt042=(TextView)findViewById(R.id.txt042);
		txt042.setText("1. From sharp minds, come sharp products.�����գ�\n" +
				       "2. Tide's in, dirt's out.(̭��ϴ�·�)\n" +
				       "3. Life is a journey. Enjoy the ride.��NISSAN ������\n" +
				       "4. Money is not everything. There's Mastercard & Visa.�����´����ÿ���\n" +
				       "5. I t's not TV, it's HBO.��HBO����̨��\n" +
				       "6. Think outside the box.��ƻ�����ԣ�\n" +
				       "7. Maybe she's born with it �C maybe it's Maybelline.����������\n" +
				       "8. Time is what you make of it.��˹�����ֱ�\n" +
				       "9. Make yourself heard.�������ţ�\n" +
				       "10. Engineered to move the human spirit. ��÷����˹-���ۣ�\n" +
				       "11. Start Ahead.��Ʈ�ᣩ\n" +
				       "12. A diamond lasts forever.���ڱȶ�˹��\n" +
				       "13. Fresh-up with Seven-up. ����ϲ��\n" +
				       "14. Connecting People.��ŵ���ǣ�\n" +
				       "15. For the Road Ahead.�����\n" +
				       "16. Generation Next.�����¿��֣�\n" +
				       "17. The Relentless Pursuit of Perfection.����־������\n" +
				       "18. Communication unlimited.��Ħ��������");

	}
}
