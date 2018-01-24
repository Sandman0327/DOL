package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMbeginIsNull() {
            addCriterion("mbegin is null");
            return (Criteria) this;
        }

        public Criteria andMbeginIsNotNull() {
            addCriterion("mbegin is not null");
            return (Criteria) this;
        }

        public Criteria andMbeginEqualTo(Date value) {
            addCriterionForJDBCDate("mbegin =", value, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("mbegin <>", value, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginGreaterThan(Date value) {
            addCriterionForJDBCDate("mbegin >", value, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mbegin >=", value, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginLessThan(Date value) {
            addCriterionForJDBCDate("mbegin <", value, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mbegin <=", value, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginIn(List<Date> values) {
            addCriterionForJDBCDate("mbegin in", values, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("mbegin not in", values, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mbegin between", value1, value2, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMbeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mbegin not between", value1, value2, "mbegin");
            return (Criteria) this;
        }

        public Criteria andMendIsNull() {
            addCriterion("mend is null");
            return (Criteria) this;
        }

        public Criteria andMendIsNotNull() {
            addCriterion("mend is not null");
            return (Criteria) this;
        }

        public Criteria andMendEqualTo(Date value) {
            addCriterionForJDBCDate("mend =", value, "mend");
            return (Criteria) this;
        }

        public Criteria andMendNotEqualTo(Date value) {
            addCriterionForJDBCDate("mend <>", value, "mend");
            return (Criteria) this;
        }

        public Criteria andMendGreaterThan(Date value) {
            addCriterionForJDBCDate("mend >", value, "mend");
            return (Criteria) this;
        }

        public Criteria andMendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mend >=", value, "mend");
            return (Criteria) this;
        }

        public Criteria andMendLessThan(Date value) {
            addCriterionForJDBCDate("mend <", value, "mend");
            return (Criteria) this;
        }

        public Criteria andMendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mend <=", value, "mend");
            return (Criteria) this;
        }

        public Criteria andMendIn(List<Date> values) {
            addCriterionForJDBCDate("mend in", values, "mend");
            return (Criteria) this;
        }

        public Criteria andMendNotIn(List<Date> values) {
            addCriterionForJDBCDate("mend not in", values, "mend");
            return (Criteria) this;
        }

        public Criteria andMendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mend between", value1, value2, "mend");
            return (Criteria) this;
        }

        public Criteria andMendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mend not between", value1, value2, "mend");
            return (Criteria) this;
        }

        public Criteria andMstateIsNull() {
            addCriterion("mstate is null");
            return (Criteria) this;
        }

        public Criteria andMstateIsNotNull() {
            addCriterion("mstate is not null");
            return (Criteria) this;
        }

        public Criteria andMstateEqualTo(String value) {
            addCriterion("mstate =", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotEqualTo(String value) {
            addCriterion("mstate <>", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThan(String value) {
            addCriterion("mstate >", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThanOrEqualTo(String value) {
            addCriterion("mstate >=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThan(String value) {
            addCriterion("mstate <", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThanOrEqualTo(String value) {
            addCriterion("mstate <=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLike(String value) {
            addCriterion("mstate like", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotLike(String value) {
            addCriterion("mstate not like", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateIn(List<String> values) {
            addCriterion("mstate in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotIn(List<String> values) {
            addCriterion("mstate not in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateBetween(String value1, String value2) {
            addCriterion("mstate between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotBetween(String value1, String value2) {
            addCriterion("mstate not between", value1, value2, "mstate");
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