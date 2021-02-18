DROP TABLE IF EXISTS users CASCADE;

CREATE TABLE users (
	username VARCHAR(20) PRIMARY KEY,
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS posts;

CREATE TABLE posts (
	id SERIAL PRIMARY KEY, -- SERIAL is a datatype that behaves as an INTEGER, but automatically increments
	content TEXT NOT NULL,
	"user" VARCHAR(20) NOT NULL,
	CONSTRAINT fk_users FOREIGN KEY("user") REFERENCES users(username)
);

ALTER TABLE posts RENAME CONSTRAINT fk_users TO users_fk;

-- THIS IS A COMMENT
/* 
 * This is a multiline comment
 * I can have multiple lines
 */

/*
*	Data Insertion
*/
-- DML, INSERT keyword is one of them
INSERT INTO users
VALUES
('hello123', 'John', 'Doe'),
('abc123', 'Jane', 'Doe');

-- DDL TRUNCATE
TRUNCATE posts;

INSERT INTO posts (content, "user")
VALUES
('This is a new post I have made', 'hello123'),
('Here''s another post', 'hello123');

-- DML
--DELETE
--FROM posts
--WHERE "user" = 'hello123';

--DELETE
--FROM users 
--WHERE username = 'hello123';

SELECT *
FROM posts;

SELECT u.username "user", u.first_name fn, u.last_name "ln"
FROM users u;

-- CONCEPTUAL JOIN TYPES AT A HIGH LEVEL
-- EQUI join: any sort of join that uses equality (=)
-- THETA join: any sort of join that uses something other than equality

-- JOIN TYPES IN SQL
-- INNER JOINS
-- LEFT JOINS
-- RIGHT JOINS
-- FULL OUTER JOINS
SELECT *
FROM users u
JOIN posts p -- The JOIN keyword by itself is implicitly an INNER JOIN
ON u.username = p."user";

SELECT *
FROM users u
LEFT JOIN posts p
ON u.username = p."user";

-- SUB QUERIES
SELECT a.last_name, a.content
FROM 
(SELECT *
FROM users u
LEFT JOIN posts p
ON u.username = p."user") a; -- the subquery needs to have some sort of alias specified, in this case, "a"

-- SELECT THE user(s) who have the largest number of characters in their name
SELECT * 
FROM users u
WHERE LENGTH(u.first_name) = (SELECT MAX(LENGTH(u.first_name))
FROM users u);

--UPDATE users u
--SET first_name = 'Jonathan'
--WHERE u.first_name = 'John';


-- In SQL, by default, DML statements are automatically committed.
-- Sometimes, you don't want some changes to become permanent unless you really know that everything is successful
-- For example, some sort of bank transfer
DROP TABLE IF EXISTS bank_account;
CREATE TABLE bank_account (
	id SERIAL PRIMARY KEY,
	balance NUMERIC DEFAULT 0 CHECK(balance >= 0)
);

INSERT INTO bank_account (balance)
VALUES (100.12),
(10.53);

SELECT *
FROM bank_account

-- If I want to transfer money, I want to make sure that when I change the value of the first one (withdraw), 
-- I then successfully change the second
-- one to be higher (deposit), and then commit when both operations are successful
-- I want to treat these two DML statements as a single unit
-- In SQL terms, as a single transaction
-- A transaction either totally succeeds or fails
-- and if it fails, we revert back to the previous state of the database

BEGIN TRANSACTION;
UPDATE bank_account 
SET balance = 90.12
WHERE bank_account.id = 1;

UPDATE bank_account 
SET balance = 20.53
WHERE bank_account.id = 2;

SELECT *
FROM bank_account;

--ROLLBACK;
COMMIT;


-- MANY TO MANY EXAMPLE
CREATE TABLE teacher 
(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	subject VARCHAR(255) NOT NULL
);

CREATE TABLE student
(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	favorite_subject VARCHAR(255) NOT NULL
);

INSERT INTO teacher (first_name, last_name, subject)
VALUES 
('Fido', 'Fido', 'Math'),
('John', 'Doe', 'Science'),
('Jane', 'Doe', 'English');

INSERT INTO student (first_name, last_name, favorite_subject)
VALUES
('Bishal', 'Adhikari', 'Math'),
('Bach', 'Tran', 'Science'),
('Charles', 'Cunningham', 'English');

-- JUNCTION TABLE to establish many-to-many
CREATE TABLE teacher_student
(
	id SERIAL PRIMARY KEY,
	teacher_id INTEGER NOT NULL,
	student_id INTEGER NOT NULL,
	CONSTRAINT fk_teacher FOREIGN KEY (teacher_id) REFERENCES teacher(id),
	CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES student(id)
);

SELECT *
FROM student;

SELECT * 
FROM teacher;

INSERT INTO teacher_student (teacher_id, student_id)
VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 1),
(2, 3);

SELECT s.*, t.*
FROM student s
INNER JOIN teacher_student ts
ON s.id = ts.student_id 
INNER JOIN teacher t
ON t.id = ts.teacher_id
WHERE t.first_name = 'John'
ORDER BY s.last_name; -- ORDER BY clause goes last


-- Using SET operations to return users who do not have a first_name starting with J
(SELECT *
FROM users)
EXCEPT
(SELECT *
FROM users u
WHERE u.first_name LIKE 'J%')



