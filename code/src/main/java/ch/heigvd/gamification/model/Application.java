package ch.heigvd.gamification.model;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Application.findByName", query = "SELECT a FROM Application a WHERE a.name = :name"),
        @NamedQuery(name = "Application.findById", query = "SELECT a FROM Application a WHERE a.id = :id")
})

public class Application extends AbstractDomainModelEntity<Long> {
    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String description;

    @Column(nullable = false, unique = true)
    private String apiKey;

    @Column(nullable = false, unique = true)
    private String apiSecret;

    @ManyToOne
    private User user;

    public Application() {
    }

    public Application(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
