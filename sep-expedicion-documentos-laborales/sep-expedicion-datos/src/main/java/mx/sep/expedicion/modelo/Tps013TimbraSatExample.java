package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tps013TimbraSatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps013TimbraSatExample() {
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

        public Criteria andSelloDigSepIsNull() {
            addCriterion("sello_dig_sep is null");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepIsNotNull() {
            addCriterion("sello_dig_sep is not null");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepEqualTo(String value) {
            addCriterion("sello_dig_sep =", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepNotEqualTo(String value) {
            addCriterion("sello_dig_sep <>", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepGreaterThan(String value) {
            addCriterion("sello_dig_sep >", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepGreaterThanOrEqualTo(String value) {
            addCriterion("sello_dig_sep >=", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepLessThan(String value) {
            addCriterion("sello_dig_sep <", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepLessThanOrEqualTo(String value) {
            addCriterion("sello_dig_sep <=", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepLike(String value) {
            addCriterion("sello_dig_sep like", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepNotLike(String value) {
            addCriterion("sello_dig_sep not like", value, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepIn(List<String> values) {
            addCriterion("sello_dig_sep in", values, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepNotIn(List<String> values) {
            addCriterion("sello_dig_sep not in", values, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepBetween(String value1, String value2) {
            addCriterion("sello_dig_sep between", value1, value2, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andSelloDigSepNotBetween(String value1, String value2) {
            addCriterion("sello_dig_sep not between", value1, value2, "selloDigSep");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatIsNull() {
            addCriterion("sello_dig_sat is null");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatIsNotNull() {
            addCriterion("sello_dig_sat is not null");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatEqualTo(String value) {
            addCriterion("sello_dig_sat =", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatNotEqualTo(String value) {
            addCriterion("sello_dig_sat <>", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatGreaterThan(String value) {
            addCriterion("sello_dig_sat >", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatGreaterThanOrEqualTo(String value) {
            addCriterion("sello_dig_sat >=", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatLessThan(String value) {
            addCriterion("sello_dig_sat <", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatLessThanOrEqualTo(String value) {
            addCriterion("sello_dig_sat <=", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatLike(String value) {
            addCriterion("sello_dig_sat like", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatNotLike(String value) {
            addCriterion("sello_dig_sat not like", value, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatIn(List<String> values) {
            addCriterion("sello_dig_sat in", values, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatNotIn(List<String> values) {
            addCriterion("sello_dig_sat not in", values, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatBetween(String value1, String value2) {
            addCriterion("sello_dig_sat between", value1, value2, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andSelloDigSatNotBetween(String value1, String value2) {
            addCriterion("sello_dig_sat not between", value1, value2, "selloDigSat");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoIsNull() {
            addCriterion("num_certificado is null");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoIsNotNull() {
            addCriterion("num_certificado is not null");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoEqualTo(String value) {
            addCriterion("num_certificado =", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoNotEqualTo(String value) {
            addCriterion("num_certificado <>", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoGreaterThan(String value) {
            addCriterion("num_certificado >", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoGreaterThanOrEqualTo(String value) {
            addCriterion("num_certificado >=", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoLessThan(String value) {
            addCriterion("num_certificado <", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoLessThanOrEqualTo(String value) {
            addCriterion("num_certificado <=", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoLike(String value) {
            addCriterion("num_certificado like", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoNotLike(String value) {
            addCriterion("num_certificado not like", value, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoIn(List<String> values) {
            addCriterion("num_certificado in", values, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoNotIn(List<String> values) {
            addCriterion("num_certificado not in", values, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoBetween(String value1, String value2) {
            addCriterion("num_certificado between", value1, value2, "numCertificado");
            return (Criteria) this;
        }

        public Criteria andNumCertificadoNotBetween(String value1, String value2) {
            addCriterion("num_certificado not between", value1, value2, "numCertificado");
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