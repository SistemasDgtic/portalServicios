package mx.sep.expedicion.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Tps015IsrAnualExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps015IsrAnualExample() {
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

        public Criteria andNomEmpIsNull() {
            addCriterion("nom_emp is null");
            return (Criteria) this;
        }

        public Criteria andNomEmpIsNotNull() {
            addCriterion("nom_emp is not null");
            return (Criteria) this;
        }

        public Criteria andNomEmpEqualTo(String value) {
            addCriterion("nom_emp =", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpNotEqualTo(String value) {
            addCriterion("nom_emp <>", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpGreaterThan(String value) {
            addCriterion("nom_emp >", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpGreaterThanOrEqualTo(String value) {
            addCriterion("nom_emp >=", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpLessThan(String value) {
            addCriterion("nom_emp <", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpLessThanOrEqualTo(String value) {
            addCriterion("nom_emp <=", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpLike(String value) {
            addCriterion("nom_emp like", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpNotLike(String value) {
            addCriterion("nom_emp not like", value, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpIn(List<String> values) {
            addCriterion("nom_emp in", values, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpNotIn(List<String> values) {
            addCriterion("nom_emp not in", values, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpBetween(String value1, String value2) {
            addCriterion("nom_emp between", value1, value2, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andNomEmpNotBetween(String value1, String value2) {
            addCriterion("nom_emp not between", value1, value2, "nomEmp");
            return (Criteria) this;
        }

        public Criteria andEntFedIsNull() {
            addCriterion("ent_fed is null");
            return (Criteria) this;
        }

        public Criteria andEntFedIsNotNull() {
            addCriterion("ent_fed is not null");
            return (Criteria) this;
        }

        public Criteria andEntFedEqualTo(Short value) {
            addCriterion("ent_fed =", value, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedNotEqualTo(Short value) {
            addCriterion("ent_fed <>", value, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedGreaterThan(Short value) {
            addCriterion("ent_fed >", value, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedGreaterThanOrEqualTo(Short value) {
            addCriterion("ent_fed >=", value, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedLessThan(Short value) {
            addCriterion("ent_fed <", value, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedLessThanOrEqualTo(Short value) {
            addCriterion("ent_fed <=", value, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedIn(List<Short> values) {
            addCriterion("ent_fed in", values, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedNotIn(List<Short> values) {
            addCriterion("ent_fed not in", values, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedBetween(Short value1, Short value2) {
            addCriterion("ent_fed between", value1, value2, "entFed");
            return (Criteria) this;
        }

        public Criteria andEntFedNotBetween(Short value1, Short value2) {
            addCriterion("ent_fed not between", value1, value2, "entFed");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaIsNull() {
            addCriterion("area_geografica is null");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaIsNotNull() {
            addCriterion("area_geografica is not null");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaEqualTo(String value) {
            addCriterion("area_geografica =", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaNotEqualTo(String value) {
            addCriterion("area_geografica <>", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaGreaterThan(String value) {
            addCriterion("area_geografica >", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaGreaterThanOrEqualTo(String value) {
            addCriterion("area_geografica >=", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaLessThan(String value) {
            addCriterion("area_geografica <", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaLessThanOrEqualTo(String value) {
            addCriterion("area_geografica <=", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaLike(String value) {
            addCriterion("area_geografica like", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaNotLike(String value) {
            addCriterion("area_geografica not like", value, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaIn(List<String> values) {
            addCriterion("area_geografica in", values, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaNotIn(List<String> values) {
            addCriterion("area_geografica not in", values, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaBetween(String value1, String value2) {
            addCriterion("area_geografica between", value1, value2, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andAreaGeograficaNotBetween(String value1, String value2) {
            addCriterion("area_geografica not between", value1, value2, "areaGeografica");
            return (Criteria) this;
        }

        public Criteria andQnaIniIsNull() {
            addCriterion("qna_ini is null");
            return (Criteria) this;
        }

        public Criteria andQnaIniIsNotNull() {
            addCriterion("qna_ini is not null");
            return (Criteria) this;
        }

        public Criteria andQnaIniEqualTo(Integer value) {
            addCriterion("qna_ini =", value, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniNotEqualTo(Integer value) {
            addCriterion("qna_ini <>", value, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniGreaterThan(Integer value) {
            addCriterion("qna_ini >", value, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniGreaterThanOrEqualTo(Integer value) {
            addCriterion("qna_ini >=", value, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniLessThan(Integer value) {
            addCriterion("qna_ini <", value, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniLessThanOrEqualTo(Integer value) {
            addCriterion("qna_ini <=", value, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniIn(List<Integer> values) {
            addCriterion("qna_ini in", values, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniNotIn(List<Integer> values) {
            addCriterion("qna_ini not in", values, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniBetween(Integer value1, Integer value2) {
            addCriterion("qna_ini between", value1, value2, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaIniNotBetween(Integer value1, Integer value2) {
            addCriterion("qna_ini not between", value1, value2, "qnaIni");
            return (Criteria) this;
        }

        public Criteria andQnaFinIsNull() {
            addCriterion("qna_fin is null");
            return (Criteria) this;
        }

        public Criteria andQnaFinIsNotNull() {
            addCriterion("qna_fin is not null");
            return (Criteria) this;
        }

        public Criteria andQnaFinEqualTo(Integer value) {
            addCriterion("qna_fin =", value, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinNotEqualTo(Integer value) {
            addCriterion("qna_fin <>", value, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinGreaterThan(Integer value) {
            addCriterion("qna_fin >", value, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinGreaterThanOrEqualTo(Integer value) {
            addCriterion("qna_fin >=", value, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinLessThan(Integer value) {
            addCriterion("qna_fin <", value, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinLessThanOrEqualTo(Integer value) {
            addCriterion("qna_fin <=", value, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinIn(List<Integer> values) {
            addCriterion("qna_fin in", values, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinNotIn(List<Integer> values) {
            addCriterion("qna_fin not in", values, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinBetween(Integer value1, Integer value2) {
            addCriterion("qna_fin between", value1, value2, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andQnaFinNotBetween(Integer value1, Integer value2) {
            addCriterion("qna_fin not between", value1, value2, "qnaFin");
            return (Criteria) this;
        }

        public Criteria andImpSubIsNull() {
            addCriterion("imp_sub is null");
            return (Criteria) this;
        }

        public Criteria andImpSubIsNotNull() {
            addCriterion("imp_sub is not null");
            return (Criteria) this;
        }

        public Criteria andImpSubEqualTo(Integer value) {
            addCriterion("imp_sub =", value, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubNotEqualTo(Integer value) {
            addCriterion("imp_sub <>", value, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubGreaterThan(Integer value) {
            addCriterion("imp_sub >", value, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubGreaterThanOrEqualTo(Integer value) {
            addCriterion("imp_sub >=", value, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubLessThan(Integer value) {
            addCriterion("imp_sub <", value, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubLessThanOrEqualTo(Integer value) {
            addCriterion("imp_sub <=", value, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubIn(List<Integer> values) {
            addCriterion("imp_sub in", values, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubNotIn(List<Integer> values) {
            addCriterion("imp_sub not in", values, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubBetween(Integer value1, Integer value2) {
            addCriterion("imp_sub between", value1, value2, "impSub");
            return (Criteria) this;
        }

        public Criteria andImpSubNotBetween(Integer value1, Integer value2) {
            addCriterion("imp_sub not between", value1, value2, "impSub");
            return (Criteria) this;
        }

        public Criteria andIsrAnualIsNull() {
            addCriterion("isr_anual is null");
            return (Criteria) this;
        }

        public Criteria andIsrAnualIsNotNull() {
            addCriterion("isr_anual is not null");
            return (Criteria) this;
        }

        public Criteria andIsrAnualEqualTo(BigDecimal value) {
            addCriterion("isr_anual =", value, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualNotEqualTo(BigDecimal value) {
            addCriterion("isr_anual <>", value, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualGreaterThan(BigDecimal value) {
            addCriterion("isr_anual >", value, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("isr_anual >=", value, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualLessThan(BigDecimal value) {
            addCriterion("isr_anual <", value, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("isr_anual <=", value, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualIn(List<BigDecimal> values) {
            addCriterion("isr_anual in", values, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualNotIn(List<BigDecimal> values) {
            addCriterion("isr_anual not in", values, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("isr_anual between", value1, value2, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andIsrAnualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("isr_anual not between", value1, value2, "isrAnual");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreIsNull() {
            addCriterion("sub_no_acre is null");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreIsNotNull() {
            addCriterion("sub_no_acre is not null");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreEqualTo(Integer value) {
            addCriterion("sub_no_acre =", value, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreNotEqualTo(Integer value) {
            addCriterion("sub_no_acre <>", value, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreGreaterThan(Integer value) {
            addCriterion("sub_no_acre >", value, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_no_acre >=", value, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreLessThan(Integer value) {
            addCriterion("sub_no_acre <", value, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreLessThanOrEqualTo(Integer value) {
            addCriterion("sub_no_acre <=", value, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreIn(List<Integer> values) {
            addCriterion("sub_no_acre in", values, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreNotIn(List<Integer> values) {
            addCriterion("sub_no_acre not in", values, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreBetween(Integer value1, Integer value2) {
            addCriterion("sub_no_acre between", value1, value2, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubNoAcreNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_no_acre not between", value1, value2, "subNoAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreIsNull() {
            addCriterion("sub_acre is null");
            return (Criteria) this;
        }

        public Criteria andSubAcreIsNotNull() {
            addCriterion("sub_acre is not null");
            return (Criteria) this;
        }

        public Criteria andSubAcreEqualTo(Integer value) {
            addCriterion("sub_acre =", value, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreNotEqualTo(Integer value) {
            addCriterion("sub_acre <>", value, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreGreaterThan(Integer value) {
            addCriterion("sub_acre >", value, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_acre >=", value, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreLessThan(Integer value) {
            addCriterion("sub_acre <", value, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreLessThanOrEqualTo(Integer value) {
            addCriterion("sub_acre <=", value, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreIn(List<Integer> values) {
            addCriterion("sub_acre in", values, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreNotIn(List<Integer> values) {
            addCriterion("sub_acre not in", values, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreBetween(Integer value1, Integer value2) {
            addCriterion("sub_acre between", value1, value2, "subAcre");
            return (Criteria) this;
        }

        public Criteria andSubAcreNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_acre not between", value1, value2, "subAcre");
            return (Criteria) this;
        }

        public Criteria andTotalCsIsNull() {
            addCriterion("total_cs is null");
            return (Criteria) this;
        }

        public Criteria andTotalCsIsNotNull() {
            addCriterion("total_cs is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCsEqualTo(Integer value) {
            addCriterion("total_cs =", value, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsNotEqualTo(Integer value) {
            addCriterion("total_cs <>", value, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsGreaterThan(Integer value) {
            addCriterion("total_cs >", value, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_cs >=", value, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsLessThan(Integer value) {
            addCriterion("total_cs <", value, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsLessThanOrEqualTo(Integer value) {
            addCriterion("total_cs <=", value, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsIn(List<Integer> values) {
            addCriterion("total_cs in", values, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsNotIn(List<Integer> values) {
            addCriterion("total_cs not in", values, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsBetween(Integer value1, Integer value2) {
            addCriterion("total_cs between", value1, value2, "totalCs");
            return (Criteria) this;
        }

        public Criteria andTotalCsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_cs not between", value1, value2, "totalCs");
            return (Criteria) this;
        }

        public Criteria andSaldoDetIsNull() {
            addCriterion("saldo_det is null");
            return (Criteria) this;
        }

        public Criteria andSaldoDetIsNotNull() {
            addCriterion("saldo_det is not null");
            return (Criteria) this;
        }

        public Criteria andSaldoDetEqualTo(BigDecimal value) {
            addCriterion("saldo_det =", value, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetNotEqualTo(BigDecimal value) {
            addCriterion("saldo_det <>", value, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetGreaterThan(BigDecimal value) {
            addCriterion("saldo_det >", value, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("saldo_det >=", value, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetLessThan(BigDecimal value) {
            addCriterion("saldo_det <", value, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("saldo_det <=", value, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetIn(List<BigDecimal> values) {
            addCriterion("saldo_det in", values, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetNotIn(List<BigDecimal> values) {
            addCriterion("saldo_det not in", values, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("saldo_det between", value1, value2, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andSaldoDetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("saldo_det not between", value1, value2, "saldoDet");
            return (Criteria) this;
        }

        public Criteria andCredSalIsNull() {
            addCriterion("cred_sal is null");
            return (Criteria) this;
        }

        public Criteria andCredSalIsNotNull() {
            addCriterion("cred_sal is not null");
            return (Criteria) this;
        }

        public Criteria andCredSalEqualTo(BigDecimal value) {
            addCriterion("cred_sal =", value, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalNotEqualTo(BigDecimal value) {
            addCriterion("cred_sal <>", value, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalGreaterThan(BigDecimal value) {
            addCriterion("cred_sal >", value, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cred_sal >=", value, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalLessThan(BigDecimal value) {
            addCriterion("cred_sal <", value, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cred_sal <=", value, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalIn(List<BigDecimal> values) {
            addCriterion("cred_sal in", values, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalNotIn(List<BigDecimal> values) {
            addCriterion("cred_sal not in", values, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cred_sal between", value1, value2, "credSal");
            return (Criteria) this;
        }

        public Criteria andCredSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cred_sal not between", value1, value2, "credSal");
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

        public Criteria andCalculoIsNull() {
            addCriterion("calculo is null");
            return (Criteria) this;
        }

        public Criteria andCalculoIsNotNull() {
            addCriterion("calculo is not null");
            return (Criteria) this;
        }

        public Criteria andCalculoEqualTo(String value) {
            addCriterion("calculo =", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoNotEqualTo(String value) {
            addCriterion("calculo <>", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoGreaterThan(String value) {
            addCriterion("calculo >", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoGreaterThanOrEqualTo(String value) {
            addCriterion("calculo >=", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoLessThan(String value) {
            addCriterion("calculo <", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoLessThanOrEqualTo(String value) {
            addCriterion("calculo <=", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoLike(String value) {
            addCriterion("calculo like", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoNotLike(String value) {
            addCriterion("calculo not like", value, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoIn(List<String> values) {
            addCriterion("calculo in", values, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoNotIn(List<String> values) {
            addCriterion("calculo not in", values, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoBetween(String value1, String value2) {
            addCriterion("calculo between", value1, value2, "calculo");
            return (Criteria) this;
        }

        public Criteria andCalculoNotBetween(String value1, String value2) {
            addCriterion("calculo not between", value1, value2, "calculo");
            return (Criteria) this;
        }

        public Criteria andTipoContratoIsNull() {
            addCriterion("tipo_contrato is null");
            return (Criteria) this;
        }

        public Criteria andTipoContratoIsNotNull() {
            addCriterion("tipo_contrato is not null");
            return (Criteria) this;
        }

        public Criteria andTipoContratoEqualTo(String value) {
            addCriterion("tipo_contrato =", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoNotEqualTo(String value) {
            addCriterion("tipo_contrato <>", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoGreaterThan(String value) {
            addCriterion("tipo_contrato >", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_contrato >=", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoLessThan(String value) {
            addCriterion("tipo_contrato <", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoLessThanOrEqualTo(String value) {
            addCriterion("tipo_contrato <=", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoLike(String value) {
            addCriterion("tipo_contrato like", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoNotLike(String value) {
            addCriterion("tipo_contrato not like", value, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoIn(List<String> values) {
            addCriterion("tipo_contrato in", values, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoNotIn(List<String> values) {
            addCriterion("tipo_contrato not in", values, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoBetween(String value1, String value2) {
            addCriterion("tipo_contrato between", value1, value2, "tipoContrato");
            return (Criteria) this;
        }

        public Criteria andTipoContratoNotBetween(String value1, String value2) {
            addCriterion("tipo_contrato not between", value1, value2, "tipoContrato");
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