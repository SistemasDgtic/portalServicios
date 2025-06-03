/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.configuracion.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps005UsuariosMapper;
import mx.sep.expedicion.dao.Tps012BienvEspMapper;
import mx.sep.expedicion.dao.join.Tps005UsuariosJoinMapper;
import mx.sep.expedicion.datos.vo.RolUsuarioVO;
import mx.sep.expedicion.modelo.Tps005Usuarios;
import mx.sep.expedicion.modelo.Tps012BienvEspExample;
import mx.sep.expedicion.modelo.custom.Tps005UsuariosExample;
import mx.sep.expedicion.servicios.configuracion.UsuarioService;
import mx.sep.expedicion.servicios.util.MailService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduardo.hernandez
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private Tps005UsuariosJoinMapper tps005UsuariosJoinMapper;
    @Autowired
    private Tps005UsuariosMapper tps005UsuariosMapper;
    @Autowired
    private ShaPasswordEncoder passwordEncoder;
    @Autowired
    private MailService mailService;
    @Autowired    
    private Tps012BienvEspMapper tps012BienvEspMapper;
    
    /**
     *
     * @param filtroBusquedaVO
     * @param usuarioRolVO
     * @return
     * @throws Exception
     */
    @Override
    public List<RolUsuarioVO> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, RolUsuarioVO usuarioRolVO) throws Exception {
        Tps005UsuariosExample tps005UsuariosExample = new Tps005UsuariosExample();
        tps005UsuariosExample.setDesde(filtroBusquedaVO.getDesde());
        tps005UsuariosExample.setElementos(filtroBusquedaVO.getHasta());
        Tps005UsuariosExample.Criteria criteria = tps005UsuariosExample.createCriteria();
        if (usuarioRolVO.getUsername() != null) {
            criteria.andUsernameLike(usuarioRolVO.getUsername() + "%");
        }
        if (usuarioRolVO.getNombreUsuario() != null) {
            criteria.andNombreUsuarioLike("%" + usuarioRolVO.getNombreUsuario() + "%");
        }
        if (usuarioRolVO.getUsuarioActivo() != null) {
            criteria.andUsuarioActivoEqualTo(usuarioRolVO.getUsuarioActivo());
        }
        List<RolUsuarioVO> list = null;
        list = tps005UsuariosJoinMapper.selectPageByExample(tps005UsuariosExample);
        return list;
    }
    
    @Override
    public Integer consultaContar(RolUsuarioVO usuarioRolVO) throws Exception {
        Tps005UsuariosExample tps005UsuariosExample = new Tps005UsuariosExample();
        Tps005UsuariosExample.Criteria criteria = tps005UsuariosExample.createCriteria();
        if (usuarioRolVO.getUsername() != null) {
            criteria.andUsernameLike(usuarioRolVO.getUsername() + "%");
        }
        if (usuarioRolVO.getNombreUsuario() != null) {
            criteria.andNombreUsuarioLike("%" + usuarioRolVO.getNombreUsuario() + "%");
        }
        if (usuarioRolVO.getUsuarioActivo() != null) {
            criteria.andUsuarioActivoEqualTo(usuarioRolVO.getUsuarioActivo());
        }
        Integer count = null;
        count = tps005UsuariosMapper.countByExample(tps005UsuariosExample);
        return count;
    }
    
    @Override
    public void eliminar(Tps005Usuarios tps005Usuarios) throws Exception {
        tps005UsuariosMapper.deleteByPrimaryKey(tps005Usuarios.getIdUsuario());
    }
    
    @Override
    public void modificar(Tps005Usuarios tps005Usuarios, Boolean actPassword) throws Exception {
        if (actPassword == true) {
            String encodedPassword = passwordEncoder.encodePassword(tps005Usuarios.getPassword(), null);
            tps005Usuarios.setPassword(encodedPassword);
        }
        tps005UsuariosMapper.updateByPrimaryKeySelective(tps005Usuarios);
    }
    
    @Override
    public void guardar(Tps005Usuarios tps005Usuarios) throws Exception {
        tps005Usuarios.setIdUsuario(tps005UsuariosJoinMapper.selectMaxPrimaryKey() + 1);
        tps005Usuarios.setUsuarioHabilitado(Boolean.FALSE);
        String encodedPassword = passwordEncoder.encodePassword(tps005Usuarios.getPassword(), null);
        tps005Usuarios.setPassword(encodedPassword);
        tps005UsuariosMapper.insert(tps005Usuarios);
    }
    
    @Override
    public List<Tps005Usuarios> consultaTodos() throws Exception {
        Tps005UsuariosExample tps005UsuariosExample = new Tps005UsuariosExample();
        tps005UsuariosExample.setOrderByClause("v_nombre_usuario");
        return tps005UsuariosMapper.selectByExample(tps005UsuariosExample);
    }
    
    @Override
    public Tps005Usuarios consultaUsuario(Tps005Usuarios tps005Usuarios) throws Exception {
        Tps005UsuariosExample tps005UsuariosExample = new Tps005UsuariosExample();
        Tps005UsuariosExample.Criteria criteria = tps005UsuariosExample.createCriteria();
        if (tps005Usuarios.getUsername() != null) {
            criteria.andUsernameEqualTo(tps005Usuarios.getUsername());
        }
        if (tps005Usuarios.getNombreUsuario() != null) {
            criteria.andNombreUsuarioLike("%" + tps005Usuarios.getNombreUsuario() + "%");
        }
        Tps005Usuarios tps005 = new Tps005Usuarios();
        tps005 = tps005UsuariosJoinMapper.selectUsuarioByExample(tps005UsuariosExample);
        return tps005;
        
    }
    
    @Override
    public List<Tps005Usuarios> consultaPorRfc(Tps005Usuarios tps005Usuarios) throws Exception {
        Tps005UsuariosExample tps005UsuariosExample = new Tps005UsuariosExample();
        Tps005UsuariosExample.Criteria criteria = tps005UsuariosExample.createCriteria();
        criteria.andUsernameEqualTo(tps005Usuarios.getUsername());        
        return tps005UsuariosMapper.selectByExample(tps005UsuariosExample);
    }
    
    @Override
    public List<Tps005Usuarios> consultaPorRespuestayRfc(Tps005Usuarios tps005Usuarios) throws Exception {
        Tps005UsuariosExample tps005UsuariosExample = new Tps005UsuariosExample();
        Tps005UsuariosExample.Criteria criteria = tps005UsuariosExample.createCriteria();
        criteria.andUsernameEqualTo(tps005Usuarios.getUsername());        
        criteria.andRespuestaEqualTo(tps005Usuarios.getRespuesta());        
        return tps005UsuariosMapper.selectByExample(tps005UsuariosExample);
    }
    
    @Override
    public void enviaMail(Tps005Usuarios tps005Usuarios) throws Exception {
        Tps005UsuariosExample tps005UsuariosExample = new Tps005UsuariosExample();
        Tps005UsuariosExample.Criteria criteria = tps005UsuariosExample.createCriteria();        
        criteria.andIdUsuarioEqualTo(tps005Usuarios.getIdUsuario());        
        Integer valorGenerado = (int) Math.floor(Math.random() * 999999);        
        String password = String.valueOf(valorGenerado);
        String encodedPassword = passwordEncoder.encodePassword(password, null);
        tps005Usuarios.setPassword(encodedPassword);        
        tps005UsuariosMapper.updateByPrimaryKeySelective(tps005Usuarios);        
        String text = "Su nueva contraseña es:  " + password + "\n\n\n**** Este es un correo generado automáticamente, favor de no responderlo ****";        
        mailService.send(tps005Usuarios.getEmail(), "Recuperación de contraseña para el acceso al Portal de Autoservicios", text);        
    }
    
    @Override
    public int consultaBienvenidaEsp(Tps005Usuarios tps005Usuarios) throws Exception {
        Tps012BienvEspExample tps012BienvEspExample = new Tps012BienvEspExample();
        Tps012BienvEspExample.Criteria criteria = tps012BienvEspExample.createCriteria();
        criteria.andUsernameEqualTo(tps005Usuarios.getUsername());
        return tps012BienvEspMapper.countByExample(tps012BienvEspExample);
    }   
}
