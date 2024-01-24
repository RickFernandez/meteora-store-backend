ALTER TABLE users
ADD CONSTRAINT fk_users_address
FOREIGN KEY (address_id)
REFERENCES address(id);