package com.trilochan.newrecycleview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder>{


    Context mContext;
    List<Students> StudentList;
    public StudentsAdapter (Context mContext, List<Students> StudenList){

        this.mContext = mContext;
        this.StudentList = StudenList;
    }
    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_std, parent, false);

        return new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, final int position) {

        Students students = StudentList.get(position);
        holder.imageView.setImageResource(students.getImageid());
        holder.tvname.setText(students.getName());
        holder.tvage.setText(String.valueOf(students.getAge()));
        holder.tvaddress.setText(students.getAddress());
        holder.btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the clicked item label
                String itemLabel = String.valueOf(StudentList.get(position));
                StudentList.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position,StudentList.size());
                Toast.makeText(mContext,"Removed : " + itemLabel,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }

    public class StudentsViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvname, tvage, tvaddress;
        Button btndel;

        public StudentsViewHolder (@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.imgprofile);
            tvname = itemView.findViewById(R.id.txtName);
            tvaddress = itemView.findViewById(R.id.txtaddress);
            tvage=itemView.findViewById(R.id.txtage);
            btndel = itemView.findViewById(R.id.btnDel);
        }
    }

}
