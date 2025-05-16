/* ‰Û‘è‡K */
/* Q.01 */
CREATE TABLE nmrm_car_type_kbn(
    car_type_kbn char(4) not NULL primary key,
    car_type_kbn_name varchar(30) not NULL,
    ins_date datetime2 not NULL,
    ins_user_id char(6) not NULL,
    upd_counter int not NULL,
    upd_date datetime2 not NULL,
    upd_user_id char(6) not NULL
);