package mx.sep.expedicion.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Tps022AnualSdoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps022AnualSdoExample() {
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

        public Criteria andAnioIsNull() {
            addCriterion("anio is null");
            return (Criteria) this;
        }

        public Criteria andAnioIsNotNull() {
            addCriterion("anio is not null");
            return (Criteria) this;
        }

        public Criteria andAnioEqualTo(Short value) {
            addCriterion("anio =", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioNotEqualTo(Short value) {
            addCriterion("anio <>", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioGreaterThan(Short value) {
            addCriterion("anio >", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioGreaterThanOrEqualTo(Short value) {
            addCriterion("anio >=", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioLessThan(Short value) {
            addCriterion("anio <", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioLessThanOrEqualTo(Short value) {
            addCriterion("anio <=", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioIn(List<Short> values) {
            addCriterion("anio in", values, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioNotIn(List<Short> values) {
            addCriterion("anio not in", values, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioBetween(Short value1, Short value2) {
            addCriterion("anio between", value1, value2, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioNotBetween(Short value1, Short value2) {
            addCriterion("anio not between", value1, value2, "anio");
            return (Criteria) this;
        }

        public Criteria andRfcIsNull() {
            addCriterion("rfc is null");
            return (Criteria) this;
        }

        public Criteria andRfcIsNotNull() {
            addCriterion("rfc is not null");
            return (Criteria) this;
        }

        public Criteria andRfcEqualTo(String value) {
            addCriterion("rfc =", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotEqualTo(String value) {
            addCriterion("rfc <>", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcGreaterThan(String value) {
            addCriterion("rfc >", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcGreaterThanOrEqualTo(String value) {
            addCriterion("rfc >=", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcLessThan(String value) {
            addCriterion("rfc <", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcLessThanOrEqualTo(String value) {
            addCriterion("rfc <=", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcLike(String value) {
            addCriterion("rfc like", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotLike(String value) {
            addCriterion("rfc not like", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcIn(List<String> values) {
            addCriterion("rfc in", values, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotIn(List<String> values) {
            addCriterion("rfc not in", values, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcBetween(String value1, String value2) {
            addCriterion("rfc between", value1, value2, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotBetween(String value1, String value2) {
            addCriterion("rfc not between", value1, value2, "rfc");
            return (Criteria) this;
        }

        public Criteria andTotImpIsNull() {
            addCriterion("tot_imp is null");
            return (Criteria) this;
        }

        public Criteria andTotImpIsNotNull() {
            addCriterion("tot_imp is not null");
            return (Criteria) this;
        }

        public Criteria andTotImpEqualTo(BigDecimal value) {
            addCriterion("tot_imp =", value, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpNotEqualTo(BigDecimal value) {
            addCriterion("tot_imp <>", value, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpGreaterThan(BigDecimal value) {
            addCriterion("tot_imp >", value, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_imp >=", value, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpLessThan(BigDecimal value) {
            addCriterion("tot_imp <", value, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_imp <=", value, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpIn(List<BigDecimal> values) {
            addCriterion("tot_imp in", values, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpNotIn(List<BigDecimal> values) {
            addCriterion("tot_imp not in", values, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_imp between", value1, value2, "totImp");
            return (Criteria) this;
        }

        public Criteria andTotImpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_imp not between", value1, value2, "totImp");
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