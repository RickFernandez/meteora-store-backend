ALTER TABLE address
ADD CONSTRAINT fk_address_user_id
FOREIGN KEY (user_id)
REFERENCES users(id);
