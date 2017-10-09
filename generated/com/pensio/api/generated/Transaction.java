//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.09 at 02:51:57 PM CEST 
//


package com.pensio.api.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuthType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NoCreditCard"/>
 *               &lt;enumeration value="InvalidLuhn"/>
 *               &lt;enumeration value="InvalidCardLength"/>
 *               &lt;enumeration value="SoonExpired"/>
 *               &lt;enumeration value="Expired"/>
 *               &lt;enumeration value="Valid"/>
 *               &lt;enumeration value="DeletedPan"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreditCardExpiry" type="{}CreditCardExpiry" minOccurs="0"/>
 *         &lt;element name="CreditCardToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCardMaskedPan">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([\d\*]*)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GiftCardToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaskedGiftCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeDSecureResult">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Not_Applicable"/>
 *               &lt;enumeration value="Disabled"/>
 *               &lt;enumeration value="Not_Attempted"/>
 *               &lt;enumeration value="CardType_Not_Supported"/>
 *               &lt;enumeration value="Not_Enrolled"/>
 *               &lt;enumeration value="Declined"/>
 *               &lt;enumeration value="Error"/>
 *               &lt;enumeration value="Attempted"/>
 *               &lt;enumeration value="Successful"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LiableForChargeback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVVCheckResult">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Not_Applicable"/>
 *               &lt;enumeration value="Not_Attempted"/>
 *               &lt;enumeration value="Unknown"/>
 *               &lt;enumeration value="Matched"/>
 *               &lt;enumeration value="MisMatched"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BlacklistToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShopOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Shop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardHolderMessageMustBeShown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MerchantCurrency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MerchantCurrencyAlpha">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CardHolderCurrency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CardHolderCurrencyAlpha">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReservedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CapturedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RefundedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CreditedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RecurringDefaultAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CreatedDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{4}-[01]\d-[0123]\d [012]\d:[012345]\d:[012345]\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UpdatedDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{4}-[01]\d-[0123]\d [012]\d:[012345]\d:[012345]\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentNature">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Wallet"/>
 *               &lt;enumeration value="EPayment"/>
 *               &lt;enumeration value="CreditCard"/>
 *               &lt;enumeration value="BankPayment"/>
 *               &lt;enumeration value="IdealPayment"/>
 *               &lt;enumeration value="Invoice"/>
 *               &lt;enumeration value="CreditCardWallet"/>
 *               &lt;enumeration value="GiftCard"/>
 *               &lt;enumeration value="Mobile"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentSchemeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentNatureService" type="{}PaymentNatureService"/>
 *         &lt;element name="FraudRiskScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FraudExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FraudRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressVerification" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressVerificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargebackEvents" type="{}ChargebackEvents" minOccurs="0"/>
 *         &lt;element name="PaymentInfos" type="{}PaymentInfos"/>
 *         &lt;element name="CustomerInfo" type="{}CustomerInfo" minOccurs="0"/>
 *         &lt;element name="ReconciliationIdentifiers" type="{}ReconciliationIdentifiers"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {

})
public class Transaction {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "PaymentId", required = true)
    protected String paymentId;
    @XmlElement(name = "AuthType", required = true)
    protected String authType;
    @XmlElement(name = "CardStatus", required = true)
    protected String cardStatus;
    @XmlElement(name = "CreditCardExpiry")
    protected CreditCardExpiry creditCardExpiry;
    @XmlElement(name = "CreditCardToken", required = true)
    protected String creditCardToken;
    @XmlElement(name = "CreditCardMaskedPan", required = true)
    protected String creditCardMaskedPan;
    @XmlElement(name = "GiftCardToken")
    protected String giftCardToken;
    @XmlElement(name = "MaskedGiftCard")
    protected String maskedGiftCard;
    @XmlElement(name = "ThreeDSecureResult", required = true)
    protected String threeDSecureResult;
    @XmlElement(name = "LiableForChargeback")
    protected String liableForChargeback;
    @XmlElement(name = "CVVCheckResult", required = true)
    protected String cvvCheckResult;
    @XmlElement(name = "BlacklistToken", required = true)
    protected String blacklistToken;
    @XmlElement(name = "ShopOrderId", required = true)
    protected String shopOrderId;
    @XmlElement(name = "Shop", required = true)
    protected String shop;
    @XmlElement(name = "Terminal", required = true)
    protected String terminal;
    @XmlElement(name = "TransactionStatus", required = true)
    protected String transactionStatus;
    @XmlElement(name = "ReasonCode", required = true)
    protected String reasonCode;
    @XmlElement(name = "CardHolderMessageMustBeShown")
    protected Boolean cardHolderMessageMustBeShown;
    @XmlElement(name = "MerchantCurrency", required = true)
    protected String merchantCurrency;
    @XmlElement(name = "MerchantCurrencyAlpha", required = true)
    protected String merchantCurrencyAlpha;
    @XmlElement(name = "CardHolderCurrency", required = true)
    protected String cardHolderCurrency;
    @XmlElement(name = "CardHolderCurrencyAlpha", required = true)
    protected String cardHolderCurrencyAlpha;
    @XmlElement(name = "ReservedAmount")
    protected double reservedAmount;
    @XmlElement(name = "CapturedAmount")
    protected double capturedAmount;
    @XmlElement(name = "RefundedAmount")
    protected double refundedAmount;
    @XmlElement(name = "CreditedAmount")
    protected double creditedAmount;
    @XmlElement(name = "RecurringDefaultAmount")
    protected double recurringDefaultAmount;
    @XmlElement(name = "SurchargeAmount")
    protected double surchargeAmount;
    @XmlElement(name = "CreatedDate", required = true)
    protected String createdDate;
    @XmlElement(name = "UpdatedDate", required = true)
    protected String updatedDate;
    @XmlElement(name = "PaymentNature", required = true)
    protected String paymentNature;
    @XmlElement(name = "PaymentSchemeName")
    protected String paymentSchemeName;
    @XmlElement(name = "PaymentNatureService", required = true)
    protected PaymentNatureService paymentNatureService;
    @XmlElement(name = "FraudRiskScore")
    protected Double fraudRiskScore;
    @XmlElement(name = "FraudExplanation")
    protected String fraudExplanation;
    @XmlElement(name = "FraudRecommendation")
    protected String fraudRecommendation;
    @XmlElement(name = "AddressVerification")
    protected String addressVerification;
    @XmlElement(name = "AddressVerificationDescription")
    protected String addressVerificationDescription;
    @XmlElement(name = "ChargebackEvents")
    protected ChargebackEvents chargebackEvents;
    @XmlElement(name = "PaymentInfos", required = true)
    protected PaymentInfos paymentInfos;
    @XmlElement(name = "CustomerInfo")
    protected CustomerInfo customerInfo;
    @XmlElement(name = "ReconciliationIdentifiers", required = true)
    protected ReconciliationIdentifiers reconciliationIdentifiers;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the creditCardExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardExpiry }
     *     
     */
    public CreditCardExpiry getCreditCardExpiry() {
        return creditCardExpiry;
    }

    /**
     * Sets the value of the creditCardExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardExpiry }
     *     
     */
    public void setCreditCardExpiry(CreditCardExpiry value) {
        this.creditCardExpiry = value;
    }

    /**
     * Gets the value of the creditCardToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardToken() {
        return creditCardToken;
    }

    /**
     * Sets the value of the creditCardToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardToken(String value) {
        this.creditCardToken = value;
    }

    /**
     * Gets the value of the creditCardMaskedPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardMaskedPan() {
        return creditCardMaskedPan;
    }

    /**
     * Sets the value of the creditCardMaskedPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardMaskedPan(String value) {
        this.creditCardMaskedPan = value;
    }

    /**
     * Gets the value of the giftCardToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardToken() {
        return giftCardToken;
    }

    /**
     * Sets the value of the giftCardToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardToken(String value) {
        this.giftCardToken = value;
    }

    /**
     * Gets the value of the maskedGiftCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedGiftCard() {
        return maskedGiftCard;
    }

    /**
     * Sets the value of the maskedGiftCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedGiftCard(String value) {
        this.maskedGiftCard = value;
    }

    /**
     * Gets the value of the threeDSecureResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSecureResult() {
        return threeDSecureResult;
    }

    /**
     * Sets the value of the threeDSecureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSecureResult(String value) {
        this.threeDSecureResult = value;
    }

    /**
     * Gets the value of the liableForChargeback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiableForChargeback() {
        return liableForChargeback;
    }

    /**
     * Sets the value of the liableForChargeback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiableForChargeback(String value) {
        this.liableForChargeback = value;
    }

    /**
     * Gets the value of the cvvCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVVCheckResult() {
        return cvvCheckResult;
    }

    /**
     * Sets the value of the cvvCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVVCheckResult(String value) {
        this.cvvCheckResult = value;
    }

    /**
     * Gets the value of the blacklistToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacklistToken() {
        return blacklistToken;
    }

    /**
     * Sets the value of the blacklistToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacklistToken(String value) {
        this.blacklistToken = value;
    }

    /**
     * Gets the value of the shopOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopOrderId() {
        return shopOrderId;
    }

    /**
     * Sets the value of the shopOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopOrderId(String value) {
        this.shopOrderId = value;
    }

    /**
     * Gets the value of the shop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShop() {
        return shop;
    }

    /**
     * Sets the value of the shop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShop(String value) {
        this.shop = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the cardHolderMessageMustBeShown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardHolderMessageMustBeShown() {
        return cardHolderMessageMustBeShown;
    }

    /**
     * Sets the value of the cardHolderMessageMustBeShown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardHolderMessageMustBeShown(Boolean value) {
        this.cardHolderMessageMustBeShown = value;
    }

    /**
     * Gets the value of the merchantCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCurrency() {
        return merchantCurrency;
    }

    /**
     * Sets the value of the merchantCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCurrency(String value) {
        this.merchantCurrency = value;
    }

    /**
     * Gets the value of the merchantCurrencyAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCurrencyAlpha() {
        return merchantCurrencyAlpha;
    }

    /**
     * Sets the value of the merchantCurrencyAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCurrencyAlpha(String value) {
        this.merchantCurrencyAlpha = value;
    }

    /**
     * Gets the value of the cardHolderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderCurrency() {
        return cardHolderCurrency;
    }

    /**
     * Sets the value of the cardHolderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderCurrency(String value) {
        this.cardHolderCurrency = value;
    }

    /**
     * Gets the value of the cardHolderCurrencyAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderCurrencyAlpha() {
        return cardHolderCurrencyAlpha;
    }

    /**
     * Sets the value of the cardHolderCurrencyAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderCurrencyAlpha(String value) {
        this.cardHolderCurrencyAlpha = value;
    }

    /**
     * Gets the value of the reservedAmount property.
     * 
     */
    public double getReservedAmount() {
        return reservedAmount;
    }

    /**
     * Sets the value of the reservedAmount property.
     * 
     */
    public void setReservedAmount(double value) {
        this.reservedAmount = value;
    }

    /**
     * Gets the value of the capturedAmount property.
     * 
     */
    public double getCapturedAmount() {
        return capturedAmount;
    }

    /**
     * Sets the value of the capturedAmount property.
     * 
     */
    public void setCapturedAmount(double value) {
        this.capturedAmount = value;
    }

    /**
     * Gets the value of the refundedAmount property.
     * 
     */
    public double getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * Sets the value of the refundedAmount property.
     * 
     */
    public void setRefundedAmount(double value) {
        this.refundedAmount = value;
    }

    /**
     * Gets the value of the creditedAmount property.
     * 
     */
    public double getCreditedAmount() {
        return creditedAmount;
    }

    /**
     * Sets the value of the creditedAmount property.
     * 
     */
    public void setCreditedAmount(double value) {
        this.creditedAmount = value;
    }

    /**
     * Gets the value of the recurringDefaultAmount property.
     * 
     */
    public double getRecurringDefaultAmount() {
        return recurringDefaultAmount;
    }

    /**
     * Sets the value of the recurringDefaultAmount property.
     * 
     */
    public void setRecurringDefaultAmount(double value) {
        this.recurringDefaultAmount = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     */
    public double getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     */
    public void setSurchargeAmount(double value) {
        this.surchargeAmount = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the paymentNature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNature() {
        return paymentNature;
    }

    /**
     * Sets the value of the paymentNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNature(String value) {
        this.paymentNature = value;
    }

    /**
     * Gets the value of the paymentSchemeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSchemeName() {
        return paymentSchemeName;
    }

    /**
     * Sets the value of the paymentSchemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSchemeName(String value) {
        this.paymentSchemeName = value;
    }

    /**
     * Gets the value of the paymentNatureService property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentNatureService }
     *     
     */
    public PaymentNatureService getPaymentNatureService() {
        return paymentNatureService;
    }

    /**
     * Sets the value of the paymentNatureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentNatureService }
     *     
     */
    public void setPaymentNatureService(PaymentNatureService value) {
        this.paymentNatureService = value;
    }

    /**
     * Gets the value of the fraudRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFraudRiskScore() {
        return fraudRiskScore;
    }

    /**
     * Sets the value of the fraudRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFraudRiskScore(Double value) {
        this.fraudRiskScore = value;
    }

    /**
     * Gets the value of the fraudExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudExplanation() {
        return fraudExplanation;
    }

    /**
     * Sets the value of the fraudExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudExplanation(String value) {
        this.fraudExplanation = value;
    }

    /**
     * Gets the value of the fraudRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudRecommendation() {
        return fraudRecommendation;
    }

    /**
     * Sets the value of the fraudRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudRecommendation(String value) {
        this.fraudRecommendation = value;
    }

    /**
     * Gets the value of the addressVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerification() {
        return addressVerification;
    }

    /**
     * Sets the value of the addressVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerification(String value) {
        this.addressVerification = value;
    }

    /**
     * Gets the value of the addressVerificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationDescription() {
        return addressVerificationDescription;
    }

    /**
     * Sets the value of the addressVerificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationDescription(String value) {
        this.addressVerificationDescription = value;
    }

    /**
     * Gets the value of the chargebackEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ChargebackEvents }
     *     
     */
    public ChargebackEvents getChargebackEvents() {
        return chargebackEvents;
    }

    /**
     * Sets the value of the chargebackEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargebackEvents }
     *     
     */
    public void setChargebackEvents(ChargebackEvents value) {
        this.chargebackEvents = value;
    }

    /**
     * Gets the value of the paymentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfos }
     *     
     */
    public PaymentInfos getPaymentInfos() {
        return paymentInfos;
    }

    /**
     * Sets the value of the paymentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfos }
     *     
     */
    public void setPaymentInfos(PaymentInfos value) {
        this.paymentInfos = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setCustomerInfo(CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the reconciliationIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationIdentifiers }
     *     
     */
    public ReconciliationIdentifiers getReconciliationIdentifiers() {
        return reconciliationIdentifiers;
    }

    /**
     * Sets the value of the reconciliationIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationIdentifiers }
     *     
     */
    public void setReconciliationIdentifiers(ReconciliationIdentifiers value) {
        this.reconciliationIdentifiers = value;
    }

}