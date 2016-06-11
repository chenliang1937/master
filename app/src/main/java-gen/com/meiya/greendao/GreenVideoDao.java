package com.meiya.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.meiya.greendao.GreenVideo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GREEN_VIDEO".
*/
public class GreenVideoDao extends AbstractDao<GreenVideo, Long> {

    public static final String TABLENAME = "GREEN_VIDEO";

    /**
     * Properties of entity GreenVideo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Vid = new Property(1, String.class, "vid", false, "VID");
        public final static Property Videolist = new Property(2, String.class, "videolist", false, "VIDEOLIST");
    };


    public GreenVideoDao(DaoConfig config) {
        super(config);
    }
    
    public GreenVideoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GREEN_VIDEO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"VID\" TEXT," + // 1: vid
                "\"VIDEOLIST\" TEXT);"); // 2: videolist
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GREEN_VIDEO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GreenVideo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String vid = entity.getVid();
        if (vid != null) {
            stmt.bindString(2, vid);
        }
 
        String videolist = entity.getVideolist();
        if (videolist != null) {
            stmt.bindString(3, videolist);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public GreenVideo readEntity(Cursor cursor, int offset) {
        GreenVideo entity = new GreenVideo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // vid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // videolist
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GreenVideo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setVideolist(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(GreenVideo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(GreenVideo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
