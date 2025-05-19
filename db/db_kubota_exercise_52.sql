/* í«â¡ââèK52 */
SELECT
    players.position,
    COUNT(goals.player_id) AS sum_point
FROM
    goals
    INNER JOIN players ON (goals.player_id = players.id)
WHERE
    players.position IS NOT NULL
GROUP BY
    players.position
ORDER BY
    sum_point DESC;