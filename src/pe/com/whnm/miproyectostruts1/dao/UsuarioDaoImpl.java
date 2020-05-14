package pe.com.whnm.miproyectostruts1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pe.com.whnm.miproyectostruts1.bean.Usuario;
import pe.com.whnm.miproyectostruts1.db.ConexionUserDB;

public class UsuarioDaoImpl implements UsuarioDao {
	
	

	public Usuario loginUsuario(Usuario usuarioLogin) {
		
		Usuario usuarioLogeado = null;
		ConexionUserDB conexionUserDB = new ConexionUserDB();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			
			
			conn = conexionUserDB.getConnection();
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT * FROM login WHERE usuario = ? AND password = ?");
			
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, usuarioLogin.getUser());
			ps.setString(2, usuarioLogin.getPassword());
			
			rs = ps.executeQuery();
			
			if (rs.next()){
				
				usuarioLogeado = new Usuario();
				
				usuarioLogeado.setUser(rs.getString("usuario"));
				usuarioLogeado.setPassword(rs.getString("password"));
				usuarioLogeado.setNombre(rs.getString("nombre"));
				usuarioLogeado.setEdad(rs.getString("edad"));
				
			}
			
			ps.close();
			rs.close();
			conn.close();
			
		} catch (Exception ex){
			
			ex.printStackTrace();
			usuarioLogeado = null;
			
		} finally {
			
			try{
				
				if (ps != null) {
					ps.close();
				}
				
				if (rs != null) {
					rs.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			
			} catch (SQLException ex) {
				
				ex.printStackTrace();
				
			}

		}
		
		return usuarioLogeado;
	}

}
