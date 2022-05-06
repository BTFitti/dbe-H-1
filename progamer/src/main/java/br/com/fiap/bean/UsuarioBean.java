package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
//CDI
import javax.inject.Named;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	
	public String save() {
		System.out.println(this.usuario);
		new UsuarioDao().insert(usuario);
		
		mostrarMensagem();
		return "usuarios?faces-redirect=true";
	}


	private void mostrarMensagem() {
		FacesContext
		.getCurrentInstance()
		.getExternalContext()
		.getFlash()
		.setKeepMessages(true);
		
		
		FacesContext
			.getCurrentInstance()
			.addMessage(null, new FacesMessage("Usuário cadastrado com sucesso!"));
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
