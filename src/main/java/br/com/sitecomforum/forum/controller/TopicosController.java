package br.com.sitecomforum.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sitecomforum.forum.Dtos.TopicoDto;
import br.com.sitecomforum.forum.model.Curso;
import br.com.sitecomforum.forum.model.Topico;
import br.com.sitecomforum.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		List<Topico> topicos = topicoRepository.findAll();
		
		return TopicoDto.convert(topicos);
		
	}
}
