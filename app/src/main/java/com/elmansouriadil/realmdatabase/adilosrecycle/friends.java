package com.elmansouriadil.realmdatabase.adilosrecycle;

/**
 * Created by yeah on 4/22/2016.
 */
public class friends {

    public friends(String name,String note){
        this.name = name;
        this.note = note;

    }
    private String name;
    private String note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
