alter table sales add column active TINYINT NULL;

UPDATE  sales SET active= 1;