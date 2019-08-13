package br.com.sitecomforum.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sitecomforum.forum.model.Topico;

public interface TopicoRepository  extends  JpaRepository<Topico, Long>{

}
