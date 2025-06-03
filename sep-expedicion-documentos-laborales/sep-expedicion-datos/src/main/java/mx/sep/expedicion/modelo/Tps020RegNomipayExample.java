package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tps020RegNomipayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps020RegNomipayExample() {
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

        public Criteria andIdRegistroIsNull() {
            addCriterion("id_registro is null");
            return (Criteria) this;
        }

        public Criteria andIdRegistroIsNotNull() {
            addCriterion("id_registro is not null");
            return (Criteria) this;
        }

        public Criteria andIdRegistroEqualTo(Integer value) {
            addCriterion("id_registro =", value, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroNotEqualTo(Integer value) {
            addCriterion("id_registro <>", value, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroGreaterThan(Integer value) {
            addCriterion("id_registro >", value, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_registro >=", value, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroLessThan(Integer value) {
            addCriterion("id_registro <", value, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroLessThanOrEqualTo(Integer value) {
            addCriterion("id_registro <=", value, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroIn(List<Integer> values) {
            addCriterion("id_registro in", values, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroNotIn(List<Integer> values) {
            addCriterion("id_registro not in", values, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroBetween(Integer value1, Integer value2) {
            addCriterion("id_registro between", value1, value2, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andIdRegistroNotBetween(Integer value1, Integer value2) {
            addCriterion("id_registro not between", value1, value2, "idRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroIsNull() {
            addCriterion("fecha_registro is null");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroIsNotNull() {
            addCriterion("fecha_registro is not null");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroEqualTo(Date value) {
            addCriterion("fecha_registro =", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroNotEqualTo(Date value) {
            addCriterion("fecha_registro <>", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroGreaterThan(Date value) {
            addCriterion("fecha_registro >", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_registro >=", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroLessThan(Date value) {
            addCriterion("fecha_registro <", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroLessThanOrEqualTo(Date value) {
            addCriterion("fecha_registro <=", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroIn(List<Date> values) {
            addCriterion("fecha_registro in", values, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroNotIn(List<Date> values) {
            addCriterion("fecha_registro not in", values, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroBetween(Date value1, Date value2) {
            addCriterion("fecha_registro between", value1, value2, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroNotBetween(Date value1, Date value2) {
            addCriterion("fecha_registro not between", value1, value2, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaIsNull() {
            addCriterion("llave_compuesta is null");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaIsNotNull() {
            addCriterion("llave_compuesta is not null");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaEqualTo(String value) {
            addCriterion("llave_compuesta =", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaNotEqualTo(String value) {
            addCriterion("llave_compuesta <>", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaGreaterThan(String value) {
            addCriterion("llave_compuesta >", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaGreaterThanOrEqualTo(String value) {
            addCriterion("llave_compuesta >=", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaLessThan(String value) {
            addCriterion("llave_compuesta <", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaLessThanOrEqualTo(String value) {
            addCriterion("llave_compuesta <=", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaLike(String value) {
            addCriterion("llave_compuesta like", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaNotLike(String value) {
            addCriterion("llave_compuesta not like", value, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaIn(List<String> values) {
            addCriterion("llave_compuesta in", values, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaNotIn(List<String> values) {
            addCriterion("llave_compuesta not in", values, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaBetween(String value1, String value2) {
            addCriterion("llave_compuesta between", value1, value2, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andLlaveCompuestaNotBetween(String value1, String value2) {
            addCriterion("llave_compuesta not between", value1, value2, "llaveCompuesta");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorIsNull() {
            addCriterion("rfc_trabajador is null");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorIsNotNull() {
            addCriterion("rfc_trabajador is not null");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorEqualTo(String value) {
            addCriterion("rfc_trabajador =", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorNotEqualTo(String value) {
            addCriterion("rfc_trabajador <>", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorGreaterThan(String value) {
            addCriterion("rfc_trabajador >", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorGreaterThanOrEqualTo(String value) {
            addCriterion("rfc_trabajador >=", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorLessThan(String value) {
            addCriterion("rfc_trabajador <", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorLessThanOrEqualTo(String value) {
            addCriterion("rfc_trabajador <=", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorLike(String value) {
            addCriterion("rfc_trabajador like", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorNotLike(String value) {
            addCriterion("rfc_trabajador not like", value, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorIn(List<String> values) {
            addCriterion("rfc_trabajador in", values, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorNotIn(List<String> values) {
            addCriterion("rfc_trabajador not in", values, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorBetween(String value1, String value2) {
            addCriterion("rfc_trabajador between", value1, value2, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andRfcTrabajadorNotBetween(String value1, String value2) {
            addCriterion("rfc_trabajador not between", value1, value2, "rfcTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorIsNull() {
            addCriterion("nomina_trabajador is null");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorIsNotNull() {
            addCriterion("nomina_trabajador is not null");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorEqualTo(Short value) {
            addCriterion("nomina_trabajador =", value, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorNotEqualTo(Short value) {
            addCriterion("nomina_trabajador <>", value, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorGreaterThan(Short value) {
            addCriterion("nomina_trabajador >", value, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorGreaterThanOrEqualTo(Short value) {
            addCriterion("nomina_trabajador >=", value, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorLessThan(Short value) {
            addCriterion("nomina_trabajador <", value, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorLessThanOrEqualTo(Short value) {
            addCriterion("nomina_trabajador <=", value, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorIn(List<Short> values) {
            addCriterion("nomina_trabajador in", values, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorNotIn(List<Short> values) {
            addCriterion("nomina_trabajador not in", values, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorBetween(Short value1, Short value2) {
            addCriterion("nomina_trabajador between", value1, value2, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andNominaTrabajadorNotBetween(Short value1, Short value2) {
            addCriterion("nomina_trabajador not between", value1, value2, "nominaTrabajador");
            return (Criteria) this;
        }

        public Criteria andEstatusIsNull() {
            addCriterion("estatus is null");
            return (Criteria) this;
        }

        public Criteria andEstatusIsNotNull() {
            addCriterion("estatus is not null");
            return (Criteria) this;
        }

        public Criteria andEstatusEqualTo(String value) {
            addCriterion("estatus =", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotEqualTo(String value) {
            addCriterion("estatus <>", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusGreaterThan(String value) {
            addCriterion("estatus >", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusGreaterThanOrEqualTo(String value) {
            addCriterion("estatus >=", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusLessThan(String value) {
            addCriterion("estatus <", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusLessThanOrEqualTo(String value) {
            addCriterion("estatus <=", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusLike(String value) {
            addCriterion("estatus like", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotLike(String value) {
            addCriterion("estatus not like", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusIn(List<String> values) {
            addCriterion("estatus in", values, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotIn(List<String> values) {
            addCriterion("estatus not in", values, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusBetween(String value1, String value2) {
            addCriterion("estatus between", value1, value2, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotBetween(String value1, String value2) {
            addCriterion("estatus not between", value1, value2, "estatus");
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