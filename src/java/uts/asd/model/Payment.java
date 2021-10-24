/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.model;

/**
 *
 * @author kj760
 */
public class Payment {
    private int PaymentId;
    private String CardType;
    private int CardNum;
    private int UserId;
    private String UserName;
    private String DocType;
    private int DocNumber;

    public Payment(String CardType, int CardNum, int UserId, String UserName, String DocType, int DocNumber) {
        this.CardType = CardType;
        this.CardNum = CardNum;
        this.UserId = UserId;
        this.UserName = UserName;
        this.DocType = DocType;
        this.DocNumber = DocNumber;
    }

    public Payment(int PaymentId, String CardType, int CardNum, int UserId, String UserName, String DocType, int DocNumber) {
        this.PaymentId = PaymentId;
        this.CardType = CardType;
        this.CardNum = CardNum;
        this.UserId = UserId;
        this.UserName = UserName;
        this.DocType = DocType;
        this.DocNumber = DocNumber;
    }

    public Payment(String CardType, int CardNum, String UserName, String DocType, int DocNumber) {
        this.CardType = CardType;
        this.CardNum = CardNum;
        this.UserName = UserName;
        this.DocType = DocType;
        this.DocNumber = DocNumber;
    }

   
    
    
    public Payment(int PaymentId, String CardType, int CardNum, int UserId) {
        this.PaymentId = PaymentId;
        this.CardType = CardType;
        this.CardNum = CardNum;
        this.UserId = UserId;
    }

    public Payment(String CardType, int CardNum, int UserId) {
        this.CardType = CardType;
        this.CardNum = CardNum;
        this.UserId = UserId;
    }

    public Payment(String CardType, int CardNum) {
        this.CardType = CardType;
        this.CardNum = CardNum;
    }

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int PaymentId) {
        this.PaymentId = PaymentId;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    public int getCardNum() {
        return CardNum;
    }

    public void setCardNum(int CardNum) {
        this.CardNum = CardNum;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getDocType() {
        return DocType;
    }

    public void setDocType(String DocType) {
        this.DocType = DocType;
    }

    public int getDocNumber() {
        return DocNumber;
    }

    public void setDocNumber(int DocNumber) {
        this.DocNumber = DocNumber;
    }

    
}
