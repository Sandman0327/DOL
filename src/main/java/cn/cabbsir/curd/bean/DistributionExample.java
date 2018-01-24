package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DistributionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributionExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDdateIsNull() {
            addCriterion("ddate is null");
            return (Criteria) this;
        }

        public Criteria andDdateIsNotNull() {
            addCriterion("ddate is not null");
            return (Criteria) this;
        }

        public Criteria andDdateEqualTo(Date value) {
            addCriterionForJDBCDate("ddate =", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ddate <>", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ddate >", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ddate >=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThan(Date value) {
            addCriterionForJDBCDate("ddate <", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ddate <=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateIn(List<Date> values) {
            addCriterionForJDBCDate("ddate in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ddate not in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ddate between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ddate not between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDmoneyIsNull() {
            addCriterion("dmoney is null");
            return (Criteria) this;
        }

        public Criteria andDmoneyIsNotNull() {
            addCriterion("dmoney is not null");
            return (Criteria) this;
        }

        public Criteria andDmoneyEqualTo(Integer value) {
            addCriterion("dmoney =", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyNotEqualTo(Integer value) {
            addCriterion("dmoney <>", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyGreaterThan(Integer value) {
            addCriterion("dmoney >", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("dmoney >=", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyLessThan(Integer value) {
            addCriterion("dmoney <", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("dmoney <=", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyIn(List<Integer> values) {
            addCriterion("dmoney in", values, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyNotIn(List<Integer> values) {
            addCriterion("dmoney not in", values, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyBetween(Integer value1, Integer value2) {
            addCriterion("dmoney between", value1, value2, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("dmoney not between", value1, value2, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDorder1IsNull() {
            addCriterion("dorder1 is null");
            return (Criteria) this;
        }

        public Criteria andDorder1IsNotNull() {
            addCriterion("dorder1 is not null");
            return (Criteria) this;
        }

        public Criteria andDorder1EqualTo(Integer value) {
            addCriterion("dorder1 =", value, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1NotEqualTo(Integer value) {
            addCriterion("dorder1 <>", value, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1GreaterThan(Integer value) {
            addCriterion("dorder1 >", value, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1GreaterThanOrEqualTo(Integer value) {
            addCriterion("dorder1 >=", value, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1LessThan(Integer value) {
            addCriterion("dorder1 <", value, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1LessThanOrEqualTo(Integer value) {
            addCriterion("dorder1 <=", value, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1In(List<Integer> values) {
            addCriterion("dorder1 in", values, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1NotIn(List<Integer> values) {
            addCriterion("dorder1 not in", values, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1Between(Integer value1, Integer value2) {
            addCriterion("dorder1 between", value1, value2, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder1NotBetween(Integer value1, Integer value2) {
            addCriterion("dorder1 not between", value1, value2, "dorder1");
            return (Criteria) this;
        }

        public Criteria andDorder2IsNull() {
            addCriterion("dorder2 is null");
            return (Criteria) this;
        }

        public Criteria andDorder2IsNotNull() {
            addCriterion("dorder2 is not null");
            return (Criteria) this;
        }

        public Criteria andDorder2EqualTo(Integer value) {
            addCriterion("dorder2 =", value, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2NotEqualTo(Integer value) {
            addCriterion("dorder2 <>", value, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2GreaterThan(Integer value) {
            addCriterion("dorder2 >", value, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2GreaterThanOrEqualTo(Integer value) {
            addCriterion("dorder2 >=", value, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2LessThan(Integer value) {
            addCriterion("dorder2 <", value, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2LessThanOrEqualTo(Integer value) {
            addCriterion("dorder2 <=", value, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2In(List<Integer> values) {
            addCriterion("dorder2 in", values, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2NotIn(List<Integer> values) {
            addCriterion("dorder2 not in", values, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2Between(Integer value1, Integer value2) {
            addCriterion("dorder2 between", value1, value2, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder2NotBetween(Integer value1, Integer value2) {
            addCriterion("dorder2 not between", value1, value2, "dorder2");
            return (Criteria) this;
        }

        public Criteria andDorder3IsNull() {
            addCriterion("dorder3 is null");
            return (Criteria) this;
        }

        public Criteria andDorder3IsNotNull() {
            addCriterion("dorder3 is not null");
            return (Criteria) this;
        }

        public Criteria andDorder3EqualTo(Integer value) {
            addCriterion("dorder3 =", value, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3NotEqualTo(Integer value) {
            addCriterion("dorder3 <>", value, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3GreaterThan(Integer value) {
            addCriterion("dorder3 >", value, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3GreaterThanOrEqualTo(Integer value) {
            addCriterion("dorder3 >=", value, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3LessThan(Integer value) {
            addCriterion("dorder3 <", value, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3LessThanOrEqualTo(Integer value) {
            addCriterion("dorder3 <=", value, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3In(List<Integer> values) {
            addCriterion("dorder3 in", values, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3NotIn(List<Integer> values) {
            addCriterion("dorder3 not in", values, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3Between(Integer value1, Integer value2) {
            addCriterion("dorder3 between", value1, value2, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDorder3NotBetween(Integer value1, Integer value2) {
            addCriterion("dorder3 not between", value1, value2, "dorder3");
            return (Criteria) this;
        }

        public Criteria andDstateIsNull() {
            addCriterion("dstate is null");
            return (Criteria) this;
        }

        public Criteria andDstateIsNotNull() {
            addCriterion("dstate is not null");
            return (Criteria) this;
        }

        public Criteria andDstateEqualTo(String value) {
            addCriterion("dstate =", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotEqualTo(String value) {
            addCriterion("dstate <>", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThan(String value) {
            addCriterion("dstate >", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThanOrEqualTo(String value) {
            addCriterion("dstate >=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThan(String value) {
            addCriterion("dstate <", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThanOrEqualTo(String value) {
            addCriterion("dstate <=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLike(String value) {
            addCriterion("dstate like", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotLike(String value) {
            addCriterion("dstate not like", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateIn(List<String> values) {
            addCriterion("dstate in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotIn(List<String> values) {
            addCriterion("dstate not in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateBetween(String value1, String value2) {
            addCriterion("dstate between", value1, value2, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotBetween(String value1, String value2) {
            addCriterion("dstate not between", value1, value2, "dstate");
            return (Criteria) this;
        }

        public Criteria andDlocationIsNull() {
            addCriterion("dlocation is null");
            return (Criteria) this;
        }

        public Criteria andDlocationIsNotNull() {
            addCriterion("dlocation is not null");
            return (Criteria) this;
        }

        public Criteria andDlocationEqualTo(String value) {
            addCriterion("dlocation =", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotEqualTo(String value) {
            addCriterion("dlocation <>", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationGreaterThan(String value) {
            addCriterion("dlocation >", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationGreaterThanOrEqualTo(String value) {
            addCriterion("dlocation >=", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationLessThan(String value) {
            addCriterion("dlocation <", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationLessThanOrEqualTo(String value) {
            addCriterion("dlocation <=", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationLike(String value) {
            addCriterion("dlocation like", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotLike(String value) {
            addCriterion("dlocation not like", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationIn(List<String> values) {
            addCriterion("dlocation in", values, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotIn(List<String> values) {
            addCriterion("dlocation not in", values, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationBetween(String value1, String value2) {
            addCriterion("dlocation between", value1, value2, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotBetween(String value1, String value2) {
            addCriterion("dlocation not between", value1, value2, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDsidIsNull() {
            addCriterion("dsid is null");
            return (Criteria) this;
        }

        public Criteria andDsidIsNotNull() {
            addCriterion("dsid is not null");
            return (Criteria) this;
        }

        public Criteria andDsidEqualTo(Integer value) {
            addCriterion("dsid =", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotEqualTo(Integer value) {
            addCriterion("dsid <>", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThan(Integer value) {
            addCriterion("dsid >", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dsid >=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThan(Integer value) {
            addCriterion("dsid <", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThanOrEqualTo(Integer value) {
            addCriterion("dsid <=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidIn(List<Integer> values) {
            addCriterion("dsid in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotIn(List<Integer> values) {
            addCriterion("dsid not in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidBetween(Integer value1, Integer value2) {
            addCriterion("dsid between", value1, value2, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotBetween(Integer value1, Integer value2) {
            addCriterion("dsid not between", value1, value2, "dsid");
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