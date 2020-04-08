package com.example.myandroidhub.student;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "student.db";
    public static final String TABLE_NAME = "student_table";
    public static final String ID = "ID";
    public static final String COLUMN_STUDENT_NAME = "studentName";
    public static final String COLUMN_STUDENT_SURNAME = "studentSurname";
    public static final String COLUMN_STUDENT_MARKS = "studentMarks";
    String TAG = "DatabaseHelper";
    Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, studentName TEXT, studentSurname TEXT,studentMarks INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String surname, String marks)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_STUDENT_NAME,name);
        contentValues.put(COLUMN_STUDENT_SURNAME,surname);
        contentValues.put(COLUMN_STUDENT_MARKS,marks);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean updateData(String id, String name, String surname, String marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_STUDENT_NAME, name);
        contentValues.put(COLUMN_STUDENT_SURNAME, surname);
        contentValues.put(COLUMN_STUDENT_MARKS, marks);
        int result = db.update(TABLE_NAME, contentValues, "ID=?", new String[]{id});
        if (result > 0)
            return true;
        else
            return false;
    }

    public int deleteData(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        int result = db.delete(TABLE_NAME,"ID=?",new String[]{id});
        return result;
    }

    public ArrayList<Student> displayAll()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("select * from "+TABLE_NAME,null);
//        if(data.getCount()==0)
//            toastMethod("No Data");

        ArrayList<Student> studentDetails = new ArrayList<>();
       // data.moveToFirst();
        while(data.moveToNext())
        {
            String id = data.getString(0);
            String name = data.getString(1);
            String surname = data.getString(2);
            String marks = data.getString(3);
            studentDetails.add(new Student(id,name,surname,marks));
            Log.d(TAG, "displayAll: "+studentDetails.get(0).getId());
        }
        return studentDetails;

    }
//    public void toastMethod(String text)
//    {
//        Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
//    }
}
