create table users(

    id varchar(36) not null,
    firstName varchar(100) not null,
    lastName varchar(100) not null,
    email varchar(100) not null unique,
    password varchar(100) not null,
    document varchar(14) not null unique,
    userType varchar(6) not null,
    street varchar(100) null,
    number varchar(100) not null,
    complement varchar(100) null,
    neighborhood varchar(100) not null,
    zipCode varchar(9) not null,
    city varchar(100) not null,
    state varchar(100) not null,
    country varchar(100) not null,

    primary key(id)

);