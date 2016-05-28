package summit.org.summitcalculator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends AppCompatActivity {

    public static Intent getStartIntent(Context context) {
        return new Intent(context, TipCalculatorActivity.class);
    }

    private EditText bill, tipPercent;
    private Button calcBtn;
    private TextView tip, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //TODO Set the actionbar title for this activity

        tip = (TextView) findViewById(R.id.tv_result_tip);
        total = (TextView) findViewById(R.id.tv_result_total);


        bill = (EditText) findViewById(R.id.et_bill_amount);
        tipPercent = (EditText) findViewById(R.id.et_tip);




        bill.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean  handled = false;
                if(actionId == EditorInfo.IME_ACTION_DONE){

                    String text = v.getText().toString();
                    handled = true;
                }
                return handled;
            }
        });

        tipPercent.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean  handled = false;
                if(actionId == EditorInfo.IME_ACTION_DONE){

                    String text = v.getText().toString();
                    handled = true;
                }
                return handled;
            }
        });

        calcBtn = (Button) findViewById(R.id.btn_calculate);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //TODO Calculate the tip
                if(!(bill.getText().equals(""))&& !(tipPercent.getText().equals(""))){

                    double calcTip = (Integer.parseInt(tipPercent.getText().toString())*.01)*
                            Integer.parseInt(bill.getText().toString());
                    double calcTotal = calcTip+ Integer.parseInt(bill.getText().toString());


                    tip.setText(Float.toString(((float) calcTip)));
                    total.setText(Float.toString(((float) calcTotal)));
                }
            }
        });
        //TODO Set listeners on buttons
        //TODO Implement tip calculation logic
        //TODO Show the result to the user using the input from edit texts

    }

}