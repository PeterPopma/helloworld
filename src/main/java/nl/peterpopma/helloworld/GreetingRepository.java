package nl.peterpopma.helloworld;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

interface GreetingRepository extends CrudRepository<GreetingEntity, Long> {
    public Optional<GreetingEntity> findByMessage(String message);
}
