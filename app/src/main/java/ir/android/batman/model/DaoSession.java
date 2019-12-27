package ir.android.batman.model;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import ir.android.batman.model.ListMovie;
import ir.android.batman.model.DetailsMovie;

import ir.android.batman.model.ListMovieDao;
import ir.android.batman.model.DetailsMovieDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig listMovieDaoConfig;
    private final DaoConfig detailsMovieDaoConfig;

    private final ListMovieDao listMovieDao;
    private final DetailsMovieDao detailsMovieDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        listMovieDaoConfig = daoConfigMap.get(ListMovieDao.class).clone();
        listMovieDaoConfig.initIdentityScope(type);

        detailsMovieDaoConfig = daoConfigMap.get(DetailsMovieDao.class).clone();
        detailsMovieDaoConfig.initIdentityScope(type);

        listMovieDao = new ListMovieDao(listMovieDaoConfig, this);
        detailsMovieDao = new DetailsMovieDao(detailsMovieDaoConfig, this);

        registerDao(ListMovie.class, listMovieDao);
        registerDao(DetailsMovie.class, detailsMovieDao);
    }
    
    public void clear() {
        listMovieDaoConfig.clearIdentityScope();
        detailsMovieDaoConfig.clearIdentityScope();
    }

    public ListMovieDao getListMovieDao() {
        return listMovieDao;
    }

    public DetailsMovieDao getDetailsMovieDao() {
        return detailsMovieDao;
    }

}
