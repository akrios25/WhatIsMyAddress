package nyc.c4q.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nyc.c4q.whatismyaddress.controller.EmailAdapter;
import nyc.c4q.whatismyaddress.model.Emails;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        Bundle extras = getIntent().getExtras();
        RecyclerView EmailRecyclerView = (RecyclerView) findViewById(R.id.email_view_list);

        List<Emails> emails = new ArrayList<>();
        emails.add(new Emails("an email"));

        EmailAdapter emailAdapter = new EmailAdapter(emails);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        EmailRecyclerView.setLayoutManager(linearLayoutManager);

        EmailRecyclerView.setonClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(RecyclerActivity.this, DisplayActivity.class);
                intent.putExtra("intent value", "some string");
                startActivity(intent);

            }
        });



//        String extra = extras.getString("sharedprefs");
//        Map<String, ?> entries = .getAll();
//        for (Map.Entry<String, ?> entry : entries.entrySet()) {
//            Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());
//
//        }
//        ArrayList<>
    }
}
