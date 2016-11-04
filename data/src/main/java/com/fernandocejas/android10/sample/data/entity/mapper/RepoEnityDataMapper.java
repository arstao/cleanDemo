package com.fernandocejas.android10.sample.data.entity.mapper;

import com.fernandocejas.android10.sample.data.entity.RepoEntity;
import com.fernandocejas.android10.sample.domain.Repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/11/3 16:40
 * 修改人：Administrator
 * 修改时间：2016/11/3 16:40
 * 修改备注：
 */
public class RepoEnityDataMapper {

    public Repo transform(RepoEntity entity){
        Repo repo = new Repo();
        repo.setName(entity.getName());
        repo.setDescription(entity.getDescription());
        repo.setId(entity.getId());
        repo.setOwner(transform(entity.getOwner()));
        return repo;
    }

    private Repo.User transform(RepoEntity.User owner) {
        Repo.User user = new Repo.User();
        user.setId(owner.getId());
        user.setAvatar_url(owner.getAvatar_url());
        user.setLogin(owner.getLogin());
        return user;
    }

    public List<Repo> transform(Collection<RepoEntity> collection){
        List<Repo> list = new ArrayList<>(20);
        for (RepoEntity entity:
                collection) {
            if (entity!=null) {
                list.add(transform(entity));
            }
        }
        return list;
    }
}
