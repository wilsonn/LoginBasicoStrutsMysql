package pe.com.whnm.miproyectostruts1.form;

import org.apache.struts.action.ActionForm;

import pe.com.whnm.miproyectostruts1.bean.Usuario;

public class LoginForm extends ActionForm{
	
	private String user;
	private String password;
	
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
