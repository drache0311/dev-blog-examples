DROP DATABASE IF EXISTS traffic;
CREATE DATABASE traffic;
USE traffic;


CREATE TABLE TRAFFIC (ID bigint not null auto_increment, ONE_STRING varchar(10), ONE_LONG bigint, ONE_BIGDECIMAL decimal(20,10), ONE_BOOLEAN char(1),TWO_STRING varchar(10), TWO_LONG bigint, TWO_BIGDECIMAL decimal(20,10), TWO_BOOLEAN char(1), primary key (ID));
