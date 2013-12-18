# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table disciplina (
  nome_da_disciplina        varchar(255),
  creditos                  integer)
;

create table periodo)
;

create table planejamento)
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists disciplina;

drop table if exists periodo;

drop table if exists planejamento;

SET REFERENTIAL_INTEGRITY TRUE;

