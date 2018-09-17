package com.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class CnUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOperidIsNull() {
            addCriterion("OPERID is null");
            return (Criteria) this;
        }

        public Criteria andOperidIsNotNull() {
            addCriterion("OPERID is not null");
            return (Criteria) this;
        }

        public Criteria andOperidEqualTo(String value) {
            addCriterion("OPERID =", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotEqualTo(String value) {
            addCriterion("OPERID <>", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThan(String value) {
            addCriterion("OPERID >", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThanOrEqualTo(String value) {
            addCriterion("OPERID >=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThan(String value) {
            addCriterion("OPERID <", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThanOrEqualTo(String value) {
            addCriterion("OPERID <=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLike(String value) {
            addCriterion("OPERID like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotLike(String value) {
            addCriterion("OPERID not like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidIn(List<String> values) {
            addCriterion("OPERID in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotIn(List<String> values) {
            addCriterion("OPERID not in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidBetween(String value1, String value2) {
            addCriterion("OPERID between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotBetween(String value1, String value2) {
            addCriterion("OPERID not between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("BANKID is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("BANKID is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(BigDecimal value) {
            addCriterion("BANKID =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(BigDecimal value) {
            addCriterion("BANKID <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(BigDecimal value) {
            addCriterion("BANKID >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKID >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(BigDecimal value) {
            addCriterion("BANKID <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKID <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<BigDecimal> values) {
            addCriterion("BANKID in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<BigDecimal> values) {
            addCriterion("BANKID not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKID between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKID not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andInstcodeIsNull() {
            addCriterion("INSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andInstcodeIsNotNull() {
            addCriterion("INSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInstcodeEqualTo(String value) {
            addCriterion("INSTCODE =", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeNotEqualTo(String value) {
            addCriterion("INSTCODE <>", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeGreaterThan(String value) {
            addCriterion("INSTCODE >", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSTCODE >=", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeLessThan(String value) {
            addCriterion("INSTCODE <", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeLessThanOrEqualTo(String value) {
            addCriterion("INSTCODE <=", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeLike(String value) {
            addCriterion("INSTCODE like", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeNotLike(String value) {
            addCriterion("INSTCODE not like", value, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeIn(List<String> values) {
            addCriterion("INSTCODE in", values, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeNotIn(List<String> values) {
            addCriterion("INSTCODE not in", values, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeBetween(String value1, String value2) {
            addCriterion("INSTCODE between", value1, value2, "instcode");
            return (Criteria) this;
        }

        public Criteria andInstcodeNotBetween(String value1, String value2) {
            addCriterion("INSTCODE not between", value1, value2, "instcode");
            return (Criteria) this;
        }

        public Criteria andOpernameIsNull() {
            addCriterion("OPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpernameIsNotNull() {
            addCriterion("OPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpernameEqualTo(String value) {
            addCriterion("OPERNAME =", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotEqualTo(String value) {
            addCriterion("OPERNAME <>", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameGreaterThan(String value) {
            addCriterion("OPERNAME >", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERNAME >=", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLessThan(String value) {
            addCriterion("OPERNAME <", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLessThanOrEqualTo(String value) {
            addCriterion("OPERNAME <=", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLike(String value) {
            addCriterion("OPERNAME like", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotLike(String value) {
            addCriterion("OPERNAME not like", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameIn(List<String> values) {
            addCriterion("OPERNAME in", values, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotIn(List<String> values) {
            addCriterion("OPERNAME not in", values, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameBetween(String value1, String value2) {
            addCriterion("OPERNAME between", value1, value2, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotBetween(String value1, String value2) {
            addCriterion("OPERNAME not between", value1, value2, "opername");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("PASS is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("PASS is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("PASS =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("PASS <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("PASS >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("PASS >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("PASS <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("PASS <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("PASS like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("PASS not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("PASS in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("PASS not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("PASS between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("PASS not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassdateIsNull() {
            addCriterion("PASSDATE is null");
            return (Criteria) this;
        }

        public Criteria andPassdateIsNotNull() {
            addCriterion("PASSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPassdateEqualTo(String value) {
            addCriterion("PASSDATE =", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateNotEqualTo(String value) {
            addCriterion("PASSDATE <>", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateGreaterThan(String value) {
            addCriterion("PASSDATE >", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateGreaterThanOrEqualTo(String value) {
            addCriterion("PASSDATE >=", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateLessThan(String value) {
            addCriterion("PASSDATE <", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateLessThanOrEqualTo(String value) {
            addCriterion("PASSDATE <=", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateLike(String value) {
            addCriterion("PASSDATE like", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateNotLike(String value) {
            addCriterion("PASSDATE not like", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateIn(List<String> values) {
            addCriterion("PASSDATE in", values, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateNotIn(List<String> values) {
            addCriterion("PASSDATE not in", values, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateBetween(String value1, String value2) {
            addCriterion("PASSDATE between", value1, value2, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateNotBetween(String value1, String value2) {
            addCriterion("PASSDATE not between", value1, value2, "passdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`TYPE` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`TYPE` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`TYPE` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`TYPE` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`TYPE` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`TYPE` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`TYPE` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`TYPE` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`TYPE` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`TYPE` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`TYPE` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`TYPE` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`TYPE` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`TYPE` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(String value) {
            addCriterion("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(String value) {
            addCriterion("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(String value) {
            addCriterion("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(String value) {
            addCriterion("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(String value) {
            addCriterion("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLike(String value) {
            addCriterion("BIRTH like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotLike(String value) {
            addCriterion("BIRTH not like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<String> values) {
            addCriterion("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<String> values) {
            addCriterion("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(String value1, String value2) {
            addCriterion("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(String value1, String value2) {
            addCriterion("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNull() {
            addCriterion("CERTNO is null");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNotNull() {
            addCriterion("CERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCertnoEqualTo(String value) {
            addCriterion("CERTNO =", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotEqualTo(String value) {
            addCriterion("CERTNO <>", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThan(String value) {
            addCriterion("CERTNO >", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTNO >=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThan(String value) {
            addCriterion("CERTNO <", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThanOrEqualTo(String value) {
            addCriterion("CERTNO <=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLike(String value) {
            addCriterion("CERTNO like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotLike(String value) {
            addCriterion("CERTNO not like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoIn(List<String> values) {
            addCriterion("CERTNO in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotIn(List<String> values) {
            addCriterion("CERTNO not in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoBetween(String value1, String value2) {
            addCriterion("CERTNO between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotBetween(String value1, String value2) {
            addCriterion("CERTNO not between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`STATUS` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`STATUS` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStaidIsNull() {
            addCriterion("STAID is null");
            return (Criteria) this;
        }

        public Criteria andStaidIsNotNull() {
            addCriterion("STAID is not null");
            return (Criteria) this;
        }

        public Criteria andStaidEqualTo(String value) {
            addCriterion("STAID =", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotEqualTo(String value) {
            addCriterion("STAID <>", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThan(String value) {
            addCriterion("STAID >", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThanOrEqualTo(String value) {
            addCriterion("STAID >=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThan(String value) {
            addCriterion("STAID <", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThanOrEqualTo(String value) {
            addCriterion("STAID <=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLike(String value) {
            addCriterion("STAID like", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotLike(String value) {
            addCriterion("STAID not like", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidIn(List<String> values) {
            addCriterion("STAID in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotIn(List<String> values) {
            addCriterion("STAID not in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidBetween(String value1, String value2) {
            addCriterion("STAID between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotBetween(String value1, String value2) {
            addCriterion("STAID not between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andStanameIsNull() {
            addCriterion("STANAME is null");
            return (Criteria) this;
        }

        public Criteria andStanameIsNotNull() {
            addCriterion("STANAME is not null");
            return (Criteria) this;
        }

        public Criteria andStanameEqualTo(String value) {
            addCriterion("STANAME =", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotEqualTo(String value) {
            addCriterion("STANAME <>", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThan(String value) {
            addCriterion("STANAME >", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThanOrEqualTo(String value) {
            addCriterion("STANAME >=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThan(String value) {
            addCriterion("STANAME <", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThanOrEqualTo(String value) {
            addCriterion("STANAME <=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLike(String value) {
            addCriterion("STANAME like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotLike(String value) {
            addCriterion("STANAME not like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameIn(List<String> values) {
            addCriterion("STANAME in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotIn(List<String> values) {
            addCriterion("STANAME not in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameBetween(String value1, String value2) {
            addCriterion("STANAME between", value1, value2, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotBetween(String value1, String value2) {
            addCriterion("STANAME not between", value1, value2, "staname");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}