package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.model.Application;
import ch.heigvd.gamification.model.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ApplicationsManagerLocal extends IGenericDAO<Application, Long> {
    List<Application> findByUser(User user);
}