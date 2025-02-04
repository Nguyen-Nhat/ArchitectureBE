create table if not exists roles
(
    id   serial primary key,
    name varchar(255) not null
);

insert into roles (name) values ('ADMIN');
insert into roles (name) values ('BRAND');
insert into roles (name) values ('PLAYER');


create table if not exists accounts
(
    id           serial
        primary key,
    username     varchar(255) not null,
    password     varchar(255) not null,
    email        varchar(255) not null,
    phone_number varchar(255) not null,
    role_id      integer      not null,
    is_active    boolean default true,
    foreign key (role_id) references roles (id)
);

insert into accounts (username, password, email, phone_number, role_id, is_active) values ('admin', '{noop}admin', 'admin@gmail.com', '0123456789', 1, true);

create table if not exists players
(
    id         serial
        primary key,
    name       varchar(255),
    avatar     varchar(255),
    birth_date date,
    gender     varchar(255),
    facebook   varchar(255),
    account_id integer not null,
    foreign key (account_id) references accounts (id)
);

create table if not exists brands
(
    id         serial
        primary key,
    name       varchar(255),
    field      varchar(255),
    address    varchar(255),
    gps        varchar(255),
    is_enable  boolean default false,
    account_id integer not null,
    foreign key (account_id) references accounts (id)
);

create table if not exists access_tokens
(
    id         serial
        primary key,
    token      varchar(255)          not null,
    revoked    boolean default false not null,
    expired    boolean default false not null,
    account_id integer               not null,
    foreign key (account_id) references accounts (id)
);