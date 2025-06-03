package mx.sep.expedicion.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Tps021ReporteIsrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps021ReporteIsrExample() {
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

        public Criteria andIdRepIsrIsNull() {
            addCriterion("id_rep_isr is null");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrIsNotNull() {
            addCriterion("id_rep_isr is not null");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrEqualTo(Integer value) {
            addCriterion("id_rep_isr =", value, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrNotEqualTo(Integer value) {
            addCriterion("id_rep_isr <>", value, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrGreaterThan(Integer value) {
            addCriterion("id_rep_isr >", value, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_rep_isr >=", value, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrLessThan(Integer value) {
            addCriterion("id_rep_isr <", value, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrLessThanOrEqualTo(Integer value) {
            addCriterion("id_rep_isr <=", value, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrIn(List<Integer> values) {
            addCriterion("id_rep_isr in", values, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrNotIn(List<Integer> values) {
            addCriterion("id_rep_isr not in", values, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrBetween(Integer value1, Integer value2) {
            addCriterion("id_rep_isr between", value1, value2, "idRepIsr");
            return (Criteria) this;
        }

        public Criteria andIdRepIsrNotBetween(Integer value1, Integer value2) {
            addCriterion("id_rep_isr not between", value1, value2, "idRepIsr");
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

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andCurpIsNull() {
            addCriterion("curp is null");
            return (Criteria) this;
        }

        public Criteria andCurpIsNotNull() {
            addCriterion("curp is not null");
            return (Criteria) this;
        }

        public Criteria andCurpEqualTo(String value) {
            addCriterion("curp =", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotEqualTo(String value) {
            addCriterion("curp <>", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpGreaterThan(String value) {
            addCriterion("curp >", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpGreaterThanOrEqualTo(String value) {
            addCriterion("curp >=", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpLessThan(String value) {
            addCriterion("curp <", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpLessThanOrEqualTo(String value) {
            addCriterion("curp <=", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpLike(String value) {
            addCriterion("curp like", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotLike(String value) {
            addCriterion("curp not like", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpIn(List<String> values) {
            addCriterion("curp in", values, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotIn(List<String> values) {
            addCriterion("curp not in", values, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpBetween(String value1, String value2) {
            addCriterion("curp between", value1, value2, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotBetween(String value1, String value2) {
            addCriterion("curp not between", value1, value2, "curp");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoIsNull() {
            addCriterion("ing_anual_sueldo is null");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoIsNotNull() {
            addCriterion("ing_anual_sueldo is not null");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoEqualTo(BigDecimal value) {
            addCriterion("ing_anual_sueldo =", value, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoNotEqualTo(BigDecimal value) {
            addCriterion("ing_anual_sueldo <>", value, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoGreaterThan(BigDecimal value) {
            addCriterion("ing_anual_sueldo >", value, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_anual_sueldo >=", value, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoLessThan(BigDecimal value) {
            addCriterion("ing_anual_sueldo <", value, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_anual_sueldo <=", value, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoIn(List<BigDecimal> values) {
            addCriterion("ing_anual_sueldo in", values, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoNotIn(List<BigDecimal> values) {
            addCriterion("ing_anual_sueldo not in", values, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_anual_sueldo between", value1, value2, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualSueldoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_anual_sueldo not between", value1, value2, "ingAnualSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoIsNull() {
            addCriterion("ing_exc_sueldo is null");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoIsNotNull() {
            addCriterion("ing_exc_sueldo is not null");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoEqualTo(BigDecimal value) {
            addCriterion("ing_exc_sueldo =", value, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoNotEqualTo(BigDecimal value) {
            addCriterion("ing_exc_sueldo <>", value, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoGreaterThan(BigDecimal value) {
            addCriterion("ing_exc_sueldo >", value, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_exc_sueldo >=", value, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoLessThan(BigDecimal value) {
            addCriterion("ing_exc_sueldo <", value, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_exc_sueldo <=", value, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoIn(List<BigDecimal> values) {
            addCriterion("ing_exc_sueldo in", values, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoNotIn(List<BigDecimal> values) {
            addCriterion("ing_exc_sueldo not in", values, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_exc_sueldo between", value1, value2, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngExcSueldoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_exc_sueldo not between", value1, value2, "ingExcSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoIsNull() {
            addCriterion("ing_acum_sueldo is null");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoIsNotNull() {
            addCriterion("ing_acum_sueldo is not null");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoEqualTo(BigDecimal value) {
            addCriterion("ing_acum_sueldo =", value, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoNotEqualTo(BigDecimal value) {
            addCriterion("ing_acum_sueldo <>", value, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoGreaterThan(BigDecimal value) {
            addCriterion("ing_acum_sueldo >", value, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_acum_sueldo >=", value, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoLessThan(BigDecimal value) {
            addCriterion("ing_acum_sueldo <", value, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_acum_sueldo <=", value, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoIn(List<BigDecimal> values) {
            addCriterion("ing_acum_sueldo in", values, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoNotIn(List<BigDecimal> values) {
            addCriterion("ing_acum_sueldo not in", values, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_acum_sueldo between", value1, value2, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAcumSueldoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_acum_sueldo not between", value1, value2, "ingAcumSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoIsNull() {
            addCriterion("subsidio_sueldo is null");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoIsNotNull() {
            addCriterion("subsidio_sueldo is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoEqualTo(BigDecimal value) {
            addCriterion("subsidio_sueldo =", value, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoNotEqualTo(BigDecimal value) {
            addCriterion("subsidio_sueldo <>", value, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoGreaterThan(BigDecimal value) {
            addCriterion("subsidio_sueldo >", value, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidio_sueldo >=", value, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoLessThan(BigDecimal value) {
            addCriterion("subsidio_sueldo <", value, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidio_sueldo <=", value, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoIn(List<BigDecimal> values) {
            addCriterion("subsidio_sueldo in", values, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoNotIn(List<BigDecimal> values) {
            addCriterion("subsidio_sueldo not in", values, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidio_sueldo between", value1, value2, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andSubsidioSueldoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidio_sueldo not between", value1, value2, "subsidioSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoIsNull() {
            addCriterion("imp_ret_sueldo is null");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoIsNotNull() {
            addCriterion("imp_ret_sueldo is not null");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoEqualTo(BigDecimal value) {
            addCriterion("imp_ret_sueldo =", value, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoNotEqualTo(BigDecimal value) {
            addCriterion("imp_ret_sueldo <>", value, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoGreaterThan(BigDecimal value) {
            addCriterion("imp_ret_sueldo >", value, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("imp_ret_sueldo >=", value, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoLessThan(BigDecimal value) {
            addCriterion("imp_ret_sueldo <", value, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("imp_ret_sueldo <=", value, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoIn(List<BigDecimal> values) {
            addCriterion("imp_ret_sueldo in", values, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoNotIn(List<BigDecimal> values) {
            addCriterion("imp_ret_sueldo not in", values, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("imp_ret_sueldo between", value1, value2, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andImpRetSueldoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("imp_ret_sueldo not between", value1, value2, "impRetSueldo");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorIsNull() {
            addCriterion("ing_anual_honor is null");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorIsNotNull() {
            addCriterion("ing_anual_honor is not null");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorEqualTo(BigDecimal value) {
            addCriterion("ing_anual_honor =", value, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorNotEqualTo(BigDecimal value) {
            addCriterion("ing_anual_honor <>", value, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorGreaterThan(BigDecimal value) {
            addCriterion("ing_anual_honor >", value, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_anual_honor >=", value, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorLessThan(BigDecimal value) {
            addCriterion("ing_anual_honor <", value, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_anual_honor <=", value, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorIn(List<BigDecimal> values) {
            addCriterion("ing_anual_honor in", values, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorNotIn(List<BigDecimal> values) {
            addCriterion("ing_anual_honor not in", values, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_anual_honor between", value1, value2, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualHonorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_anual_honor not between", value1, value2, "ingAnualHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorIsNull() {
            addCriterion("ing_exc_honor is null");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorIsNotNull() {
            addCriterion("ing_exc_honor is not null");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorEqualTo(BigDecimal value) {
            addCriterion("ing_exc_honor =", value, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorNotEqualTo(BigDecimal value) {
            addCriterion("ing_exc_honor <>", value, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorGreaterThan(BigDecimal value) {
            addCriterion("ing_exc_honor >", value, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_exc_honor >=", value, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorLessThan(BigDecimal value) {
            addCriterion("ing_exc_honor <", value, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_exc_honor <=", value, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorIn(List<BigDecimal> values) {
            addCriterion("ing_exc_honor in", values, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorNotIn(List<BigDecimal> values) {
            addCriterion("ing_exc_honor not in", values, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_exc_honor between", value1, value2, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngExcHonorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_exc_honor not between", value1, value2, "ingExcHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorIsNull() {
            addCriterion("ing_acum_honor is null");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorIsNotNull() {
            addCriterion("ing_acum_honor is not null");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorEqualTo(BigDecimal value) {
            addCriterion("ing_acum_honor =", value, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorNotEqualTo(BigDecimal value) {
            addCriterion("ing_acum_honor <>", value, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorGreaterThan(BigDecimal value) {
            addCriterion("ing_acum_honor >", value, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_acum_honor >=", value, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorLessThan(BigDecimal value) {
            addCriterion("ing_acum_honor <", value, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_acum_honor <=", value, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorIn(List<BigDecimal> values) {
            addCriterion("ing_acum_honor in", values, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorNotIn(List<BigDecimal> values) {
            addCriterion("ing_acum_honor not in", values, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_acum_honor between", value1, value2, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andIngAcumHonorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_acum_honor not between", value1, value2, "ingAcumHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorIsNull() {
            addCriterion("subsidio_honor is null");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorIsNotNull() {
            addCriterion("subsidio_honor is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorEqualTo(BigDecimal value) {
            addCriterion("subsidio_honor =", value, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorNotEqualTo(BigDecimal value) {
            addCriterion("subsidio_honor <>", value, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorGreaterThan(BigDecimal value) {
            addCriterion("subsidio_honor >", value, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidio_honor >=", value, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorLessThan(BigDecimal value) {
            addCriterion("subsidio_honor <", value, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidio_honor <=", value, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorIn(List<BigDecimal> values) {
            addCriterion("subsidio_honor in", values, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorNotIn(List<BigDecimal> values) {
            addCriterion("subsidio_honor not in", values, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidio_honor between", value1, value2, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andSubsidioHonorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidio_honor not between", value1, value2, "subsidioHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorIsNull() {
            addCriterion("imp_ret_honor is null");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorIsNotNull() {
            addCriterion("imp_ret_honor is not null");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorEqualTo(BigDecimal value) {
            addCriterion("imp_ret_honor =", value, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorNotEqualTo(BigDecimal value) {
            addCriterion("imp_ret_honor <>", value, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorGreaterThan(BigDecimal value) {
            addCriterion("imp_ret_honor >", value, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("imp_ret_honor >=", value, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorLessThan(BigDecimal value) {
            addCriterion("imp_ret_honor <", value, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("imp_ret_honor <=", value, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorIn(List<BigDecimal> values) {
            addCriterion("imp_ret_honor in", values, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorNotIn(List<BigDecimal> values) {
            addCriterion("imp_ret_honor not in", values, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("imp_ret_honor between", value1, value2, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andImpRetHonorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("imp_ret_honor not between", value1, value2, "impRetHonor");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaIsNull() {
            addCriterion("ing_anual_separa is null");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaIsNotNull() {
            addCriterion("ing_anual_separa is not null");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaEqualTo(BigDecimal value) {
            addCriterion("ing_anual_separa =", value, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaNotEqualTo(BigDecimal value) {
            addCriterion("ing_anual_separa <>", value, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaGreaterThan(BigDecimal value) {
            addCriterion("ing_anual_separa >", value, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_anual_separa >=", value, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaLessThan(BigDecimal value) {
            addCriterion("ing_anual_separa <", value, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_anual_separa <=", value, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaIn(List<BigDecimal> values) {
            addCriterion("ing_anual_separa in", values, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaNotIn(List<BigDecimal> values) {
            addCriterion("ing_anual_separa not in", values, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_anual_separa between", value1, value2, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngAnualSeparaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_anual_separa not between", value1, value2, "ingAnualSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaIsNull() {
            addCriterion("ing_exc_separa is null");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaIsNotNull() {
            addCriterion("ing_exc_separa is not null");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaEqualTo(BigDecimal value) {
            addCriterion("ing_exc_separa =", value, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaNotEqualTo(BigDecimal value) {
            addCriterion("ing_exc_separa <>", value, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaGreaterThan(BigDecimal value) {
            addCriterion("ing_exc_separa >", value, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_exc_separa >=", value, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaLessThan(BigDecimal value) {
            addCriterion("ing_exc_separa <", value, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_exc_separa <=", value, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaIn(List<BigDecimal> values) {
            addCriterion("ing_exc_separa in", values, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaNotIn(List<BigDecimal> values) {
            addCriterion("ing_exc_separa not in", values, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_exc_separa between", value1, value2, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngExcSeparaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_exc_separa not between", value1, value2, "ingExcSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaIsNull() {
            addCriterion("ing_acum_separa is null");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaIsNotNull() {
            addCriterion("ing_acum_separa is not null");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaEqualTo(BigDecimal value) {
            addCriterion("ing_acum_separa =", value, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaNotEqualTo(BigDecimal value) {
            addCriterion("ing_acum_separa <>", value, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaGreaterThan(BigDecimal value) {
            addCriterion("ing_acum_separa >", value, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_acum_separa >=", value, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaLessThan(BigDecimal value) {
            addCriterion("ing_acum_separa <", value, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ing_acum_separa <=", value, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaIn(List<BigDecimal> values) {
            addCriterion("ing_acum_separa in", values, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaNotIn(List<BigDecimal> values) {
            addCriterion("ing_acum_separa not in", values, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_acum_separa between", value1, value2, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andIngAcumSeparaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ing_acum_separa not between", value1, value2, "ingAcumSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaIsNull() {
            addCriterion("subsidio_separa is null");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaIsNotNull() {
            addCriterion("subsidio_separa is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaEqualTo(BigDecimal value) {
            addCriterion("subsidio_separa =", value, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaNotEqualTo(BigDecimal value) {
            addCriterion("subsidio_separa <>", value, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaGreaterThan(BigDecimal value) {
            addCriterion("subsidio_separa >", value, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidio_separa >=", value, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaLessThan(BigDecimal value) {
            addCriterion("subsidio_separa <", value, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidio_separa <=", value, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaIn(List<BigDecimal> values) {
            addCriterion("subsidio_separa in", values, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaNotIn(List<BigDecimal> values) {
            addCriterion("subsidio_separa not in", values, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidio_separa between", value1, value2, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andSubsidioSeparaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidio_separa not between", value1, value2, "subsidioSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaIsNull() {
            addCriterion("imp_ret_separa is null");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaIsNotNull() {
            addCriterion("imp_ret_separa is not null");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaEqualTo(BigDecimal value) {
            addCriterion("imp_ret_separa =", value, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaNotEqualTo(BigDecimal value) {
            addCriterion("imp_ret_separa <>", value, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaGreaterThan(BigDecimal value) {
            addCriterion("imp_ret_separa >", value, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("imp_ret_separa >=", value, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaLessThan(BigDecimal value) {
            addCriterion("imp_ret_separa <", value, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("imp_ret_separa <=", value, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaIn(List<BigDecimal> values) {
            addCriterion("imp_ret_separa in", values, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaNotIn(List<BigDecimal> values) {
            addCriterion("imp_ret_separa not in", values, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("imp_ret_separa between", value1, value2, "impRetSepara");
            return (Criteria) this;
        }

        public Criteria andImpRetSeparaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("imp_ret_separa not between", value1, value2, "impRetSepara");
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