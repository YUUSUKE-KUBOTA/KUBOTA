/* í«â¡ââèK40 */
SELECT
    DISTINCT pairings.kickoff,
    my_country.name AS my_name,
    enemy_country.name AS enemy_name
FROM
    pairings
    LEFT OUTER JOIN countries AS my_country ON (pairings.my_country_id = my_country.id)
    LEFT OUTER JOIN countries AS enemy_country ON (pairings.enemy_country_id = enemy_country.id);