package pe.com.whnm.miproyectostruts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import pe.com.whnm.miproyectostruts1.bean.Usuario;
import pe.com.whnm.miproyectostruts1.dao.UsuarioDao;
import pe.com.whnm.miproyectostruts1.dao.UsuarioDaoImpl;
import pe.com.whnm.miproyectostruts1.form.LoginForm;

public class LoginAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		LoginForm login = (LoginForm)form;
		
		UsuarioDao usuarioDao = new UsuarioDaoImpl();
		
		Usuario usuarioLogin = new Usuario();
		usuarioLogin.setUser(login.getUser());
		usuarioLogin.setPassword(login.getPassword());
		
		Usuario usuarioLogeado = usuarioDao.loginUsuario(usuarioLogin);
		
		if (usuarioLogeado != null) {
			
			return mapping.findForward("success");
			
		} else {
			
			return mapping.findForward("error");
			
		}
		
		
		
	}
	

}
