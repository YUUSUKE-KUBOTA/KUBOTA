/* ’Ç‰Á‰‰K13 */
SELECT
    id,
    country_id,
    uniform_num,
    position,
    name,
    club,
    birth,
    height,
    weight
FROM
    players
WHERE
        (weight / POWER(height / 100,2)) >= 20
    AND (weight / POWER(height / 100,2)) < 21;