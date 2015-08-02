package com.jkxqj.qiandao.model;

import cn.bmob.v3.BmobObject;

/**
 * Created by JKXQJ on 2015/8/1.
 */
public class QianTui  extends BmobObject {
    private String id;
    private String account;
    private String realName;
    private String IP;
    private String MAC;
    private String TuiTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getTuiTime() {
        return TuiTime;
    }

    public void setTuiTime(String tuiTime) {
        TuiTime = tuiTime;
    }


}
