package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSusernameIsNull() {
            addCriterion("susername is null");
            return (Criteria) this;
        }

        public Criteria andSusernameIsNotNull() {
            addCriterion("susername is not null");
            return (Criteria) this;
        }

        public Criteria andSusernameEqualTo(String value) {
            addCriterion("susername =", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotEqualTo(String value) {
            addCriterion("susername <>", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThan(String value) {
            addCriterion("susername >", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThanOrEqualTo(String value) {
            addCriterion("susername >=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThan(String value) {
            addCriterion("susername <", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThanOrEqualTo(String value) {
            addCriterion("susername <=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLike(String value) {
            addCriterion("susername like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotLike(String value) {
            addCriterion("susername not like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameIn(List<String> values) {
            addCriterion("susername in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotIn(List<String> values) {
            addCriterion("susername not in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameBetween(String value1, String value2) {
            addCriterion("susername between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotBetween(String value1, String value2) {
            addCriterion("susername not between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNull() {
            addCriterion("spassword is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNotNull() {
            addCriterion("spassword is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordEqualTo(String value) {
            addCriterion("spassword =", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotEqualTo(String value) {
            addCriterion("spassword <>", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThan(String value) {
            addCriterion("spassword >", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("spassword >=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThan(String value) {
            addCriterion("spassword <", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThanOrEqualTo(String value) {
            addCriterion("spassword <=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLike(String value) {
            addCriterion("spassword like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotLike(String value) {
            addCriterion("spassword not like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordIn(List<String> values) {
            addCriterion("spassword in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotIn(List<String> values) {
            addCriterion("spassword not in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordBetween(String value1, String value2) {
            addCriterion("spassword between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotBetween(String value1, String value2) {
            addCriterion("spassword not between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSlocationIsNull() {
            addCriterion("slocation is null");
            return (Criteria) this;
        }

        public Criteria andSlocationIsNotNull() {
            addCriterion("slocation is not null");
            return (Criteria) this;
        }

        public Criteria andSlocationEqualTo(String value) {
            addCriterion("slocation =", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotEqualTo(String value) {
            addCriterion("slocation <>", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationGreaterThan(String value) {
            addCriterion("slocation >", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationGreaterThanOrEqualTo(String value) {
            addCriterion("slocation >=", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationLessThan(String value) {
            addCriterion("slocation <", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationLessThanOrEqualTo(String value) {
            addCriterion("slocation <=", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationLike(String value) {
            addCriterion("slocation like", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotLike(String value) {
            addCriterion("slocation not like", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationIn(List<String> values) {
            addCriterion("slocation in", values, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotIn(List<String> values) {
            addCriterion("slocation not in", values, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationBetween(String value1, String value2) {
            addCriterion("slocation between", value1, value2, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotBetween(String value1, String value2) {
            addCriterion("slocation not between", value1, value2, "slocation");
            return (Criteria) this;
        }

        public Criteria andSrankIsNull() {
            addCriterion("srank is null");
            return (Criteria) this;
        }

        public Criteria andSrankIsNotNull() {
            addCriterion("srank is not null");
            return (Criteria) this;
        }

        public Criteria andSrankEqualTo(Integer value) {
            addCriterion("srank =", value, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankNotEqualTo(Integer value) {
            addCriterion("srank <>", value, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankGreaterThan(Integer value) {
            addCriterion("srank >", value, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("srank >=", value, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankLessThan(Integer value) {
            addCriterion("srank <", value, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankLessThanOrEqualTo(Integer value) {
            addCriterion("srank <=", value, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankIn(List<Integer> values) {
            addCriterion("srank in", values, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankNotIn(List<Integer> values) {
            addCriterion("srank not in", values, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankBetween(Integer value1, Integer value2) {
            addCriterion("srank between", value1, value2, "srank");
            return (Criteria) this;
        }

        public Criteria andSrankNotBetween(Integer value1, Integer value2) {
            addCriterion("srank not between", value1, value2, "srank");
            return (Criteria) this;
        }

        public Criteria andSphonenumberIsNull() {
            addCriterion("sphonenumber is null");
            return (Criteria) this;
        }

        public Criteria andSphonenumberIsNotNull() {
            addCriterion("sphonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andSphonenumberEqualTo(String value) {
            addCriterion("sphonenumber =", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberNotEqualTo(String value) {
            addCriterion("sphonenumber <>", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberGreaterThan(String value) {
            addCriterion("sphonenumber >", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("sphonenumber >=", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberLessThan(String value) {
            addCriterion("sphonenumber <", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberLessThanOrEqualTo(String value) {
            addCriterion("sphonenumber <=", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberLike(String value) {
            addCriterion("sphonenumber like", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberNotLike(String value) {
            addCriterion("sphonenumber not like", value, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberIn(List<String> values) {
            addCriterion("sphonenumber in", values, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberNotIn(List<String> values) {
            addCriterion("sphonenumber not in", values, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberBetween(String value1, String value2) {
            addCriterion("sphonenumber between", value1, value2, "sphonenumber");
            return (Criteria) this;
        }

        public Criteria andSphonenumberNotBetween(String value1, String value2) {
            addCriterion("sphonenumber not between", value1, value2, "sphonenumber");
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