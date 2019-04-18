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

public class LoginAppsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_apps);
    }

    public void OnClick(View view) {
        Intent i = null;
        switch (view.getId()){
            case R.id.btn_regis:
                i = new Intent(this, RegisterActivity.class);
                break;
        }
        if (null!=i) startActivity(i);
    }
}
