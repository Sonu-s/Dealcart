package com.example.user.dealkart.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.dealkart.BuyCartActivity;
import com.example.user.dealkart.R;

import java.io.ByteArrayOutputStream;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;

    private Integer[] images = {R.drawable.oppo, R.drawable.oneplus, R.drawable.mobile,
            R.drawable.im, R.drawable.i, R.drawable.img};

    public RecyclerViewAdapter( Context context) {

       this.mContext = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_item_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.MyViewHolder holder, final int i) {

        holder.imageView.setImageResource(images[i]);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext,BuyCartActivity.class);
                intent.putExtra("picture",images[i]);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        // private ImageView favoriteImage;
        private ImageView imageView;
        private TextView nameText;
        private TextView price1Text;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // favoriteImage = itemView.findViewById(R.id.favoriteImage);
            imageView = itemView.findViewById(R.id.imageView);
            nameText = itemView.findViewById(R.id.nameText);
            price1Text = itemView.findViewById(R.id.price1Text);
        }
    }


}
