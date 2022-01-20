

insert into authors (id, name, surname) values (1, 'Karol', 'Bigris');
insert into authors (id, name, surname) values (2, 'Michał', 'Nowicki');
insert into authors (id, name, surname) values (3, 'Łukasz', 'Dudek');

insert into categories (id, name, description) values (1, 'Sport', 'All about sport');
insert into categories (id, name, description) values (2, 'Cooking', 'All about cooking');
insert into categories (id, name, description) values (3, 'Science', 'All about science');
insert into categories (id, name, description) values (4, 'Animal', 'All about Animal');
insert into categories (id, name, description) values (5, 'Weather', 'All about Weather');
insert into categories (id, name, description) values (6, 'Programing', 'All about Programing');
insert into categories (id, name, description) values (7, 'War', 'All about War');
insert into categories (id, name, description) values (8, 'Kibersecurity', 'All about Kibersecurity');
insert into categories (id, name, description) values (9, 'Games', 'All about Games');
insert into categories (id, name, description) values (10, 'Traveling', 'All about Traveling');



insert into articles (content,created,title,updated, author_id) values ( 'some content 1','2020-01-01','content 1','2020-02-02',1)
insert into articles (content,created,title,updated, author_id) values ( 'some content 2','2021-01-01','content 2','2021-02-02',2)
insert into articles (content,created,title,updated, author_id) values ( 'some content 3','2022-01-01','content 3','2022-02-02',3)
insert into articles (content,created,title,updated, author_id) values ( 'some content 4','2023-01-01','content 4','2023-02-02',1)
insert into articles (content,created,title,updated, author_id) values ( 'some content 5','2024-01-01','content 5','2023-02-02',2)
insert into articles (content,created,title,updated, author_id) values ( 'some content 6','2025-01-01','content 6','2023-02-02',3)

insert into articles_categories (articles_id, categories_id) values (1,2)
insert into articles_categories (articles_id, categories_id) values (1,5)
insert into articles_categories (articles_id, categories_id) values (1,7)
insert into articles_categories (articles_id, categories_id) values (1,3)
insert into articles_categories (articles_id, categories_id) values (2,1)
insert into articles_categories (articles_id, categories_id) values (2,4)
insert into articles_categories (articles_id, categories_id) values (2,3)
insert into articles_categories (articles_id, categories_id) values (2,2)
insert into articles_categories (articles_id, categories_id) values (2,8)
insert into articles_categories (articles_id, categories_id) values (2,10)
insert into articles_categories (articles_id, categories_id) values (3,2)
insert into articles_categories (articles_id, categories_id) values (3,6)
insert into articles_categories (articles_id, categories_id) values (3,10)
insert into articles_categories (articles_id, categories_id) values (4,9)
insert into articles_categories (articles_id, categories_id) values (4,1)
insert into articles_categories (articles_id, categories_id) values (4,2)
insert into articles_categories (articles_id, categories_id) values (4,6)
insert into articles_categories (articles_id, categories_id) values (5,6)
insert into articles_categories (articles_id, categories_id) values (5,1)
insert into articles_categories (articles_id, categories_id) values (5,8)
insert into articles_categories (articles_id, categories_id) values (5,3)
insert into articles_categories (articles_id, categories_id) values (6,1)
insert into articles_categories (articles_id, categories_id) values (6,2)



