/* ‰Û‘è‡A */
/* Q.14 */
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
        car_class_id = 'SC-1'
    AND lending_time_kbn = 0003;