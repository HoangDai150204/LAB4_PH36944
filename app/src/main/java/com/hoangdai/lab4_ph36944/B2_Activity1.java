package com.hoangdai.lab4_ph36944;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class B2_Activity1 extends AppCompatActivity {

    public static String KEY_SP = "edtsp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b21);

        Button btngui = findViewById(R.id.btngui);
        EditText edtsp = findViewById(R.id.edtsp);
        TextView txtgia = findViewById(R.id.txtgia);

        String sGia=getIntent().getStringExtra(B2_Activity2.KEY_GIA);

        txtgia.setText(sGia);

        btngui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validate ô nhập trống
                String sNamesp = edtsp.getText().toString();
                if (sNamesp == null || sNamesp.equals("")) {
                    Toast.makeText(getApplicationContext(), "Cần nhập tên sản phẩm!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), B2_Activity2.class);

                    intent.putExtra(KEY_SP, sNamesp);

                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}