package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tps017RetenedorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps017RetenedorExample() {
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

        public Criteria andIdRetenedorIsNull() {
            addCriterion("id_retenedor is null");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorIsNotNull() {
            addCriterion("id_retenedor is not null");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorEqualTo(Integer value) {
            addCriterion("id_retenedor =", value, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorNotEqualTo(Integer value) {
            addCriterion("id_retenedor <>", value, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorGreaterThan(Integer value) {
            addCriterion("id_retenedor >", value, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_retenedor >=", value, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorLessThan(Integer value) {
            addCriterion("id_retenedor <", value, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorLessThanOrEqualTo(Integer value) {
            addCriterion("id_retenedor <=", value, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorIn(List<Integer> values) {
            addCriterion("id_retenedor in", values, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorNotIn(List<Integer> values) {
            addCriterion("id_retenedor not in", values, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorBetween(Integer value1, Integer value2) {
            addCriterion("id_retenedor between", value1, value2, "idRetenedor");
            return (Criteria) this;
        }

        public Criteria andIdRetenedorNotBetween(Integer value1, Integer value2) {
            addCriterion("id_retenedor not between", value1, value2, "idRetenedor");
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

        public Criteria andRazonSocialIsNull() {
            addCriterion("razon_social is null");
            return (Criteria) this;
        }

        public Criteria andRazonSocialIsNotNull() {
            addCriterion("razon_social is not null");
            return (Criteria) this;
        }

        public Criteria andRazonSocialEqualTo(String value) {
            addCriterion("razon_social =", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialNotEqualTo(String value) {
            addCriterion("razon_social <>", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialGreaterThan(String value) {
            addCriterion("razon_social >", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialGreaterThanOrEqualTo(String value) {
            addCriterion("razon_social >=", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialLessThan(String value) {
            addCriterion("razon_social <", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialLessThanOrEqualTo(String value) {
            addCriterion("razon_social <=", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialLike(String value) {
            addCriterion("razon_social like", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialNotLike(String value) {
            addCriterion("razon_social not like", value, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialIn(List<String> values) {
            addCriterion("razon_social in", values, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialNotIn(List<String> values) {
            addCriterion("razon_social not in", values, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialBetween(String value1, String value2) {
            addCriterion("razon_social between", value1, value2, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andRazonSocialNotBetween(String value1, String value2) {
            addCriterion("razon_social not between", value1, value2, "razonSocial");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteIsNull() {
            addCriterion("nom_representante is null");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteIsNotNull() {
            addCriterion("nom_representante is not null");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteEqualTo(String value) {
            addCriterion("nom_representante =", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteNotEqualTo(String value) {
            addCriterion("nom_representante <>", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteGreaterThan(String value) {
            addCriterion("nom_representante >", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteGreaterThanOrEqualTo(String value) {
            addCriterion("nom_representante >=", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteLessThan(String value) {
            addCriterion("nom_representante <", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteLessThanOrEqualTo(String value) {
            addCriterion("nom_representante <=", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteLike(String value) {
            addCriterion("nom_representante like", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteNotLike(String value) {
            addCriterion("nom_representante not like", value, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteIn(List<String> values) {
            addCriterion("nom_representante in", values, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteNotIn(List<String> values) {
            addCriterion("nom_representante not in", values, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteBetween(String value1, String value2) {
            addCriterion("nom_representante between", value1, value2, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andNomRepresentanteNotBetween(String value1, String value2) {
            addCriterion("nom_representante not between", value1, value2, "nomRepresentante");
            return (Criteria) this;
        }

        public Criteria andCveUnicaIsNull() {
            addCriterion("cve_unica is null");
            return (Criteria) this;
        }

        public Criteria andCveUnicaIsNotNull() {
            addCriterion("cve_unica is not null");
            return (Criteria) this;
        }

        public Criteria andCveUnicaEqualTo(String value) {
            addCriterion("cve_unica =", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaNotEqualTo(String value) {
            addCriterion("cve_unica <>", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaGreaterThan(String value) {
            addCriterion("cve_unica >", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaGreaterThanOrEqualTo(String value) {
            addCriterion("cve_unica >=", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaLessThan(String value) {
            addCriterion("cve_unica <", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaLessThanOrEqualTo(String value) {
            addCriterion("cve_unica <=", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaLike(String value) {
            addCriterion("cve_unica like", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaNotLike(String value) {
            addCriterion("cve_unica not like", value, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaIn(List<String> values) {
            addCriterion("cve_unica in", values, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaNotIn(List<String> values) {
            addCriterion("cve_unica not in", values, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaBetween(String value1, String value2) {
            addCriterion("cve_unica between", value1, value2, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andCveUnicaNotBetween(String value1, String value2) {
            addCriterion("cve_unica not between", value1, value2, "cveUnica");
            return (Criteria) this;
        }

        public Criteria andAnioIniIsNull() {
            addCriterion("anio_ini is null");
            return (Criteria) this;
        }

        public Criteria andAnioIniIsNotNull() {
            addCriterion("anio_ini is not null");
            return (Criteria) this;
        }

        public Criteria andAnioIniEqualTo(Integer value) {
            addCriterion("anio_ini =", value, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniNotEqualTo(Integer value) {
            addCriterion("anio_ini <>", value, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniGreaterThan(Integer value) {
            addCriterion("anio_ini >", value, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniGreaterThanOrEqualTo(Integer value) {
            addCriterion("anio_ini >=", value, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniLessThan(Integer value) {
            addCriterion("anio_ini <", value, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniLessThanOrEqualTo(Integer value) {
            addCriterion("anio_ini <=", value, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniIn(List<Integer> values) {
            addCriterion("anio_ini in", values, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniNotIn(List<Integer> values) {
            addCriterion("anio_ini not in", values, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniBetween(Integer value1, Integer value2) {
            addCriterion("anio_ini between", value1, value2, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioIniNotBetween(Integer value1, Integer value2) {
            addCriterion("anio_ini not between", value1, value2, "anioIni");
            return (Criteria) this;
        }

        public Criteria andAnioFinIsNull() {
            addCriterion("anio_fin is null");
            return (Criteria) this;
        }

        public Criteria andAnioFinIsNotNull() {
            addCriterion("anio_fin is not null");
            return (Criteria) this;
        }

        public Criteria andAnioFinEqualTo(Integer value) {
            addCriterion("anio_fin =", value, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinNotEqualTo(Integer value) {
            addCriterion("anio_fin <>", value, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinGreaterThan(Integer value) {
            addCriterion("anio_fin >", value, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinGreaterThanOrEqualTo(Integer value) {
            addCriterion("anio_fin >=", value, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinLessThan(Integer value) {
            addCriterion("anio_fin <", value, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinLessThanOrEqualTo(Integer value) {
            addCriterion("anio_fin <=", value, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinIn(List<Integer> values) {
            addCriterion("anio_fin in", values, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinNotIn(List<Integer> values) {
            addCriterion("anio_fin not in", values, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinBetween(Integer value1, Integer value2) {
            addCriterion("anio_fin between", value1, value2, "anioFin");
            return (Criteria) this;
        }

        public Criteria andAnioFinNotBetween(Integer value1, Integer value2) {
            addCriterion("anio_fin not between", value1, value2, "anioFin");
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