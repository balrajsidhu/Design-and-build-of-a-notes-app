package com.example.secondtrycasestudy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  ItemFragment.NotesOnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemFragment fragment=new ItemFragment();
        getSupportFragmentManager()
                .beginTransaction()
                 .add(R.id.frame,fragment,"note_fragment")
                .commit();
    }
//we will remove toast afterword

    // this will

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //if(requestCode==100 && requestCode==RESULT_OK){

//        ItemFragment fragment=(ItemFragment) getSupportFragmentManager().findFragmentByTag("note_fragment");
//
//
//
//
//
//        if (fragment != null) {
//
//            fragment.refresh();
//            Toast.makeText(this, "data refreshed  ", Toast.LENGTH_SHORT).show();

        ItemFragment notesFragments=(ItemFragment) getSupportFragmentManager().findFragmentByTag("notesFragments");
        if (notesFragments != null)

            notesFragments.refresh();

        }

        //        if( resultCode==RESULT_OK&&data.hasExtra("result_text")){
//            EditText title=findViewById(R.id.title);
//            title.setText(data.getStringExtra("result_text"));
//        }



    @Override
    public void onClick(int position) {
        Intent intent=new Intent(this,IamYouEditActivity.class);
        intent.putExtra("note_index",position);
        startActivityForResult(intent,100);

    }

    public void addpressed(View view) {
        Intent intent=new Intent(this,IamYouEditActivity.class);
        startActivity(intent);
    }
}