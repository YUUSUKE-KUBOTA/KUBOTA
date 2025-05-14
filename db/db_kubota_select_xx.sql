/* ‰Û‘è‡A */
/* Q.01 */
SELECT
	car_management_no,
	car_model_id,
	shop_id,
	etc,
	car_navigation,
	smoking_kbn,
	ins_date,
	ins_user_id,
	upd_counter,
	upd_date,
	upd_user_id
FROM
	nmrm_rent_car
WHERE
	0 = 0;

/* Q.02 */
SELECT
	car_management_no
FROM
	nmrm_rent_car
WHERE
	0 = 0;

/* Q.03 */
SELECT
	car_model_id,
	shop_id
FROM
	nmrm_rent_car
WHERE
	0 = 0;

/* Q.04 */
SELECT
	car_management_no
FROM
	nmrm_rent_car
WHERE
	shop_id = '000001';

/* Q.05 */
SELECT
	car_model_name
FROM
	nmrm_car_model
WHERE
	displacement >= 1000;

/* Q.06 */
SELECT
	car_model_name
FROM
	nmrm_car_model
WHERE
		fuel_economy >= 20.0
	AND fuel_economy <= 29.9;

/* Q.07 */
SELECT
	car_management_no
FROM
	nmrm_rent_car
WHERE
		etc = 1
	AND car_navigation = 1;

/* Q.08 */
SELECT
	car_management_no
FROM
	nmrm_rent_car
WHERE
		etc = '1' 
	OR car_navigation = '1';

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

/* Q.10 */
SELECT
	shop_id,
	shop_name,
	ins_date,
	ins_user_id,
	upd_counter,
	upd_date,
	upd_user_id
FROM
	nmrm_shop
WHERE
	shop_name LIKE '%”L%';

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

/* Q.12 */
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
	fuel_economy NOT BETWEEN 20.0 AND 29.9;

/* Q.13 */
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
	car_class_id IN ('K-A', 'K-B');

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