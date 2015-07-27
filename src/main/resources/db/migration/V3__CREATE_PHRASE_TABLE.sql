-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Reason: Author table to storage all the values
-- Author : Alberto Cerqueira
-- Date : 22/07/2015
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------- TABELA: TBL_AUTHOR ----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS carminp.TBL_PHRASE (
  phrase_id UUID NOT NULL DEFAULT uuid_generate_v1mc(),
  phrase_phrase CHARACTER VARYING(244) NOT NULL,
  author_name CHARACTER VARYING(60) NOT NULL,
  CONSTRAINT TBL_AUTHOR_FK FOREIGN KEY (author_name)
    REFERENCES carminp.TBL_AUTHOR (author_name) MATCH SIMPLE
    ON UPDATE NO ACTION 
    ON DELETE NO ACTION
);

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO carminp.TBL_PHRASE (phrase_phrase, author_name) VALUES ('Essa zoeira está fantástica', 'Guilherme Magalhaes');
INSERT INTO carminp.TBL_PHRASE (phrase_phrase, author_name) VALUES ('Do not worry baby', 'Alberto Cerqueira');
INSERT INTO carminp.TBL_PHRASE (phrase_phrase, author_name) VALUES ('Aids hoje, aids amanhã, aids sempre!', 'Romario Lima');

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------