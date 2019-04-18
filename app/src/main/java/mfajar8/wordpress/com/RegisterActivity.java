package mfajar8.wordpress.com;

/*
 * NIM   : 10116463
 * NAMA  : Mochamad Fajar Ismatulloh
 * KELAS : AKB-11
 * TGL   : 16/04/2019
 * */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button kealther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        kealther = (Button) findViewById(R.id.btn_Register);
        kealther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, AlmostThereActivity.class);
                startActivity(i);
            }
        });

    }
}
