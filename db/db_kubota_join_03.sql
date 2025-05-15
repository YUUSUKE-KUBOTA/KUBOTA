SELECT
    car_model_name,
    shop_name
FROM
    nmrm_rent_car
    INNER JOIN nmrm_car_model ON (nmrm_rent_car.car_model_id = nmrm_car_model.car_model_id)
    INNER JOIN nmrm_shop ON (nmrm_rent_car.shop_id = nmrm_shop.shop_id)
WHERE
    car_management_no = '000067';