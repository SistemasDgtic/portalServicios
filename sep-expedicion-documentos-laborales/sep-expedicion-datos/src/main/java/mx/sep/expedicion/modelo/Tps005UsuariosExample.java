package mx.sep.expedicion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tps005UsuariosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tps005UsuariosExample() {
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

        public Criteria andIdUsuarioIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioEqualTo(Integer value) {
            addCriterion("id_usuario =", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotEqualTo(Integer value) {
            addCriterion("id_usuario <>", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThan(Integer value) {
            addCriterion("id_usuario >", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_usuario >=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThan(Integer value) {
            addCriterion("id_usuario <", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_usuario <=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIn(List<Integer> values) {
            addCriterion("id_usuario in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotIn(List<Integer> values) {
            addCriterion("id_usuario not in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario not between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaIsNull() {
            addCriterion("id_pregunta is null");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaIsNotNull() {
            addCriterion("id_pregunta is not null");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaEqualTo(Integer value) {
            addCriterion("id_pregunta =", value, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaNotEqualTo(Integer value) {
            addCriterion("id_pregunta <>", value, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaGreaterThan(Integer value) {
            addCriterion("id_pregunta >", value, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_pregunta >=", value, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaLessThan(Integer value) {
            addCriterion("id_pregunta <", value, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaLessThanOrEqualTo(Integer value) {
            addCriterion("id_pregunta <=", value, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaIn(List<Integer> values) {
            addCriterion("id_pregunta in", values, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaNotIn(List<Integer> values) {
            addCriterion("id_pregunta not in", values, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaBetween(Integer value1, Integer value2) {
            addCriterion("id_pregunta between", value1, value2, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andIdPreguntaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_pregunta not between", value1, value2, "idPregunta");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioIsNull() {
            addCriterion("nombre_usuario is null");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioIsNotNull() {
            addCriterion("nombre_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioEqualTo(String value) {
            addCriterion("nombre_usuario =", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioNotEqualTo(String value) {
            addCriterion("nombre_usuario <>", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioGreaterThan(String value) {
            addCriterion("nombre_usuario >", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_usuario >=", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioLessThan(String value) {
            addCriterion("nombre_usuario <", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioLessThanOrEqualTo(String value) {
            addCriterion("nombre_usuario <=", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioLike(String value) {
            addCriterion("nombre_usuario like", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioNotLike(String value) {
            addCriterion("nombre_usuario not like", value, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioIn(List<String> values) {
            addCriterion("nombre_usuario in", values, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioNotIn(List<String> values) {
            addCriterion("nombre_usuario not in", values, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioBetween(String value1, String value2) {
            addCriterion("nombre_usuario between", value1, value2, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreUsuarioNotBetween(String value1, String value2) {
            addCriterion("nombre_usuario not between", value1, value2, "nombreUsuario");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRespuestaIsNull() {
            addCriterion("respuesta is null");
            return (Criteria) this;
        }

        public Criteria andRespuestaIsNotNull() {
            addCriterion("respuesta is not null");
            return (Criteria) this;
        }

        public Criteria andRespuestaEqualTo(String value) {
            addCriterion("respuesta =", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaNotEqualTo(String value) {
            addCriterion("respuesta <>", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaGreaterThan(String value) {
            addCriterion("respuesta >", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaGreaterThanOrEqualTo(String value) {
            addCriterion("respuesta >=", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaLessThan(String value) {
            addCriterion("respuesta <", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaLessThanOrEqualTo(String value) {
            addCriterion("respuesta <=", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaLike(String value) {
            addCriterion("respuesta like", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaNotLike(String value) {
            addCriterion("respuesta not like", value, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaIn(List<String> values) {
            addCriterion("respuesta in", values, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaNotIn(List<String> values) {
            addCriterion("respuesta not in", values, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaBetween(String value1, String value2) {
            addCriterion("respuesta between", value1, value2, "respuesta");
            return (Criteria) this;
        }

        public Criteria andRespuestaNotBetween(String value1, String value2) {
            addCriterion("respuesta not between", value1, value2, "respuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoIsNull() {
            addCriterion("usuario_activo is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoIsNotNull() {
            addCriterion("usuario_activo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoEqualTo(Boolean value) {
            addCriterion("usuario_activo =", value, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoNotEqualTo(Boolean value) {
            addCriterion("usuario_activo <>", value, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoGreaterThan(Boolean value) {
            addCriterion("usuario_activo >", value, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("usuario_activo >=", value, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoLessThan(Boolean value) {
            addCriterion("usuario_activo <", value, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoLessThanOrEqualTo(Boolean value) {
            addCriterion("usuario_activo <=", value, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoIn(List<Boolean> values) {
            addCriterion("usuario_activo in", values, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoNotIn(List<Boolean> values) {
            addCriterion("usuario_activo not in", values, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoBetween(Boolean value1, Boolean value2) {
            addCriterion("usuario_activo between", value1, value2, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioActivoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("usuario_activo not between", value1, value2, "usuarioActivo");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoIsNull() {
            addCriterion("usuario_habilitado is null");
            return (Criteria) this;
        }        

        public Criteria andUsuarioHabilitadoIsNotNull() {
            addCriterion("usuario_habilitado is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoEqualTo(Boolean value) {
            addCriterion("usuario_habilitado =", value, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoNotEqualTo(Boolean value) {
            addCriterion("usuario_habilitado <>", value, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoGreaterThan(Boolean value) {
            addCriterion("usuario_habilitado >", value, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("usuario_habilitado >=", value, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoLessThan(Boolean value) {
            addCriterion("usuario_habilitado <", value, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoLessThanOrEqualTo(Boolean value) {
            addCriterion("usuario_habilitado <=", value, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoIn(List<Boolean> values) {
            addCriterion("usuario_habilitado in", values, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoNotIn(List<Boolean> values) {
            addCriterion("usuario_habilitado not in", values, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoBetween(Boolean value1, Boolean value2) {
            addCriterion("usuario_habilitado between", value1, value2, "usuarioHabilitado");
            return (Criteria) this;
        }

        public Criteria andUsuarioHabilitadoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("usuario_habilitado not between", value1, value2, "usuarioHabilitado");
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