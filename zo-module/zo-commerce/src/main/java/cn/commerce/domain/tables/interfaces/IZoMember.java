/*
 * This file is generated by jOOQ.
 */
package cn.commerce.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IZoMember extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.PK_ID</code>. uniqueId,PK_ID
     */
    public IZoMember setPkId(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.R_IDENTITY_ID</code>.
     * 「identityId」- 关联档案
     */
    public IZoMember setRIdentityId(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.R_IDENTITY_ID</code>.
     * 「identityId」- 关联档案
     */
    public String getRIdentityId();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.R_COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    public IZoMember setRCompanyId(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.R_COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    public String getRCompanyId();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.R_CARD_ID</code>. 「cardId」- 绑定卡
     */
    public IZoMember setRCardId(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.R_CARD_ID</code>. 「cardId」- 绑定卡
     */
    public String getRCardId();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.L_POINT</code>. 积分,point,L_POINT
     */
    public IZoMember setLPoint(Long value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.L_POINT</code>. 积分,point,L_POINT
     */
    public Long getLPoint();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.S_PROPOSER</code>.
     * 推荐人,proposer,S_PROPOSER
     */
    public IZoMember setSProposer(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.S_PROPOSER</code>.
     * 推荐人,proposer,S_PROPOSER
     */
    public String getSProposer();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.S_CODE</code>. 会员编号,code,S_CODE
     */
    public IZoMember setSCode(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.S_CODE</code>. 会员编号,code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.RLT_MBER_LEVEL</code>.
     * 会员等级,level,RLT_MBER_LEVEL
     */
    public IZoMember setRltMberLevel(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.RLT_MBER_LEVEL</code>.
     * 会员等级,level,RLT_MBER_LEVEL
     */
    public String getRltMberLevel();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.RLT_MBER_STATUS</code>.
     * 会员状态,status,RLT_MBER_STATUS
     */
    public IZoMember setRltMberStatus(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.RLT_MBER_STATUS</code>.
     * 会员状态,status,RLT_MBER_STATUS
     */
    public String getRltMberStatus();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.S_LICENSE_NUM</code>.
     * 驾驶证,licenseNumber,S_LICENSE_NUM
     */
    public IZoMember setSLicenseNum(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.S_LICENSE_NUM</code>.
     * 驾驶证,licenseNumber,S_LICENSE_NUM
     */
    public String getSLicenseNum();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.S_MOBILE</code>.
     * 手机号,mobile,S_MOBILE
     */
    public IZoMember setSMobile(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.S_MOBILE</code>.
     * 手机号,mobile,S_MOBILE
     */
    public String getSMobile();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.S_NICKNAME</code>.
     * 昵称,nickname,S_NICKNAME
     */
    public IZoMember setSNickname(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.S_NICKNAME</code>.
     * 昵称,nickname,S_NICKNAME
     */
    public String getSNickname();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.S_PHOTO</code>. 头像,photo,S_PHOTO
     */
    public IZoMember setSPhoto(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.S_PHOTO</code>. 头像,photo,S_PHOTO
     */
    public String getSPhoto();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.S_REALNAME</code>.
     * 姓名,realname,S_REALNAME
     */
    public IZoMember setSRealname(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.S_REALNAME</code>.
     * 姓名,realname,S_REALNAME
     */
    public String getSRealname();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.D_BIRTHDAY</code>.
     * 生日,birthday,D_BIRTHDAY
     */
    public IZoMember setDBirthday(LocalDateTime value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.D_BIRTHDAY</code>.
     * 生日,birthday,D_BIRTHDAY
     */
    public LocalDateTime getDBirthday();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.IS_MALE</code>.
     * 男？true为男，false为女,male,IS_MALE
     */
    public IZoMember setIsMale(Boolean value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.IS_MALE</code>.
     * 男？true为男，false为女,male,IS_MALE
     */
    public Boolean getIsMale();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.J_CONFIG</code>. config,J_CONFIG
     */
    public IZoMember setJConfig(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public IZoMember setIsActive(Boolean value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public IZoMember setZSigma(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_LANGUAGE</code>.
     * language,Z_LANGUAGE
     */
    public IZoMember setZLanguage(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_LANGUAGE</code>.
     * language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_CREATE_BY</code>.
     * createBy,Z_CREATE_BY
     */
    public IZoMember setZCreateBy(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_CREATE_BY</code>.
     * createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_CREATE_TIME</code>.
     * createTime,Z_CREATE_TIME
     */
    public IZoMember setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_CREATE_TIME</code>.
     * createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_UPDATE_BY</code>.
     * updateBy,Z_UPDATE_BY
     */
    public IZoMember setZUpdateBy(String value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_UPDATE_BY</code>.
     * updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_UPDATE_TIME</code>.
     * updateTime,Z_UPDATE_TIME
     */
    public IZoMember setZUpdateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_SCAFFOLD.ZO_MEMBER.Z_UPDATE_TIME</code>.
     * updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IZoMember
     */
    public void from(IZoMember from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IZoMember
     */
    public <E extends IZoMember> E into(E into);

        @Override
        public default IZoMember fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setPkId,json::getString,"PK_ID","java.lang.String");
                setOrThrow(this::setRIdentityId,json::getString,"R_IDENTITY_ID","java.lang.String");
                setOrThrow(this::setRCompanyId,json::getString,"R_COMPANY_ID","java.lang.String");
                setOrThrow(this::setRCardId,json::getString,"R_CARD_ID","java.lang.String");
                setOrThrow(this::setLPoint,json::getLong,"L_POINT","java.lang.Long");
                setOrThrow(this::setSProposer,json::getString,"S_PROPOSER","java.lang.String");
                setOrThrow(this::setSCode,json::getString,"S_CODE","java.lang.String");
                setOrThrow(this::setRltMberLevel,json::getString,"RLT_MBER_LEVEL","java.lang.String");
                setOrThrow(this::setRltMberStatus,json::getString,"RLT_MBER_STATUS","java.lang.String");
                setOrThrow(this::setSLicenseNum,json::getString,"S_LICENSE_NUM","java.lang.String");
                setOrThrow(this::setSMobile,json::getString,"S_MOBILE","java.lang.String");
                setOrThrow(this::setSNickname,json::getString,"S_NICKNAME","java.lang.String");
                setOrThrow(this::setSPhoto,json::getString,"S_PHOTO","java.lang.String");
                setOrThrow(this::setSRealname,json::getString,"S_REALNAME","java.lang.String");
                setOrThrow(this::setDBirthday,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"D_BIRTHDAY","java.time.LocalDateTime");
                setOrThrow(this::setIsMale,json::getBoolean,"IS_MALE","java.lang.Boolean");
                setOrThrow(this::setJConfig,json::getString,"J_CONFIG","java.lang.String");
                setOrThrow(this::setIsActive,json::getBoolean,"IS_ACTIVE","java.lang.Boolean");
                setOrThrow(this::setZSigma,json::getString,"Z_SIGMA","java.lang.String");
                setOrThrow(this::setZLanguage,json::getString,"Z_LANGUAGE","java.lang.String");
                setOrThrow(this::setZCreateBy,json::getString,"Z_CREATE_BY","java.lang.String");
                setOrThrow(this::setZCreateTime,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"Z_CREATE_TIME","java.time.LocalDateTime");
                setOrThrow(this::setZUpdateBy,json::getString,"Z_UPDATE_BY","java.lang.String");
                setOrThrow(this::setZUpdateTime,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"Z_UPDATE_TIME","java.time.LocalDateTime");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("PK_ID",getPkId());
                json.put("R_IDENTITY_ID",getRIdentityId());
                json.put("R_COMPANY_ID",getRCompanyId());
                json.put("R_CARD_ID",getRCardId());
                json.put("L_POINT",getLPoint());
                json.put("S_PROPOSER",getSProposer());
                json.put("S_CODE",getSCode());
                json.put("RLT_MBER_LEVEL",getRltMberLevel());
                json.put("RLT_MBER_STATUS",getRltMberStatus());
                json.put("S_LICENSE_NUM",getSLicenseNum());
                json.put("S_MOBILE",getSMobile());
                json.put("S_NICKNAME",getSNickname());
                json.put("S_PHOTO",getSPhoto());
                json.put("S_REALNAME",getSRealname());
                json.put("D_BIRTHDAY",getDBirthday()==null?null:getDBirthday().toString());
                json.put("IS_MALE",getIsMale());
                json.put("J_CONFIG",getJConfig());
                json.put("IS_ACTIVE",getIsActive());
                json.put("Z_SIGMA",getZSigma());
                json.put("Z_LANGUAGE",getZLanguage());
                json.put("Z_CREATE_BY",getZCreateBy());
                json.put("Z_CREATE_TIME",getZCreateTime()==null?null:getZCreateTime().toString());
                json.put("Z_UPDATE_BY",getZUpdateBy());
                json.put("Z_UPDATE_TIME",getZUpdateTime()==null?null:getZUpdateTime().toString());
                return json;
        }

}
