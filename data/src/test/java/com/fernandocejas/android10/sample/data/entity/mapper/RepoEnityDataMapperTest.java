package com.fernandocejas.android10.sample.data.entity.mapper;

import com.fernandocejas.android10.sample.data.ApplicationTestCase;
import com.fernandocejas.android10.sample.data.entity.RepoEntity;
import com.fernandocejas.android10.sample.domain.Repo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/11/3 17:10
 * 修改人：Administrator
 * 修改时间：2016/11/3 17:10
 * 修改备注：
 */
public class RepoEnityDataMapperTest extends ApplicationTestCase {

    private static final long MOCK_ID = 1L;
    private static final String MOCK_NAME = "tao";
    private  RepoEnityDataMapper repoEnityDataMapper;

    @Before
    public  void setup(){
        repoEnityDataMapper = new RepoEnityDataMapper();
    }
    @Test
    public void transformTest(){
        Repo repo = repoEnityDataMapper.transform(mockRepoEntity());
        assertThat(repo, is(instanceOf(Repo.class)));
        assertThat(repo.getId(), is(MOCK_ID));
        assertThat(repo.getName(), is(MOCK_NAME));
    }

    @Test
    public void transformCollectionTest(){
//        RepoEntity mockUserEntityOne  = mock(RepoEntity.class);
//        RepoEntity mockUserEntityTwo  = mock(RepoEntity.class);
        RepoEntity mockUserEntityOne = mockRepoEntity();
        RepoEntity mockUserEntityTwo = mockRepoEntity();
        List<RepoEntity> repoEntity = new ArrayList<>();
        repoEntity.add(mockUserEntityOne);
        repoEntity.add(mockUserEntityTwo);
        List<Repo> list = repoEnityDataMapper.transform(repoEntity);

        assertThat(list.size(),is(2));
        assertThat(list.get(0),is(instanceOf(Repo.class)));
        assertThat(list.get(1),is(instanceOf(Repo.class)));
    }
    private RepoEntity mockRepoEntity(){
        RepoEntity entity = new RepoEntity();
        entity.setId(MOCK_ID);
        entity.setName(MOCK_NAME);
        entity.setOwner(new RepoEntity.User());
        return entity;
    }
}
