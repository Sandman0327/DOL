package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCusernameIsNull() {
            addCriterion("cusername is null");
            return (Criteria) this;
        }

        public Criteria andCusernameIsNotNull() {
            addCriterion("cusername is not null");
            return (Criteria) this;
        }

        public Criteria andCusernameEqualTo(String value) {
            addCriterion("cusername =", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotEqualTo(String value) {
            addCriterion("cusername <>", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameGreaterThan(String value) {
            addCriterion("cusername >", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameGreaterThanOrEqualTo(String value) {
            addCriterion("cusername >=", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameLessThan(String value) {
            addCriterion("cusername <", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameLessThanOrEqualTo(String value) {
            addCriterion("cusername <=", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameLike(String value) {
            addCriterion("cusername like", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotLike(String value) {
            addCriterion("cusername not like", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameIn(List<String> values) {
            addCriterion("cusername in", values, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotIn(List<String> values) {
            addCriterion("cusername not in", values, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameBetween(String value1, String value2) {
            addCriterion("cusername between", value1, value2, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotBetween(String value1, String value2) {
            addCriterion("cusername not between", value1, value2, "cusername");
            return (Criteria) this;
        }

        public Criteria andCpasswordIsNull() {
            addCriterion("cpassword is null");
            return (Criteria) this;
        }

        public Criteria andCpasswordIsNotNull() {
            addCriterion("cpassword is not null");
            return (Criteria) this;
        }

        public Criteria andCpasswordEqualTo(String value) {
            addCriterion("cpassword =", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotEqualTo(String value) {
            addCriterion("cpassword <>", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordGreaterThan(String value) {
            addCriterion("cpassword >", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cpassword >=", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordLessThan(String value) {
            addCriterion("cpassword <", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordLessThanOrEqualTo(String value) {
            addCriterion("cpassword <=", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordLike(String value) {
            addCriterion("cpassword like", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotLike(String value) {
            addCriterion("cpassword not like", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordIn(List<String> values) {
            addCriterion("cpassword in", values, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotIn(List<String> values) {
            addCriterion("cpassword not in", values, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordBetween(String value1, String value2) {
            addCriterion("cpassword between", value1, value2, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotBetween(String value1, String value2) {
            addCriterion("cpassword not between", value1, value2, "cpassword");
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