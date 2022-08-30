package com.sales.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.DTO.EstabelecimentoDTO;
import com.sales.domain.Endereco;
import com.sales.domain.Estabelecimento;
import com.sales.domain.Servico;
import com.sales.repositories.EnderecoRepository;
import com.sales.repositories.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {
	
	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public List<Estabelecimento> findAll() {
		return estabelecimentoRepository.findAll();
		}
	
	public Estabelecimento find(Integer id) { 
		 Optional<Estabelecimento> obj = estabelecimentoRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Servico.class.getName(), null)); 
		}
	
	//Method for insert
		public Estabelecimento insert(Estabelecimento obj) {
			//obj.setId(null);
			 estabelecimentoRepository.save(obj);
			return obj;
		}
		
		
		public Estabelecimento fromDTO(EstabelecimentoDTO objDto) {
				Endereco end = new Endereco(null, objDto.getLogradouro(), objDto.getEstado(), objDto.getCidade(), objDto.getPais(), objDto.getBairro());
				enderecoRepository.save(end);
				Estabelecimento est = new Estabelecimento(null, objDto.getTipo(), end);
				 estabelecimentoRepository.save(est);
				 return est;
		}
}
