/* ‰Û‘è‡F */
/* Q.03 */
SELECT
    model.car_model_name,
    shop.shop_name
FROM
    nmrm_rent_car as rent
    INNER JOIN nmrm_car_model as model ON (rent.car_model_id = model.car_model_id)
    INNER JOIN nmrm_shop as shop ON (rent.shop_id = shop.shop_id)
WHERE
    rent.car_management_no = '000067';