/*
 * This file is generated by jOOQ.
 */
package cn.commerce.domain.tables.daos;


import cn.commerce.domain.tables.ZoMember;
import cn.commerce.domain.tables.records.ZoMemberRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZoMemberDao extends AbstractVertxDAO<ZoMemberRecord, cn.commerce.domain.tables.pojos.ZoMember, String, Future<List<cn.commerce.domain.tables.pojos.ZoMember>>, Future<cn.commerce.domain.tables.pojos.ZoMember>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ZoMemberRecord,cn.commerce.domain.tables.pojos.ZoMember,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public ZoMemberDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(ZoMember.ZO_MEMBER, cn.commerce.domain.tables.pojos.ZoMember.class, new JDBCClassicQueryExecutor<ZoMemberRecord,cn.commerce.domain.tables.pojos.ZoMember,String>(configuration,cn.commerce.domain.tables.pojos.ZoMember.class,vertx));
        }

        @Override
        protected String getId(cn.commerce.domain.tables.pojos.ZoMember object) {
                return object.getPkId();
        }

        /**
     * Find records that have <code>R_IDENTITY_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRIdentityId(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.R_IDENTITY_ID.in(values));
        }

        /**
     * Find records that have <code>R_IDENTITY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRIdentityId(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.R_IDENTITY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>R_COMPANY_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRCompanyId(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.R_COMPANY_ID.in(values));
        }

        /**
     * Find records that have <code>R_COMPANY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRCompanyId(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.R_COMPANY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>R_CARD_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRCardId(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.R_CARD_ID.in(values));
        }

        /**
     * Find records that have <code>R_CARD_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRCardId(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.R_CARD_ID.in(values),limit);
        }

        /**
     * Find records that have <code>L_POINT IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByLPoint(Collection<Long> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.L_POINT.in(values));
        }

        /**
     * Find records that have <code>L_POINT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByLPoint(Collection<Long> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.L_POINT.in(values),limit);
        }

        /**
     * Find records that have <code>S_PROPOSER IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySProposer(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_PROPOSER.in(values));
        }

        /**
     * Find records that have <code>S_PROPOSER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySProposer(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_PROPOSER.in(values),limit);
        }

        /**
     * Find records that have <code>S_CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySCode(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_CODE.in(values));
        }

        /**
     * Find records that have <code>S_CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySCode(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_CODE.in(values),limit);
        }

        /**
     * Find records that have <code>RLT_MBER_LEVEL IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRltMberLevel(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.RLT_MBER_LEVEL.in(values));
        }

        /**
     * Find records that have <code>RLT_MBER_LEVEL IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRltMberLevel(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.RLT_MBER_LEVEL.in(values),limit);
        }

        /**
     * Find records that have <code>RLT_MBER_STATUS IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRltMberStatus(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.RLT_MBER_STATUS.in(values));
        }

        /**
     * Find records that have <code>RLT_MBER_STATUS IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByRltMberStatus(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.RLT_MBER_STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>S_LICENSE_NUM IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySLicenseNum(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_LICENSE_NUM.in(values));
        }

        /**
     * Find records that have <code>S_LICENSE_NUM IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySLicenseNum(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_LICENSE_NUM.in(values),limit);
        }

        /**
     * Find records that have <code>S_MOBILE IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySMobile(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_MOBILE.in(values));
        }

        /**
     * Find records that have <code>S_MOBILE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySMobile(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_MOBILE.in(values),limit);
        }

        /**
     * Find records that have <code>S_NICKNAME IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySNickname(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_NICKNAME.in(values));
        }

        /**
     * Find records that have <code>S_NICKNAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySNickname(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_NICKNAME.in(values),limit);
        }

        /**
     * Find records that have <code>S_PHOTO IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySPhoto(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_PHOTO.in(values));
        }

        /**
     * Find records that have <code>S_PHOTO IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySPhoto(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_PHOTO.in(values),limit);
        }

        /**
     * Find records that have <code>S_REALNAME IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySRealname(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_REALNAME.in(values));
        }

        /**
     * Find records that have <code>S_REALNAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyBySRealname(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.S_REALNAME.in(values),limit);
        }

        /**
     * Find records that have <code>D_BIRTHDAY IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByDBirthday(Collection<LocalDateTime> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.D_BIRTHDAY.in(values));
        }

        /**
     * Find records that have <code>D_BIRTHDAY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByDBirthday(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.D_BIRTHDAY.in(values),limit);
        }

        /**
     * Find records that have <code>IS_MALE IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByIsMale(Collection<Boolean> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.IS_MALE.in(values));
        }

        /**
     * Find records that have <code>IS_MALE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByIsMale(Collection<Boolean> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.IS_MALE.in(values),limit);
        }

        /**
     * Find records that have <code>J_CONFIG IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByJConfig(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.J_CONFIG.in(values));
        }

        /**
     * Find records that have <code>J_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByJConfig(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.J_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>IS_ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByIsActive(Collection<Boolean> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.IS_ACTIVE.in(values));
        }

        /**
     * Find records that have <code>IS_ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByIsActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.IS_ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>Z_SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZSigma(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_SIGMA.in(values));
        }

        /**
     * Find records that have <code>Z_SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZSigma(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>Z_LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZLanguage(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>Z_LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZLanguage(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>Z_CREATE_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZCreateBy(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_CREATE_BY.in(values));
        }

        /**
     * Find records that have <code>Z_CREATE_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZCreateBy(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_CREATE_BY.in(values),limit);
        }

        /**
     * Find records that have <code>Z_CREATE_TIME IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZCreateTime(Collection<LocalDateTime> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_CREATE_TIME.in(values));
        }

        /**
     * Find records that have <code>Z_CREATE_TIME IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZCreateTime(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_CREATE_TIME.in(values),limit);
        }

        /**
     * Find records that have <code>Z_UPDATE_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZUpdateBy(Collection<String> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_UPDATE_BY.in(values));
        }

        /**
     * Find records that have <code>Z_UPDATE_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZUpdateBy(Collection<String> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_UPDATE_BY.in(values),limit);
        }

        /**
     * Find records that have <code>Z_UPDATE_TIME IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZUpdateTime(Collection<LocalDateTime> values) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_UPDATE_TIME.in(values));
        }

        /**
     * Find records that have <code>Z_UPDATE_TIME IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.commerce.domain.tables.pojos.ZoMember>> findManyByZUpdateTime(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(ZoMember.ZO_MEMBER.Z_UPDATE_TIME.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<ZoMemberRecord,cn.commerce.domain.tables.pojos.ZoMember,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<ZoMemberRecord,cn.commerce.domain.tables.pojos.ZoMember,String>) super.queryExecutor();
        }
}