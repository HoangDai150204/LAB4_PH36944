package com.hoangdai.lab4_ph36944;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class B2_Activity2 extends AppCompatActivity {

    public static String KEY_GIA="edtgia";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b22);

        TextView txtsp = findViewById(R.id.txtsp);
        EditText edtgiasp = findViewById(R.id.edtgia);
        Button btnbaogia = findViewById(R.id.btnbaogia);

        String sNamesp = getIntent().getStringExtra(B2_Activity1.KEY_SP);

        txtsp.setText(sNamesp);

        btnbaogia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validate ô nhập trống
                String sGia = edtgiasp.getText().toString();

                if(sGia == null||sGia.equals("")){
                    Toast.makeText(getApplicationContext(), "Cần nhập giá", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), B2_Activity1.class);
                    intent.putExtra(KEY_GIA,sGia);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }
}