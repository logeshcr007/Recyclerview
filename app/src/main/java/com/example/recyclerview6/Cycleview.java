package com.example.recyclerview6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Cycleview extends RecyclerView.Adapter<Cycleview.ViewHoler> {

    private  Context context;
    private List<Model> modelList;

    public Cycleview(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public Cycleview.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( context );
        View view = inflater.inflate( R.layout.front_page,parent,false );
        return new Cycleview.ViewHoler( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Cycleview.ViewHoler holder, int position) {
        Model model = modelList.get( position );

        holder.imageView.setImageDrawable( context.getResources().getDrawable( model.getImageview() ) );
        holder.textView.setText( model.getExtview());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHoler(@NonNull View itemView) {
            super( itemView );

            imageView = itemView.findViewById( R.id.image_view );
            textView= itemView.findViewById( R.id.text_view );
        }
    }
}
