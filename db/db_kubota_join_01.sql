/* ‰Û‘è‡F */
/* Q.01 */
SELECT
    car_management_no,
    car_model_name
FROM
    nmrm_rent_car
    INNER JOIN nmrm_shop ON (nmrm_rent_car.shop_id = nmrm_shop.shop_id)
    INNER JOIN nmrm_car_model ON (nmrm_rent_car.car_model_id = nmrm_car_model.car_model_id)
WHERE
    shop_name = '‚É‚á‚ñ‚±“X';