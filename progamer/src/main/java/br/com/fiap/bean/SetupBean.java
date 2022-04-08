package br.com.fiap.bean;



import java.util.List;

import javax.enterprise.context.RequestScoped;
//CDI
import javax.inject.Named;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;


@Named
@RequestScoped
public class SetupBean {

		public void save() {
			System.out.println(this.setup);
			new SetupDao().insert(setup);
		}
		
		public List<Setup> getSetups(){
			return new SetupDao().list();
		}
		private Setup setup = new Setup();

		public Setup getSetup() {
			return setup;
		}

		public void setSetup(Setup setup) {
			this.setup = setup;
		}
	
}
