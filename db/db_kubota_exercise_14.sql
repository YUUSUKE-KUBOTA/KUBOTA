/* ’Ç‰Á‰‰K14 */
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
       height >= 165
    OR weight < 60;