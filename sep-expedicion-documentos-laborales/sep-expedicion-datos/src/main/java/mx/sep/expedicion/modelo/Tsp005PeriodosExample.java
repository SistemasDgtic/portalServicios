package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tsp005PeriodosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tsp005PeriodosExample() {
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

        public Criteria andMesIsNull() {
            addCriterion("mes is null");
            return (Criteria) this;
        }

        public Criteria andMesIsNotNull() {
            addCriterion("mes is not null");
            return (Criteria) this;
        }

        public Criteria andMesEqualTo(Short value) {
            addCriterion("mes =", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotEqualTo(Short value) {
            addCriterion("mes <>", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesGreaterThan(Short value) {
            addCriterion("mes >", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesGreaterThanOrEqualTo(Short value) {
            addCriterion("mes >=", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesLessThan(Short value) {
            addCriterion("mes <", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesLessThanOrEqualTo(Short value) {
            addCriterion("mes <=", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesIn(List<Short> values) {
            addCriterion("mes in", values, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotIn(List<Short> values) {
            addCriterion("mes not in", values, "mes");
            return (Criteria) this;
        }

        public Criteria andMesBetween(Short value1, Short value2) {
            addCriterion("mes between", value1, value2, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotBetween(Short value1, Short value2) {
            addCriterion("mes not between", value1, value2, "mes");
            return (Criteria) this;
        }

        public Criteria andQuincenaIsNull() {
            addCriterion("quincena is null");
            return (Criteria) this;
        }

        public Criteria andQuincenaIsNotNull() {
            addCriterion("quincena is not null");
            return (Criteria) this;
        }

        public Criteria andQuincenaEqualTo(Short value) {
            addCriterion("quincena =", value, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaNotEqualTo(Short value) {
            addCriterion("quincena <>", value, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaGreaterThan(Short value) {
            addCriterion("quincena >", value, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaGreaterThanOrEqualTo(Short value) {
            addCriterion("quincena >=", value, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaLessThan(Short value) {
            addCriterion("quincena <", value, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaLessThanOrEqualTo(Short value) {
            addCriterion("quincena <=", value, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaIn(List<Short> values) {
            addCriterion("quincena in", values, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaNotIn(List<Short> values) {
            addCriterion("quincena not in", values, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaBetween(Short value1, Short value2) {
            addCriterion("quincena between", value1, value2, "quincena");
            return (Criteria) this;
        }

        public Criteria andQuincenaNotBetween(Short value1, Short value2) {
            addCriterion("quincena not between", value1, value2, "quincena");
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