package com.meiya.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "GREEN_PICFLOW".
 */
public class GreenPicflow {

    private Long id;
    private String setid;
    private String picflow;

    public GreenPicflow() {
    }

    public GreenPicflow(Long id) {
        this.id = id;
    }

    public GreenPicflow(Long id, String setid, String picflow) {
        this.id = id;
        this.setid = setid;
        this.picflow = picflow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSetid() {
        return setid;
    }

    public void setSetid(String setid) {
        this.setid = setid;
    }

    public String getPicflow() {
        return picflow;
    }

    public void setPicflow(String picflow) {
        this.picflow = picflow;
    }

}
