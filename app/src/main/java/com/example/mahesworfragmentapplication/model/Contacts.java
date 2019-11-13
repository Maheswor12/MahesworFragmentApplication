package com.example.mahesworfragmentapplication.model;

public class Contacts {
    private String name;
    private String phoneno;
    private int imageid;

    public Contacts(String name, String phoneno, int imageid) {
        this.name = name;
        this.phoneno = phoneno;
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
