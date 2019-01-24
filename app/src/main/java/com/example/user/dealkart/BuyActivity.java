package com.example.user.dealkart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class BuyActivity extends AppCompatActivity {

    private Button changeAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Delivery");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        changeAddress = findViewById(R.id.changeAddress);
    }

    public void addressChange(View view) {

        Intent intent = new Intent(BuyActivity.this,ChangeAddressActivity.class);
        startActivity(intent);
    }
}
