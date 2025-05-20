/* í«â¡ââèK59 */
SELECT
    pairings.kickoff,
    my_country.name AS my_country_name,
    enemy_country.name AS enemy_country_name,
    my_country.ranking AS my_country_ranking,
    enemy_country.ranking AS enemy_country_ranking,
    (SELECT
        COUNT(goals.pairing_id)
     FROM
        goals
        INNER JOIN players ON goals.player_id = players.id
     WHERE
        players.country_id = my_country.id
        AND goals.pairing_id = pairings.id
     ) AS my_country_goals
FROM
    pairings
    INNER JOIN countries AS my_country ON (pairings.my_country_id = my_country.id)
    INNER JOIN countries AS enemy_country ON (pairings.enemy_country_id = enemy_country.id)
WHERE
    my_country.group_name = 'C'
    AND enemy_country.group_name = 'C'
ORDER BY
    pairings.kickoff,
    my_country.ranking;