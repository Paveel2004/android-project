package com.example.investment;

import static com.google.android.material.internal.ContextUtils.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Support extends AppCompatActivity {

    EditText editName;
    EditText editEmail;
    EditText editQuestion;
    Button sendButton;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("SupportQuestion:");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        editName = findViewById(R.id.name);
        editEmail = findViewById(R.id.email);
        editQuestion = findViewById(R.id.question);

    }
    private void clearAllEditText(){
        editName.setText("");
        editEmail.setText("");
        editQuestion.setText("");
    }
    public String generateKey(){
        return myRef.push().getKey();
    }
    public void sendData(View view)
    {

        Toast toast = Toast.makeText(getApplicationContext(),"Вопрос отправлен! Ответим за 24ч!",Toast.LENGTH_LONG);
        SupportQuestion supportQuestion = new SupportQuestion(editName.getText().toString(),editEmail.getText().toString(),editQuestion.getText().toString());
        
        myRef.child(generateKey()).setValue(supportQuestion);

        clearAllEditText();
        toast.show();

    }
}