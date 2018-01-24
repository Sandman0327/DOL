package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaterialOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialOrderExample() {
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

        public Criteria andMoidIsNull() {
            addCriterion("moid is null");
            return (Criteria) this;
        }

        public Criteria andMoidIsNotNull() {
            addCriterion("moid is not null");
            return (Criteria) this;
        }

        public Criteria andMoidEqualTo(Integer value) {
            addCriterion("moid =", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotEqualTo(Integer value) {
            addCriterion("moid <>", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThan(Integer value) {
            addCriterion("moid >", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moid >=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThan(Integer value) {
            addCriterion("moid <", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThanOrEqualTo(Integer value) {
            addCriterion("moid <=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidIn(List<Integer> values) {
            addCriterion("moid in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotIn(List<Integer> values) {
            addCriterion("moid not in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidBetween(Integer value1, Integer value2) {
            addCriterion("moid between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotBetween(Integer value1, Integer value2) {
            addCriterion("moid not between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andModateIsNull() {
            addCriterion("modate is null");
            return (Criteria) this;
        }

        public Criteria andModateIsNotNull() {
            addCriterion("modate is not null");
            return (Criteria) this;
        }

        public Criteria andModateEqualTo(Date value) {
            addCriterionForJDBCDate("modate =", value, "modate");
            return (Criteria) this;
        }

        public Criteria andModateNotEqualTo(Date value) {
            addCriterionForJDBCDate("modate <>", value, "modate");
            return (Criteria) this;
        }

        public Criteria andModateGreaterThan(Date value) {
            addCriterionForJDBCDate("modate >", value, "modate");
            return (Criteria) this;
        }

        public Criteria andModateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modate >=", value, "modate");
            return (Criteria) this;
        }

        public Criteria andModateLessThan(Date value) {
            addCriterionForJDBCDate("modate <", value, "modate");
            return (Criteria) this;
        }

        public Criteria andModateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modate <=", value, "modate");
            return (Criteria) this;
        }

        public Criteria andModateIn(List<Date> values) {
            addCriterionForJDBCDate("modate in", values, "modate");
            return (Criteria) this;
        }

        public Criteria andModateNotIn(List<Date> values) {
            addCriterionForJDBCDate("modate not in", values, "modate");
            return (Criteria) this;
        }

        public Criteria andModateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modate between", value1, value2, "modate");
            return (Criteria) this;
        }

        public Criteria andModateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modate not between", value1, value2, "modate");
            return (Criteria) this;
        }

        public Criteria andMoorderIsNull() {
            addCriterion("moorder is null");
            return (Criteria) this;
        }

        public Criteria andMoorderIsNotNull() {
            addCriterion("moorder is not null");
            return (Criteria) this;
        }

        public Criteria andMoorderEqualTo(Integer value) {
            addCriterion("moorder =", value, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderNotEqualTo(Integer value) {
            addCriterion("moorder <>", value, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderGreaterThan(Integer value) {
            addCriterion("moorder >", value, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("moorder >=", value, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderLessThan(Integer value) {
            addCriterion("moorder <", value, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderLessThanOrEqualTo(Integer value) {
            addCriterion("moorder <=", value, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderIn(List<Integer> values) {
            addCriterion("moorder in", values, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderNotIn(List<Integer> values) {
            addCriterion("moorder not in", values, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderBetween(Integer value1, Integer value2) {
            addCriterion("moorder between", value1, value2, "moorder");
            return (Criteria) this;
        }

        public Criteria andMoorderNotBetween(Integer value1, Integer value2) {
            addCriterion("moorder not between", value1, value2, "moorder");
            return (Criteria) this;
        }

        public Criteria andMostateIsNull() {
            addCriterion("mostate is null");
            return (Criteria) this;
        }

        public Criteria andMostateIsNotNull() {
            addCriterion("mostate is not null");
            return (Criteria) this;
        }

        public Criteria andMostateEqualTo(String value) {
            addCriterion("mostate =", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateNotEqualTo(String value) {
            addCriterion("mostate <>", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateGreaterThan(String value) {
            addCriterion("mostate >", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateGreaterThanOrEqualTo(String value) {
            addCriterion("mostate >=", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateLessThan(String value) {
            addCriterion("mostate <", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateLessThanOrEqualTo(String value) {
            addCriterion("mostate <=", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateLike(String value) {
            addCriterion("mostate like", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateNotLike(String value) {
            addCriterion("mostate not like", value, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateIn(List<String> values) {
            addCriterion("mostate in", values, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateNotIn(List<String> values) {
            addCriterion("mostate not in", values, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateBetween(String value1, String value2) {
            addCriterion("mostate between", value1, value2, "mostate");
            return (Criteria) this;
        }

        public Criteria andMostateNotBetween(String value1, String value2) {
            addCriterion("mostate not between", value1, value2, "mostate");
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