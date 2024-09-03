package org.example;

public class User {
    private Integer uid;
    private String name, last_name, MACaddr;

    public Integer getUid() {
        return uid;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getMACaddr() {
        return MACaddr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public User(Integer uid, String MAC){
        this.uid = uid;
        this.MACaddr = MAC;
    }

    @Override
    public String toString() {
        String user_info;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"uid\": ");
        sb.append(this.getUid());
        sb.append(",\"MAC\": \"");
        sb.append(this.getMACaddr());
        sb.append("\",\"name\":\"");
        sb.append(this.getName());
        sb.append(" ");
        sb.append(this.getLast_name());
        sb.append("\"}");
        user_info = sb.toString();
//        JSONObject
//        return super.toString();
        return user_info;
    }
}
