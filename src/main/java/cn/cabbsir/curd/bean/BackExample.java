package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBdateIsNull() {
            addCriterion("bdate is null");
            return (Criteria) this;
        }

        public Criteria andBdateIsNotNull() {
            addCriterion("bdate is not null");
            return (Criteria) this;
        }

        public Criteria andBdateEqualTo(Date value) {
            addCriterionForJDBCDate("bdate =", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bdate <>", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThan(Date value) {
            addCriterionForJDBCDate("bdate >", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bdate >=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThan(Date value) {
            addCriterionForJDBCDate("bdate <", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bdate <=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateIn(List<Date> values) {
            addCriterionForJDBCDate("bdate in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bdate not in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bdate between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bdate not between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBsourceIsNull() {
            addCriterion("bsource is null");
            return (Criteria) this;
        }

        public Criteria andBsourceIsNotNull() {
            addCriterion("bsource is not null");
            return (Criteria) this;
        }

        public Criteria andBsourceEqualTo(String value) {
            addCriterion("bsource =", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceNotEqualTo(String value) {
            addCriterion("bsource <>", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceGreaterThan(String value) {
            addCriterion("bsource >", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceGreaterThanOrEqualTo(String value) {
            addCriterion("bsource >=", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceLessThan(String value) {
            addCriterion("bsource <", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceLessThanOrEqualTo(String value) {
            addCriterion("bsource <=", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceLike(String value) {
            addCriterion("bsource like", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceNotLike(String value) {
            addCriterion("bsource not like", value, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceIn(List<String> values) {
            addCriterion("bsource in", values, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceNotIn(List<String> values) {
            addCriterion("bsource not in", values, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceBetween(String value1, String value2) {
            addCriterion("bsource between", value1, value2, "bsource");
            return (Criteria) this;
        }

        public Criteria andBsourceNotBetween(String value1, String value2) {
            addCriterion("bsource not between", value1, value2, "bsource");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNull() {
            addCriterion("bmoney is null");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNotNull() {
            addCriterion("bmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBmoneyEqualTo(Integer value) {
            addCriterion("bmoney =", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotEqualTo(Integer value) {
            addCriterion("bmoney <>", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThan(Integer value) {
            addCriterion("bmoney >", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("bmoney >=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThan(Integer value) {
            addCriterion("bmoney <", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("bmoney <=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyIn(List<Integer> values) {
            addCriterion("bmoney in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotIn(List<Integer> values) {
            addCriterion("bmoney not in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyBetween(Integer value1, Integer value2) {
            addCriterion("bmoney between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("bmoney not between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBorder1IsNull() {
            addCriterion("border1 is null");
            return (Criteria) this;
        }

        public Criteria andBorder1IsNotNull() {
            addCriterion("border1 is not null");
            return (Criteria) this;
        }

        public Criteria andBorder1EqualTo(Integer value) {
            addCriterion("border1 =", value, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1NotEqualTo(Integer value) {
            addCriterion("border1 <>", value, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1GreaterThan(Integer value) {
            addCriterion("border1 >", value, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1GreaterThanOrEqualTo(Integer value) {
            addCriterion("border1 >=", value, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1LessThan(Integer value) {
            addCriterion("border1 <", value, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1LessThanOrEqualTo(Integer value) {
            addCriterion("border1 <=", value, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1In(List<Integer> values) {
            addCriterion("border1 in", values, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1NotIn(List<Integer> values) {
            addCriterion("border1 not in", values, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1Between(Integer value1, Integer value2) {
            addCriterion("border1 between", value1, value2, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder1NotBetween(Integer value1, Integer value2) {
            addCriterion("border1 not between", value1, value2, "border1");
            return (Criteria) this;
        }

        public Criteria andBorder2IsNull() {
            addCriterion("border2 is null");
            return (Criteria) this;
        }

        public Criteria andBorder2IsNotNull() {
            addCriterion("border2 is not null");
            return (Criteria) this;
        }

        public Criteria andBorder2EqualTo(Integer value) {
            addCriterion("border2 =", value, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2NotEqualTo(Integer value) {
            addCriterion("border2 <>", value, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2GreaterThan(Integer value) {
            addCriterion("border2 >", value, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2GreaterThanOrEqualTo(Integer value) {
            addCriterion("border2 >=", value, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2LessThan(Integer value) {
            addCriterion("border2 <", value, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2LessThanOrEqualTo(Integer value) {
            addCriterion("border2 <=", value, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2In(List<Integer> values) {
            addCriterion("border2 in", values, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2NotIn(List<Integer> values) {
            addCriterion("border2 not in", values, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2Between(Integer value1, Integer value2) {
            addCriterion("border2 between", value1, value2, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder2NotBetween(Integer value1, Integer value2) {
            addCriterion("border2 not between", value1, value2, "border2");
            return (Criteria) this;
        }

        public Criteria andBorder3IsNull() {
            addCriterion("border3 is null");
            return (Criteria) this;
        }

        public Criteria andBorder3IsNotNull() {
            addCriterion("border3 is not null");
            return (Criteria) this;
        }

        public Criteria andBorder3EqualTo(Integer value) {
            addCriterion("border3 =", value, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3NotEqualTo(Integer value) {
            addCriterion("border3 <>", value, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3GreaterThan(Integer value) {
            addCriterion("border3 >", value, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3GreaterThanOrEqualTo(Integer value) {
            addCriterion("border3 >=", value, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3LessThan(Integer value) {
            addCriterion("border3 <", value, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3LessThanOrEqualTo(Integer value) {
            addCriterion("border3 <=", value, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3In(List<Integer> values) {
            addCriterion("border3 in", values, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3NotIn(List<Integer> values) {
            addCriterion("border3 not in", values, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3Between(Integer value1, Integer value2) {
            addCriterion("border3 between", value1, value2, "border3");
            return (Criteria) this;
        }

        public Criteria andBorder3NotBetween(Integer value1, Integer value2) {
            addCriterion("border3 not between", value1, value2, "border3");
            return (Criteria) this;
        }

        public Criteria andBstateIsNull() {
            addCriterion("bstate is null");
            return (Criteria) this;
        }

        public Criteria andBstateIsNotNull() {
            addCriterion("bstate is not null");
            return (Criteria) this;
        }

        public Criteria andBstateEqualTo(String value) {
            addCriterion("bstate =", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotEqualTo(String value) {
            addCriterion("bstate <>", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateGreaterThan(String value) {
            addCriterion("bstate >", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateGreaterThanOrEqualTo(String value) {
            addCriterion("bstate >=", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLessThan(String value) {
            addCriterion("bstate <", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLessThanOrEqualTo(String value) {
            addCriterion("bstate <=", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLike(String value) {
            addCriterion("bstate like", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotLike(String value) {
            addCriterion("bstate not like", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateIn(List<String> values) {
            addCriterion("bstate in", values, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotIn(List<String> values) {
            addCriterion("bstate not in", values, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateBetween(String value1, String value2) {
            addCriterion("bstate between", value1, value2, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotBetween(String value1, String value2) {
            addCriterion("bstate not between", value1, value2, "bstate");
            return (Criteria) this;
        }

        public Criteria andBsidIsNull() {
            addCriterion("bsid is null");
            return (Criteria) this;
        }

        public Criteria andBsidIsNotNull() {
            addCriterion("bsid is not null");
            return (Criteria) this;
        }

        public Criteria andBsidEqualTo(Integer value) {
            addCriterion("bsid =", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotEqualTo(Integer value) {
            addCriterion("bsid <>", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThan(Integer value) {
            addCriterion("bsid >", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bsid >=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThan(Integer value) {
            addCriterion("bsid <", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThanOrEqualTo(Integer value) {
            addCriterion("bsid <=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidIn(List<Integer> values) {
            addCriterion("bsid in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotIn(List<Integer> values) {
            addCriterion("bsid not in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidBetween(Integer value1, Integer value2) {
            addCriterion("bsid between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotBetween(Integer value1, Integer value2) {
            addCriterion("bsid not between", value1, value2, "bsid");
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