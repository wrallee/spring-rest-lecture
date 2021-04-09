package me.wrallee.demorestapi.events;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class EventRepository {

    private final EntityManager em;

    public Long save(Event event) {
        em.persist(event);
        return event.getId();
    }

    public Event findById(Long id) {
        return em.find(Event.class, id);
    }
}
