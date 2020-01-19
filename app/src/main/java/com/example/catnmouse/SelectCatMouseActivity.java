package com.example.catnmouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class SelectCatMouseActivity extends AppCompatActivity {
    private Button button;
    private Switch aSwitch;
    private boolean isCat = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_cat_mouse2);

        button = findViewById(R.id.button3);
        aSwitch = findViewById(R.id.switch3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        //        user.setCat(isCat);
        //        openGameActivity();
            }
        });
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCat = !isCat;
            }
        });
        //public void openGameActivity()
        //{
        //   Intent intent = new Intent(this, GameActivity.class);
        //   startActivity(intent);
        //}
    }
}
