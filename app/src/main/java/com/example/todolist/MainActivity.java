package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fredy();
        arielEdri();
        jeffrey();
        //Hello From Freddy
    }


    private void jeffrey(){

    }

    private void fredy(){


    }

    private void arielEdri(){
        Toast.makeText(this,"ariel",Toast.LENGTH_LONG).show();
    }
}