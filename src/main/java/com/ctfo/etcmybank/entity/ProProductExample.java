package com.ctfo.etcmybank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProProductExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    private static final long serialVersionUID = 1L;

    public ProProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("product_no is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("product_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("product_no =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("product_no <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("product_no >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_no >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("product_no <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("product_no <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("product_no like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("product_no not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("product_no in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("product_no not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("product_no between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("product_no not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("supplier_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("supplier_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(Byte value) {
            addCriterion("supplier_type =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(Byte value) {
            addCriterion("supplier_type <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(Byte value) {
            addCriterion("supplier_type >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("supplier_type >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(Byte value) {
            addCriterion("supplier_type <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(Byte value) {
            addCriterion("supplier_type <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<Byte> values) {
            addCriterion("supplier_type in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<Byte> values) {
            addCriterion("supplier_type not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(Byte value1, Byte value2) {
            addCriterion("supplier_type between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("supplier_type not between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdIsNull() {
            addCriterion("institution_id is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdIsNotNull() {
            addCriterion("institution_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdEqualTo(Long value) {
            addCriterion("institution_id =", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdNotEqualTo(Long value) {
            addCriterion("institution_id <>", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdGreaterThan(Long value) {
            addCriterion("institution_id >", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("institution_id >=", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdLessThan(Long value) {
            addCriterion("institution_id <", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdLessThanOrEqualTo(Long value) {
            addCriterion("institution_id <=", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdIn(List<Long> values) {
            addCriterion("institution_id in", values, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdNotIn(List<Long> values) {
            addCriterion("institution_id not in", values, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdBetween(Long value1, Long value2) {
            addCriterion("institution_id between", value1, value2, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdNotBetween(Long value1, Long value2) {
            addCriterion("institution_id not between", value1, value2, "institutionId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdIsNull() {
            addCriterion("category_code_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdIsNotNull() {
            addCriterion("category_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdEqualTo(Integer value) {
            addCriterion("category_code_id =", value, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdNotEqualTo(Integer value) {
            addCriterion("category_code_id <>", value, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdGreaterThan(Integer value) {
            addCriterion("category_code_id >", value, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_code_id >=", value, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdLessThan(Integer value) {
            addCriterion("category_code_id <", value, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_code_id <=", value, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdIn(List<Integer> values) {
            addCriterion("category_code_id in", values, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdNotIn(List<Integer> values) {
            addCriterion("category_code_id not in", values, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("category_code_id between", value1, value2, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_code_id not between", value1, value2, "categoryCodeId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNull() {
            addCriterion("product_state is null");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNotNull() {
            addCriterion("product_state is not null");
            return (Criteria) this;
        }

        public Criteria andProductStateEqualTo(Byte value) {
            addCriterion("product_state =", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotEqualTo(Byte value) {
            addCriterion("product_state <>", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThan(Byte value) {
            addCriterion("product_state >", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_state >=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThan(Byte value) {
            addCriterion("product_state <", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThanOrEqualTo(Byte value) {
            addCriterion("product_state <=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateIn(List<Byte> values) {
            addCriterion("product_state in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotIn(List<Byte> values) {
            addCriterion("product_state not in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateBetween(Byte value1, Byte value2) {
            addCriterion("product_state between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotBetween(Byte value1, Byte value2) {
            addCriterion("product_state not between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andPublicDateIsNull() {
            addCriterion("public_date is null");
            return (Criteria) this;
        }

        public Criteria andPublicDateIsNotNull() {
            addCriterion("public_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublicDateEqualTo(Date value) {
            addCriterion("public_date =", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateNotEqualTo(Date value) {
            addCriterion("public_date <>", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateGreaterThan(Date value) {
            addCriterion("public_date >", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateGreaterThanOrEqualTo(Date value) {
            addCriterion("public_date >=", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateLessThan(Date value) {
            addCriterion("public_date <", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateLessThanOrEqualTo(Date value) {
            addCriterion("public_date <=", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateIn(List<Date> values) {
            addCriterion("public_date in", values, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateNotIn(List<Date> values) {
            addCriterion("public_date not in", values, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateBetween(Date value1, Date value2) {
            addCriterion("public_date between", value1, value2, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateNotBetween(Date value1, Date value2) {
            addCriterion("public_date not between", value1, value2, "publicDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNull() {
            addCriterion("expired_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNotNull() {
            addCriterion("expired_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateEqualTo(Date value) {
            addCriterion("expired_date =", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotEqualTo(Date value) {
            addCriterion("expired_date <>", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThan(Date value) {
            addCriterion("expired_date >", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expired_date >=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThan(Date value) {
            addCriterion("expired_date <", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThanOrEqualTo(Date value) {
            addCriterion("expired_date <=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIn(List<Date> values) {
            addCriterion("expired_date in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotIn(List<Date> values) {
            addCriterion("expired_date not in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateBetween(Date value1, Date value2) {
            addCriterion("expired_date between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotBetween(Date value1, Date value2) {
            addCriterion("expired_date not between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(Byte value) {
            addCriterion("credit_limit =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(Byte value) {
            addCriterion("credit_limit <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(Byte value) {
            addCriterion("credit_limit >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("credit_limit >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(Byte value) {
            addCriterion("credit_limit <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(Byte value) {
            addCriterion("credit_limit <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<Byte> values) {
            addCriterion("credit_limit in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<Byte> values) {
            addCriterion("credit_limit not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(Byte value1, Byte value2) {
            addCriterion("credit_limit between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("credit_limit not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitIsNull() {
            addCriterion("credit_apply_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitIsNotNull() {
            addCriterion("credit_apply_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitEqualTo(Byte value) {
            addCriterion("credit_apply_limit =", value, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitNotEqualTo(Byte value) {
            addCriterion("credit_apply_limit <>", value, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitGreaterThan(Byte value) {
            addCriterion("credit_apply_limit >", value, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("credit_apply_limit >=", value, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitLessThan(Byte value) {
            addCriterion("credit_apply_limit <", value, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitLessThanOrEqualTo(Byte value) {
            addCriterion("credit_apply_limit <=", value, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitIn(List<Byte> values) {
            addCriterion("credit_apply_limit in", values, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitNotIn(List<Byte> values) {
            addCriterion("credit_apply_limit not in", values, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitBetween(Byte value1, Byte value2) {
            addCriterion("credit_apply_limit between", value1, value2, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("credit_apply_limit not between", value1, value2, "creditApplyLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinIsNull() {
            addCriterion("loan_amount_min is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinIsNotNull() {
            addCriterion("loan_amount_min is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinEqualTo(BigDecimal value) {
            addCriterion("loan_amount_min =", value, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount_min <>", value, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinGreaterThan(BigDecimal value) {
            addCriterion("loan_amount_min >", value, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount_min >=", value, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinLessThan(BigDecimal value) {
            addCriterion("loan_amount_min <", value, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount_min <=", value, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinIn(List<BigDecimal> values) {
            addCriterion("loan_amount_min in", values, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount_min not in", values, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount_min between", value1, value2, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount_min not between", value1, value2, "loanAmountMin");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxIsNull() {
            addCriterion("loan_amount_max is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxIsNotNull() {
            addCriterion("loan_amount_max is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxEqualTo(BigDecimal value) {
            addCriterion("loan_amount_max =", value, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount_max <>", value, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxGreaterThan(BigDecimal value) {
            addCriterion("loan_amount_max >", value, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount_max >=", value, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxLessThan(BigDecimal value) {
            addCriterion("loan_amount_max <", value, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount_max <=", value, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxIn(List<BigDecimal> values) {
            addCriterion("loan_amount_max in", values, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount_max not in", values, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount_max between", value1, value2, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount_max not between", value1, value2, "loanAmountMax");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitIsNull() {
            addCriterion("loan_amount_limit is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitIsNotNull() {
            addCriterion("loan_amount_limit is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitEqualTo(Byte value) {
            addCriterion("loan_amount_limit =", value, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitNotEqualTo(Byte value) {
            addCriterion("loan_amount_limit <>", value, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitGreaterThan(Byte value) {
            addCriterion("loan_amount_limit >", value, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("loan_amount_limit >=", value, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitLessThan(Byte value) {
            addCriterion("loan_amount_limit <", value, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitLessThanOrEqualTo(Byte value) {
            addCriterion("loan_amount_limit <=", value, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitIn(List<Byte> values) {
            addCriterion("loan_amount_limit in", values, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitNotIn(List<Byte> values) {
            addCriterion("loan_amount_limit not in", values, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitBetween(Byte value1, Byte value2) {
            addCriterion("loan_amount_limit between", value1, value2, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("loan_amount_limit not between", value1, value2, "loanAmountLimit");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioIsNull() {
            addCriterion("down_payment_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioIsNotNull() {
            addCriterion("down_payment_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioEqualTo(BigDecimal value) {
            addCriterion("down_payment_ratio =", value, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioNotEqualTo(BigDecimal value) {
            addCriterion("down_payment_ratio <>", value, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioGreaterThan(BigDecimal value) {
            addCriterion("down_payment_ratio >", value, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("down_payment_ratio >=", value, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioLessThan(BigDecimal value) {
            addCriterion("down_payment_ratio <", value, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("down_payment_ratio <=", value, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioIn(List<BigDecimal> values) {
            addCriterion("down_payment_ratio in", values, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioNotIn(List<BigDecimal> values) {
            addCriterion("down_payment_ratio not in", values, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("down_payment_ratio between", value1, value2, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andDownPaymentRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("down_payment_ratio not between", value1, value2, "downPaymentRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioIsNull() {
            addCriterion("tail_ratio is null");
            return (Criteria) this;
        }

        public Criteria andTailRatioIsNotNull() {
            addCriterion("tail_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andTailRatioEqualTo(BigDecimal value) {
            addCriterion("tail_ratio =", value, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioNotEqualTo(BigDecimal value) {
            addCriterion("tail_ratio <>", value, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioGreaterThan(BigDecimal value) {
            addCriterion("tail_ratio >", value, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tail_ratio >=", value, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioLessThan(BigDecimal value) {
            addCriterion("tail_ratio <", value, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tail_ratio <=", value, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioIn(List<BigDecimal> values) {
            addCriterion("tail_ratio in", values, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioNotIn(List<BigDecimal> values) {
            addCriterion("tail_ratio not in", values, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tail_ratio between", value1, value2, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andTailRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tail_ratio not between", value1, value2, "tailRatio");
            return (Criteria) this;
        }

        public Criteria andCreditTermIsNull() {
            addCriterion("credit_term is null");
            return (Criteria) this;
        }

        public Criteria andCreditTermIsNotNull() {
            addCriterion("credit_term is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTermEqualTo(Integer value) {
            addCriterion("credit_term =", value, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermNotEqualTo(Integer value) {
            addCriterion("credit_term <>", value, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermGreaterThan(Integer value) {
            addCriterion("credit_term >", value, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_term >=", value, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermLessThan(Integer value) {
            addCriterion("credit_term <", value, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermLessThanOrEqualTo(Integer value) {
            addCriterion("credit_term <=", value, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermIn(List<Integer> values) {
            addCriterion("credit_term in", values, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermNotIn(List<Integer> values) {
            addCriterion("credit_term not in", values, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermBetween(Integer value1, Integer value2) {
            addCriterion("credit_term between", value1, value2, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_term not between", value1, value2, "creditTerm");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseIsNull() {
            addCriterion("credit_term_base is null");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseIsNotNull() {
            addCriterion("credit_term_base is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseEqualTo(Byte value) {
            addCriterion("credit_term_base =", value, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseNotEqualTo(Byte value) {
            addCriterion("credit_term_base <>", value, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseGreaterThan(Byte value) {
            addCriterion("credit_term_base >", value, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseGreaterThanOrEqualTo(Byte value) {
            addCriterion("credit_term_base >=", value, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseLessThan(Byte value) {
            addCriterion("credit_term_base <", value, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseLessThanOrEqualTo(Byte value) {
            addCriterion("credit_term_base <=", value, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseIn(List<Byte> values) {
            addCriterion("credit_term_base in", values, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseNotIn(List<Byte> values) {
            addCriterion("credit_term_base not in", values, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseBetween(Byte value1, Byte value2) {
            addCriterion("credit_term_base between", value1, value2, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andCreditTermBaseNotBetween(Byte value1, Byte value2) {
            addCriterion("credit_term_base not between", value1, value2, "creditTermBase");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeIsNull() {
            addCriterion("security_deposit_type is null");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeIsNotNull() {
            addCriterion("security_deposit_type is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeEqualTo(Byte value) {
            addCriterion("security_deposit_type =", value, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeNotEqualTo(Byte value) {
            addCriterion("security_deposit_type <>", value, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeGreaterThan(Byte value) {
            addCriterion("security_deposit_type >", value, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("security_deposit_type >=", value, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeLessThan(Byte value) {
            addCriterion("security_deposit_type <", value, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeLessThanOrEqualTo(Byte value) {
            addCriterion("security_deposit_type <=", value, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeIn(List<Byte> values) {
            addCriterion("security_deposit_type in", values, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeNotIn(List<Byte> values) {
            addCriterion("security_deposit_type not in", values, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeBetween(Byte value1, Byte value2) {
            addCriterion("security_deposit_type between", value1, value2, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("security_deposit_type not between", value1, value2, "securityDepositType");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountIsNull() {
            addCriterion("security_deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountIsNotNull() {
            addCriterion("security_deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountEqualTo(BigDecimal value) {
            addCriterion("security_deposit_amount =", value, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("security_deposit_amount <>", value, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("security_deposit_amount >", value, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("security_deposit_amount >=", value, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountLessThan(BigDecimal value) {
            addCriterion("security_deposit_amount <", value, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("security_deposit_amount <=", value, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountIn(List<BigDecimal> values) {
            addCriterion("security_deposit_amount in", values, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("security_deposit_amount not in", values, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("security_deposit_amount between", value1, value2, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("security_deposit_amount not between", value1, value2, "securityDepositAmount");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}