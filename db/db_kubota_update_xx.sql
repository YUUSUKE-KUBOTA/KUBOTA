/* ‰Û‘è‡B */
/* Q.01 */
UPDATE
	nmrm_shop
SET
	shop_name = '‚Ë‚±‚Ü‚Â–{“X'
WHERE
	shop_id = '000001';

/* Q.02 */
UPDATE
	nmrm_car_model
SET
	car_model_name = 'AQUA'
WHERE
	car_model_name = 'ƒAƒNƒA';

/* Q.03 */
UPDATE
	nmrm_rent_car
SET
	etc = '1',
	car_navigation = '1'
WHERE
	car_management_no = '000057';

/* Q.04 */
UPDATE
	nmrm_rent_car
SET
	smoking_kbn = '2'
WHERE
	0 = 0;

/* Q.05 */
UPDATE
	nmrm_rent_car
SET
	smoking_kbn = '1'
WHERE
	car_management_no BETWEEN '000020' AND '000030';

/* Q.06 */
UPDATE
	nmrm_rent_car
SET
	etc = '0',
	car_navigation = '0'
WHERE
	smoking_kbn = '1';

/* Q.07 */
UPDATE
	nmrm_rent_car
SET
	shop_id = '000001'
WHERE
	smoking_kbn = '1';

/* Q.08 */
UPDATE
	nmrm_rent_car
SET
	etc = '1',
	car_navigation = '1'
WHERE
	etc = '1',
	car_navigation = '1'