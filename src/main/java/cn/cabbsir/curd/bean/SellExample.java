package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSeidIsNull() {
            addCriterion("seid is null");
            return (Criteria) this;
        }

        public Criteria andSeidIsNotNull() {
            addCriterion("seid is not null");
            return (Criteria) this;
        }

        public Criteria andSeidEqualTo(Integer value) {
            addCriterion("seid =", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotEqualTo(Integer value) {
            addCriterion("seid <>", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidGreaterThan(Integer value) {
            addCriterion("seid >", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seid >=", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidLessThan(Integer value) {
            addCriterion("seid <", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidLessThanOrEqualTo(Integer value) {
            addCriterion("seid <=", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidIn(List<Integer> values) {
            addCriterion("seid in", values, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotIn(List<Integer> values) {
            addCriterion("seid not in", values, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidBetween(Integer value1, Integer value2) {
            addCriterion("seid between", value1, value2, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotBetween(Integer value1, Integer value2) {
            addCriterion("seid not between", value1, value2, "seid");
            return (Criteria) this;
        }

        public Criteria andSedateIsNull() {
            addCriterion("sedate is null");
            return (Criteria) this;
        }

        public Criteria andSedateIsNotNull() {
            addCriterion("sedate is not null");
            return (Criteria) this;
        }

        public Criteria andSedateEqualTo(Date value) {
            addCriterionForJDBCDate("sedate =", value, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sedate <>", value, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateGreaterThan(Date value) {
            addCriterionForJDBCDate("sedate >", value, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sedate >=", value, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateLessThan(Date value) {
            addCriterionForJDBCDate("sedate <", value, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sedate <=", value, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateIn(List<Date> values) {
            addCriterionForJDBCDate("sedate in", values, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sedate not in", values, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sedate between", value1, value2, "sedate");
            return (Criteria) this;
        }

        public Criteria andSedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sedate not between", value1, value2, "sedate");
            return (Criteria) this;
        }

        public Criteria andSesaleIsNull() {
            addCriterion("sesale is null");
            return (Criteria) this;
        }

        public Criteria andSesaleIsNotNull() {
            addCriterion("sesale is not null");
            return (Criteria) this;
        }

        public Criteria andSesaleEqualTo(Integer value) {
            addCriterion("sesale =", value, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleNotEqualTo(Integer value) {
            addCriterion("sesale <>", value, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleGreaterThan(Integer value) {
            addCriterion("sesale >", value, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("sesale >=", value, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleLessThan(Integer value) {
            addCriterion("sesale <", value, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleLessThanOrEqualTo(Integer value) {
            addCriterion("sesale <=", value, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleIn(List<Integer> values) {
            addCriterion("sesale in", values, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleNotIn(List<Integer> values) {
            addCriterion("sesale not in", values, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleBetween(Integer value1, Integer value2) {
            addCriterion("sesale between", value1, value2, "sesale");
            return (Criteria) this;
        }

        public Criteria andSesaleNotBetween(Integer value1, Integer value2) {
            addCriterion("sesale not between", value1, value2, "sesale");
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