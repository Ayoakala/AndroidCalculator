package summit.org.summitcalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    public static Intent getStartIntent(Context context) {
        return new Intent(context, CalculatorActivity.class);
    }
    // _0, _1 , _2, _3 ,_4, _5, _6, _7, _8, _9, times, minus, plus, decimal, equals
    private Button[] nums;
    private Button[] operators;
    private String[] op_name=  {"times", "minus", "add", "decimal", "equals"};
    private Character[] op_id=  {'x', '-', '+'};
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //TODO set correct title for action bar
        //todo grab and set listeners
        //todo Implement calculator

        result = (TextView) findViewById(R.id.result);

        nums = new Button[10];
        for (int x = 0; x<nums.length;x++){
            String buttonID = "_" + x;
            int resID = getResources().getIdentifier(buttonID , "id", this.getPackageName());
            nums[x] = ((Button) findViewById(resID));
            nums[x].setOnClickListener(this);
        }

        operators = new Button[5];
        for (int x = 0; x < op_name.length; x++){
            String buttonID = op_name[x];
            int resID = getResources().getIdentifier(buttonID,"id", this.getPackageName());
            operators[x] = ((Button) findViewById(resID));
            operators[x].setOnClickListener(this);
        }


    }

//    public int compute(int x, int y){
//
//
//    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id._0: result.append("0");
                break;
            case R.id._1: result.append("1");
                break;
            case R.id._2: result.append("2");
                break;
            case R.id._3: result.append("3");
                break;
            case R.id._4: result.append("4");
                break;
            case R.id._5: result.append("5");
                break;
            case R.id._6: result.append("6");
                break;
            case R.id._7: result.append("7");
                break;
            case R.id._8: result.append("8");
                break;
            case R.id._9: result.append("9");
                break;
            case R.id.add:

                for(int x = 0; x < op_id.length; x++) {
                    if (result.getText().toString().contains(op_id[x].toString())) {
                        int ans = Integer.parseInt(result.getText().toString()+"added");
                        result.setText("");
                        result.append(ans + "");
                        result.append("hhhhhhh");
                    }
                    result.append("+");
                    break;
                }
            case R.id.minus:
                break;
            case R.id.times:
                break;
            case R.id.decimal:
                break;
            case R.id.equals:
                break;
        }
    }
}
