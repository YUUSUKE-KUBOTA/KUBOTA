/* í«â¡ââèK50 */
SELECT
    (SELECT name FROM players WHERE players.id = goals.player_id) AS name,
    COUNT(goals.player_id) AS sum_point
FROM
    goals
WHERE
    goals.player_id IS NOT NULL
GROUP BY
    goals.player_id
ORDER BY
    sum_point DESC;