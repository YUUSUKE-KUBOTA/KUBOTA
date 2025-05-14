/* ‰Û‘è‡A */
/* Q.11 */
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
	fuel_economy BETWEEN 20.0 AND 29.9;