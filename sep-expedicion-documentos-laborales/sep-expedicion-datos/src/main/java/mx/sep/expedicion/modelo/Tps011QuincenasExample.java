package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tps011QuincenasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps011QuincenasExample() {
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

        public Criteria andFechaCapIsNull() {
            addCriterion("fecha_cap is null");
            return (Criteria) this;
        }

        public Criteria andFechaCapIsNotNull() {
            addCriterion("fecha_cap is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCapEqualTo(Date value) {
            addCriterion("fecha_cap =", value, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapNotEqualTo(Date value) {
            addCriterion("fecha_cap <>", value, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapGreaterThan(Date value) {
            addCriterion("fecha_cap >", value, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_cap >=", value, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapLessThan(Date value) {
            addCriterion("fecha_cap <", value, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapLessThanOrEqualTo(Date value) {
            addCriterion("fecha_cap <=", value, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapIn(List<Date> values) {
            addCriterion("fecha_cap in", values, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapNotIn(List<Date> values) {
            addCriterion("fecha_cap not in", values, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapBetween(Date value1, Date value2) {
            addCriterion("fecha_cap between", value1, value2, "fechaCap");
            return (Criteria) this;
        }

        public Criteria andFechaCapNotBetween(Date value1, Date value2) {
            addCriterion("fecha_cap not between", value1, value2, "fechaCap");
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