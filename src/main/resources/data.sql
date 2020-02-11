insert into actor  (actor_id, created_by, creation_date, last_modified_by, last_modified_date, first_name, last_name, year_of_birth)
values (1, null, now(), null, now(), 'Jan Josef', 'Liefers', 1968);
insert into director  (director_id, created_by, creation_date, last_modified_by, last_modified_date, first_name, last_name, year_of_birth)
values (1, null, now(), null, now(), 'Jimmy', 'Canzone', 1965);
insert into director  (director_id, created_by, creation_date, last_modified_by, last_modified_date, first_name, last_name, year_of_birth)
values (2, null, now(), null, now(), 'John', 'Rigoletto', 1960);
insert into movie (id, created_by, creation_date, last_modified_by, last_modified_date, description, title, year_of_publication)
values (1, null, now(), null, now(), 'Ein verrückter Science Fiction', 'Krieg der Sterne', 1983);
insert into movie_actor (movie_id, actor_id, `character`) values (1, 1, 'Hauptrolle');
insert into movie_actor (movie_id, actor_id, `character`) values (1, 1, 'noch ne tolle Rolle');
insert into movie_director (movie_id, director_id) values (1, 1);
insert into movie_director (movie_id, director_id) values (1, 2);