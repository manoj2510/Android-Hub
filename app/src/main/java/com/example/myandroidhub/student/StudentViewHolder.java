package com.example.myandroidhub.student;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView mStudentName, mStudentSurname,mStudentMarks;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        mStudentName = itemView.findViewById(R.id.tv_student_name);
        mStudentSurname = itemView.findViewById(R.id.tv_student_surname);
        mStudentMarks = itemView.findViewById(R.id.tv_student_marks);
    }

}
