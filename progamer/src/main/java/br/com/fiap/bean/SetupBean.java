package br.com.fiap.bean;



import javax.enterprise.context.RequestScoped;
//CDI
import javax.inject.Named;

import br.com.fiap.model.Setup;


@Named
@RequestScoped
public class SetupBean {

		public void save() {
			System.out.println(this.setup);
		}
		private Setup setup = new Setup();

		public Setup getSetup() {
			return setup;
		}

		public void setSetup(Setup setup) {
			this.setup = setup;
		}
	
}
