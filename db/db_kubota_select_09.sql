/* ‰Û‘è‡A */
/* Q.09 */
SELECT
    car_model_id,
    car_model_name,
    car_type_kbn,
    car_class_id,
    maker_id,
    capacity,
    fuel_economy,
    displacement,
    ins_date,
    ins_user_id,
    upd_counter,
    upd_date,
    upd_user_id
FROM
    nmrm_car_model
WHERE
    car_model_name LIKE '%ƒƒSƒ“%';