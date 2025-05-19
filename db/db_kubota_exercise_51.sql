/* í«â¡ââèK51 */
SELECT
    players.name,
    COUNT(goals.player_id) AS sum_point
FROM
    goals
    INNER JOIN players ON (goals.player_id = players.id)
WHERE
    goals.player_id IS NOT NULL
GROUP BY
    players.name
ORDER BY
    sum_point DESC;