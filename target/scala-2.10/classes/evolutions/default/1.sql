# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table novo_planejamento (
  id                        bigint not null,
  constraint pk_novo_planejamento primary key (id))
;

create table planejamento (
  id                        bigint not null,
  constraint pk_planejamento primary key (id))
;

create table planejamento_comum (
  id                        bigint not null,
  constraint pk_planejamento_comum primary key (id))
;

create table usuario (
  id                        bigint not null,
  email                     varchar(255),
  nome                      varchar(255),
  senha                     varchar(255),
  sistema_planejamento_id   bigint,
  constraint pk_usuario primary key (id))
;

create sequence novo_planejamento_seq;

create sequence planejamento_seq;

create sequence planejamento_comum_seq;

create sequence usuario_seq;

alter table usuario add constraint fk_usuario_sistemaPlanejamento_1 foreign key (sistema_planejamento_id) references planejamento (id) on delete restrict on update restrict;
create index ix_usuario_sistemaPlanejamento_1 on usuario (sistema_planejamento_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists novo_planejamento;

drop table if exists planejamento;

drop table if exists planejamento_comum;

drop table if exists usuario;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists novo_planejamento_seq;

drop sequence if exists planejamento_seq;

drop sequence if exists planejamento_comum_seq;

drop sequence if exists usuario_seq;

