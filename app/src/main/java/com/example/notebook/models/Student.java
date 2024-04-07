package com.example.notebook.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.notebook.room.StudentDao;
@Entity(tableName = "students")
public class Student {
    @PrimaryKey(autoGenerate = true)
    long id;
    @ColumnInfo(name = "name_surname")
    private String name_surname;
    @ColumnInfo(name = "tel_number")
    private String tel_number;
    @ColumnInfo(name = "image",typeAffinity = ColumnInfo.BLOB)
    private byte[] image;
    @Ignore
    public Student(long id,String name_surname,String tel_number,byte[] image){
        this.id=id;
        this.name_surname=name_surname;
        this.tel_number=tel_number;
        this.image=image;
    }

    public Student(String name_surname,String tel_number,byte[] image){
        this.name_surname=name_surname;
        this.tel_number=tel_number;
        this.image=image;
    }

    public long getId() {
        return id;
    }

    public String getName_surname() {
        return name_surname;
    }

    public String getTel_number() {
        return tel_number;
    }

    public byte[] getImage() {
        return image;
    }

    public void setId(long id) {
        this.id = id;
    }

}
