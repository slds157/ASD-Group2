/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kj760
 * Created: 2021-10-21
 */


CREATE TABLE "USER"(
    "USERID" INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 100000, INCREMENT BY 1) ,
    "USERNAME" VARCHAR(23) NOT NULL,
    "USEREMAIL" VARCHAR(23)  NOT NULL,
    "USERPASSWORD" VARCHAR(23)  NOT NULL，
    "USERTYPE" VARCHAR(23) NOT NULL,
    PRIMARY KEY(USERID)
);