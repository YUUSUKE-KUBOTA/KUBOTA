/* í«â¡ââèK34 */
SELECT
    goals.goal_time,
    players.name,
    countries.name
FROM
    goals
    LEFT OUTER JOIN players ON (goals.player_id = players.id)
    LEFT OUTER JOIN countries ON (players.country_id = countries.id)
WHERE
    0 = 0;