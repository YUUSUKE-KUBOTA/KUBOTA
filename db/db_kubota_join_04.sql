SELECT
    car_model_name,
    etc,
    car_navigation,
    smoking_kbn
FROM
    nmrm_rent_car
    INNER JOIN nmrm_shop ON (nmrm_rent_car.shop_id = nmrm_shop.shop_id)
    INNER JOIN nmrt_lending_status ON (nmrm_rent_car.car_management_no = nmrt_lending_status.car_management_no)
    INNER JOIN nmrm_car_model ON (nmrm_rent_car.car_model_id = nmrm_car_model.car_model_id)
WHERE
    shop_name = '”LƒoƒXŽæˆµ“X';