/* ’Ç‰Á‰‰K49 */
SELECT
    pairings.kickoff,
    countries.name
FROM
    pairings
    INNER JOIN countries ON (pairings.enemy_country_id = countries.id)
WHERE
    0 = 0
ORDER BY
    kickoff ASC;