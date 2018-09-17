package com.mybatis.model;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * CN_USER
 * @author 
 */
@Table(name="XTMCS.CN_USER")
public class CnUser extends CnUserKey implements Serializable {
    private String instcode;

    private String opername;

    private String pass;

    private String passdate;

    private String department;

    private String type;

    private String sex;

    private String birth;

    private String certno;

    private String tel;

    private String email;

    private String address;

    private String status;

    private String staid;

    private String staname;

    private static final long serialVersionUID = 1L;

    public String getInstcode() {
        return instcode;
    }

    public void setInstcode(String instcode) {
        this.instcode = instcode;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPassdate() {
        return passdate;
    }

    public void setPassdate(String passdate) {
        this.passdate = passdate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStaid() {
        return staid;
    }

    public void setStaid(String staid) {
        this.staid = staid;
    }

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CnUser other = (CnUser) that;
        return (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()))
            && (this.getBankid() == null ? other.getBankid() == null : this.getBankid().equals(other.getBankid()))
            && (this.getInstcode() == null ? other.getInstcode() == null : this.getInstcode().equals(other.getInstcode()))
            && (this.getOpername() == null ? other.getOpername() == null : this.getOpername().equals(other.getOpername()))
            && (this.getPass() == null ? other.getPass() == null : this.getPass().equals(other.getPass()))
            && (this.getPassdate() == null ? other.getPassdate() == null : this.getPassdate().equals(other.getPassdate()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
            && (this.getCertno() == null ? other.getCertno() == null : this.getCertno().equals(other.getCertno()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStaid() == null ? other.getStaid() == null : this.getStaid().equals(other.getStaid()))
            && (this.getStaname() == null ? other.getStaname() == null : this.getStaname().equals(other.getStaname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        result = prime * result + ((getBankid() == null) ? 0 : getBankid().hashCode());
        result = prime * result + ((getInstcode() == null) ? 0 : getInstcode().hashCode());
        result = prime * result + ((getOpername() == null) ? 0 : getOpername().hashCode());
        result = prime * result + ((getPass() == null) ? 0 : getPass().hashCode());
        result = prime * result + ((getPassdate() == null) ? 0 : getPassdate().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getCertno() == null) ? 0 : getCertno().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStaid() == null) ? 0 : getStaid().hashCode());
        result = prime * result + ((getStaname() == null) ? 0 : getStaname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instcode=").append(instcode);
        sb.append(", opername=").append(opername);
        sb.append(", pass=").append(pass);
        sb.append(", passdate=").append(passdate);
        sb.append(", department=").append(department);
        sb.append(", type=").append(type);
        sb.append(", sex=").append(sex);
        sb.append(", birth=").append(birth);
        sb.append(", certno=").append(certno);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append(", staid=").append(staid);
        sb.append(", staname=").append(staname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}