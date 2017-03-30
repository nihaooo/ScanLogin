package com.testscanlogin.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import cn.bmob.v3.Bmob;

public class LoginActivity extends AppCompatActivity  {

    // UI references.
    private AutoCompleteTextView mStudentId;
    private EditText mPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bmob.initialize(this, "f9fd3e06a0ee9b9d702db043e81e7393");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mStudentId = (AutoCompleteTextView) findViewById(R.id.student_id);
        mPassword = (EditText) findViewById(R.id.student_password);
        Button mSignInButton = (Button) findViewById(R.id.sign_in_button);
        mSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int  id= Integer.parseInt((mStudentId.getText().toString()));
                int  password = Integer.parseInt((mPassword.getText().toString()));
                Method method = new Method(LoginActivity.this);
                method.addInformation(id,password);
            }
        });

    }

}

