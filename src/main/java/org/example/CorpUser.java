package org.example;

public class CorpUser extends User{

    private String department;

    public CorpUser(Integer uid, String MAC) {
        super(uid, MAC);
    }

    public void setDepartment(String dep){
        this.department = dep;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        String a =  super.toString();
        StringBuilder sb = new StringBuilder(a);
        sb.insert(a.indexOf("\"name\""), ("\"department\":\""+this.getDepartment()+"\","));
        return sb.toString();
    }
}
