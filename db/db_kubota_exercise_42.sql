/* ’Ç‰Á‰‰K42 */
SELECT
    goals.goal_time,
    players.name
FROM
    goals
    INNER JOIN players ON (goals.player_id = players.id)
WHERE
    goals.player_id IS NOT NULL