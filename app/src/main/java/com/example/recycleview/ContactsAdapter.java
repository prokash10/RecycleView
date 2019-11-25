package com.example.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsAdapter {

    public class contactsViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tvname;
        TextView tvphone;
         public contactsViewHolder(@NonNull View itemView)
         {
             super(itemView);
             imageView=itemView.findViewById(R.id.imageView);
             tvname=itemView.findViewById(R.id.tvname);
             tvphone=itemView.findViewById(R.id.tvphone);

         }
    }
}
