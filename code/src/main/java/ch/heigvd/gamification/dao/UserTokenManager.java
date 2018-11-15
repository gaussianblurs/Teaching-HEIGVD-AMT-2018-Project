/**
 * @document UserTokenManagerLocal
 * @date 28.10.2018
 * @author Samuel Mayor, Alexandra Korukova, Pierre-Samuel Rochat and Arnold von Bauer Gauss
 * @Goal Acts as a link between the DB table usertoken and the web application
 */

package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.model.User;
import ch.heigvd.gamification.model.UserToken;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

@Stateless
public class UserTokenManager extends GenericDAO<UserToken, Long> implements UserTokenManagerLocal {

    /**
     * find a userToken by its token
     * @param token Token to lookup the usertoken with
     * @return UserToken
     */
    public UserToken findByToken(String token) {
        UserToken userToken = null;
        try {
            userToken = (UserToken) em.createNamedQuery("UserToken.findByToken").setParameter("token", token).getSingleResult();
        } catch (NoResultException ex) {
            //TODO: log
        }
        return userToken;
    }

    /**
     * find a userToken by its user
     * @param user User to lookup the usertoken with
     * @return UserToken
     */
    public UserToken findByUser(User user) {
        UserToken userToken = null;
        try {
            userToken = (UserToken) em.createNamedQuery("UserToken.findByUser").setParameter("user", user).getSingleResult();
        } catch (NoResultException ex) {
            //TODO: log
        }
        return userToken;
    }
}
