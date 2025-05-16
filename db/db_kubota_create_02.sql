/* ‰Û‘è‡K */
/* Q.02 */
CREATE TABLE nmrm_car_class(
    car_class_id char(4) not NULL primary key,
    car_class_name varchar(40) not NULL,
    ins_date datetime2,
    ins_user_id char(6),
    upd_counter int,
    upd_date datetime2,
    upd_user_id char(6)
);