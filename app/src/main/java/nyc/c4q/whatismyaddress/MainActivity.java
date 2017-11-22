package nyc.c4q.whatismyaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String SHARED_PREFS = "address shared preferences";
    private Button saveEmail;
    private Button recyclerIntent;
    private EditText userEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveEmail = (Button) findViewById(R.id.save_email_button);
        recyclerIntent = (Button) findViewById(R.id.recycler_intent_button);
        userEmail = (EditText) findViewById(R.id.user_email_view);

        saveEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
            String email = saveEmail.getText().toString();
            }
        });
        recyclerIntent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                intent.putExtra("sharedprefs", SHARED_PREFS);
                startActivity(intent);

            }
        });

    }

}
