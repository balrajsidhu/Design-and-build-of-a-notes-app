package com.example.secondtrycasestudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import com.example.secondtrycasestudy.dummy.DummyContent;

public class IamYouEditActivity extends AppCompatActivity {

    EditText titlET;
    EditText dateET;
   SwitchCompat priortySwitchET;
   DummyContent.DummyItem note=null;
   int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iam_you_edit);

        titlET=findViewById(R.id.title);
        dateET=findViewById(R.id.date);
        priortySwitchET=findViewById(R.id.priortySwitch);

        Intent intent=getIntent();
        position=intent.getIntExtra("note_position",-1);;
        if(intent.hasExtra("note_position")){
             position=intent.getIntExtra("note_position",-1);
             note= DummyContent.ITEMS.get(position);

             titlET.setText(note.title);
             dateET.setText(note.date);
            priortySwitchET.setChecked(note.checkBookmark);


        }
    }

    public void cancelpressed(View view) {
    finish();
    }

    public void savepressed(View view) {
//     Intent resultIntent=new Intent();
//    EditText title=findViewById(R.id.title);
//    String resultText=title.getText().toString();
//    resultIntent.putExtra("result_text",resultText);
      //  DummyContent.ITEMS.get(position).title="new Title";


//        if(note!=null){
//
//            note.title=titlET.getText().toString();
//            note.checkBookmark=priortySwitchET.isChecked();
//            note.date=dateET.getText().toString();
//            note.date=dateET.getText().toString();
//        }
//       //Intent intent=new Intent();
//        //this intinte is to send data back to main activity
//
//       setResult(RESULT_OK);


        finish();
    }
}