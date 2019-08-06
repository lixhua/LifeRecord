package com.lxh.personal.common.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswodIsNull() {
            addCriterion("passwod is null");
            return (Criteria) this;
        }

        public Criteria andPasswodIsNotNull() {
            addCriterion("passwod is not null");
            return (Criteria) this;
        }

        public Criteria andPasswodEqualTo(String value) {
            addCriterion("passwod =", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodNotEqualTo(String value) {
            addCriterion("passwod <>", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodGreaterThan(String value) {
            addCriterion("passwod >", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodGreaterThanOrEqualTo(String value) {
            addCriterion("passwod >=", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodLessThan(String value) {
            addCriterion("passwod <", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodLessThanOrEqualTo(String value) {
            addCriterion("passwod <=", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodLike(String value) {
            addCriterion("passwod like", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodNotLike(String value) {
            addCriterion("passwod not like", value, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodIn(List<String> values) {
            addCriterion("passwod in", values, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodNotIn(List<String> values) {
            addCriterion("passwod not in", values, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodBetween(String value1, String value2) {
            addCriterion("passwod between", value1, value2, "passwod");
            return (Criteria) this;
        }

        public Criteria andPasswodNotBetween(String value1, String value2) {
            addCriterion("passwod not between", value1, value2, "passwod");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNull() {
            addCriterion("remarks1 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNotNull() {
            addCriterion("remarks1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks1EqualTo(String value) {
            addCriterion("remarks1 =", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotEqualTo(String value) {
            addCriterion("remarks1 <>", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThan(String value) {
            addCriterion("remarks1 >", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThanOrEqualTo(String value) {
            addCriterion("remarks1 >=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThan(String value) {
            addCriterion("remarks1 <", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThanOrEqualTo(String value) {
            addCriterion("remarks1 <=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Like(String value) {
            addCriterion("remarks1 like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotLike(String value) {
            addCriterion("remarks1 not like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1In(List<String> values) {
            addCriterion("remarks1 in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotIn(List<String> values) {
            addCriterion("remarks1 not in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Between(String value1, String value2) {
            addCriterion("remarks1 between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotBetween(String value1, String value2) {
            addCriterion("remarks1 not between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks2IsNull() {
            addCriterion("remarks2 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks2IsNotNull() {
            addCriterion("remarks2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks2EqualTo(String value) {
            addCriterion("remarks2 =", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotEqualTo(String value) {
            addCriterion("remarks2 <>", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2GreaterThan(String value) {
            addCriterion("remarks2 >", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2GreaterThanOrEqualTo(String value) {
            addCriterion("remarks2 >=", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2LessThan(String value) {
            addCriterion("remarks2 <", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2LessThanOrEqualTo(String value) {
            addCriterion("remarks2 <=", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2Like(String value) {
            addCriterion("remarks2 like", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotLike(String value) {
            addCriterion("remarks2 not like", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2In(List<String> values) {
            addCriterion("remarks2 in", values, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotIn(List<String> values) {
            addCriterion("remarks2 not in", values, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2Between(String value1, String value2) {
            addCriterion("remarks2 between", value1, value2, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotBetween(String value1, String value2) {
            addCriterion("remarks2 not between", value1, value2, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks3IsNull() {
            addCriterion("remarks3 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks3IsNotNull() {
            addCriterion("remarks3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks3EqualTo(String value) {
            addCriterion("remarks3 =", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotEqualTo(String value) {
            addCriterion("remarks3 <>", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3GreaterThan(String value) {
            addCriterion("remarks3 >", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3GreaterThanOrEqualTo(String value) {
            addCriterion("remarks3 >=", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3LessThan(String value) {
            addCriterion("remarks3 <", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3LessThanOrEqualTo(String value) {
            addCriterion("remarks3 <=", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3Like(String value) {
            addCriterion("remarks3 like", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotLike(String value) {
            addCriterion("remarks3 not like", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3In(List<String> values) {
            addCriterion("remarks3 in", values, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotIn(List<String> values) {
            addCriterion("remarks3 not in", values, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3Between(String value1, String value2) {
            addCriterion("remarks3 between", value1, value2, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotBetween(String value1, String value2) {
            addCriterion("remarks3 not between", value1, value2, "remarks3");
            return (Criteria) this;
        }
    }

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