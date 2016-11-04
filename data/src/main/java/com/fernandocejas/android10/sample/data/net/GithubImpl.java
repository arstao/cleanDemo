package com.fernandocejas.android10.sample.data.net;

import com.fernandocejas.android10.sample.data.entity.RepoEntity;

import java.util.List;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/11/3 16:27
 * 修改人：Administrator
 * 修改时间：2016/11/3 16:27
 * 修改备注：
 */
public class GithubImpl implements GithubApi {

//    private final Context context;
//
//    /**
//     * Constructor of the class
//     *
//     * @param context {@link android.content.Context}.
//     */
//    public GithubImpl(Context context) {
//        if (context == null ) {
//            throw new IllegalArgumentException("The constructor parameters cannot be null!!!");
//        }
//        this.context = context.getApplicationContext();
//    }
    @Override
    public Observable<List<RepoEntity>> getRepos() {
        Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .build();
        return restAdapter.create(GithubApi.class).getRepos();
    }

}
