package com.taotao.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUusernameIsNull() {
            addCriterion("uUsername is null");
            return (Criteria) this;
        }

        public Criteria andUusernameIsNotNull() {
            addCriterion("uUsername is not null");
            return (Criteria) this;
        }

        public Criteria andUusernameEqualTo(String value) {
            addCriterion("uUsername =", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotEqualTo(String value) {
            addCriterion("uUsername <>", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameGreaterThan(String value) {
            addCriterion("uUsername >", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameGreaterThanOrEqualTo(String value) {
            addCriterion("uUsername >=", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLessThan(String value) {
            addCriterion("uUsername <", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLessThanOrEqualTo(String value) {
            addCriterion("uUsername <=", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLike(String value) {
            addCriterion("uUsername like", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotLike(String value) {
            addCriterion("uUsername not like", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameIn(List<String> values) {
            addCriterion("uUsername in", values, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotIn(List<String> values) {
            addCriterion("uUsername not in", values, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameBetween(String value1, String value2) {
            addCriterion("uUsername between", value1, value2, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotBetween(String value1, String value2) {
            addCriterion("uUsername not between", value1, value2, "uusername");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("uPassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("uPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("uPassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("uPassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("uPassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("uPassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("uPassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("uPassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("uPassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("uPassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("uPassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("uPassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("uPassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("uPassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUaccessIsNull() {
            addCriterion("uAccess is null");
            return (Criteria) this;
        }

        public Criteria andUaccessIsNotNull() {
            addCriterion("uAccess is not null");
            return (Criteria) this;
        }

        public Criteria andUaccessEqualTo(String value) {
            addCriterion("uAccess =", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessNotEqualTo(String value) {
            addCriterion("uAccess <>", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessGreaterThan(String value) {
            addCriterion("uAccess >", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessGreaterThanOrEqualTo(String value) {
            addCriterion("uAccess >=", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessLessThan(String value) {
            addCriterion("uAccess <", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessLessThanOrEqualTo(String value) {
            addCriterion("uAccess <=", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessLike(String value) {
            addCriterion("uAccess like", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessNotLike(String value) {
            addCriterion("uAccess not like", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessIn(List<String> values) {
            addCriterion("uAccess in", values, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessNotIn(List<String> values) {
            addCriterion("uAccess not in", values, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessBetween(String value1, String value2) {
            addCriterion("uAccess between", value1, value2, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessNotBetween(String value1, String value2) {
            addCriterion("uAccess not between", value1, value2, "uaccess");
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