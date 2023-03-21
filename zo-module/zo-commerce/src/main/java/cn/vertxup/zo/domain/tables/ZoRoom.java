/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.zo.domain.tables;


import cn.vertxup.zo.domain.Db;
import cn.vertxup.zo.domain.Keys;
import cn.vertxup.zo.domain.tables.records.ZoRoomRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZoRoom extends TableImpl<ZoRoomRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DB_SCAFFOLD.ZO_ROOM</code>
     */
    public static final ZoRoom ZO_ROOM = new ZoRoom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ZoRoomRecord> getRecordType() {
        return ZoRoomRecord.class;
    }

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.PK_ID</code>. uniqueId,PK_ID
     */
    public final TableField<ZoRoomRecord, String> PK_ID = createField(DSL.name("PK_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "uniqueId,PK_ID");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.T_ROOMATTRS</code>.
     * attrs,T_ROOMATTRS
     */
    public final TableField<ZoRoomRecord, String> T_ROOMATTRS = createField(DSL.name("T_ROOMATTRS"), SQLDataType.CLOB, this, "attrs,T_ROOMATTRS");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.S_CODE</code>. code,S_CODE
     */
    public final TableField<ZoRoomRecord, String> S_CODE = createField(DSL.name("S_CODE"), SQLDataType.VARCHAR(36), this, "code,S_CODE");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.S_ROOM_NUM</code>. number,S_ROOM_NUM
     */
    public final TableField<ZoRoomRecord, String> S_ROOM_NUM = createField(DSL.name("S_ROOM_NUM"), SQLDataType.VARCHAR(16).nullable(false), this, "number,S_ROOM_NUM");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.J_CONFIG</code>. config,J_CONFIG
     */
    public final TableField<ZoRoomRecord, String> J_CONFIG = createField(DSL.name("J_CONFIG"), SQLDataType.CLOB, this, "config,J_CONFIG");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.J_FEATURES</code>.
     * features,J_FEATURES
     */
    public final TableField<ZoRoomRecord, String> J_FEATURES = createField(DSL.name("J_FEATURES"), SQLDataType.CLOB, this, "features,J_FEATURES");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.R_FLOOR_ID</code>. floor,R_FLOOR_ID
     */
    public final TableField<ZoRoomRecord, String> R_FLOOR_ID = createField(DSL.name("R_FLOOR_ID"), SQLDataType.VARCHAR(36), this, "floor,R_FLOOR_ID");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.R_HOTEL_ID</code>.
     * hotelId,R_HOTEL_ID
     */
    public final TableField<ZoRoomRecord, String> R_HOTEL_ID = createField(DSL.name("R_HOTEL_ID"), SQLDataType.VARCHAR(36), this, "hotelId,R_HOTEL_ID");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.R_ROOM_TYPE_ID</code>.
     * roomTypeId,R_ROOM_TYPE_ID
     */
    public final TableField<ZoRoomRecord, String> R_ROOM_TYPE_ID = createField(DSL.name("R_ROOM_TYPE_ID"), SQLDataType.VARCHAR(36), this, "roomTypeId,R_ROOM_TYPE_ID");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.R_TENT_ID</code>. tent,R_TENT_ID
     */
    public final TableField<ZoRoomRecord, String> R_TENT_ID = createField(DSL.name("R_TENT_ID"), SQLDataType.VARCHAR(36), this, "tent,R_TENT_ID");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public final TableField<ZoRoomRecord, Boolean> IS_ACTIVE = createField(DSL.name("IS_ACTIVE"), SQLDataType.BIT, this, "active,IS_ACTIVE");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public final TableField<ZoRoomRecord, String> Z_SIGMA = createField(DSL.name("Z_SIGMA"), SQLDataType.VARCHAR(32), this, "sigma,Z_SIGMA");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.Z_LANGUAGE</code>.
     * language,Z_LANGUAGE
     */
    public final TableField<ZoRoomRecord, String> Z_LANGUAGE = createField(DSL.name("Z_LANGUAGE"), SQLDataType.VARCHAR(8), this, "language,Z_LANGUAGE");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.Z_CREATE_BY</code>.
     * createBy,Z_CREATE_BY
     */
    public final TableField<ZoRoomRecord, String> Z_CREATE_BY = createField(DSL.name("Z_CREATE_BY"), SQLDataType.VARCHAR(36), this, "createBy,Z_CREATE_BY");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.Z_CREATE_TIME</code>.
     * createTime,Z_CREATE_TIME
     */
    public final TableField<ZoRoomRecord, LocalDateTime> Z_CREATE_TIME = createField(DSL.name("Z_CREATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "createTime,Z_CREATE_TIME");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.Z_UPDATE_BY</code>.
     * updateBy,Z_UPDATE_BY
     */
    public final TableField<ZoRoomRecord, String> Z_UPDATE_BY = createField(DSL.name("Z_UPDATE_BY"), SQLDataType.VARCHAR(36), this, "updateBy,Z_UPDATE_BY");

    /**
     * The column <code>DB_SCAFFOLD.ZO_ROOM.Z_UPDATE_TIME</code>.
     * updateTime,Z_UPDATE_TIME
     */
    public final TableField<ZoRoomRecord, LocalDateTime> Z_UPDATE_TIME = createField(DSL.name("Z_UPDATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "updateTime,Z_UPDATE_TIME");

    private ZoRoom(Name alias, Table<ZoRoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private ZoRoom(Name alias, Table<ZoRoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_SCAFFOLD.ZO_ROOM</code> table reference
     */
    public ZoRoom(String alias) {
        this(DSL.name(alias), ZO_ROOM);
    }

    /**
     * Create an aliased <code>DB_SCAFFOLD.ZO_ROOM</code> table reference
     */
    public ZoRoom(Name alias) {
        this(alias, ZO_ROOM);
    }

    /**
     * Create a <code>DB_SCAFFOLD.ZO_ROOM</code> table reference
     */
    public ZoRoom() {
        this(DSL.name("ZO_ROOM"), null);
    }

    public <O extends Record> ZoRoom(Table<O> child, ForeignKey<O, ZoRoomRecord> key) {
        super(child, key, ZO_ROOM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_SCAFFOLD;
    }

    @Override
    public UniqueKey<ZoRoomRecord> getPrimaryKey() {
        return Keys.KEY_ZO_ROOM_PRIMARY;
    }

    @Override
    public List<UniqueKey<ZoRoomRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_ZO_ROOM_UK_ZO_ROOM_S_CODE_Z_SIGMA);
    }

    @Override
    public ZoRoom as(String alias) {
        return new ZoRoom(DSL.name(alias), this);
    }

    @Override
    public ZoRoom as(Name alias) {
        return new ZoRoom(alias, this);
    }

    @Override
    public ZoRoom as(Table<?> alias) {
        return new ZoRoom(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ZoRoom rename(String name) {
        return new ZoRoom(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ZoRoom rename(Name name) {
        return new ZoRoom(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ZoRoom rename(Table<?> name) {
        return new ZoRoom(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
