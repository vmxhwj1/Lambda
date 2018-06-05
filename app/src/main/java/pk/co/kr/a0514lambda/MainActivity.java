package pk.co.kr.a0514lambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;


    interface NoArgLambda{
        public void method();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.display);

        //NoArgLambda 인터페이스를 사용
        /*
        NoArgLambda ref1 = new NoArgLambda(){
            @Override
            public void method() {
               display.setText("람다를 이용하지 않는 방식");
            }
        };
        */
        NoArgLambda ref1 = () -> {display.setText("람다를 이용한 방식");};
        ref1.method();
    }
}
