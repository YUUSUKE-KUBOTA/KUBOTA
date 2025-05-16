/* ‰Û‘è‡J */
/* Q.04 */
SELECT
    model.car_model_name,
    rent.etc,
    rent.car_navigation,
    rent.smoking_kbn
FROM
    nmrm_rent_car as rent
    INNER JOIN nmrm_shop as shop ON (rent.shop_id = shop.shop_id)
    LEFT OUTER JOIN nmrt_lending_status as lend ON (rent.car_management_no = lend.car_management_no)
    INNER JOIN nmrm_car_model as model ON (rent.car_model_id = model.car_model_id)
WHERE
        shop.shop_name = '”LƒoƒXŽæˆµ“X'
    AND lend.car_management_no IS NULL;