/* ‰Û‘è‡K */
/* Q.03 */
CREATE TABLE nmrm_maker(
    maker_id char(4) not NULL primary key,
    maker_name varchar(20),
    ins_date datetime2,
    ins_user_id char(6),
    upd_counter int,
    upd_date datetime2,
    upd_userid char(6)
);