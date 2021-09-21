package mx.edu.tesoem.isc.hugo4295.g7s21p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, TresActivity.class);
                startActivity(intent);
                finish();
            }
        }, 10000);

    }

    public void Click(View v){
        Intent cargar = new Intent(this, PrincipalActivity.class);
        startActivity(cargar);
        finish();
    }

}