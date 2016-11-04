package com.fernandocejas.android10.sample.data.repository;

import com.fernandocejas.android10.sample.data.entity.mapper.RepoEnityDataMapper;
import com.fernandocejas.android10.sample.data.net.GithubImpl;
import com.fernandocejas.android10.sample.domain.Repo;
import com.fernandocejas.android10.sample.domain.repository.RepoRepository;

import java.util.List;

import rx.Observable;

/**
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/11/3 16:08
 * 修改人：Administrator
 * 修改时间：2016/11/3 16:08
 * 修改备注：
 */
public class RepoDataRepository implements RepoRepository {
    @Override
    public Observable<List<Repo>> getRepos() {
        return new GithubImpl().getRepos().map(repoEntities -> {return new RepoEnityDataMapper().transform(repoEntities);});
    }
}
