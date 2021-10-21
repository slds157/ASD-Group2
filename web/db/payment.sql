/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kj760
 * Created: 2021-10-21
 */


CREATE TABLE "ORDER"(
    "PAYMENTID" INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 100000, INCREMENT BY 1) ,
    "CARDTYPE" VARCHAR(23) NOT NULL,
    "CARDNUMBER" INT  NOT NULL,
    "USERID" INT NOT NULL,
    FOREIGN KEY(USERID) REFERENCES "USER"(USERID),
    PRIMARY KEY(ORDERID)
);