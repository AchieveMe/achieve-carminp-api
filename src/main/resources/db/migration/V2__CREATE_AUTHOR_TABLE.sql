-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Reason: Author table to storage all the values
-- Author : Guilherme Magalhaes
-- Date : 20/07/2015
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------- TABELA: TBL_AUTHOR ----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS carminp.TBL_AUTHOR (
  author_id UUID NOT NULL DEFAULT uuid_generate_v1mc(),
  author_name CHARACTER VARYING(60) NOT NULL,
  CONSTRAINT author_pk PRIMARY KEY (author_id)
);

------------------------------------------------------------------------- INDEX: uk_author__author_name -----------------------------------------------------------------------

DROP INDEX IF EXISTS uk_author__author_name;

CREATE INDEX uk_author__author_name
  ON carminp.TBL_AUTHOR
  USING btree
  (author_name COLLATE pg_catalog."default");

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO carminp.TBL_AUTHOR (author_name) VALUES ('Guilherme Magalhaes');
INSERT INTO carminp.TBL_AUTHOR (author_name) VALUES ('Alberto Cerqueira');
INSERT INTO carminp.TBL_AUTHOR (author_name) VALUES ('Romario Lima');

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------