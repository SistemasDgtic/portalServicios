package mx.sep.expedicion.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tps003ComprobanteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps003ComprobanteExample() {
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

        public Criteria andNumComprobanteIsNull() {
            addCriterion("num_comprobante is null");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteIsNotNull() {
            addCriterion("num_comprobante is not null");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteEqualTo(Integer value) {
            addCriterion("num_comprobante =", value, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteNotEqualTo(Integer value) {
            addCriterion("num_comprobante <>", value, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteGreaterThan(Integer value) {
            addCriterion("num_comprobante >", value, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_comprobante >=", value, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteLessThan(Integer value) {
            addCriterion("num_comprobante <", value, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteLessThanOrEqualTo(Integer value) {
            addCriterion("num_comprobante <=", value, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteIn(List<Integer> values) {
            addCriterion("num_comprobante in", values, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteNotIn(List<Integer> values) {
            addCriterion("num_comprobante not in", values, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteBetween(Integer value1, Integer value2) {
            addCriterion("num_comprobante between", value1, value2, "numComprobante");
            return (Criteria) this;
        }

        public Criteria andNumComprobanteNotBetween(Integer value1, Integer value2) {
            addCriterion("num_comprobante not between", value1, value2, "numComprobante");
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

        public Criteria andClavePresupuestalIsNull() {
            addCriterion("clave_presupuestal is null");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalIsNotNull() {
            addCriterion("clave_presupuestal is not null");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalEqualTo(String value) {
            addCriterion("clave_presupuestal =", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalNotEqualTo(String value) {
            addCriterion("clave_presupuestal <>", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalGreaterThan(String value) {
            addCriterion("clave_presupuestal >", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalGreaterThanOrEqualTo(String value) {
            addCriterion("clave_presupuestal >=", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalLessThan(String value) {
            addCriterion("clave_presupuestal <", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalLessThanOrEqualTo(String value) {
            addCriterion("clave_presupuestal <=", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalLike(String value) {
            addCriterion("clave_presupuestal like", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalNotLike(String value) {
            addCriterion("clave_presupuestal not like", value, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalIn(List<String> values) {
            addCriterion("clave_presupuestal in", values, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalNotIn(List<String> values) {
            addCriterion("clave_presupuestal not in", values, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalBetween(String value1, String value2) {
            addCriterion("clave_presupuestal between", value1, value2, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andClavePresupuestalNotBetween(String value1, String value2) {
            addCriterion("clave_presupuestal not between", value1, value2, "clavePresupuestal");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoIsNull() {
            addCriterion("centro_trabajo is null");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoIsNotNull() {
            addCriterion("centro_trabajo is not null");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoEqualTo(String value) {
            addCriterion("centro_trabajo =", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoNotEqualTo(String value) {
            addCriterion("centro_trabajo <>", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoGreaterThan(String value) {
            addCriterion("centro_trabajo >", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoGreaterThanOrEqualTo(String value) {
            addCriterion("centro_trabajo >=", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoLessThan(String value) {
            addCriterion("centro_trabajo <", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoLessThanOrEqualTo(String value) {
            addCriterion("centro_trabajo <=", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoLike(String value) {
            addCriterion("centro_trabajo like", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoNotLike(String value) {
            addCriterion("centro_trabajo not like", value, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoIn(List<String> values) {
            addCriterion("centro_trabajo in", values, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoNotIn(List<String> values) {
            addCriterion("centro_trabajo not in", values, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoBetween(String value1, String value2) {
            addCriterion("centro_trabajo between", value1, value2, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andCentroTrabajoNotBetween(String value1, String value2) {
            addCriterion("centro_trabajo not between", value1, value2, "centroTrabajo");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaIsNull() {
            addCriterion("id_tipo_nomina is null");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaIsNotNull() {
            addCriterion("id_tipo_nomina is not null");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaEqualTo(String value) {
            addCriterion("id_tipo_nomina =", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaNotEqualTo(String value) {
            addCriterion("id_tipo_nomina <>", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaGreaterThan(String value) {
            addCriterion("id_tipo_nomina >", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaGreaterThanOrEqualTo(String value) {
            addCriterion("id_tipo_nomina >=", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaLessThan(String value) {
            addCriterion("id_tipo_nomina <", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaLessThanOrEqualTo(String value) {
            addCriterion("id_tipo_nomina <=", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaLike(String value) {
            addCriterion("id_tipo_nomina like", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaNotLike(String value) {
            addCriterion("id_tipo_nomina not like", value, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaIn(List<String> values) {
            addCriterion("id_tipo_nomina in", values, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaNotIn(List<String> values) {
            addCriterion("id_tipo_nomina not in", values, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaBetween(String value1, String value2) {
            addCriterion("id_tipo_nomina between", value1, value2, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andIdTipoNominaNotBetween(String value1, String value2) {
            addCriterion("id_tipo_nomina not between", value1, value2, "idTipoNomina");
            return (Criteria) this;
        }

        public Criteria andFechaIniIsNull() {
            addCriterion("fecha_ini is null");
            return (Criteria) this;
        }

        public Criteria andFechaIniIsNotNull() {
            addCriterion("fecha_ini is not null");
            return (Criteria) this;
        }

        public Criteria andFechaIniEqualTo(Date value) {
            addCriterion("fecha_ini =", value, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniNotEqualTo(Date value) {
            addCriterion("fecha_ini <>", value, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniGreaterThan(Date value) {
            addCriterion("fecha_ini >", value, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_ini >=", value, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniLessThan(Date value) {
            addCriterion("fecha_ini <", value, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniLessThanOrEqualTo(Date value) {
            addCriterion("fecha_ini <=", value, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniIn(List<Date> values) {
            addCriterion("fecha_ini in", values, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniNotIn(List<Date> values) {
            addCriterion("fecha_ini not in", values, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniBetween(Date value1, Date value2) {
            addCriterion("fecha_ini between", value1, value2, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaIniNotBetween(Date value1, Date value2) {
            addCriterion("fecha_ini not between", value1, value2, "fechaIni");
            return (Criteria) this;
        }

        public Criteria andFechaFinIsNull() {
            addCriterion("fecha_fin is null");
            return (Criteria) this;
        }

        public Criteria andFechaFinIsNotNull() {
            addCriterion("fecha_fin is not null");
            return (Criteria) this;
        }

        public Criteria andFechaFinEqualTo(Date value) {
            addCriterion("fecha_fin =", value, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinNotEqualTo(Date value) {
            addCriterion("fecha_fin <>", value, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinGreaterThan(Date value) {
            addCriterion("fecha_fin >", value, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_fin >=", value, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinLessThan(Date value) {
            addCriterion("fecha_fin <", value, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinLessThanOrEqualTo(Date value) {
            addCriterion("fecha_fin <=", value, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinIn(List<Date> values) {
            addCriterion("fecha_fin in", values, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinNotIn(List<Date> values) {
            addCriterion("fecha_fin not in", values, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinBetween(Date value1, Date value2) {
            addCriterion("fecha_fin between", value1, value2, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaFinNotBetween(Date value1, Date value2) {
            addCriterion("fecha_fin not between", value1, value2, "fechaFin");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNull() {
            addCriterion("fecha_pago is null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNotNull() {
            addCriterion("fecha_pago is not null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoEqualTo(Date value) {
            addCriterion("fecha_pago =", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotEqualTo(Date value) {
            addCriterion("fecha_pago <>", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThan(Date value) {
            addCriterion("fecha_pago >", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_pago >=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThan(Date value) {
            addCriterion("fecha_pago <", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThanOrEqualTo(Date value) {
            addCriterion("fecha_pago <=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIn(List<Date> values) {
            addCriterion("fecha_pago in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotIn(List<Date> values) {
            addCriterion("fecha_pago not in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoBetween(Date value1, Date value2) {
            addCriterion("fecha_pago between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotBetween(Date value1, Date value2) {
            addCriterion("fecha_pago not between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andQnaProcIsNull() {
            addCriterion("qna_proc is null");
            return (Criteria) this;
        }

        public Criteria andQnaProcIsNotNull() {
            addCriterion("qna_proc is not null");
            return (Criteria) this;
        }

        public Criteria andQnaProcEqualTo(Integer value) {
            addCriterion("qna_proc =", value, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcNotEqualTo(Integer value) {
            addCriterion("qna_proc <>", value, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcGreaterThan(Integer value) {
            addCriterion("qna_proc >", value, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcGreaterThanOrEqualTo(Integer value) {
            addCriterion("qna_proc >=", value, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcLessThan(Integer value) {
            addCriterion("qna_proc <", value, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcLessThanOrEqualTo(Integer value) {
            addCriterion("qna_proc <=", value, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcIn(List<Integer> values) {
            addCriterion("qna_proc in", values, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcNotIn(List<Integer> values) {
            addCriterion("qna_proc not in", values, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcBetween(Integer value1, Integer value2) {
            addCriterion("qna_proc between", value1, value2, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andQnaProcNotBetween(Integer value1, Integer value2) {
            addCriterion("qna_proc not between", value1, value2, "qnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcIsNull() {
            addCriterion("cons_qna_proc is null");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcIsNotNull() {
            addCriterion("cons_qna_proc is not null");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcEqualTo(Short value) {
            addCriterion("cons_qna_proc =", value, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcNotEqualTo(Short value) {
            addCriterion("cons_qna_proc <>", value, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcGreaterThan(Short value) {
            addCriterion("cons_qna_proc >", value, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcGreaterThanOrEqualTo(Short value) {
            addCriterion("cons_qna_proc >=", value, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcLessThan(Short value) {
            addCriterion("cons_qna_proc <", value, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcLessThanOrEqualTo(Short value) {
            addCriterion("cons_qna_proc <=", value, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcIn(List<Short> values) {
            addCriterion("cons_qna_proc in", values, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcNotIn(List<Short> values) {
            addCriterion("cons_qna_proc not in", values, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcBetween(Short value1, Short value2) {
            addCriterion("cons_qna_proc between", value1, value2, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andConsQnaProcNotBetween(Short value1, Short value2) {
            addCriterion("cons_qna_proc not between", value1, value2, "consQnaProc");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeIsNull() {
            addCriterion("tot_perc_cheque is null");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeIsNotNull() {
            addCriterion("tot_perc_cheque is not null");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeEqualTo(BigDecimal value) {
            addCriterion("tot_perc_cheque =", value, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeNotEqualTo(BigDecimal value) {
            addCriterion("tot_perc_cheque <>", value, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeGreaterThan(BigDecimal value) {
            addCriterion("tot_perc_cheque >", value, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_perc_cheque >=", value, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeLessThan(BigDecimal value) {
            addCriterion("tot_perc_cheque <", value, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_perc_cheque <=", value, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeIn(List<BigDecimal> values) {
            addCriterion("tot_perc_cheque in", values, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeNotIn(List<BigDecimal> values) {
            addCriterion("tot_perc_cheque not in", values, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_perc_cheque between", value1, value2, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotPercChequeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_perc_cheque not between", value1, value2, "totPercCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeIsNull() {
            addCriterion("tot_ded_cheque is null");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeIsNotNull() {
            addCriterion("tot_ded_cheque is not null");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeEqualTo(BigDecimal value) {
            addCriterion("tot_ded_cheque =", value, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeNotEqualTo(BigDecimal value) {
            addCriterion("tot_ded_cheque <>", value, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeGreaterThan(BigDecimal value) {
            addCriterion("tot_ded_cheque >", value, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_ded_cheque >=", value, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeLessThan(BigDecimal value) {
            addCriterion("tot_ded_cheque <", value, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_ded_cheque <=", value, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeIn(List<BigDecimal> values) {
            addCriterion("tot_ded_cheque in", values, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeNotIn(List<BigDecimal> values) {
            addCriterion("tot_ded_cheque not in", values, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_ded_cheque between", value1, value2, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotDedChequeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_ded_cheque not between", value1, value2, "totDedCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeIsNull() {
            addCriterion("tot_neto_cheque is null");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeIsNotNull() {
            addCriterion("tot_neto_cheque is not null");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeEqualTo(BigDecimal value) {
            addCriterion("tot_neto_cheque =", value, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeNotEqualTo(BigDecimal value) {
            addCriterion("tot_neto_cheque <>", value, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeGreaterThan(BigDecimal value) {
            addCriterion("tot_neto_cheque >", value, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_neto_cheque >=", value, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeLessThan(BigDecimal value) {
            addCriterion("tot_neto_cheque <", value, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_neto_cheque <=", value, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeIn(List<BigDecimal> values) {
            addCriterion("tot_neto_cheque in", values, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeNotIn(List<BigDecimal> values) {
            addCriterion("tot_neto_cheque not in", values, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_neto_cheque between", value1, value2, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andTotNetoChequeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_neto_cheque not between", value1, value2, "totNetoCheque");
            return (Criteria) this;
        }

        public Criteria andNumPercIsNull() {
            addCriterion("num_perc is null");
            return (Criteria) this;
        }

        public Criteria andNumPercIsNotNull() {
            addCriterion("num_perc is not null");
            return (Criteria) this;
        }

        public Criteria andNumPercEqualTo(Short value) {
            addCriterion("num_perc =", value, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercNotEqualTo(Short value) {
            addCriterion("num_perc <>", value, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercGreaterThan(Short value) {
            addCriterion("num_perc >", value, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercGreaterThanOrEqualTo(Short value) {
            addCriterion("num_perc >=", value, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercLessThan(Short value) {
            addCriterion("num_perc <", value, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercLessThanOrEqualTo(Short value) {
            addCriterion("num_perc <=", value, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercIn(List<Short> values) {
            addCriterion("num_perc in", values, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercNotIn(List<Short> values) {
            addCriterion("num_perc not in", values, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercBetween(Short value1, Short value2) {
            addCriterion("num_perc between", value1, value2, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumPercNotBetween(Short value1, Short value2) {
            addCriterion("num_perc not between", value1, value2, "numPerc");
            return (Criteria) this;
        }

        public Criteria andNumDescIsNull() {
            addCriterion("num_desc is null");
            return (Criteria) this;
        }

        public Criteria andNumDescIsNotNull() {
            addCriterion("num_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNumDescEqualTo(Short value) {
            addCriterion("num_desc =", value, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescNotEqualTo(Short value) {
            addCriterion("num_desc <>", value, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescGreaterThan(Short value) {
            addCriterion("num_desc >", value, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescGreaterThanOrEqualTo(Short value) {
            addCriterion("num_desc >=", value, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescLessThan(Short value) {
            addCriterion("num_desc <", value, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescLessThanOrEqualTo(Short value) {
            addCriterion("num_desc <=", value, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescIn(List<Short> values) {
            addCriterion("num_desc in", values, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescNotIn(List<Short> values) {
            addCriterion("num_desc not in", values, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescBetween(Short value1, Short value2) {
            addCriterion("num_desc between", value1, value2, "numDesc");
            return (Criteria) this;
        }

        public Criteria andNumDescNotBetween(Short value1, Short value2) {
            addCriterion("num_desc not between", value1, value2, "numDesc");
            return (Criteria) this;
        }

        public Criteria andClabeInterIsNull() {
            addCriterion("clabe_inter is null");
            return (Criteria) this;
        }

        public Criteria andClabeInterIsNotNull() {
            addCriterion("clabe_inter is not null");
            return (Criteria) this;
        }

        public Criteria andClabeInterEqualTo(String value) {
            addCriterion("clabe_inter =", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterNotEqualTo(String value) {
            addCriterion("clabe_inter <>", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterGreaterThan(String value) {
            addCriterion("clabe_inter >", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterGreaterThanOrEqualTo(String value) {
            addCriterion("clabe_inter >=", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterLessThan(String value) {
            addCriterion("clabe_inter <", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterLessThanOrEqualTo(String value) {
            addCriterion("clabe_inter <=", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterLike(String value) {
            addCriterion("clabe_inter like", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterNotLike(String value) {
            addCriterion("clabe_inter not like", value, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterIn(List<String> values) {
            addCriterion("clabe_inter in", values, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterNotIn(List<String> values) {
            addCriterion("clabe_inter not in", values, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterBetween(String value1, String value2) {
            addCriterion("clabe_inter between", value1, value2, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andClabeInterNotBetween(String value1, String value2) {
            addCriterion("clabe_inter not between", value1, value2, "clabeInter");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionIsNull() {
            addCriterion("mensaje_impresion is null");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionIsNotNull() {
            addCriterion("mensaje_impresion is not null");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionEqualTo(String value) {
            addCriterion("mensaje_impresion =", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionNotEqualTo(String value) {
            addCriterion("mensaje_impresion <>", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionGreaterThan(String value) {
            addCriterion("mensaje_impresion >", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionGreaterThanOrEqualTo(String value) {
            addCriterion("mensaje_impresion >=", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionLessThan(String value) {
            addCriterion("mensaje_impresion <", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionLessThanOrEqualTo(String value) {
            addCriterion("mensaje_impresion <=", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionLike(String value) {
            addCriterion("mensaje_impresion like", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionNotLike(String value) {
            addCriterion("mensaje_impresion not like", value, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionIn(List<String> values) {
            addCriterion("mensaje_impresion in", values, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionNotIn(List<String> values) {
            addCriterion("mensaje_impresion not in", values, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionBetween(String value1, String value2) {
            addCriterion("mensaje_impresion between", value1, value2, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andMensajeImpresionNotBetween(String value1, String value2) {
            addCriterion("mensaje_impresion not between", value1, value2, "mensajeImpresion");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadIsNull() {
            addCriterion("codigo_seguridad is null");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadIsNotNull() {
            addCriterion("codigo_seguridad is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadEqualTo(String value) {
            addCriterion("codigo_seguridad =", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadNotEqualTo(String value) {
            addCriterion("codigo_seguridad <>", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadGreaterThan(String value) {
            addCriterion("codigo_seguridad >", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadGreaterThanOrEqualTo(String value) {
            addCriterion("codigo_seguridad >=", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadLessThan(String value) {
            addCriterion("codigo_seguridad <", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadLessThanOrEqualTo(String value) {
            addCriterion("codigo_seguridad <=", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadLike(String value) {
            addCriterion("codigo_seguridad like", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadNotLike(String value) {
            addCriterion("codigo_seguridad not like", value, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadIn(List<String> values) {
            addCriterion("codigo_seguridad in", values, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadNotIn(List<String> values) {
            addCriterion("codigo_seguridad not in", values, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadBetween(String value1, String value2) {
            addCriterion("codigo_seguridad between", value1, value2, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andCodigoSeguridadNotBetween(String value1, String value2) {
            addCriterion("codigo_seguridad not between", value1, value2, "codigoSeguridad");
            return (Criteria) this;
        }

        public Criteria andNumeroSsIsNull() {
            addCriterion("numero_ss is null");
            return (Criteria) this;
        }

        public Criteria andNumeroSsIsNotNull() {
            addCriterion("numero_ss is not null");
            return (Criteria) this;
        }

        public Criteria andNumeroSsEqualTo(String value) {
            addCriterion("numero_ss =", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsNotEqualTo(String value) {
            addCriterion("numero_ss <>", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsGreaterThan(String value) {
            addCriterion("numero_ss >", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsGreaterThanOrEqualTo(String value) {
            addCriterion("numero_ss >=", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsLessThan(String value) {
            addCriterion("numero_ss <", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsLessThanOrEqualTo(String value) {
            addCriterion("numero_ss <=", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsLike(String value) {
            addCriterion("numero_ss like", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsNotLike(String value) {
            addCriterion("numero_ss not like", value, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsIn(List<String> values) {
            addCriterion("numero_ss in", values, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsNotIn(List<String> values) {
            addCriterion("numero_ss not in", values, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsBetween(String value1, String value2) {
            addCriterion("numero_ss between", value1, value2, "numeroSs");
            return (Criteria) this;
        }

        public Criteria andNumeroSsNotBetween(String value1, String value2) {
            addCriterion("numero_ss not between", value1, value2, "numeroSs");
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