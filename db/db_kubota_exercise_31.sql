/* ’Ç‰Á‰‰K31 */
SELECT
    countries.name,
    players.name,
    players.uniform_num
FROM
    players
    INNER JOIN countries ON (players.country_id = countries.id)
WHERE
    0 = 0