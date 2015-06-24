package org.owntracks.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import org.owntracks.android.db.Message;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table MESSAGE.
*/
public class MessageDao extends AbstractDao<Message, String> {

    public static final String TABLENAME = "MESSAGE";

    /**
     * Properties of entity Message.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "_id");
        public final static Property Tst = new Property(1, Long.class, "tst", false, "TST");
        public final static Property Channel = new Property(2, String.class, "channel", false, "CHANNEL");
        public final static Property Sender = new Property(3, String.class, "sender", false, "SENDER");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property Description = new Property(5, String.class, "description", false, "DESCRIPTION");
        public final static Property Icon = new Property(6, String.class, "icon", false, "ICON");
        public final static Property Priority = new Property(7, Integer.class, "priority", false, "PRIORITY");
        public final static Property IconUrl = new Property(8, String.class, "iconUrl", false, "ICON_URL");
        public final static Property Url = new Property(9, String.class, "url", false, "URL");
    };


    public MessageDao(DaoConfig config) {
        super(config);
    }
    
    public MessageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'MESSAGE' (" + //
                "'_id' TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "'TST' INTEGER," + // 1: tst
                "'CHANNEL' TEXT," + // 2: channel
                "'SENDER' TEXT," + // 3: sender
                "'TITLE' TEXT," + // 4: title
                "'DESCRIPTION' TEXT," + // 5: description
                "'ICON' TEXT," + // 6: icon
                "'PRIORITY' INTEGER," + // 7: priority
                "'ICON_URL' TEXT," + // 8: iconUrl
                "'URL' TEXT);"); // 9: url
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'MESSAGE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Message entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        Long tst = entity.getTst();
        if (tst != null) {
            stmt.bindLong(2, tst);
        }
 
        String channel = entity.getChannel();
        if (channel != null) {
            stmt.bindString(3, channel);
        }
 
        String sender = entity.getSender();
        if (sender != null) {
            stmt.bindString(4, sender);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(6, description);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(7, icon);
        }
 
        Integer priority = entity.getPriority();
        if (priority != null) {
            stmt.bindLong(8, priority);
        }
 
        String iconUrl = entity.getIconUrl();
        if (iconUrl != null) {
            stmt.bindString(9, iconUrl);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(10, url);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Message readEntity(Cursor cursor, int offset) {
        Message entity = new Message( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // tst
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // channel
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // sender
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // description
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // icon
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // priority
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // iconUrl
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // url
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Message entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTst(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setChannel(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSender(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDescription(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIcon(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPriority(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setIconUrl(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setUrl(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(Message entity, long rowId) {
        return entity.getId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(Message entity) {
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