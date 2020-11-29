package com.example.secondtrycasestudy;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.secondtrycasestudy.dummy.DummyContent.DummyItem;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<DummyItem> mValues;
    ItemFragment.NotesOnClickListener listener;

    public MyItemRecyclerViewAdapter(List<DummyItem> items, ItemFragment.NotesOnClickListener listener) {
        mValues = items;
        this.listener=listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
//
                holder.mItem = mValues.get(position);
        holder.title.setText(mValues.get(position).title);
        holder.date.setText(mValues.get(position).date);
        if(mValues.get(position).checkBookmark){

            holder.imageTV.setVisibility(View.VISIBLE);

        }
        else{
            holder.imageTV.setVisibility(View.INVISIBLE);


        }
        holder.imageTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.GONE);
            }
        });
        holder.imageTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(position);
            }
        });
    }



        @Override
    public int getItemCount() {
        return mValues.size();
    }
//        holder.mItem = mValues.get(position);
//        holder.title.setText(mValues.get(position).title);
//        holder.date.setText(mValues.get(position).date);
//        if(mValues.get(position).checkBookmark){
//
//            holder.imageTV.setVisibility(View.VISIBLE);
//
//        }
//        else{
//            holder.imageTV.setVisibility(View.INVISIBLE);
//
//
//        }
//        holder.imageTV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                v.setVisibility(View.GONE);
//            }
//        });
//        holder.imageTV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.onNoteClick(position);
//            }
//        });
//    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;

//        public final TextView mContentView;
        public DummyItem mItem;
       // public  EditText title;
       public TextView title;
        public  TextView date;
        public final ImageView imageTV;


        public ViewHolder(View view) {
            super(view);
            mView = view;

        //    mContentView = (TextView) view.findViewById(R.id.content);
            date=view.findViewById(R.id.date);
            title=view.findViewById(R.id.title);
            imageTV=view.findViewById(R.id.ImageView);


            Calendar calendar=Calendar.getInstance();
            String currentDate= DateFormat.getDateInstance().format(calendar.getTime());
            date=(TextView) view.findViewById(R.id.date);
            date.setText(currentDate);
            //title.setText("Title");


        }

        @Override
        public String toString() {
          //   return super.toString() + " '" + mContentView.getText() + "'";
            return super.toString() + " '" + title.getText() + "'";
        }


    }
}