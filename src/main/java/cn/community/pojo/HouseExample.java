package cn.community.pojo;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andBuildNumberIsNull() {
            addCriterion("build_number is null");
            return (Criteria) this;
        }

        public Criteria andBuildNumberIsNotNull() {
            addCriterion("build_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuildNumberEqualTo(Integer value) {
            addCriterion("build_number =", value, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberNotEqualTo(Integer value) {
            addCriterion("build_number <>", value, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberGreaterThan(Integer value) {
            addCriterion("build_number >", value, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_number >=", value, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberLessThan(Integer value) {
            addCriterion("build_number <", value, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberLessThanOrEqualTo(Integer value) {
            addCriterion("build_number <=", value, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberIn(List<Integer> values) {
            addCriterion("build_number in", values, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberNotIn(List<Integer> values) {
            addCriterion("build_number not in", values, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberBetween(Integer value1, Integer value2) {
            addCriterion("build_number between", value1, value2, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andBuildNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("build_number not between", value1, value2, "buildNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberIsNull() {
            addCriterion("unit_number is null");
            return (Criteria) this;
        }

        public Criteria andUnitNumberIsNotNull() {
            addCriterion("unit_number is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNumberEqualTo(Integer value) {
            addCriterion("unit_number =", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberNotEqualTo(Integer value) {
            addCriterion("unit_number <>", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberGreaterThan(Integer value) {
            addCriterion("unit_number >", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_number >=", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberLessThan(Integer value) {
            addCriterion("unit_number <", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberLessThanOrEqualTo(Integer value) {
            addCriterion("unit_number <=", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberIn(List<Integer> values) {
            addCriterion("unit_number in", values, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberNotIn(List<Integer> values) {
            addCriterion("unit_number not in", values, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberBetween(Integer value1, Integer value2) {
            addCriterion("unit_number between", value1, value2, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_number not between", value1, value2, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNull() {
            addCriterion("house_number is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNotNull() {
            addCriterion("house_number is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberEqualTo(String value) {
            addCriterion("house_number =", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotEqualTo(String value) {
            addCriterion("house_number <>", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThan(String value) {
            addCriterion("house_number >", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("house_number >=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThan(String value) {
            addCriterion("house_number <", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThanOrEqualTo(String value) {
            addCriterion("house_number <=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLike(String value) {
            addCriterion("house_number like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotLike(String value) {
            addCriterion("house_number not like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIn(List<String> values) {
            addCriterion("house_number in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotIn(List<String> values) {
            addCriterion("house_number not in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberBetween(String value1, String value2) {
            addCriterion("house_number between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotBetween(String value1, String value2) {
            addCriterion("house_number not between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andSaleStateIsNull() {
            addCriterion("sale_state is null");
            return (Criteria) this;
        }

        public Criteria andSaleStateIsNotNull() {
            addCriterion("sale_state is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStateEqualTo(String value) {
            addCriterion("sale_state =", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotEqualTo(String value) {
            addCriterion("sale_state <>", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateGreaterThan(String value) {
            addCriterion("sale_state >", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateGreaterThanOrEqualTo(String value) {
            addCriterion("sale_state >=", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateLessThan(String value) {
            addCriterion("sale_state <", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateLessThanOrEqualTo(String value) {
            addCriterion("sale_state <=", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateLike(String value) {
            addCriterion("sale_state like", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotLike(String value) {
            addCriterion("sale_state not like", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateIn(List<String> values) {
            addCriterion("sale_state in", values, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotIn(List<String> values) {
            addCriterion("sale_state not in", values, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateBetween(String value1, String value2) {
            addCriterion("sale_state between", value1, value2, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotBetween(String value1, String value2) {
            addCriterion("sale_state not between", value1, value2, "saleState");
            return (Criteria) this;
        }

        public Criteria andHoseTypeIsNull() {
            addCriterion("hose_type is null");
            return (Criteria) this;
        }

        public Criteria andHoseTypeIsNotNull() {
            addCriterion("hose_type is not null");
            return (Criteria) this;
        }

        public Criteria andHoseTypeEqualTo(String value) {
            addCriterion("hose_type =", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeNotEqualTo(String value) {
            addCriterion("hose_type <>", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeGreaterThan(String value) {
            addCriterion("hose_type >", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hose_type >=", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeLessThan(String value) {
            addCriterion("hose_type <", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeLessThanOrEqualTo(String value) {
            addCriterion("hose_type <=", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeLike(String value) {
            addCriterion("hose_type like", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeNotLike(String value) {
            addCriterion("hose_type not like", value, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeIn(List<String> values) {
            addCriterion("hose_type in", values, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeNotIn(List<String> values) {
            addCriterion("hose_type not in", values, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeBetween(String value1, String value2) {
            addCriterion("hose_type between", value1, value2, "hoseType");
            return (Criteria) this;
        }

        public Criteria andHoseTypeNotBetween(String value1, String value2) {
            addCriterion("hose_type not between", value1, value2, "hoseType");
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