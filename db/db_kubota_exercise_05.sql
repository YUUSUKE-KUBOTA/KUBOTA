/* ’Ç‰Á‰‰K5 */
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
    height < 170;