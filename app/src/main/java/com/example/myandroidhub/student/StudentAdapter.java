package com.example.myandroidhub.student;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private ArrayList<Student> students = new ArrayList<>();

    public StudentAdapter(ArrayList<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_student_recycler,null);
        StudentViewHolder studentViewHolder = new StudentViewHolder(view);
        return studentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.mStudentName.setText(students.get(position).getName());
        holder.mStudentSurname.setText(students.get(position).getSurname());
        holder.mStudentMarks.setText(students.get(position).getMarks());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
