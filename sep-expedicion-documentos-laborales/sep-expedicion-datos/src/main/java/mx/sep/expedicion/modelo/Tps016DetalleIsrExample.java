package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tps016DetalleIsrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps016DetalleIsrExample() {
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

        public Criteria andIdConstanciaIsNull() {
            addCriterion("id_constancia is null");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaIsNotNull() {
            addCriterion("id_constancia is not null");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaEqualTo(Integer value) {
            addCriterion("id_constancia =", value, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaNotEqualTo(Integer value) {
            addCriterion("id_constancia <>", value, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaGreaterThan(Integer value) {
            addCriterion("id_constancia >", value, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_constancia >=", value, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaLessThan(Integer value) {
            addCriterion("id_constancia <", value, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaLessThanOrEqualTo(Integer value) {
            addCriterion("id_constancia <=", value, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaIn(List<Integer> values) {
            addCriterion("id_constancia in", values, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaNotIn(List<Integer> values) {
            addCriterion("id_constancia not in", values, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaBetween(Integer value1, Integer value2) {
            addCriterion("id_constancia between", value1, value2, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andIdConstanciaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_constancia not between", value1, value2, "idConstancia");
            return (Criteria) this;
        }

        public Criteria andClaveIsNull() {
            addCriterion("clave is null");
            return (Criteria) this;
        }

        public Criteria andClaveIsNotNull() {
            addCriterion("clave is not null");
            return (Criteria) this;
        }

        public Criteria andClaveEqualTo(Short value) {
            addCriterion("clave =", value, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveNotEqualTo(Short value) {
            addCriterion("clave <>", value, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveGreaterThan(Short value) {
            addCriterion("clave >", value, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveGreaterThanOrEqualTo(Short value) {
            addCriterion("clave >=", value, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveLessThan(Short value) {
            addCriterion("clave <", value, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveLessThanOrEqualTo(Short value) {
            addCriterion("clave <=", value, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveIn(List<Short> values) {
            addCriterion("clave in", values, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveNotIn(List<Short> values) {
            addCriterion("clave not in", values, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveBetween(Short value1, Short value2) {
            addCriterion("clave between", value1, value2, "clave");
            return (Criteria) this;
        }

        public Criteria andClaveNotBetween(Short value1, Short value2) {
            addCriterion("clave not between", value1, value2, "clave");
            return (Criteria) this;
        }

        public Criteria andImpTotalIsNull() {
            addCriterion("imp_total is null");
            return (Criteria) this;
        }

        public Criteria andImpTotalIsNotNull() {
            addCriterion("imp_total is not null");
            return (Criteria) this;
        }

        public Criteria andImpTotalEqualTo(Integer value) {
            addCriterion("imp_total =", value, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalNotEqualTo(Integer value) {
            addCriterion("imp_total <>", value, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalGreaterThan(Integer value) {
            addCriterion("imp_total >", value, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("imp_total >=", value, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalLessThan(Integer value) {
            addCriterion("imp_total <", value, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalLessThanOrEqualTo(Integer value) {
            addCriterion("imp_total <=", value, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalIn(List<Integer> values) {
            addCriterion("imp_total in", values, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalNotIn(List<Integer> values) {
            addCriterion("imp_total not in", values, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalBetween(Integer value1, Integer value2) {
            addCriterion("imp_total between", value1, value2, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("imp_total not between", value1, value2, "impTotal");
            return (Criteria) this;
        }

        public Criteria andImpExentoIsNull() {
            addCriterion("imp_exento is null");
            return (Criteria) this;
        }

        public Criteria andImpExentoIsNotNull() {
            addCriterion("imp_exento is not null");
            return (Criteria) this;
        }

        public Criteria andImpExentoEqualTo(Integer value) {
            addCriterion("imp_exento =", value, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoNotEqualTo(Integer value) {
            addCriterion("imp_exento <>", value, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoGreaterThan(Integer value) {
            addCriterion("imp_exento >", value, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("imp_exento >=", value, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoLessThan(Integer value) {
            addCriterion("imp_exento <", value, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoLessThanOrEqualTo(Integer value) {
            addCriterion("imp_exento <=", value, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoIn(List<Integer> values) {
            addCriterion("imp_exento in", values, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoNotIn(List<Integer> values) {
            addCriterion("imp_exento not in", values, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoBetween(Integer value1, Integer value2) {
            addCriterion("imp_exento between", value1, value2, "impExento");
            return (Criteria) this;
        }

        public Criteria andImpExentoNotBetween(Integer value1, Integer value2) {
            addCriterion("imp_exento not between", value1, value2, "impExento");
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