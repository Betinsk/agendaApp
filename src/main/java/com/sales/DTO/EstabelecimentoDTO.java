package com.sales.DTO;

import java.io.Serializable;

public class EstabelecimentoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
			private String logradouro;
			private String estado;
			private String cidade;
			private String pais;
			private String bairro;
			
			private String tipo;

			public EstabelecimentoDTO() {
				
			}

			public String getTipo() {
				return tipo;
			}

			public void setTipo(String tipo) {
				this.tipo = tipo;
			}

			public String getLogradouro() {
				return logradouro;
			}

			public void setLogradouro(String logradouro) {
				this.logradouro = logradouro;
			}

			public String getEstado() {
				return estado;
			}

			public void setEstado(String estado) {
				this.estado = estado;
			}

			public String getCidade() {
				return cidade;
			}

			public void setCidade(String cidade) {
				this.cidade = cidade;
			}

			public String getPais() {
				return pais;
			}

			public void setPais(String pais) {
				this.pais = pais;
			}

			public String getBairro() {
				return bairro;
			}

			public void setBairro(String bairro) {
				this.bairro = bairro;
			}
			
			
			
}
