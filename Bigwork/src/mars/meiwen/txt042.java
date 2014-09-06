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
		txt042.setText("1. From sharp minds, come sharp products.（夏普）\n" +
				       "2. Tide's in, dirt's out.(汰渍洗衣粉)\n" +
				       "3. Life is a journey. Enjoy the ride.（NISSAN 汽车）\n" +
				       "4. Money is not everything. There's Mastercard & Visa.（万事达信用卡）\n" +
				       "5. I t's not TV, it's HBO.（HBO电视台）\n" +
				       "6. Think outside the box.（苹果电脑）\n" +
				       "7. Maybe she's born with it – maybe it's Maybelline.（美宝莲）\n" +
				       "8. Time is what you make of it.（斯沃奇手表）\n" +
				       "9. Make yourself heard.（爱立信）\n" +
				       "10. Engineered to move the human spirit. （梅塞德斯-奔驰）\n" +
				       "11. Start Ahead.（飘柔）\n" +
				       "12. A diamond lasts forever.（第比尔斯）\n" +
				       "13. Fresh-up with Seven-up. （七喜）\n" +
				       "14. Connecting People.（诺基亚）\n" +
				       "15. For the Road Ahead.（本田）\n" +
				       "16. Generation Next.（百事可乐）\n" +
				       "17. The Relentless Pursuit of Perfection.（凌志汽车）\n" +
				       "18. Communication unlimited.（摩托罗拉）");

	}
}
