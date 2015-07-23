-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Reason: Author table to storage all the values
-- Author : Alberto Cerqueira
-- Date : 22/07/2015
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------- TABELA: TBL_AUTHOR ----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS carminp.TBL_PHRASE (
  phrase_id UUID NOT NULL DEFAULT uuid_generate_v1mc(),
  phrase_phrase CHARACTER VARYING(244) NOT NULL,
  author_id UUID NOT NULL,
  CONSTRAINT TBL_AUTHOR_FK FOREIGN KEY (author_id)
    REFERENCES carminp.TBL_AUTHOR (author_id) MATCH SIMPLE
    ON UPDATE NO ACTION 
    ON DELETE NO ACTION
);

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
