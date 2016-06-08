package br.com.cursoalgaworks.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "perfilUsuarioBean")
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private List<String> interesses;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}

	public void atualizar() {
		for (String interesse : interesses) {
			System.out.println("Nome:" + this.nome);
			System.out.println("Interesse:" + interesse);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Perfil Atualizado!!"));
		}
	}

}
