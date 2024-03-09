package br.dcx.ufpb.apps4society.appalpharesponseregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dcx.ufpb.apps4society.appalpharesponseregister.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
