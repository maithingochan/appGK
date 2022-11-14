package com.example.appgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt_user,txt_password;
    CheckBox checkSave;
    Button btn_signIn,btn_signUp;

    String thongtinluu = "tai_khoan matkhau";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_password=(EditText) findViewById(R.id.txtPassword);
        txt_user=(EditText) findViewById(R.id.txt_user);
        checkSave=(CheckBox) findViewById(R.id.cblogin);
        btn_signIn=(Button) findViewById(R.id.btnSignIn);
        btn_signUp=(Button) findViewById(R.id.btnSignIn_SignUp);

        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = getSharedPreferences(thongtinluu,MODE_PRIVATE);
                SharedPreferences.Editor editor     = sharedPreferences.edit();

                editor.putString("Username", txt_user.getText().toString().trim());
                editor.putString("Password", txt_password.getText().toString().trim());
                editor.putBoolean("Save", checkSave.isChecked());
                editor.commit();
//                if(txt_user.getText().length()!=0&&txt_password.getText().length()!=0){
//                    if(txt_user.getText().toString().equals("doanthanhha") &&  txt_password.getText().toString().equals("123")){
//                        Intent intent = new Intent(MainActivity.this,Home.class);
//                        startActivity(intent);
//                        Toast.makeText(MainActivity.this, "Dang nhap thanh cong!!", Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(MainActivity.this, "Sai tai  khoan hoac mat khau!!", Toast.LENGTH_SHORT).show();
//                        txt_user.setText("");
//                        txt_password.setText("");
//                    }
//                }else{
//                    Toast.makeText(MainActivity.this, "Nhap day du thong tin!!!", Toast.LENGTH_SHORT).show();
//                }
            }
        });
        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent= new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
            }
        });

    }

    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getSharedPreferences(thongtinluu,MODE_PRIVATE);
        String username = sharedPreferences.getString("Username", "");
        String password = sharedPreferences.getString("Password", "");
        boolean save = sharedPreferences.getBoolean("Save", false);
        if(save == true) {
            txt_password.setText(password);
            txt_user.setText(username);
        }
    }
}