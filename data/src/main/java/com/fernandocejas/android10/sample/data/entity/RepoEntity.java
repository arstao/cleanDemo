package com.fernandocejas.android10.sample.data.entity;

/**
 * @author Hannes Dorfmann
 */
public class RepoEntity {

  long id;
  String name;
  String description;

  RepoEntity.User owner;


  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public User getOwner() {
    return owner;
  }

  public static class User {

    long id;
    String login;
    String avatar_url;

    public void setId(long id) {
      this.id = id;
    }

    public void setLogin(String login) {
      this.login = login;
    }

    public String getAvatar_url() {
      return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
      this.avatar_url = avatar_url;
    }

    public long getId() {
      return id;
    }

    public String getLogin() {
      return login;
    }

    public String getAvatarUrl() {
      return avatar_url;
    }
  }
}
