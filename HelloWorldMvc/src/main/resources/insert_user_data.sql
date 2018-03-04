insert into USER_PROFILE(id, type) values(nextval('user_profile_id_seq'::regclass), 'ADMIN');

insert into USER_PROFILE(id, type) values(nextval('user_profile_id_seq'::regclass), 'DBA');

insert into "USER"(id, email, first_name, last_name, password, user_name) values(nextval('"USER_id_seq"'::regclass), 'joyson.ullal@gmail.com', 'Joyson', 'Dsouza', '$2a$10$VE/4Vtr6LAL0Lcu8UYiNKek5Tb4o0URDZVzQ/U34XRnEF1PvYQO7q
', 'joyson');

insert into USER_USER_PROFILE(user_id, user_profile_id) values (1,1);

CREATE SEQUENCE USER_DOCUMENT_ID_SEQ;
CREATE TABLE USER_DOCUMENTS (id serial NOT NULL, document_name varchar(128) NOT NULL, document_mimetype varchar(128) NOT NULL, document_data longblob, PRIMARY KEY (id));