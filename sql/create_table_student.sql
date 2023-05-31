-- CREATE DATABASE IF NOT EXISTS `student_tracker`;
 -- USE `student_tracker`;

CREATE TABLE `student` (
    `id` int NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) default null,
    `last_name` varchar(45) default null,
    `email` varchar(45) default null,
    primary key (`id`)
) ENGINE=InnoDB auto_increment=1 default CHARSET=latin1;
