package com.Kafka.Project.model;


public class UserEvent {
    private String user_id;
    private String app_version;
    private String device_type;
    private String ip;
    private String locale;
    private String device_id;
    private String timestamp;
    
    
    public UserEvent() {
    }
    public UserEvent(String user_id, String app_version, String device_type, String ip, String locale, String device_id,
            String timestamp) {
        this.user_id = user_id;
        this.app_version = app_version;
        this.device_type = device_type;
        this.ip = ip;
        this.locale = locale;
        this.device_id = device_id;
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "UserEvent [user_id=" + user_id + ", app_version=" + app_version + ", device_type=" + device_type
                + ", ip=" + ip + ", locale=" + locale + ", device_id=" + device_id + ", timestamp=" + timestamp + "]";
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getApp_version() {
        return app_version;
    }
    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }
    public String getDevice_type() {
        return device_type;
    }
    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getLocale() {
        return locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }
    public String getDevice_id() {
        return device_id;
    }
    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    
}
