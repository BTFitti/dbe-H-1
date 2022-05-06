package br.com.fiap.bean;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
//CDI
import javax.inject.Named;
import javax.servlet.ServletContext;

import org.primefaces.model.file.UploadedFile;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@Named
@RequestScoped
public class SetupBean {
	
	public String save() throws IOException{
		
		ServletContext servletContext = (ServletContext) FacesContext
				.getCurrentInstance()
				.getExternalContext()
				.getContext();
		
		String path = servletContext.getRealPath("/");
		System.out.println(path);
		
		FileOutputStream out =
				new FileOutputStream(path+"\\images\\setups\\" + image.getFileName());
		out.write(image.getContent());
		out.close();
		
		setup.setImagePath("\\images\\setups\\" + image.getFileName());
		new SetupDao().insert(setup);
		
		mostrarMensagem();
		return "setups?faces-redirect=true";
	}

	private void mostrarMensagem() {
		FacesContext
		.getCurrentInstance()
		.getExternalContext()
		.getFlash()
		.setKeepMessages(true);
		
		
		FacesContext
			.getCurrentInstance()
			.addMessage(null, new FacesMessage("Setup cadastrado com sucesso!"));
	}

	public List<Setup> getSetups() {
		return new SetupDao().list();
	}

	private Setup setup = new Setup();
	
	private UploadedFile image;
	
	
	
	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

}
