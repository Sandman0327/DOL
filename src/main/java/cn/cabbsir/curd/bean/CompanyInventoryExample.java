package cn.cabbsir.curd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyInventoryExample() {
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

        public Criteria andCiidIsNull() {
            addCriterion("ciid is null");
            return (Criteria) this;
        }

        public Criteria andCiidIsNotNull() {
            addCriterion("ciid is not null");
            return (Criteria) this;
        }

        public Criteria andCiidEqualTo(Integer value) {
            addCriterion("ciid =", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotEqualTo(Integer value) {
            addCriterion("ciid <>", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidGreaterThan(Integer value) {
            addCriterion("ciid >", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ciid >=", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidLessThan(Integer value) {
            addCriterion("ciid <", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidLessThanOrEqualTo(Integer value) {
            addCriterion("ciid <=", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidIn(List<Integer> values) {
            addCriterion("ciid in", values, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotIn(List<Integer> values) {
            addCriterion("ciid not in", values, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidBetween(Integer value1, Integer value2) {
            addCriterion("ciid between", value1, value2, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotBetween(Integer value1, Integer value2) {
            addCriterion("ciid not between", value1, value2, "ciid");
            return (Criteria) this;
        }

        public Criteria andCidateIsNull() {
            addCriterion("cidate is null");
            return (Criteria) this;
        }

        public Criteria andCidateIsNotNull() {
            addCriterion("cidate is not null");
            return (Criteria) this;
        }

        public Criteria andCidateEqualTo(Date value) {
            addCriterionForJDBCDate("cidate =", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cidate <>", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateGreaterThan(Date value) {
            addCriterionForJDBCDate("cidate >", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cidate >=", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateLessThan(Date value) {
            addCriterionForJDBCDate("cidate <", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cidate <=", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateIn(List<Date> values) {
            addCriterionForJDBCDate("cidate in", values, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cidate not in", values, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cidate between", value1, value2, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cidate not between", value1, value2, "cidate");
            return (Criteria) this;
        }

        public Criteria andCiadd1IsNull() {
            addCriterion("ciadd1 is null");
            return (Criteria) this;
        }

        public Criteria andCiadd1IsNotNull() {
            addCriterion("ciadd1 is not null");
            return (Criteria) this;
        }

        public Criteria andCiadd1EqualTo(Integer value) {
            addCriterion("ciadd1 =", value, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1NotEqualTo(Integer value) {
            addCriterion("ciadd1 <>", value, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1GreaterThan(Integer value) {
            addCriterion("ciadd1 >", value, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ciadd1 >=", value, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1LessThan(Integer value) {
            addCriterion("ciadd1 <", value, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1LessThanOrEqualTo(Integer value) {
            addCriterion("ciadd1 <=", value, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1In(List<Integer> values) {
            addCriterion("ciadd1 in", values, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1NotIn(List<Integer> values) {
            addCriterion("ciadd1 not in", values, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1Between(Integer value1, Integer value2) {
            addCriterion("ciadd1 between", value1, value2, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd1NotBetween(Integer value1, Integer value2) {
            addCriterion("ciadd1 not between", value1, value2, "ciadd1");
            return (Criteria) this;
        }

        public Criteria andCiadd2IsNull() {
            addCriterion("ciadd2 is null");
            return (Criteria) this;
        }

        public Criteria andCiadd2IsNotNull() {
            addCriterion("ciadd2 is not null");
            return (Criteria) this;
        }

        public Criteria andCiadd2EqualTo(Integer value) {
            addCriterion("ciadd2 =", value, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2NotEqualTo(Integer value) {
            addCriterion("ciadd2 <>", value, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2GreaterThan(Integer value) {
            addCriterion("ciadd2 >", value, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ciadd2 >=", value, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2LessThan(Integer value) {
            addCriterion("ciadd2 <", value, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2LessThanOrEqualTo(Integer value) {
            addCriterion("ciadd2 <=", value, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2In(List<Integer> values) {
            addCriterion("ciadd2 in", values, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2NotIn(List<Integer> values) {
            addCriterion("ciadd2 not in", values, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2Between(Integer value1, Integer value2) {
            addCriterion("ciadd2 between", value1, value2, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd2NotBetween(Integer value1, Integer value2) {
            addCriterion("ciadd2 not between", value1, value2, "ciadd2");
            return (Criteria) this;
        }

        public Criteria andCiadd3IsNull() {
            addCriterion("ciadd3 is null");
            return (Criteria) this;
        }

        public Criteria andCiadd3IsNotNull() {
            addCriterion("ciadd3 is not null");
            return (Criteria) this;
        }

        public Criteria andCiadd3EqualTo(Integer value) {
            addCriterion("ciadd3 =", value, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3NotEqualTo(Integer value) {
            addCriterion("ciadd3 <>", value, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3GreaterThan(Integer value) {
            addCriterion("ciadd3 >", value, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ciadd3 >=", value, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3LessThan(Integer value) {
            addCriterion("ciadd3 <", value, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3LessThanOrEqualTo(Integer value) {
            addCriterion("ciadd3 <=", value, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3In(List<Integer> values) {
            addCriterion("ciadd3 in", values, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3NotIn(List<Integer> values) {
            addCriterion("ciadd3 not in", values, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3Between(Integer value1, Integer value2) {
            addCriterion("ciadd3 between", value1, value2, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCiadd3NotBetween(Integer value1, Integer value2) {
            addCriterion("ciadd3 not between", value1, value2, "ciadd3");
            return (Criteria) this;
        }

        public Criteria andCireduce1IsNull() {
            addCriterion("cireduce1 is null");
            return (Criteria) this;
        }

        public Criteria andCireduce1IsNotNull() {
            addCriterion("cireduce1 is not null");
            return (Criteria) this;
        }

        public Criteria andCireduce1EqualTo(Integer value) {
            addCriterion("cireduce1 =", value, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1NotEqualTo(Integer value) {
            addCriterion("cireduce1 <>", value, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1GreaterThan(Integer value) {
            addCriterion("cireduce1 >", value, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1GreaterThanOrEqualTo(Integer value) {
            addCriterion("cireduce1 >=", value, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1LessThan(Integer value) {
            addCriterion("cireduce1 <", value, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1LessThanOrEqualTo(Integer value) {
            addCriterion("cireduce1 <=", value, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1In(List<Integer> values) {
            addCriterion("cireduce1 in", values, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1NotIn(List<Integer> values) {
            addCriterion("cireduce1 not in", values, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1Between(Integer value1, Integer value2) {
            addCriterion("cireduce1 between", value1, value2, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce1NotBetween(Integer value1, Integer value2) {
            addCriterion("cireduce1 not between", value1, value2, "cireduce1");
            return (Criteria) this;
        }

        public Criteria andCireduce2IsNull() {
            addCriterion("cireduce2 is null");
            return (Criteria) this;
        }

        public Criteria andCireduce2IsNotNull() {
            addCriterion("cireduce2 is not null");
            return (Criteria) this;
        }

        public Criteria andCireduce2EqualTo(Integer value) {
            addCriterion("cireduce2 =", value, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2NotEqualTo(Integer value) {
            addCriterion("cireduce2 <>", value, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2GreaterThan(Integer value) {
            addCriterion("cireduce2 >", value, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2GreaterThanOrEqualTo(Integer value) {
            addCriterion("cireduce2 >=", value, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2LessThan(Integer value) {
            addCriterion("cireduce2 <", value, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2LessThanOrEqualTo(Integer value) {
            addCriterion("cireduce2 <=", value, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2In(List<Integer> values) {
            addCriterion("cireduce2 in", values, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2NotIn(List<Integer> values) {
            addCriterion("cireduce2 not in", values, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2Between(Integer value1, Integer value2) {
            addCriterion("cireduce2 between", value1, value2, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce2NotBetween(Integer value1, Integer value2) {
            addCriterion("cireduce2 not between", value1, value2, "cireduce2");
            return (Criteria) this;
        }

        public Criteria andCireduce3IsNull() {
            addCriterion("cireduce3 is null");
            return (Criteria) this;
        }

        public Criteria andCireduce3IsNotNull() {
            addCriterion("cireduce3 is not null");
            return (Criteria) this;
        }

        public Criteria andCireduce3EqualTo(Integer value) {
            addCriterion("cireduce3 =", value, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3NotEqualTo(Integer value) {
            addCriterion("cireduce3 <>", value, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3GreaterThan(Integer value) {
            addCriterion("cireduce3 >", value, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3GreaterThanOrEqualTo(Integer value) {
            addCriterion("cireduce3 >=", value, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3LessThan(Integer value) {
            addCriterion("cireduce3 <", value, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3LessThanOrEqualTo(Integer value) {
            addCriterion("cireduce3 <=", value, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3In(List<Integer> values) {
            addCriterion("cireduce3 in", values, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3NotIn(List<Integer> values) {
            addCriterion("cireduce3 not in", values, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3Between(Integer value1, Integer value2) {
            addCriterion("cireduce3 between", value1, value2, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCireduce3NotBetween(Integer value1, Integer value2) {
            addCriterion("cireduce3 not between", value1, value2, "cireduce3");
            return (Criteria) this;
        }

        public Criteria andCiinventory1IsNull() {
            addCriterion("ciinventory1 is null");
            return (Criteria) this;
        }

        public Criteria andCiinventory1IsNotNull() {
            addCriterion("ciinventory1 is not null");
            return (Criteria) this;
        }

        public Criteria andCiinventory1EqualTo(Integer value) {
            addCriterion("ciinventory1 =", value, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1NotEqualTo(Integer value) {
            addCriterion("ciinventory1 <>", value, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1GreaterThan(Integer value) {
            addCriterion("ciinventory1 >", value, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ciinventory1 >=", value, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1LessThan(Integer value) {
            addCriterion("ciinventory1 <", value, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1LessThanOrEqualTo(Integer value) {
            addCriterion("ciinventory1 <=", value, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1In(List<Integer> values) {
            addCriterion("ciinventory1 in", values, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1NotIn(List<Integer> values) {
            addCriterion("ciinventory1 not in", values, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1Between(Integer value1, Integer value2) {
            addCriterion("ciinventory1 between", value1, value2, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory1NotBetween(Integer value1, Integer value2) {
            addCriterion("ciinventory1 not between", value1, value2, "ciinventory1");
            return (Criteria) this;
        }

        public Criteria andCiinventory2IsNull() {
            addCriterion("ciinventory2 is null");
            return (Criteria) this;
        }

        public Criteria andCiinventory2IsNotNull() {
            addCriterion("ciinventory2 is not null");
            return (Criteria) this;
        }

        public Criteria andCiinventory2EqualTo(Integer value) {
            addCriterion("ciinventory2 =", value, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2NotEqualTo(Integer value) {
            addCriterion("ciinventory2 <>", value, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2GreaterThan(Integer value) {
            addCriterion("ciinventory2 >", value, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ciinventory2 >=", value, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2LessThan(Integer value) {
            addCriterion("ciinventory2 <", value, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2LessThanOrEqualTo(Integer value) {
            addCriterion("ciinventory2 <=", value, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2In(List<Integer> values) {
            addCriterion("ciinventory2 in", values, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2NotIn(List<Integer> values) {
            addCriterion("ciinventory2 not in", values, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2Between(Integer value1, Integer value2) {
            addCriterion("ciinventory2 between", value1, value2, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory2NotBetween(Integer value1, Integer value2) {
            addCriterion("ciinventory2 not between", value1, value2, "ciinventory2");
            return (Criteria) this;
        }

        public Criteria andCiinventory3IsNull() {
            addCriterion("ciinventory3 is null");
            return (Criteria) this;
        }

        public Criteria andCiinventory3IsNotNull() {
            addCriterion("ciinventory3 is not null");
            return (Criteria) this;
        }

        public Criteria andCiinventory3EqualTo(Integer value) {
            addCriterion("ciinventory3 =", value, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3NotEqualTo(Integer value) {
            addCriterion("ciinventory3 <>", value, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3GreaterThan(Integer value) {
            addCriterion("ciinventory3 >", value, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ciinventory3 >=", value, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3LessThan(Integer value) {
            addCriterion("ciinventory3 <", value, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3LessThanOrEqualTo(Integer value) {
            addCriterion("ciinventory3 <=", value, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3In(List<Integer> values) {
            addCriterion("ciinventory3 in", values, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3NotIn(List<Integer> values) {
            addCriterion("ciinventory3 not in", values, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3Between(Integer value1, Integer value2) {
            addCriterion("ciinventory3 between", value1, value2, "ciinventory3");
            return (Criteria) this;
        }

        public Criteria andCiinventory3NotBetween(Integer value1, Integer value2) {
            addCriterion("ciinventory3 not between", value1, value2, "ciinventory3");
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