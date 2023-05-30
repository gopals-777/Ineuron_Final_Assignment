package in.grs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.grs.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
