
drop table if exists `movie_actor`;
drop table if exists `movie_director`;
drop table if exists `actor`;
drop table if exists `director`;
drop table if exists `movie`;
drop sequence if exists `hibernate_sequence`;
create sequence `hibernate_sequence` start with 1 increment by 1;
create table `actor` (`actor_id` bigint not null, `created_by` varchar(255), `creation_date` timestamp, `last_modified_by` varchar(255), `last_modified_date` timestamp, `first_name` varchar(255), `last_name` varchar(255), `year_of_birth` binary(255), `year_of_death` binary(255), primary key (actor_id));
create table `director` (`director_id` bigint not null, `created_by` varchar(255), `creation_date` timestamp, `last_modified_by` varchar(255), `last_modified_date` timestamp, `first_name` varchar(255), `last_name` varchar(255), `year_of_birth` binary(255), `year_of_death` binary(255), primary key (director_id));
create table `movie` (`id` bigint not null, `created_by` varchar(255), `creation_date` timestamp, `last_modified_by` varchar(255), `last_modified_date` timestamp,`imgPath` varchar(255), `description` varchar(255), `title` varchar(255), `year_of_publication` binary(255), primary key (id));
create table `movie_actor` (`movie_id` bigint not null, `actor_id` bigint not null, `character` varchar(255));
create table `movie_director` (`movie_id` bigint not null, `director_id` bigint not null);
alter table `movie_actor` add constraint `FKMA01` foreign key (`actor_id`) references `actor`;
alter table `movie_actor` add constraint `FKMA02` foreign key (`movie_id`) references `movie`;
alter table `movie_director` add constraint `FKMD01` foreign key (`director_id`) references `director`;
alter table `movie_director` add constraint `FKMD02` foreign key (`movie_id`) references `movie`;