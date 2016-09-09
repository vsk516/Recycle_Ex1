package com.example.vamsisaikrishna.recycle_ex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vamsisaikrishna on 6/21/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder>{

    private List<ListItem> listItems;
    private LayoutInflater inflater;

    public ListAdapter(List<ListItem> listItems, Context c){
        this.inflater = LayoutInflater.from(c);
        this.listItems = listItems;
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_view,parent,false);

        return new ListHolder(view);
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        ListItem item = listItems.get(position);
        holder.txt.setText(item.getTitle());
        holder.img.setImageResource(item.getImageResId());


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class ListHolder extends RecyclerView.ViewHolder{

        private TextView txt;
        private ImageView img;
       // private View container;

        public ListHolder(View itemView) {
            super(itemView);

            txt = (TextView)itemView.findViewById(R.id.txt_root);
            img = (ImageView)itemView.findViewById(R.id.image_root);
          //  container = itemView.findViewById(R.id.cont_item_root);

        }
    }
}
