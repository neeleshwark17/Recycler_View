package com.assignment.recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<ObjectClass> mObjectClasses;

    public Adapter(ArrayList<ObjectClass> mObjectClasses) {
        this.mObjectClasses = mObjectClasses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ObjectClass objectClass = mObjectClasses.get(position);
        holder.imageView.setImageResource(objectClass.getmImageResource());
        holder.title.setText(objectClass.getmTitle());
        holder.subTitle.setText(objectClass.getmSubtitle());
    }

    @Override
    public int getItemCount() {
        return mObjectClasses.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView subTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textViewTitle);
            subTitle = itemView.findViewById(R.id.textViewSubtitle);
        }
    }
}
