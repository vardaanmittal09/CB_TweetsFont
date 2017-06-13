package com.example.android.cb_tweetsfont;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText  et_tweet ;
    Button btnadd;
    ArrayList<String> studentArrayList=new ArrayList<>();
    ListView listView;
    Tweet_Adapter adapter=new Tweet_Adapter(studentArrayList,this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_tweet=(EditText)findViewById(R.id.et_tweet);
        btnadd=(Button)findViewById(R.id.btnadd);
        listView=(ListView)findViewById(R.id.lv_tweets);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentArrayList.add(et_tweet.getText().toString());
                Toast.makeText(MainActivity.this, "Added", Toast.LENGTH_SHORT).show();
                et_tweet.setText("");
                adapter.notifyDataSetChanged();
            }
        });
    }

}
