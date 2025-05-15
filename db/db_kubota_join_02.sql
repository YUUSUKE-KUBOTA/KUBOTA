SELECT/**/
    nmrt_lending_status.car_management_no,
    car_model_name,
    return_plan_date
FROM
    nmrm_rent_car
    INNER JOIN nmrm_shop ON (nmrm_rent_car.shop_id = nmrm_shop.shop_id)
    INNER JOIN nmrm_car_model ON (nmrm_rent_car.car_model_id = nmrm_car_model.car_model_id)
    INNER JOIN nmrt_lending_status ON (nmrt_lending_status.car_management_no = nmrt_lending_status.car_management_no)
WHERE
    shop_name LIKE '%–{“X%';