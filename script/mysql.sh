CREATE DATABASE saltynote;

CREATE USER 'USER_NAME'@'localhost' IDENTIFIED BY 'NEW-PASSWORD';
GRANT ALL PRIVILEGES ON saltynote.* TO 'USER_NAME'@'localhost' WITH GRANT OPTION;