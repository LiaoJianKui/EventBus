package com.example.administrator.eventbus;

/**
 * Created by Administrator on 2017/4/1.
 */

public class MyEvent {
    private String Msg;
    public MyEvent(String msg){
        this.Msg=msg;
    }
    public String getMsg(){
        return Msg;
    }
}
