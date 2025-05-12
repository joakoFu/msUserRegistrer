package cl.nttdata.msUserRegistrer.data;

import cl.nttdata.msUserRegistrer.to.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface  UserRepository extends JpaRepository<UserEntity, Long> {
}
