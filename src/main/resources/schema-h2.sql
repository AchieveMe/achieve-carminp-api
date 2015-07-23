------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Reason: H2 Dev env
-- Author : Guilherme Magalhaes
-- Author : Alberto Cerqueira
-- Date : 20/07/2015
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE SCHEMA IF NOT EXISTS carminp;

CREATE TABLE IF NOT EXISTS carminp.TBL_AUTHOR (
  author_id UUID NOT NULL DEFAULT RANDOM_UUID(),
  author_name CHARACTER VARYING(60) NOT NULL,
  CONSTRAINT author_pk PRIMARY KEY (author_id)
);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS carminp.TBL_PHRASE (
  author_id UUID NOT NULL,
  text CHARACTER VARYING(500) NOT NULL,
  CONSTRAINT TBL_AUTHOR_FK FOREIGN KEY (author_id)
  REFERENCES TBL_AUTOR (author_id) MATCH SIMPLE
  ON UPDATE NO ACTION 
  ON DELETE NO ACTION
);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------