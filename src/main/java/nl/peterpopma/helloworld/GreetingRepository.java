package nl.peterpopma.helloworld;

import org.springframework.data.repository.CrudRepository;

interface GreetingRepository extends CrudRepository<GreetingEntity, Long> {

}
