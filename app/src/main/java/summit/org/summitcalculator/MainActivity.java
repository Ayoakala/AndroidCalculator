package summit.org.summitcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button calcBtn, tipBtn;


    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set click listeners on button
        calcBtn = (Button) findViewById(R.id.btn_calc);
        calcBtn.setOnClickListener(this);
        tipBtn = (Button) findViewById(R.id.btn_tip_calc);
        tipBtn.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_calc:
                Intent nextScreen_1 = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(nextScreen_1);
                break;
            case R.id.btn_tip_calc:
                Intent nextScreen_2 = new Intent(getApplicationContext(), TipCalculatorActivity.class);
                startActivity(nextScreen_2);
                break;
        }
    }
}