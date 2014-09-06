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
		txt012.setText("1.When you were born, you were crying and everyone around you was smiling, live your life so that when you die, you're smiling and everyone around you is crying.\n当你出生时，你哭着，身边的人笑着。尽情享受生命吧！当你离世时，你笑着，身边的人哭着。\n" +
				       "2.The real measure of our wealth is how much we'd be worth if we lost all our money.\n“真正衡量我们财富的方法，是在我们一分钱都没有的时候，我们还值多少。”\n" +
				       "3.Love comes to those who still hope even though they've been disappointed, to those who still believe even though they've been betrayed, need to love those who still love even though they've been hurt before.\n爱情是属于那些曾经失意但仍然充满希望的人，是属于那些曾经被出卖但仍然充满信心的人，是属于那些曾经被对方伤害却仍然深爱对方的人。\n" +
				       "4.Dream what you want to dreams, go where you want to go, be what you want to be coz you have only one life and one chance to do all the things you want in life.\n梦想你的梦想；到你想到的地方；做你想做的自己吧！因为你只能活一次。\n" +
				       "5.May you have enough happiness to make you sweet, enough trials to make you strong, enough sorrow to keep you human, enough hope to make you happy and enough money to buy me gifts.\n祝福你有足以令自己甜蜜的喜悦，足以令自己坚强的考验，足以令自己活得实在的苦涩，足以令自己快乐的企盼及足够你送我礼物的金钱。\n" +
				       "6.A careless word may kindle strife; a cruel word may wreck a life, a timely word may level stress, a loving word may heal and bless.\n一句无心之失可以触发争端，一句狠心话可以摧毁一生；一句适当的说话可以减轻压力，一句情话可以替人疗伤，抚慰心灵。\n" +
				       "7.The happiest of people don't necessarily have the best of everything, they just make the most of everything that comes along their way.\n世上最快乐的人未必拥有最好的东西，他们只是随心所欲，使身边的一切跟随自己的意愿。");
	}

}
