package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
//CDI
import javax.inject.Named;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	
	public void save() {
		System.out.println(this.usuario);
		new UsuarioDao().insert(usuario);
	}

	public List<Usuario> getUsuarios() {
		return new UsuarioDao().list();
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}