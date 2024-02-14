package com.example.investment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainChat extends AppCompatActivity {
    private EditText editText;
    private Button sendButton;
    private ListView messageListView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> messages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat);

        editText = findViewById(R.id.textMessage);
        sendButton = findViewById(R.id.sendMessage);
        messageListView = findViewById(R.id.messageListView);

        messages = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.message_item,messages);
        messageListView.setAdapter(adapter);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMessageToList();
            }
        });
    }
    private void addMessageToList(){
        String message = editText.getText().toString().trim();
        if(!message.isEmpty()){
            messages.add(message);
            adapter.notifyDataSetChanged();
            editText.getText().clear();
        }
    }
}