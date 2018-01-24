package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionExample() {
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

        public Criteria andPoidIsNull() {
            addCriterion("poid is null");
            return (Criteria) this;
        }

        public Criteria andPoidIsNotNull() {
            addCriterion("poid is not null");
            return (Criteria) this;
        }

        public Criteria andPoidEqualTo(Integer value) {
            addCriterion("poid =", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotEqualTo(Integer value) {
            addCriterion("poid <>", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThan(Integer value) {
            addCriterion("poid >", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("poid >=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThan(Integer value) {
            addCriterion("poid <", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThanOrEqualTo(Integer value) {
            addCriterion("poid <=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidIn(List<Integer> values) {
            addCriterion("poid in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotIn(List<Integer> values) {
            addCriterion("poid not in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidBetween(Integer value1, Integer value2) {
            addCriterion("poid between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotBetween(Integer value1, Integer value2) {
            addCriterion("poid not between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andPosidIsNull() {
            addCriterion("posid is null");
            return (Criteria) this;
        }

        public Criteria andPosidIsNotNull() {
            addCriterion("posid is not null");
            return (Criteria) this;
        }

        public Criteria andPosidEqualTo(Integer value) {
            addCriterion("posid =", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotEqualTo(Integer value) {
            addCriterion("posid <>", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThan(Integer value) {
            addCriterion("posid >", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThanOrEqualTo(Integer value) {
            addCriterion("posid >=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThan(Integer value) {
            addCriterion("posid <", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThanOrEqualTo(Integer value) {
            addCriterion("posid <=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidIn(List<Integer> values) {
            addCriterion("posid in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotIn(List<Integer> values) {
            addCriterion("posid not in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidBetween(Integer value1, Integer value2) {
            addCriterion("posid between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotBetween(Integer value1, Integer value2) {
            addCriterion("posid not between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andPodateIsNull() {
            addCriterion("podate is null");
            return (Criteria) this;
        }

        public Criteria andPodateIsNotNull() {
            addCriterion("podate is not null");
            return (Criteria) this;
        }

        public Criteria andPodateEqualTo(Date value) {
            addCriterionForJDBCDate("podate =", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateNotEqualTo(Date value) {
            addCriterionForJDBCDate("podate <>", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateGreaterThan(Date value) {
            addCriterionForJDBCDate("podate >", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("podate >=", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateLessThan(Date value) {
            addCriterionForJDBCDate("podate <", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("podate <=", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateIn(List<Date> values) {
            addCriterionForJDBCDate("podate in", values, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateNotIn(List<Date> values) {
            addCriterionForJDBCDate("podate not in", values, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("podate between", value1, value2, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("podate not between", value1, value2, "podate");
            return (Criteria) this;
        }

        public Criteria andPomoneyIsNull() {
            addCriterion("pomoney is null");
            return (Criteria) this;
        }

        public Criteria andPomoneyIsNotNull() {
            addCriterion("pomoney is not null");
            return (Criteria) this;
        }

        public Criteria andPomoneyEqualTo(Integer value) {
            addCriterion("pomoney =", value, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyNotEqualTo(Integer value) {
            addCriterion("pomoney <>", value, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyGreaterThan(Integer value) {
            addCriterion("pomoney >", value, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pomoney >=", value, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyLessThan(Integer value) {
            addCriterion("pomoney <", value, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyLessThanOrEqualTo(Integer value) {
            addCriterion("pomoney <=", value, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyIn(List<Integer> values) {
            addCriterion("pomoney in", values, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyNotIn(List<Integer> values) {
            addCriterion("pomoney not in", values, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyBetween(Integer value1, Integer value2) {
            addCriterion("pomoney between", value1, value2, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPomoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("pomoney not between", value1, value2, "pomoney");
            return (Criteria) this;
        }

        public Criteria andPoorder1IsNull() {
            addCriterion("poorder1 is null");
            return (Criteria) this;
        }

        public Criteria andPoorder1IsNotNull() {
            addCriterion("poorder1 is not null");
            return (Criteria) this;
        }

        public Criteria andPoorder1EqualTo(Integer value) {
            addCriterion("poorder1 =", value, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1NotEqualTo(Integer value) {
            addCriterion("poorder1 <>", value, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1GreaterThan(Integer value) {
            addCriterion("poorder1 >", value, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1GreaterThanOrEqualTo(Integer value) {
            addCriterion("poorder1 >=", value, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1LessThan(Integer value) {
            addCriterion("poorder1 <", value, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1LessThanOrEqualTo(Integer value) {
            addCriterion("poorder1 <=", value, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1In(List<Integer> values) {
            addCriterion("poorder1 in", values, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1NotIn(List<Integer> values) {
            addCriterion("poorder1 not in", values, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1Between(Integer value1, Integer value2) {
            addCriterion("poorder1 between", value1, value2, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder1NotBetween(Integer value1, Integer value2) {
            addCriterion("poorder1 not between", value1, value2, "poorder1");
            return (Criteria) this;
        }

        public Criteria andPoorder2IsNull() {
            addCriterion("poorder2 is null");
            return (Criteria) this;
        }

        public Criteria andPoorder2IsNotNull() {
            addCriterion("poorder2 is not null");
            return (Criteria) this;
        }

        public Criteria andPoorder2EqualTo(Integer value) {
            addCriterion("poorder2 =", value, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2NotEqualTo(Integer value) {
            addCriterion("poorder2 <>", value, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2GreaterThan(Integer value) {
            addCriterion("poorder2 >", value, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2GreaterThanOrEqualTo(Integer value) {
            addCriterion("poorder2 >=", value, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2LessThan(Integer value) {
            addCriterion("poorder2 <", value, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2LessThanOrEqualTo(Integer value) {
            addCriterion("poorder2 <=", value, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2In(List<Integer> values) {
            addCriterion("poorder2 in", values, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2NotIn(List<Integer> values) {
            addCriterion("poorder2 not in", values, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2Between(Integer value1, Integer value2) {
            addCriterion("poorder2 between", value1, value2, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder2NotBetween(Integer value1, Integer value2) {
            addCriterion("poorder2 not between", value1, value2, "poorder2");
            return (Criteria) this;
        }

        public Criteria andPoorder3IsNull() {
            addCriterion("poorder3 is null");
            return (Criteria) this;
        }

        public Criteria andPoorder3IsNotNull() {
            addCriterion("poorder3 is not null");
            return (Criteria) this;
        }

        public Criteria andPoorder3EqualTo(Integer value) {
            addCriterion("poorder3 =", value, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3NotEqualTo(Integer value) {
            addCriterion("poorder3 <>", value, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3GreaterThan(Integer value) {
            addCriterion("poorder3 >", value, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3GreaterThanOrEqualTo(Integer value) {
            addCriterion("poorder3 >=", value, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3LessThan(Integer value) {
            addCriterion("poorder3 <", value, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3LessThanOrEqualTo(Integer value) {
            addCriterion("poorder3 <=", value, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3In(List<Integer> values) {
            addCriterion("poorder3 in", values, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3NotIn(List<Integer> values) {
            addCriterion("poorder3 not in", values, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3Between(Integer value1, Integer value2) {
            addCriterion("poorder3 between", value1, value2, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPoorder3NotBetween(Integer value1, Integer value2) {
            addCriterion("poorder3 not between", value1, value2, "poorder3");
            return (Criteria) this;
        }

        public Criteria andPostateIsNull() {
            addCriterion("postate is null");
            return (Criteria) this;
        }

        public Criteria andPostateIsNotNull() {
            addCriterion("postate is not null");
            return (Criteria) this;
        }

        public Criteria andPostateEqualTo(String value) {
            addCriterion("postate =", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateNotEqualTo(String value) {
            addCriterion("postate <>", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateGreaterThan(String value) {
            addCriterion("postate >", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateGreaterThanOrEqualTo(String value) {
            addCriterion("postate >=", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateLessThan(String value) {
            addCriterion("postate <", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateLessThanOrEqualTo(String value) {
            addCriterion("postate <=", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateLike(String value) {
            addCriterion("postate like", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateNotLike(String value) {
            addCriterion("postate not like", value, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateIn(List<String> values) {
            addCriterion("postate in", values, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateNotIn(List<String> values) {
            addCriterion("postate not in", values, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateBetween(String value1, String value2) {
            addCriterion("postate between", value1, value2, "postate");
            return (Criteria) this;
        }

        public Criteria andPostateNotBetween(String value1, String value2) {
            addCriterion("postate not between", value1, value2, "postate");
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