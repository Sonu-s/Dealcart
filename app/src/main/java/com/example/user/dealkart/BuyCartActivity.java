package com.example.user.dealkart;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class BuyCartActivity extends AppCompatActivity {

    private Button buyNow;
    private Button addToCart;
    private ImageView productImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_cart);

       Toolbar toolbar = findViewById(R.id.toolbar);
       toolbar.setTitle("Item");
       setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        productImage = findViewById(R.id.productImages);
        Intent mIntent = getIntent();
        int value = mIntent.getIntExtra("picture",0);
        productImage.setImageResource(value);

        // Bottom Sheet....

        LinearLayout layoutBottomSheet = findViewById(R.id.bottom_sheet);
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(layoutBottomSheet);

        buyNow = findViewById(R.id.buyNow);
        addToCart = findViewById(R.id.addToCart);

        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BuyCartActivity.this, "BUY NOW!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BuyCartActivity.this,BuyActivity.class);
                startActivity(intent);
            }
        });


        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(BuyCartActivity.this, "Added To Cart!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
