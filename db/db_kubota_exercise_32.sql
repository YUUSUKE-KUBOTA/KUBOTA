/* ’Ç‰Á‰‰K32 */
SELECT
    countries.name,
    players.name,
    goals.goal_time
FROM
    goals
    INNER JOIN players ON (goals.player_id = players.id)
    INNER JOIN countries ON (players.country_id = countries.id)
WHERE
    0 = 0;