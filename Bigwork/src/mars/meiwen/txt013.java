package mars.meiwen;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class txt013 extends Activity{

	private TextView txt013;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt013);
		txt013=(TextView)findViewById(R.id.txt013);
		txt013.setText("1.Ready or not, some day it will all come to an end. There will be no more sunrises, no days, no hours or minutes. All the things you collected, whether treasured or forgotten, will pass no someone else.\n�������Ƿ�����������׼��������һ�죬һ�ж����������ʱ�����������ճ������¡�Сʱ�ͷ��ӵĸ������ӵ�е�һ�У�������ֵ����ϧ�Ļ���Ӧ�������ģ��ǽ�ת�����ˡ�\n" +
				       "2.Your wealth, fame and temporal power will shrivel to irrelevance. It will not matter what you owned or what you were owed.\n�������Ƿ�����������׼��������һ�죬һ�ж����������ʱ�����������ճ������¡�Сʱ�ͷ��ӵĸ������ӵ�е�һ�У�������ֵ����ϧ�Ļ���Ӧ�������ģ��ǽ�ת�����ˡ�\n" +
				       "3.Your grudges, resentments, frustrations, and jealousies will finally disappear. So, too, your hopes, ambitions, plans, and to-do lists will all expire. The wins and losses that once seemed so important will fade away.\n��Ķ��⡢�ߺޡ���ܸкͼ��ʶ�����ʧ��������Ȼ�����ϣ�����������ƻ���Ҫ������Ҳ���޷�ʵ�֡�������������Ҫ�ĵ���ʧ��Ҳ�����ص�Į�ˡ�\n" +
				       "4.It won't matter where you come from, or on what side of the tracks you lived. It won't matter whether you were beautiful or brilliant. Your gender, skin color, ethnicity will be irrelevant.\n��ʱ�������Ժη�������������Ҫ��ͬ���������ǳ�������������Ҳ�������塣����Ա𡢷�ɫ������Ҳ�������޹ء�\n" +
				       "5.So what will matter? How will the value of your days be measured?\n��ô������ʲô������������ϧ���أ��ָ���ʲô��׼ȥ���������ļ�ֵ�أ�\n" +
				       "6.What will matter is not what you bought, but what you built; not what you got, but what you gave.\n��Ҫ��ϧ�ģ�������������õĳɹ���������ļ�ֵ��\n" +
				       "7.What will matter is not your success, but your significance.\n��Ҫ��ϧ�ģ���������Ķ�����Ҳ������������ģ�������������õģ����������ġ�\n" +
				       "8.What will matter is not what you learned, but what you taught.\n��Ҫ��ϧ�ģ���������ѧ����ʲô����������������ʲô��");
	}

}
