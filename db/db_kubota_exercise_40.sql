/* ’Ç‰Á‰‰K40 */
SELECT
    pairings.kickoff,
	countries.name AS enemy_name
FROM
    pairings
    INNER JOIN countries ON (pairings.enemy_country_id = countries.id);