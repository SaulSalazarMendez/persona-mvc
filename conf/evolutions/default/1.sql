# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table persona (
  id                            bigint not null,
  nombre                        varchar(255),
  constraint pk_persona primary key (id)
);
create sequence persona_seq;


# --- !Downs

drop table if exists persona;
drop sequence if exists persona_seq;

