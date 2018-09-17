package com.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * CN_USER
 * @author 
 */
@Table(name="XTMCS.CN_USER")
public class CnUserKey implements Serializable {
    @Id
    @GeneratedValue
    private String operid;

    @Id
    @GeneratedValue
    private BigDecimal bankid;

    private static final long serialVersionUID = 1L;

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid;
    }

    public BigDecimal getBankid() {
        return bankid;
    }

    public void setBankid(BigDecimal bankid) {
        this.bankid = bankid;
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
        CnUserKey other = (CnUserKey) that;
        return (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()))
            && (this.getBankid() == null ? other.getBankid() == null : this.getBankid().equals(other.getBankid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        result = prime * result + ((getBankid() == null) ? 0 : getBankid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operid=").append(operid);
        sb.append(", bankid=").append(bankid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}