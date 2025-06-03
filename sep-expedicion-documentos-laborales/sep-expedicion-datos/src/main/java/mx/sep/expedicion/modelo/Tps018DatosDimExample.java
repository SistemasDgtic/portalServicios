package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tps018DatosDimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps018DatosDimExample() {
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

        public Criteria andIdDatosIsNull() {
            addCriterion("id_datos is null");
            return (Criteria) this;
        }

        public Criteria andIdDatosIsNotNull() {
            addCriterion("id_datos is not null");
            return (Criteria) this;
        }

        public Criteria andIdDatosEqualTo(Integer value) {
            addCriterion("id_datos =", value, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosNotEqualTo(Integer value) {
            addCriterion("id_datos <>", value, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosGreaterThan(Integer value) {
            addCriterion("id_datos >", value, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_datos >=", value, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosLessThan(Integer value) {
            addCriterion("id_datos <", value, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosLessThanOrEqualTo(Integer value) {
            addCriterion("id_datos <=", value, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosIn(List<Integer> values) {
            addCriterion("id_datos in", values, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosNotIn(List<Integer> values) {
            addCriterion("id_datos not in", values, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosBetween(Integer value1, Integer value2) {
            addCriterion("id_datos between", value1, value2, "idDatos");
            return (Criteria) this;
        }

        public Criteria andIdDatosNotBetween(Integer value1, Integer value2) {
            addCriterion("id_datos not between", value1, value2, "idDatos");
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

        public Criteria andAnioEqualTo(Integer value) {
            addCriterion("anio =", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioNotEqualTo(Integer value) {
            addCriterion("anio <>", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioGreaterThan(Integer value) {
            addCriterion("anio >", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioGreaterThanOrEqualTo(Integer value) {
            addCriterion("anio >=", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioLessThan(Integer value) {
            addCriterion("anio <", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioLessThanOrEqualTo(Integer value) {
            addCriterion("anio <=", value, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioIn(List<Integer> values) {
            addCriterion("anio in", values, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioNotIn(List<Integer> values) {
            addCriterion("anio not in", values, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioBetween(Integer value1, Integer value2) {
            addCriterion("anio between", value1, value2, "anio");
            return (Criteria) this;
        }

        public Criteria andAnioNotBetween(Integer value1, Integer value2) {
            addCriterion("anio not between", value1, value2, "anio");
            return (Criteria) this;
        }

        public Criteria andNumFolioIsNull() {
            addCriterion("num_folio is null");
            return (Criteria) this;
        }

        public Criteria andNumFolioIsNotNull() {
            addCriterion("num_folio is not null");
            return (Criteria) this;
        }

        public Criteria andNumFolioEqualTo(String value) {
            addCriterion("num_folio =", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioNotEqualTo(String value) {
            addCriterion("num_folio <>", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioGreaterThan(String value) {
            addCriterion("num_folio >", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioGreaterThanOrEqualTo(String value) {
            addCriterion("num_folio >=", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioLessThan(String value) {
            addCriterion("num_folio <", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioLessThanOrEqualTo(String value) {
            addCriterion("num_folio <=", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioLike(String value) {
            addCriterion("num_folio like", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioNotLike(String value) {
            addCriterion("num_folio not like", value, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioIn(List<String> values) {
            addCriterion("num_folio in", values, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioNotIn(List<String> values) {
            addCriterion("num_folio not in", values, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioBetween(String value1, String value2) {
            addCriterion("num_folio between", value1, value2, "numFolio");
            return (Criteria) this;
        }

        public Criteria andNumFolioNotBetween(String value1, String value2) {
            addCriterion("num_folio not between", value1, value2, "numFolio");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionIsNull() {
            addCriterion("fecha_presentacion is null");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionIsNotNull() {
            addCriterion("fecha_presentacion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_presentacion =", value, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_presentacion <>", value, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha_presentacion >", value, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_presentacion >=", value, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionLessThan(Date value) {
            addCriterionForJDBCDate("fecha_presentacion <", value, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_presentacion <=", value, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_presentacion in", values, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_presentacion not in", values, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_presentacion between", value1, value2, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andFechaPresentacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_presentacion not between", value1, value2, "fechaPresentacion");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNull() {
            addCriterion("usuario is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNotNull() {
            addCriterion("usuario is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioEqualTo(String value) {
            addCriterion("usuario =", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotEqualTo(String value) {
            addCriterion("usuario <>", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThan(String value) {
            addCriterion("usuario >", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("usuario >=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThan(String value) {
            addCriterion("usuario <", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThanOrEqualTo(String value) {
            addCriterion("usuario <=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLike(String value) {
            addCriterion("usuario like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotLike(String value) {
            addCriterion("usuario not like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioIn(List<String> values) {
            addCriterion("usuario in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotIn(List<String> values) {
            addCriterion("usuario not in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioBetween(String value1, String value2) {
            addCriterion("usuario between", value1, value2, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotBetween(String value1, String value2) {
            addCriterion("usuario not between", value1, value2, "usuario");
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