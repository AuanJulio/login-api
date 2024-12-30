package br.com.loginapi.dao.repository;

import br.com.loginapi.dao.domain.user.TabUserObj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TabUserRepository extends JpaRepository<TabUserObj, String> {
}
