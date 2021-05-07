package com.slytherin.chickendinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cart extends AppCompatActivity {

    Button btn_Cart;
    Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        btn_Cart = (Button)findViewById(R.id.btn_place_order);
        btn_save = (Button)findViewById(R.id.btn_place_order);

        btn_Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart_View = new Intent(Cart.this, AddToCart.class);
                startActivity(cart_View);
            }
        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_save = new Intent(Cart.this,Orders.class);
            }
        });
    }

}
