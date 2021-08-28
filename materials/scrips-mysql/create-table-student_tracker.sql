CREATE DATABASE IF NOT EXISTS hb_student_tracker;
USE hb_student_tracker;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
	id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(32) DEFAULT NULL,
    last_name VARCHAR(32) DEFAULT NULL,
    email VARCHAR(32) DEFAULT NULL
)

 ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;