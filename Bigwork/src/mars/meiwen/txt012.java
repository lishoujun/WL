package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt012 extends Activity{

	private TextView txt012;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt012);
		txt012=(TextView)findViewById(R.id.txt012);
		txt012.setText("1.When you were born, you were crying and everyone around you was smiling, live your life so that when you die, you're smiling and everyone around you is crying.\n�������ʱ������ţ���ߵ���Ц�š��������������ɣ���������ʱ����Ц�ţ���ߵ��˿��š�\n" +
				       "2.The real measure of our wealth is how much we'd be worth if we lost all our money.\n�������������ǲƸ��ķ�������������һ��Ǯ��û�е�ʱ�����ǻ�ֵ���١���\n" +
				       "3.Love comes to those who still hope even though they've been disappointed, to those who still believe even though they've been betrayed, need to love those who still love even though they've been hurt before.\n������������Щ����ʧ�⵫��Ȼ����ϣ�����ˣ���������Щ��������������Ȼ�������ĵ��ˣ���������Щ�������Է��˺�ȴ��Ȼ��Է����ˡ�\n" +
				       "4.Dream what you want to dreams, go where you want to go, be what you want to be coz you have only one life and one chance to do all the things you want in life.\n����������룻�����뵽�ĵط��������������Լ��ɣ���Ϊ��ֻ�ܻ�һ�Ρ�\n" +
				       "5.May you have enough happiness to make you sweet, enough trials to make you strong, enough sorrow to keep you human, enough hope to make you happy and enough money to buy me gifts.\nף�������������Լ����۵�ϲ�ã��������Լ���ǿ�Ŀ��飬�������Լ����ʵ�ڵĿ�ɬ���������Լ����ֵ����μ��㹻����������Ľ�Ǯ��\n" +
				       "6.A careless word may kindle strife; a cruel word may wreck a life, a timely word may level stress, a loving word may heal and bless.\nһ������֮ʧ���Դ������ˣ�һ����Ļ����Դݻ�һ����һ���ʵ���˵�����Լ���ѹ����һ���黰�����������ˣ���ο���顣\n" +
				       "7.The happiest of people don't necessarily have the best of everything, they just make the most of everything that comes along their way.\n��������ֵ���δ��ӵ����õĶ���������ֻ������������ʹ��ߵ�һ�и����Լ�����Ը��");
	}

}
