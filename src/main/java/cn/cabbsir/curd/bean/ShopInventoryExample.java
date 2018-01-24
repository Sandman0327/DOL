package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopInventoryExample() {
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

        public Criteria andSiidIsNull() {
            addCriterion("siid is null");
            return (Criteria) this;
        }

        public Criteria andSiidIsNotNull() {
            addCriterion("siid is not null");
            return (Criteria) this;
        }

        public Criteria andSiidEqualTo(Integer value) {
            addCriterion("siid =", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidNotEqualTo(Integer value) {
            addCriterion("siid <>", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidGreaterThan(Integer value) {
            addCriterion("siid >", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("siid >=", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidLessThan(Integer value) {
            addCriterion("siid <", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidLessThanOrEqualTo(Integer value) {
            addCriterion("siid <=", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidIn(List<Integer> values) {
            addCriterion("siid in", values, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidNotIn(List<Integer> values) {
            addCriterion("siid not in", values, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidBetween(Integer value1, Integer value2) {
            addCriterion("siid between", value1, value2, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidNotBetween(Integer value1, Integer value2) {
            addCriterion("siid not between", value1, value2, "siid");
            return (Criteria) this;
        }

        public Criteria andSisidIsNull() {
            addCriterion("sisid is null");
            return (Criteria) this;
        }

        public Criteria andSisidIsNotNull() {
            addCriterion("sisid is not null");
            return (Criteria) this;
        }

        public Criteria andSisidEqualTo(Integer value) {
            addCriterion("sisid =", value, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidNotEqualTo(Integer value) {
            addCriterion("sisid <>", value, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidGreaterThan(Integer value) {
            addCriterion("sisid >", value, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sisid >=", value, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidLessThan(Integer value) {
            addCriterion("sisid <", value, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidLessThanOrEqualTo(Integer value) {
            addCriterion("sisid <=", value, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidIn(List<Integer> values) {
            addCriterion("sisid in", values, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidNotIn(List<Integer> values) {
            addCriterion("sisid not in", values, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidBetween(Integer value1, Integer value2) {
            addCriterion("sisid between", value1, value2, "sisid");
            return (Criteria) this;
        }

        public Criteria andSisidNotBetween(Integer value1, Integer value2) {
            addCriterion("sisid not between", value1, value2, "sisid");
            return (Criteria) this;
        }

        public Criteria andSidateIsNull() {
            addCriterion("sidate is null");
            return (Criteria) this;
        }

        public Criteria andSidateIsNotNull() {
            addCriterion("sidate is not null");
            return (Criteria) this;
        }

        public Criteria andSidateEqualTo(Date value) {
            addCriterionForJDBCDate("sidate =", value, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sidate <>", value, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateGreaterThan(Date value) {
            addCriterionForJDBCDate("sidate >", value, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sidate >=", value, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateLessThan(Date value) {
            addCriterionForJDBCDate("sidate <", value, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sidate <=", value, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateIn(List<Date> values) {
            addCriterionForJDBCDate("sidate in", values, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sidate not in", values, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sidate between", value1, value2, "sidate");
            return (Criteria) this;
        }

        public Criteria andSidateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sidate not between", value1, value2, "sidate");
            return (Criteria) this;
        }

        public Criteria andSiadd1IsNull() {
            addCriterion("siadd1 is null");
            return (Criteria) this;
        }

        public Criteria andSiadd1IsNotNull() {
            addCriterion("siadd1 is not null");
            return (Criteria) this;
        }

        public Criteria andSiadd1EqualTo(Integer value) {
            addCriterion("siadd1 =", value, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1NotEqualTo(Integer value) {
            addCriterion("siadd1 <>", value, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1GreaterThan(Integer value) {
            addCriterion("siadd1 >", value, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1GreaterThanOrEqualTo(Integer value) {
            addCriterion("siadd1 >=", value, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1LessThan(Integer value) {
            addCriterion("siadd1 <", value, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1LessThanOrEqualTo(Integer value) {
            addCriterion("siadd1 <=", value, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1In(List<Integer> values) {
            addCriterion("siadd1 in", values, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1NotIn(List<Integer> values) {
            addCriterion("siadd1 not in", values, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1Between(Integer value1, Integer value2) {
            addCriterion("siadd1 between", value1, value2, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd1NotBetween(Integer value1, Integer value2) {
            addCriterion("siadd1 not between", value1, value2, "siadd1");
            return (Criteria) this;
        }

        public Criteria andSiadd2IsNull() {
            addCriterion("siadd2 is null");
            return (Criteria) this;
        }

        public Criteria andSiadd2IsNotNull() {
            addCriterion("siadd2 is not null");
            return (Criteria) this;
        }

        public Criteria andSiadd2EqualTo(Integer value) {
            addCriterion("siadd2 =", value, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2NotEqualTo(Integer value) {
            addCriterion("siadd2 <>", value, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2GreaterThan(Integer value) {
            addCriterion("siadd2 >", value, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2GreaterThanOrEqualTo(Integer value) {
            addCriterion("siadd2 >=", value, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2LessThan(Integer value) {
            addCriterion("siadd2 <", value, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2LessThanOrEqualTo(Integer value) {
            addCriterion("siadd2 <=", value, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2In(List<Integer> values) {
            addCriterion("siadd2 in", values, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2NotIn(List<Integer> values) {
            addCriterion("siadd2 not in", values, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2Between(Integer value1, Integer value2) {
            addCriterion("siadd2 between", value1, value2, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd2NotBetween(Integer value1, Integer value2) {
            addCriterion("siadd2 not between", value1, value2, "siadd2");
            return (Criteria) this;
        }

        public Criteria andSiadd3IsNull() {
            addCriterion("siadd3 is null");
            return (Criteria) this;
        }

        public Criteria andSiadd3IsNotNull() {
            addCriterion("siadd3 is not null");
            return (Criteria) this;
        }

        public Criteria andSiadd3EqualTo(Integer value) {
            addCriterion("siadd3 =", value, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3NotEqualTo(Integer value) {
            addCriterion("siadd3 <>", value, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3GreaterThan(Integer value) {
            addCriterion("siadd3 >", value, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3GreaterThanOrEqualTo(Integer value) {
            addCriterion("siadd3 >=", value, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3LessThan(Integer value) {
            addCriterion("siadd3 <", value, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3LessThanOrEqualTo(Integer value) {
            addCriterion("siadd3 <=", value, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3In(List<Integer> values) {
            addCriterion("siadd3 in", values, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3NotIn(List<Integer> values) {
            addCriterion("siadd3 not in", values, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3Between(Integer value1, Integer value2) {
            addCriterion("siadd3 between", value1, value2, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSiadd3NotBetween(Integer value1, Integer value2) {
            addCriterion("siadd3 not between", value1, value2, "siadd3");
            return (Criteria) this;
        }

        public Criteria andSireduce1IsNull() {
            addCriterion("sireduce1 is null");
            return (Criteria) this;
        }

        public Criteria andSireduce1IsNotNull() {
            addCriterion("sireduce1 is not null");
            return (Criteria) this;
        }

        public Criteria andSireduce1EqualTo(Integer value) {
            addCriterion("sireduce1 =", value, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1NotEqualTo(Integer value) {
            addCriterion("sireduce1 <>", value, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1GreaterThan(Integer value) {
            addCriterion("sireduce1 >", value, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sireduce1 >=", value, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1LessThan(Integer value) {
            addCriterion("sireduce1 <", value, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1LessThanOrEqualTo(Integer value) {
            addCriterion("sireduce1 <=", value, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1In(List<Integer> values) {
            addCriterion("sireduce1 in", values, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1NotIn(List<Integer> values) {
            addCriterion("sireduce1 not in", values, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1Between(Integer value1, Integer value2) {
            addCriterion("sireduce1 between", value1, value2, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce1NotBetween(Integer value1, Integer value2) {
            addCriterion("sireduce1 not between", value1, value2, "sireduce1");
            return (Criteria) this;
        }

        public Criteria andSireduce2IsNull() {
            addCriterion("sireduce2 is null");
            return (Criteria) this;
        }

        public Criteria andSireduce2IsNotNull() {
            addCriterion("sireduce2 is not null");
            return (Criteria) this;
        }

        public Criteria andSireduce2EqualTo(Integer value) {
            addCriterion("sireduce2 =", value, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2NotEqualTo(Integer value) {
            addCriterion("sireduce2 <>", value, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2GreaterThan(Integer value) {
            addCriterion("sireduce2 >", value, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2GreaterThanOrEqualTo(Integer value) {
            addCriterion("sireduce2 >=", value, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2LessThan(Integer value) {
            addCriterion("sireduce2 <", value, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2LessThanOrEqualTo(Integer value) {
            addCriterion("sireduce2 <=", value, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2In(List<Integer> values) {
            addCriterion("sireduce2 in", values, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2NotIn(List<Integer> values) {
            addCriterion("sireduce2 not in", values, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2Between(Integer value1, Integer value2) {
            addCriterion("sireduce2 between", value1, value2, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce2NotBetween(Integer value1, Integer value2) {
            addCriterion("sireduce2 not between", value1, value2, "sireduce2");
            return (Criteria) this;
        }

        public Criteria andSireduce3IsNull() {
            addCriterion("sireduce3 is null");
            return (Criteria) this;
        }

        public Criteria andSireduce3IsNotNull() {
            addCriterion("sireduce3 is not null");
            return (Criteria) this;
        }

        public Criteria andSireduce3EqualTo(Integer value) {
            addCriterion("sireduce3 =", value, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3NotEqualTo(Integer value) {
            addCriterion("sireduce3 <>", value, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3GreaterThan(Integer value) {
            addCriterion("sireduce3 >", value, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3GreaterThanOrEqualTo(Integer value) {
            addCriterion("sireduce3 >=", value, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3LessThan(Integer value) {
            addCriterion("sireduce3 <", value, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3LessThanOrEqualTo(Integer value) {
            addCriterion("sireduce3 <=", value, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3In(List<Integer> values) {
            addCriterion("sireduce3 in", values, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3NotIn(List<Integer> values) {
            addCriterion("sireduce3 not in", values, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3Between(Integer value1, Integer value2) {
            addCriterion("sireduce3 between", value1, value2, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSireduce3NotBetween(Integer value1, Integer value2) {
            addCriterion("sireduce3 not between", value1, value2, "sireduce3");
            return (Criteria) this;
        }

        public Criteria andSiinventory1IsNull() {
            addCriterion("siinventory1 is null");
            return (Criteria) this;
        }

        public Criteria andSiinventory1IsNotNull() {
            addCriterion("siinventory1 is not null");
            return (Criteria) this;
        }

        public Criteria andSiinventory1EqualTo(Integer value) {
            addCriterion("siinventory1 =", value, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1NotEqualTo(Integer value) {
            addCriterion("siinventory1 <>", value, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1GreaterThan(Integer value) {
            addCriterion("siinventory1 >", value, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1GreaterThanOrEqualTo(Integer value) {
            addCriterion("siinventory1 >=", value, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1LessThan(Integer value) {
            addCriterion("siinventory1 <", value, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1LessThanOrEqualTo(Integer value) {
            addCriterion("siinventory1 <=", value, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1In(List<Integer> values) {
            addCriterion("siinventory1 in", values, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1NotIn(List<Integer> values) {
            addCriterion("siinventory1 not in", values, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1Between(Integer value1, Integer value2) {
            addCriterion("siinventory1 between", value1, value2, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory1NotBetween(Integer value1, Integer value2) {
            addCriterion("siinventory1 not between", value1, value2, "siinventory1");
            return (Criteria) this;
        }

        public Criteria andSiinventory2IsNull() {
            addCriterion("siinventory2 is null");
            return (Criteria) this;
        }

        public Criteria andSiinventory2IsNotNull() {
            addCriterion("siinventory2 is not null");
            return (Criteria) this;
        }

        public Criteria andSiinventory2EqualTo(Integer value) {
            addCriterion("siinventory2 =", value, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2NotEqualTo(Integer value) {
            addCriterion("siinventory2 <>", value, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2GreaterThan(Integer value) {
            addCriterion("siinventory2 >", value, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2GreaterThanOrEqualTo(Integer value) {
            addCriterion("siinventory2 >=", value, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2LessThan(Integer value) {
            addCriterion("siinventory2 <", value, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2LessThanOrEqualTo(Integer value) {
            addCriterion("siinventory2 <=", value, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2In(List<Integer> values) {
            addCriterion("siinventory2 in", values, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2NotIn(List<Integer> values) {
            addCriterion("siinventory2 not in", values, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2Between(Integer value1, Integer value2) {
            addCriterion("siinventory2 between", value1, value2, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory2NotBetween(Integer value1, Integer value2) {
            addCriterion("siinventory2 not between", value1, value2, "siinventory2");
            return (Criteria) this;
        }

        public Criteria andSiinventory3IsNull() {
            addCriterion("siinventory3 is null");
            return (Criteria) this;
        }

        public Criteria andSiinventory3IsNotNull() {
            addCriterion("siinventory3 is not null");
            return (Criteria) this;
        }

        public Criteria andSiinventory3EqualTo(Integer value) {
            addCriterion("siinventory3 =", value, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3NotEqualTo(Integer value) {
            addCriterion("siinventory3 <>", value, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3GreaterThan(Integer value) {
            addCriterion("siinventory3 >", value, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3GreaterThanOrEqualTo(Integer value) {
            addCriterion("siinventory3 >=", value, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3LessThan(Integer value) {
            addCriterion("siinventory3 <", value, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3LessThanOrEqualTo(Integer value) {
            addCriterion("siinventory3 <=", value, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3In(List<Integer> values) {
            addCriterion("siinventory3 in", values, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3NotIn(List<Integer> values) {
            addCriterion("siinventory3 not in", values, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3Between(Integer value1, Integer value2) {
            addCriterion("siinventory3 between", value1, value2, "siinventory3");
            return (Criteria) this;
        }

        public Criteria andSiinventory3NotBetween(Integer value1, Integer value2) {
            addCriterion("siinventory3 not between", value1, value2, "siinventory3");
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