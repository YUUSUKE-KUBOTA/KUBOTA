/* ‰Û‘è‡F */
/* Q.02 */
SELECT
    rent.car_management_no,
    model.car_model_name,
    lend.return_plan_date
FROM
    nmrm_rent_car as rent
    INNER JOIN nmrm_shop as shop ON (rent.shop_id = shop.shop_id)
    INNER JOIN nmrm_car_model as model ON (rent.car_model_id = model.car_model_id)
    INNER JOIN nmrt_lending_status as lend ON (rent.car_management_no = lend.car_management_no)
WHERE
    shop.shop_name LIKE '%–{“X%';