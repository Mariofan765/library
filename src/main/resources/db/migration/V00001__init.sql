create table if not exists public.books (
    id int8 not null generated always as identity,
    title varchar(200) not null,
    author varchar(200) not null,
    author_full_name varchar(200) not null,
    constraint pk_books primary key (id),
    constraint uk_books unique (title, author, author_full_name)
);

create table if not exists public.users (
    id int8 not null generated always as identity,
    username varchar(200) not null,
    password varchar (200) not null,
    constraint pk_users primary key (id),
    constraint uk_users unique (username)
);

insert into public.books (title, author, author_full_name) values
    ('Горе от ума', 'А.С. Грибоедов', 'Александр Сергеевич Грибоедов'),
    ('Евгений Онегин', 'А.С. Пушкин','Александр Сергеевич Пушкин'),
    ('Война и Мир', 'Л.Н. Толстой', 'Лев Николаевич Толстой'),
    ('Преступление и наказание', 'Ф.М. Достоевский', 'Федор Михайлович Толстой')
on conflict do nothing;
