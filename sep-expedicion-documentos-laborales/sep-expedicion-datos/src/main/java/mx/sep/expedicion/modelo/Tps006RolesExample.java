package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tps006RolesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps006RolesExample() {
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

        public Criteria andIdRolIsNull() {
            addCriterion("id_rol is null");
            return (Criteria) this;
        }

        public Criteria andIdRolIsNotNull() {
            addCriterion("id_rol is not null");
            return (Criteria) this;
        }

        public Criteria andIdRolEqualTo(Integer value) {
            addCriterion("id_rol =", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolNotEqualTo(Integer value) {
            addCriterion("id_rol <>", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolGreaterThan(Integer value) {
            addCriterion("id_rol >", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_rol >=", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolLessThan(Integer value) {
            addCriterion("id_rol <", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolLessThanOrEqualTo(Integer value) {
            addCriterion("id_rol <=", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolIn(List<Integer> values) {
            addCriterion("id_rol in", values, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolNotIn(List<Integer> values) {
            addCriterion("id_rol not in", values, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolBetween(Integer value1, Integer value2) {
            addCriterion("id_rol between", value1, value2, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolNotBetween(Integer value1, Integer value2) {
            addCriterion("id_rol not between", value1, value2, "idRol");
            return (Criteria) this;
        }

        public Criteria andRolIsNull() {
            addCriterion("rol is null");
            return (Criteria) this;
        }

        public Criteria andRolIsNotNull() {
            addCriterion("rol is not null");
            return (Criteria) this;
        }

        public Criteria andRolEqualTo(String value) {
            addCriterion("rol =", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolNotEqualTo(String value) {
            addCriterion("rol <>", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolGreaterThan(String value) {
            addCriterion("rol >", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolGreaterThanOrEqualTo(String value) {
            addCriterion("rol >=", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolLessThan(String value) {
            addCriterion("rol <", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolLessThanOrEqualTo(String value) {
            addCriterion("rol <=", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolLike(String value) {
            addCriterion("rol like", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolNotLike(String value) {
            addCriterion("rol not like", value, "rol");
            return (Criteria) this;
        }

        public Criteria andRolIn(List<String> values) {
            addCriterion("rol in", values, "rol");
            return (Criteria) this;
        }

        public Criteria andRolNotIn(List<String> values) {
            addCriterion("rol not in", values, "rol");
            return (Criteria) this;
        }

        public Criteria andRolBetween(String value1, String value2) {
            addCriterion("rol between", value1, value2, "rol");
            return (Criteria) this;
        }

        public Criteria andRolNotBetween(String value1, String value2) {
            addCriterion("rol not between", value1, value2, "rol");
            return (Criteria) this;
        }

        public Criteria andActivoIsNull() {
            addCriterion("activo is null");
            return (Criteria) this;
        }

        public Criteria andActivoIsNotNull() {
            addCriterion("activo is not null");
            return (Criteria) this;
        }

        public Criteria andActivoEqualTo(Boolean value) {
            addCriterion("activo =", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotEqualTo(Boolean value) {
            addCriterion("activo <>", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoGreaterThan(Boolean value) {
            addCriterion("activo >", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activo >=", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoLessThan(Boolean value) {
            addCriterion("activo <", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoLessThanOrEqualTo(Boolean value) {
            addCriterion("activo <=", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoIn(List<Boolean> values) {
            addCriterion("activo in", values, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotIn(List<Boolean> values) {
            addCriterion("activo not in", values, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoBetween(Boolean value1, Boolean value2) {
            addCriterion("activo between", value1, value2, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activo not between", value1, value2, "activo");
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