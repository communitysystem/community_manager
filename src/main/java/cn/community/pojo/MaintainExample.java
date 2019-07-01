package cn.community.pojo;

import java.util.ArrayList;
import java.util.List;

public class MaintainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainExample() {
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

        public Criteria andMaintainIdIsNull() {
            addCriterion("maintain_id is null");
            return (Criteria) this;
        }

        public Criteria andMaintainIdIsNotNull() {
            addCriterion("maintain_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainIdEqualTo(String value) {
            addCriterion("maintain_id =", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotEqualTo(String value) {
            addCriterion("maintain_id <>", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdGreaterThan(String value) {
            addCriterion("maintain_id >", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_id >=", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLessThan(String value) {
            addCriterion("maintain_id <", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLessThanOrEqualTo(String value) {
            addCriterion("maintain_id <=", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLike(String value) {
            addCriterion("maintain_id like", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotLike(String value) {
            addCriterion("maintain_id not like", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdIn(List<String> values) {
            addCriterion("maintain_id in", values, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotIn(List<String> values) {
            addCriterion("maintain_id not in", values, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdBetween(String value1, String value2) {
            addCriterion("maintain_id between", value1, value2, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotBetween(String value1, String value2) {
            addCriterion("maintain_id not between", value1, value2, "maintainId");
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeIsNull() {
            addCriterion("maintain_charge is null");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeIsNotNull() {
            addCriterion("maintain_charge is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeEqualTo(Double value) {
            addCriterion("maintain_charge =", value, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeNotEqualTo(Double value) {
            addCriterion("maintain_charge <>", value, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeGreaterThan(Double value) {
            addCriterion("maintain_charge >", value, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("maintain_charge >=", value, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeLessThan(Double value) {
            addCriterion("maintain_charge <", value, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeLessThanOrEqualTo(Double value) {
            addCriterion("maintain_charge <=", value, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeIn(List<Double> values) {
            addCriterion("maintain_charge in", values, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeNotIn(List<Double> values) {
            addCriterion("maintain_charge not in", values, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeBetween(Double value1, Double value2) {
            addCriterion("maintain_charge between", value1, value2, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andMaintainChargeNotBetween(Double value1, Double value2) {
            addCriterion("maintain_charge not between", value1, value2, "maintainCharge");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
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