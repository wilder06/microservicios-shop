package pe.com.shop.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.shop.userservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
