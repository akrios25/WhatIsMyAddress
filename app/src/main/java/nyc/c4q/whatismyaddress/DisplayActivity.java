package nyc.c4q.whatismyaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private TextView intentValues;
    private TextView intentCharCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle extras = getIntent().getExtras();
        extras.getString("intent value");

        intentValues = (TextView) findViewById(R.id.intent_value);
        intentCharCount = (TextView) findViewById(R.id.intent_char_count);
        intentValues.setText(extras);
        intentCharCount.setText(getText(counter).toString());
    }
    public void charCountConverter(IntentValues iv) {
         int counter = 0;
        for (int i = 0; i < intentCharCount.length(); i++) {
            counter++;
        }
    }
}
