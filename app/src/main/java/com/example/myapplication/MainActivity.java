package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.gridview.GridViewActivity;
import com.example.myapplication.listvieew.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mEditText;
    private Button mRadioButton;
    private Button mCheckBox;
    private Button mListview;
    private Button mGridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mEditText = findViewById(R.id.btn_edittext);
        mRadioButton = findViewById(R.id.btn_radiobutton);
        mCheckBox = findViewById(R.id.btn_checkbox);
        mListview = findViewById(R.id.btn_listview);
        mGridView = findViewById(R.id.btn_gridview);

        setListeners();


    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);


                case R.id.btn_button:
                    intent = new Intent(MainActivity.this, Button.class);

                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);

                case R.id.btn_radiobutton:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);

                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);

                case R.id.btn_gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
            }
            startActivity(intent);
        }

    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        mBtnButton.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mEditText.setOnClickListener(onClick);
        mRadioButton.setOnClickListener(onClick);
        mListview.setOnClickListener(onClick);
        mGridView.setOnClickListener(onClick);
    }
}
