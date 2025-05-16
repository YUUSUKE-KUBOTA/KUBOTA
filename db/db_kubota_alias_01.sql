/* ‰Û‘è‡J */
/* Q.01 */
SELECT
    rent.car_management_no,
    model.car_model_name
FROM
    nmrm_rent_car as rent
    INNER JOIN nmrm_shop as shop ON (rent.shop_id = shop.shop_id)
    INNER JOIN nmrm_car_model as model ON (rent.car_model_id = model.car_model_id)
WHERE
    shop.shop_name = '‚É‚á‚ñ‚±“X';