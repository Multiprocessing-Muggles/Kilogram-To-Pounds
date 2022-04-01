package dasgupta.multiprocessingmuggles.sunami.kilogramstopounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.InputText);

        button = (Button) findViewById(R.id.button);

        textView = (TextView) findViewById(R.id.OutputText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = 0;
                try {
                    num = Double.parseDouble(editText.getText().toString());
                }catch (Exception e){
                    int a = 9;
                }
                double output = num *  2.205;

                textView.setText(String.valueOf(output) + " Pounds");
            }
        });
    }
}