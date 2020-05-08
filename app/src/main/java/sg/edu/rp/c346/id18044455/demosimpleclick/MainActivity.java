package sg.edu.rp.c346.id18044455.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtnDisplay = findViewById(R.id.toggleButtonEnabled);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        tbtnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbtnDisplay.isChecked() == false){
                    etInput.setEnabled(false);
                    tvDisplay.setEnabled(false);
                }
                else{
                    etInput.setEnabled(true);
                    tvDisplay.setEnabled(true);
                }
            }
        });

    }
}
