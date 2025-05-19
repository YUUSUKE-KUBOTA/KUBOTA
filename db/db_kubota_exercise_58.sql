/* í«â¡ââèK57 */
SELECT
    pairings.kickoff,
    my_country.name,
    enemy_country.name,
    my_country.ranking,
    enemy_country.ranking,
	COUNT(goals.player_id)
FROM
    pairings
    LEFT OUTER JOIN countries AS my_country ON (pairings.my_country_id = my_country.id)
    LEFT OUTER JOIN countries AS enemy_country ON (pairings.enemy_country_id = enemy_country.id)
	LEFT OUTER JOIN players ON (my_country.id = players.country_id)
	LEFT OUTER JOIN goals ON (players.id = goals.player_id)
WHERE
    my_country.group_name = 'C'
	AND enemy_country.group_name = 'C'
GROUP BY
    
