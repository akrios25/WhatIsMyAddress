package nyc.c4q.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String SHARED_PREFS = "address shared preferences";
    private Button saveEmail;
    private Button recyclerIntent;
    private EditText userEmail;
    private SharedPreferences submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_item_view);
        saveEmail = (Button) findViewById(R.id.save_email_button);
        recyclerIntent = (Button) findViewById(R.id.recycler_intent_button);
        userEmail = (EditText) findViewById(R.id.user_email_view);

        submit = getApplicationContext().getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);



        saveEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences.Editor editor = submit.edit();
                String email = saveEmail.getText().toString();
                editor.putString(SHARED_PREFS, email);
                editor.commit();
                userEmail.setText("");

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
