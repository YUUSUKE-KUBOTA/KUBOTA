/* ’Ç‰Á‰‰K15 */
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
        height < 170
    AND (position IN ('FW')
    OR  position IN ('MF'));