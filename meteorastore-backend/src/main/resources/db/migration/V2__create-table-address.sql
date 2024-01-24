CREATE TABLE address (
    id VARCHAR(36) not null,
    street VARCHAR(100) not null,
    number VARCHAR(100) not null,
    complement VARCHAR(100) null,
    neighborhood VARCHAR(100) not null,
    zipCode VARCHAR(9) not null,
    city VARCHAR(100) not null,
    state VARCHAR(100) not null,
    country VARCHAR(100) not null,

    primary key(id)
);