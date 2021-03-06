package ir.android.batman.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LIST_MOVIE".
*/
public class ListMovieDao extends AbstractDao<ListMovie, String> {

    public static final String TABLENAME = "LIST_MOVIE";

    /**
     * Properties of entity ListMovie.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Title = new Property(0, String.class, "Title", false, "TITLE");
        public final static Property Year = new Property(1, String.class, "Year", false, "YEAR");
        public final static Property ImdbID = new Property(2, String.class, "imdbID", true, "IMDB_ID");
        public final static Property Type = new Property(3, String.class, "Type", false, "TYPE");
        public final static Property Poster = new Property(4, String.class, "Poster", false, "POSTER");
    }


    public ListMovieDao(DaoConfig config) {
        super(config);
    }
    
    public ListMovieDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LIST_MOVIE\" (" + //
                "\"TITLE\" TEXT," + // 0: Title
                "\"YEAR\" TEXT," + // 1: Year
                "\"IMDB_ID\" TEXT PRIMARY KEY NOT NULL UNIQUE ," + // 2: imdbID
                "\"TYPE\" TEXT," + // 3: Type
                "\"POSTER\" TEXT);"); // 4: Poster
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LIST_MOVIE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ListMovie entity) {
        stmt.clearBindings();
 
        String Title = entity.getTitle();
        if (Title != null) {
            stmt.bindString(1, Title);
        }
 
        String Year = entity.getYear();
        if (Year != null) {
            stmt.bindString(2, Year);
        }
 
        String imdbID = entity.getImdbID();
        if (imdbID != null) {
            stmt.bindString(3, imdbID);
        }
 
        String Type = entity.getType();
        if (Type != null) {
            stmt.bindString(4, Type);
        }
 
        String Poster = entity.getPoster();
        if (Poster != null) {
            stmt.bindString(5, Poster);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ListMovie entity) {
        stmt.clearBindings();
 
        String Title = entity.getTitle();
        if (Title != null) {
            stmt.bindString(1, Title);
        }
 
        String Year = entity.getYear();
        if (Year != null) {
            stmt.bindString(2, Year);
        }
 
        String imdbID = entity.getImdbID();
        if (imdbID != null) {
            stmt.bindString(3, imdbID);
        }
 
        String Type = entity.getType();
        if (Type != null) {
            stmt.bindString(4, Type);
        }
 
        String Poster = entity.getPoster();
        if (Poster != null) {
            stmt.bindString(5, Poster);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2);
    }    

    @Override
    public ListMovie readEntity(Cursor cursor, int offset) {
        ListMovie entity = new ListMovie( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // Title
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // Year
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // imdbID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // Type
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // Poster
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ListMovie entity, int offset) {
        entity.setTitle(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setYear(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImdbID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setType(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPoster(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final String updateKeyAfterInsert(ListMovie entity, long rowId) {
        return entity.getImdbID();
    }
    
    @Override
    public String getKey(ListMovie entity) {
        if(entity != null) {
            return entity.getImdbID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ListMovie entity) {
        return entity.getImdbID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
