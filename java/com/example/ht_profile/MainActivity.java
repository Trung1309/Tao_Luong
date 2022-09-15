package com.example.ht_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_DK;
    private Button btn_DN;
    private EditText tf_User;
    private EditText tf_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_DK = findViewById(R.id.btn_dk);
        btn_DN = findViewById(R.id.btn_dn);
        tf_pass = findViewById(R.id.tf_pass);
        tf_User = findViewById(R.id.tf_User);

        btn_DK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DK_Activity.class);
                startActivity(intent);
            }
        });

        btn_DN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tf_User.getText().length() != 0  && tf_pass.getText().length() != 0){
                    if (tf_User.getText().toString().equals("Admin") && tf_pass.getText().toString().equals("Admin")){
                        Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Profile_Activity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Tên tài khoản mật khẩu không đúng", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ tông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}