package org.mheguevara.component;

/**
 * Created with IntelliJ IDEA.
 * User: muhammet
 * Date: 11/30/12
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Msisdn {

    private String id;
    private String type;
    private String msisdn;
    private String email;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @Override
    public String toString() {
        return "id=" + id + ",msisdn="+ msisdn;
    }
}
