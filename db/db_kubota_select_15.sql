/* ‰Û‘è‡A */
/* Q.15 */
SELECT
    car_class_id,
    price_kbn,
    option_id,
    lending_time_kbn,
    price,
    ins_date,
    ins_user_id,
    upd_counter,
    upd_date,
    upd_user_id
FROM
    nmrm_price_structure
WHERE
        car_class_id LIKE 'S%'
    OR price > 10000;