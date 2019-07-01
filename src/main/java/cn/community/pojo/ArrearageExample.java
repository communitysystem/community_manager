package cn.community.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrearageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArrearageExample() {
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

        public Criteria andArrearageIdIsNull() {
            addCriterion("arrearage_id is null");
            return (Criteria) this;
        }

        public Criteria andArrearageIdIsNotNull() {
            addCriterion("arrearage_id is not null");
            return (Criteria) this;
        }

        public Criteria andArrearageIdEqualTo(String value) {
            addCriterion("arrearage_id =", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdNotEqualTo(String value) {
            addCriterion("arrearage_id <>", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdGreaterThan(String value) {
            addCriterion("arrearage_id >", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdGreaterThanOrEqualTo(String value) {
            addCriterion("arrearage_id >=", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdLessThan(String value) {
            addCriterion("arrearage_id <", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdLessThanOrEqualTo(String value) {
            addCriterion("arrearage_id <=", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdLike(String value) {
            addCriterion("arrearage_id like", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdNotLike(String value) {
            addCriterion("arrearage_id not like", value, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdIn(List<String> values) {
            addCriterion("arrearage_id in", values, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdNotIn(List<String> values) {
            addCriterion("arrearage_id not in", values, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdBetween(String value1, String value2) {
            addCriterion("arrearage_id between", value1, value2, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andArrearageIdNotBetween(String value1, String value2) {
            addCriterion("arrearage_id not between", value1, value2, "arrearageId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_Id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Integer value) {
            addCriterion("owner_Id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Integer value) {
            addCriterion("owner_Id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Integer value) {
            addCriterion("owner_Id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_Id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Integer value) {
            addCriterion("owner_Id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_Id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Integer> values) {
            addCriterion("owner_Id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Integer> values) {
            addCriterion("owner_Id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_Id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_Id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andArrearageSumIsNull() {
            addCriterion("arrearage_sum is null");
            return (Criteria) this;
        }

        public Criteria andArrearageSumIsNotNull() {
            addCriterion("arrearage_sum is not null");
            return (Criteria) this;
        }

        public Criteria andArrearageSumEqualTo(Double value) {
            addCriterion("arrearage_sum =", value, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumNotEqualTo(Double value) {
            addCriterion("arrearage_sum <>", value, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumGreaterThan(Double value) {
            addCriterion("arrearage_sum >", value, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumGreaterThanOrEqualTo(Double value) {
            addCriterion("arrearage_sum >=", value, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumLessThan(Double value) {
            addCriterion("arrearage_sum <", value, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumLessThanOrEqualTo(Double value) {
            addCriterion("arrearage_sum <=", value, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumIn(List<Double> values) {
            addCriterion("arrearage_sum in", values, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumNotIn(List<Double> values) {
            addCriterion("arrearage_sum not in", values, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumBetween(Double value1, Double value2) {
            addCriterion("arrearage_sum between", value1, value2, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageSumNotBetween(Double value1, Double value2) {
            addCriterion("arrearage_sum not between", value1, value2, "arrearageSum");
            return (Criteria) this;
        }

        public Criteria andArrearageDateIsNull() {
            addCriterion("arrearage_date is null");
            return (Criteria) this;
        }

        public Criteria andArrearageDateIsNotNull() {
            addCriterion("arrearage_date is not null");
            return (Criteria) this;
        }

        public Criteria andArrearageDateEqualTo(Date value) {
            addCriterionForJDBCDate("arrearage_date =", value, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("arrearage_date <>", value, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateGreaterThan(Date value) {
            addCriterionForJDBCDate("arrearage_date >", value, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrearage_date >=", value, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateLessThan(Date value) {
            addCriterionForJDBCDate("arrearage_date <", value, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrearage_date <=", value, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateIn(List<Date> values) {
            addCriterionForJDBCDate("arrearage_date in", values, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("arrearage_date not in", values, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrearage_date between", value1, value2, "arrearageDate");
            return (Criteria) this;
        }

        public Criteria andArrearageDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrearage_date not between", value1, value2, "arrearageDate");
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