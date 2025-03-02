package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.dao.ActorDao;
import mate.academy.hibernate.relations.dao.impl.ActorDaoImpl;
import mate.academy.hibernate.relations.model.Actor;
import mate.academy.hibernate.relations.service.ActorService;
import org.hibernate.SessionFactory;

public class ActorServiceImpl implements ActorService {
    private ActorDao actordao;

    public ActorServiceImpl(SessionFactory sessionFactory) {
        this.actordao = new ActorDaoImpl(sessionFactory);
    }

    @Override
    public Actor add(Actor actor) {
        return actordao.add(actor);
    }

    @Override
    public Actor get(Long id) {
        return actordao.get(id).orElseThrow(null);
    }
}
