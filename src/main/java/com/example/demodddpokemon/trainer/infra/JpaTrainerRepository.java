package com.example.demodddpokemon.trainer.infra;

import com.example.demodddpokemon.trainer.domain.Trainer;
import com.example.demodddpokemon.trainer.domain.TrainerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JpaTrainerRepository implements TrainerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Trainer findById(String id) {
        return entityManager.find(Trainer.class, id);
    }

    @Override
    public void save(Trainer trainer) {
        entityManager.persist(trainer);
    }
}
