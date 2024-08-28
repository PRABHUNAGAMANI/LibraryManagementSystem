package Project_Library.LibraryManagament.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Project_Library.LibraryManagament.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
	Optional<User> findByEmail(String email);
}
