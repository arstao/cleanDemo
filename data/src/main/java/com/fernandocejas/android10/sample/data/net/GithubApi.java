package com.fernandocejas.android10.sample.data.net;


import com.fernandocejas.android10.sample.data.entity.RepoEntity;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

/**
 * @author Hannes Dorfmann
 */
public interface GithubApi {
  @GET("/repositories")
  @Headers("Cache-Control: no-cache")
  public Observable<List<RepoEntity>> getRepos();
}
