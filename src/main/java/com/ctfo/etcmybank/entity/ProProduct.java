package com.ctfo.etcmybank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProProduct implements Serializable {
    private Integer id;

    private String productNo;

    private String productName;

    private Byte supplierType;

    private Long institutionId;

    private Integer categoryCodeId;

    private String categoryCode;

    private String categoryName;

    private Byte productState;

    private Date publicDate;

    private Date expiredDate;

    private Byte creditLimit;

    private Byte creditApplyLimit;

    private BigDecimal loanAmountMin;

    private BigDecimal loanAmountMax;

    private Byte loanAmountLimit;

    private BigDecimal downPaymentRatio;

    private BigDecimal tailRatio;

    private Integer creditTerm;

    private Byte creditTermBase;

    private Byte securityDepositType;

    private BigDecimal securityDepositAmount;

    private Byte deleteFlag;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Byte getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(Byte supplierType) {
        this.supplierType = supplierType;
    }

    public Long getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Long institutionId) {
        this.institutionId = institutionId;
    }

    public Integer getCategoryCodeId() {
        return categoryCodeId;
    }

    public void setCategoryCodeId(Integer categoryCodeId) {
        this.categoryCodeId = categoryCodeId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Byte getProductState() {
        return productState;
    }

    public void setProductState(Byte productState) {
        this.productState = productState;
    }

    public Date getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Byte getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Byte creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Byte getCreditApplyLimit() {
        return creditApplyLimit;
    }

    public void setCreditApplyLimit(Byte creditApplyLimit) {
        this.creditApplyLimit = creditApplyLimit;
    }

    public BigDecimal getLoanAmountMin() {
        return loanAmountMin;
    }

    public void setLoanAmountMin(BigDecimal loanAmountMin) {
        this.loanAmountMin = loanAmountMin;
    }

    public BigDecimal getLoanAmountMax() {
        return loanAmountMax;
    }

    public void setLoanAmountMax(BigDecimal loanAmountMax) {
        this.loanAmountMax = loanAmountMax;
    }

    public Byte getLoanAmountLimit() {
        return loanAmountLimit;
    }

    public void setLoanAmountLimit(Byte loanAmountLimit) {
        this.loanAmountLimit = loanAmountLimit;
    }

    public BigDecimal getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(BigDecimal downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public BigDecimal getTailRatio() {
        return tailRatio;
    }

    public void setTailRatio(BigDecimal tailRatio) {
        this.tailRatio = tailRatio;
    }

    public Integer getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(Integer creditTerm) {
        this.creditTerm = creditTerm;
    }

    public Byte getCreditTermBase() {
        return creditTermBase;
    }

    public void setCreditTermBase(Byte creditTermBase) {
        this.creditTermBase = creditTermBase;
    }

    public Byte getSecurityDepositType() {
        return securityDepositType;
    }

    public void setSecurityDepositType(Byte securityDepositType) {
        this.securityDepositType = securityDepositType;
    }

    public BigDecimal getSecurityDepositAmount() {
        return securityDepositAmount;
    }

    public void setSecurityDepositAmount(BigDecimal securityDepositAmount) {
        this.securityDepositAmount = securityDepositAmount;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}