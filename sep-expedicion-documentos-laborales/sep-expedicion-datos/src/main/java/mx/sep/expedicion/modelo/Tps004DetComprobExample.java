package mx.sep.expedicion.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Tps004DetComprobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps004DetComprobExample() {
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

        public Criteria andIdComprobanteIsNull() {
            addCriterion("id_comprobante is null");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteIsNotNull() {
            addCriterion("id_comprobante is not null");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteEqualTo(Integer value) {
            addCriterion("id_comprobante =", value, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteNotEqualTo(Integer value) {
            addCriterion("id_comprobante <>", value, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteGreaterThan(Integer value) {
            addCriterion("id_comprobante >", value, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_comprobante >=", value, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteLessThan(Integer value) {
            addCriterion("id_comprobante <", value, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteLessThanOrEqualTo(Integer value) {
            addCriterion("id_comprobante <=", value, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteIn(List<Integer> values) {
            addCriterion("id_comprobante in", values, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteNotIn(List<Integer> values) {
            addCriterion("id_comprobante not in", values, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteBetween(Integer value1, Integer value2) {
            addCriterion("id_comprobante between", value1, value2, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andIdComprobanteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_comprobante not between", value1, value2, "idComprobante");
            return (Criteria) this;
        }

        public Criteria andConsecutivoIsNull() {
            addCriterion("consecutivo is null");
            return (Criteria) this;
        }

        public Criteria andConsecutivoIsNotNull() {
            addCriterion("consecutivo is not null");
            return (Criteria) this;
        }

        public Criteria andConsecutivoEqualTo(Short value) {
            addCriterion("consecutivo =", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoNotEqualTo(Short value) {
            addCriterion("consecutivo <>", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoGreaterThan(Short value) {
            addCriterion("consecutivo >", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoGreaterThanOrEqualTo(Short value) {
            addCriterion("consecutivo >=", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoLessThan(Short value) {
            addCriterion("consecutivo <", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoLessThanOrEqualTo(Short value) {
            addCriterion("consecutivo <=", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoIn(List<Short> values) {
            addCriterion("consecutivo in", values, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoNotIn(List<Short> values) {
            addCriterion("consecutivo not in", values, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoBetween(Short value1, Short value2) {
            addCriterion("consecutivo between", value1, value2, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoNotBetween(Short value1, Short value2) {
            addCriterion("consecutivo not between", value1, value2, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andPercDedIsNull() {
            addCriterion("perc_ded is null");
            return (Criteria) this;
        }

        public Criteria andPercDedIsNotNull() {
            addCriterion("perc_ded is not null");
            return (Criteria) this;
        }

        public Criteria andPercDedEqualTo(String value) {
            addCriterion("perc_ded =", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedNotEqualTo(String value) {
            addCriterion("perc_ded <>", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedGreaterThan(String value) {
            addCriterion("perc_ded >", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedGreaterThanOrEqualTo(String value) {
            addCriterion("perc_ded >=", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedLessThan(String value) {
            addCriterion("perc_ded <", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedLessThanOrEqualTo(String value) {
            addCriterion("perc_ded <=", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedLike(String value) {
            addCriterion("perc_ded like", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedNotLike(String value) {
            addCriterion("perc_ded not like", value, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedIn(List<String> values) {
            addCriterion("perc_ded in", values, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedNotIn(List<String> values) {
            addCriterion("perc_ded not in", values, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedBetween(String value1, String value2) {
            addCriterion("perc_ded between", value1, value2, "percDed");
            return (Criteria) this;
        }

        public Criteria andPercDedNotBetween(String value1, String value2) {
            addCriterion("perc_ded not between", value1, value2, "percDed");
            return (Criteria) this;
        }

        public Criteria andConceptoIsNull() {
            addCriterion("concepto is null");
            return (Criteria) this;
        }

        public Criteria andConceptoIsNotNull() {
            addCriterion("concepto is not null");
            return (Criteria) this;
        }

        public Criteria andConceptoEqualTo(String value) {
            addCriterion("concepto =", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotEqualTo(String value) {
            addCriterion("concepto <>", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoGreaterThan(String value) {
            addCriterion("concepto >", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoGreaterThanOrEqualTo(String value) {
            addCriterion("concepto >=", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoLessThan(String value) {
            addCriterion("concepto <", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoLessThanOrEqualTo(String value) {
            addCriterion("concepto <=", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoLike(String value) {
            addCriterion("concepto like", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotLike(String value) {
            addCriterion("concepto not like", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoIn(List<String> values) {
            addCriterion("concepto in", values, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotIn(List<String> values) {
            addCriterion("concepto not in", values, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoBetween(String value1, String value2) {
            addCriterion("concepto between", value1, value2, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotBetween(String value1, String value2) {
            addCriterion("concepto not between", value1, value2, "concepto");
            return (Criteria) this;
        }

        public Criteria andImporteIsNull() {
            addCriterion("importe is null");
            return (Criteria) this;
        }

        public Criteria andImporteIsNotNull() {
            addCriterion("importe is not null");
            return (Criteria) this;
        }

        public Criteria andImporteEqualTo(BigDecimal value) {
            addCriterion("importe =", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotEqualTo(BigDecimal value) {
            addCriterion("importe <>", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteGreaterThan(BigDecimal value) {
            addCriterion("importe >", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("importe >=", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteLessThan(BigDecimal value) {
            addCriterion("importe <", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("importe <=", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteIn(List<BigDecimal> values) {
            addCriterion("importe in", values, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotIn(List<BigDecimal> values) {
            addCriterion("importe not in", values, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe between", value1, value2, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe not between", value1, value2, "importe");
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